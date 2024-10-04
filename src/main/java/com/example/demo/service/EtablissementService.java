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

@Service
public class EtablissementService {
    @Autowired
    private EtablissementRepository etablissementRepository;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private MultimediaRepository multimediaRepository;

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

<<<<<<< HEAD
    // Méthode pour rechercher par nom arabe
    public Optional<Etablissement> findEtablissementByNameFr(String name_fr) {
        return this.etablissementRepository.findEtablissementByNameFr(name_fr);
=======
    // Méthode pour rechercher par nom français
    public Optional<Etablissement> findEtablissementByNameFr(String nameFr) {
        return this.etablissementRepository.findEtablissementByNameFr(nameFr);
    }

    // Méthode pour rechercher par nom en anglais
    public Optional<Etablissement> findEtablissementByNameEn(String nameEn) {
        return this.etablissementRepository.findEtablissementByNameEn(nameEn);
>>>>>>> cb3f5d367d498769acf935d94d172e80f9cfce83
    }

    public List<Etablissement> findEtablissementsByType(String type) {
        return this.etablissementRepository.findEtablissementsByType(type);
    }

    public List<Etablissement> findAll() {
        return this.etablissementRepository.findAll();
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

    public Boolean updateDataEtablissement(Etablissement etablissement, Long userId,Optional<Etablissement> existingMinister/*, Optional<Multimedia> multimedias */) {
        if (existingMinister.isPresent()) {
            Etablissement Etabbliss = existingMinister.get();
            Etabbliss.setName(etablissement.getName());
            Etabbliss.setNameFr(etablissement.getNameFr());
            Etabbliss.setDescription(etablissement.getDescription());
            Etabbliss.setDescriptionFr(etablissement.getDescriptionFr());
            Etabbliss.setDescriptionEn(etablissement.getDescriptionEn());
            this.etablissementRepository.save(Etabbliss);
      /*  if (multimedias.isPresent()) {
            List<Multimedia> savedMultimedias = new ArrayList();
            multimedias.ifPresent((multimedia) -> {
                multimedia.setEtablissement(existingEtablissement);
            });
            multimedias.ifPresent(savedMultimedias::addAll);
            savedMultimedias.ifPresent(existingEtablissement::setMultimediaList);
            this.multimediaRepository.saveAll(savedMultimedias);
        } */
        return true;
    }
    else
    {
        return false;
    }
      //  return existingEtablissement;
    }
    
}
