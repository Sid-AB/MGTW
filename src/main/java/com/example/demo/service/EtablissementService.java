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

    public Etablissement findEtablissementById(Long id) {
        return this.etablissementRepository.findEtablissementById(id);
    }

    Optional<Etablissement> findEtablissementByName(String username) {
        return this.etablissementRepository.findEtablissementByName(username);
    }

    // Méthode pour rechercher par nom arabe
    public Optional<Etablissement> findEtablissementByNameFr(String name_fr) {
        return this.etablissementRepository.findEtablissementByNameFr(name_fr);
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
    public List<Etablissement> findByDescription_frContainingIgnoreCase(String keyword) {
        return this.etablissementRepository.findByDescriptionFrContainingIgnoreCase(keyword);
    }
    public List<Etablissement> findByDescription_enContainingIgnoreCase(String keyword) {
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

    public Etablissement updateDataEtablissement(Etablissement updatedEtablissement, Long userId, List<Multimedia> multimedias) {
        Etablissement existingEtablissement = this.etablissementRepository.findEtablissementById(userId);
        existingEtablissement.setName(updatedEtablissement.getName());
        existingEtablissement.setType(updatedEtablissement.getType());
        existingEtablissement.setDescription(updatedEtablissement.getDescription());
        this.etablissementRepository.save(existingEtablissement);
        if (multimedias != null && !multimedias.isEmpty()) {
            List<Multimedia> savedMultimedias = new ArrayList();
            multimedias.forEach((multimedia) -> {
                multimedia.setEtablissement(existingEtablissement);
            });
            savedMultimedias.addAll(multimedias);
            existingEtablissement.setMultimediaList(savedMultimedias);
            this.multimediaRepository.saveAll(savedMultimedias);
        }

        return existingEtablissement;
    }
}
