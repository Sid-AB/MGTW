package com.example.demo.service;


import com.example.demo.dto.PresseDTO;
import com.example.demo.entities.Multimedia;
import com.example.demo.entities.Presse;
import com.example.demo.entities.PresseCategorie;
import com.example.demo.repository.ComplexeRepository;
import com.example.demo.repository.MultimediaRepository;
import com.example.demo.repository.PresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class PresseService {
    @Autowired
    private PresseRepository presseRepository;
    @Autowired
    private ComplexeRepository complexeRepository;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private MultimediaRepository multimediaRepository;
    @Autowired
    private PresseCategorieService presseCategorieService;

    public PresseService() {
    }

    public Presse findPresseById(Long id) {
        return this.presseRepository.findPresseById(id);
    }

    public List<Presse> findAll() {
        return this.presseRepository.findAll();
    }

    public List<Presse> findPresseByPresseCategories(List<PresseCategorie> categories) {
        return this.presseRepository.findPresseByPresseCategories(categories);
    }

    public List<Presse> findPresseByPresseCategoriesAndTypepbpr(List<PresseCategorie> categories, String string) {
        return this.presseRepository.findPresseByPresseCategoriesAndTypepbpr(categories, string);
    }
    public List<Presse> findByDescriptionContainingIgnoreCase(String keyword) {
        return this.presseRepository.findByDescriptionContainingIgnoreCase(keyword);
    }

    public Presse saveRadio(PresseDTO presseDTO) {
        Presse presse = presseDTO.toEPresse();
        this.presseRepository.save(presse);
        List<Long> categoriepressesID = presseDTO.getSelectedCategorie();
        Iterator multimedia;
        if (!categoriepressesID.isEmpty()) {
            multimedia = categoriepressesID.iterator();

            while(multimedia.hasNext()) {
                Long categoriepresseID = (Long)multimedia.next();
                Optional<PresseCategorie> presseCategorie = this.presseCategorieService.findPresseCategorieById(categoriepresseID);
                presse.getPresseCategories().add((PresseCategorie)presseCategorie.get());
                this.presseRepository.save(presse);
            }
        }

        multimedia = null;
        List<Multimedia> multimedias = new ArrayList();
        if (!((MultipartFile)presseDTO.getProfilFiles().get(0)).isEmpty()) {
            multimedias.addAll(this.filesStorageService.saveFiles(presseDTO.getProfilFiles(), "profileDoc"));
        }

        Presse presse1 = this.saveUserAndMultimedias(multimedias, presse);
        presse1.setComplexe(this.complexeRepository.findComplexeById(presseDTO.getComplexe()));
        this.presseRepository.save(presse1);
        return presse1;
    }

    public Presse saveUserAndMultimedias(List<Multimedia> multimedias, Presse presse) {
        this.presseRepository.save(presse);
        if (multimedias != null && !multimedias.isEmpty()) {
            List<Multimedia> savedMultimedias = new ArrayList();
            multimedias.forEach((multimedia) -> {
                multimedia.setPresse(presse);
            });
            savedMultimedias.addAll(multimedias);
            presse.setMultimediaList(savedMultimedias);
            this.multimediaRepository.saveAll(savedMultimedias);
        }

        return presse;
    }
}
