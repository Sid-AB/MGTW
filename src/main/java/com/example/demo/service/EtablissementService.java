package com.example.demo.service;


import com.example.demo.dto.EtablissementDTO;
import com.example.demo.entities.Etablissement;
import com.example.demo.entities.Multimedia;
import com.example.demo.repository.EtablissementRepository;
import com.example.demo.repository.MultimediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EtablissementService {
    @Autowired
    private EtablissementRepository etablissementRepository;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private MultimediaRepository multimediaRepository;

    @Autowired
    private MultimediaService multimediaService;

    public EtablissementService() {
    }

    public Optional<Etablissement> findById(Long id) {
        return this.etablissementRepository.findById(id);
    }

    

    public Etablissement findEtablissementById(Long id) {
        return this.etablissementRepository.findEtablissementById(id);
    }

    // Méthode pour rechercher par nom arabe
    public Optional<Etablissement> findEtablissementByName(String name) {
        return this.etablissementRepository.findEtablissementByName(name);
    }

    // Méthode pour rechercher par nom arabe
    public Optional<Etablissement> findEtablissementByNameFr(String nameFr) {
        return this.etablissementRepository.findEtablissementByNameFr(nameFr);
    }

    // Méthode pour rechercher par nom arabe
    public Optional<Etablissement> findEtablissementByNameEn(String nameEn) {
        return this.etablissementRepository.findEtablissementByNameEn(nameEn);
    }

    public List<Etablissement> findEtablissementsByType(String type) {
        return this.etablissementRepository.findEtablissementsByType(type);
    }

    public Etablissement findEtablissementsByTypeEtablissmnt(String typeEtablissmnt) {
        return this.etablissementRepository.findEtablissementsByTypeEtablissmnt(typeEtablissmnt);
    }
    public List<Etablissement> findAll() {
        return this.etablissementRepository.findAll();
    }
    //////etablissmnt sans aps et impression
     public List<Etablissement> findEtablissementsSoustutelleSansApsEtSociete() {
        List<Etablissement> etablissements = findEtablissementsByType("soustutelle");
        System.out.println("Number of etablissements found: " + etablissements.size()); // Debug statement
        return etablissements.stream()
            .filter(etablissement -> 
                !"aps".equals(etablissement.getTypeEtablissmnt()) &&
                !"société d'impression".equals(etablissement.getTypeEtablissmnt()))
            .collect(Collectors.toList());
    }
    public Etablissement saveEtablissement(EtablissementDTO etablissementDTO) {
        Etablissement etablissement = etablissementDTO.toEtablissement();
        this.etablissementRepository.save(etablissement);
        Multimedia multimedia = null;
        List<Multimedia> multimedias = new ArrayList();
        if (!((MultipartFile)etablissementDTO.getEtablissementFiles().get(0)).isEmpty()) {
            multimedias.addAll(this.filesStorageService.saveFiles(etablissementDTO.getEtablissementFiles(), "etablissementDoc"));
        }

        Etablissement etablissement1 = this.saveUserAndMultimedias(multimedias, etablissement);
        return etablissement1;
    }
    public List<Etablissement> findByDescriptionContainingIgnoreCase(String keyword) {
        return this.etablissementRepository.findByDescriptionContainingIgnoreCase(keyword);
    }
    public List<Etablissement> findByDescriptionFrContainingIgnoreCase(String keyword) {
        return this.etablissementRepository.findByDescriptionFrContainingIgnoreCase(keyword);
    }
    public List<Etablissement> findByDescriptionEnContainingIgnoreCase(String keyword) {
        return this.etablissementRepository.findByDescriptionEnContainingIgnoreCase(keyword);
    }
    public Etablissement saveUserAndMultimedias(List<Multimedia> multimedias, Etablissement etablissement) {
        this.etablissementRepository.save(etablissement);
        if (multimedias != null && !multimedias.isEmpty()) {
            List<Multimedia> savedMultimedias = new ArrayList();
            multimedias.forEach((multimedia) -> {
                multimedia.setEtablissement(etablissement);
            });
            savedMultimedias.addAll(multimedias);
            etablissement.setMultimediaList(savedMultimedias);
            this.multimediaRepository.saveAll(savedMultimedias);
        }

        return etablissement;
    }

    public Boolean updateDataEtablissement(Etablissement etablissement, Long userId,Optional<Etablissement> existingEtablissement, List<MultipartFile> multimediaFiles ) {
        if (existingEtablissement.isPresent()) {
            Etablissement Etabbliss = existingEtablissement.get();
            Etabbliss.setName(etablissement.getName());
            Etabbliss.setNameFr(etablissement.getNameFr());
            Etabbliss.setNameEn(etablissement.getNameEn());
            Etabbliss.setAdresse(etablissement.getAdresse());
            Etabbliss.setAdresseFr(etablissement.getAdresseFr());
            Etabbliss.setAdresseEn(etablissement.getAdresseEn());
            Etabbliss.setDescription(etablissement.getDescription());
            Etabbliss.setDescriptionFr(etablissement.getDescriptionFr());
            Etabbliss.setDescriptionEn(etablissement.getDescriptionEn());
            Etabbliss.setLocalisation(etablissement.getLocalisation());
            Etabbliss.setSite(etablissement.getSite());
            Etabbliss.setTypeEtablissmnt(etablissement.getTypeEtablissmnt());
           
            if (multimediaFiles != null && !multimediaFiles.isEmpty()) {
                List<Multimedia> multimediaList = new ArrayList<>();
                for (MultipartFile file : multimediaFiles) {
                    if (!file.isEmpty()) {
                        // Create a Multimedia entity
                        Multimedia multimedia = this.multimediaService.findFirstByEtablissementOrderByIdAsc(etablissement);
                        multimedia.setFileName(file.getOriginalFilename());
    
                        // Save file to filesystem and get the file path
                        multimedia = this.filesStorageService.save(file,"etablissementDoc");
                       // multimedia.setFilePath(filePath);
    
                        // Set the etablissement reference in multimedia
                        multimedia.setEtablissement(Etabbliss);
    
                        // Add multimedia to the list
                        multimediaList.add(multimedia);
                    }
                }
    
                // Save the multimedia files
                multimediaRepository.saveAll(multimediaList);
            }
        this.etablissementRepository.save(Etabbliss);
        return true;
    }
    else
    {
        return false;
    }
      //  return existingEtablissement;
    }
    
}
