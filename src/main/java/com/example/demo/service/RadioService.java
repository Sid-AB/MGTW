package com.example.demo.service;


import com.example.demo.dto.RadioDTO;
import com.example.demo.entities.Caracteristique;
import com.example.demo.entities.Multimedia;
import com.example.demo.entities.Radio;
import com.example.demo.repository.CaractirestiqueRepository;
import com.example.demo.repository.ComplexeRepository;
import com.example.demo.repository.MultimediaRepository;
import com.example.demo.repository.RadioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
public class RadioService {
    @Autowired
    private RadioRepository radioRepository;
    @Autowired
    private ComplexeRepository complexeRepository;
    @Autowired
    private CaractirestiqueRepository caractirestiqueRepository;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private MultimediaRepository multimediaRepository;

    public RadioService() {
    }

    public Radio findRadioById(Long id) {
        return this.radioRepository.findRadioById(id);
    }

    public List<Radio> findAll() {
        return this.radioRepository.findAll();
    }

    public List<Radio> findRadioByCategorie(String string) {
        return this.radioRepository.findRadioByCategorie(string);
    }
    public List<Radio> findByDescriptionContainingIgnoreCase(String keyword) {
        return this.radioRepository.findByDescriptionContainingIgnoreCase(keyword);
    }
    public Radio saveRadio(RadioDTO radioDTO) {
        Radio radio = radioDTO.toERadio();
        this.radioRepository.save(radio);
        Caracteristique caracteristique = radioDTO.toECaractiristique();
        Multimedia multimedia = null;
        List<Multimedia> multimedias = new ArrayList();
        if (!((MultipartFile)radioDTO.getProfilFiles().get(0)).isEmpty()) {
            multimedias.addAll(this.filesStorageService.saveFiles(radioDTO.getProfilFiles(), "profileDoc"));
        }

        Radio radio1 = this.saveUserAndMultimedias(multimedias, radio);
        radio1.setComplexe(this.complexeRepository.findComplexeById(radioDTO.getComplexe()));
        this.radioRepository.save(radio1);
        this.saveCaracteristique(radio1, caracteristique);
        return radio1;
    }

    public Caracteristique saveCaracteristique(Radio radio, Caracteristique caracteristique) {
        caracteristique.setRadio(radio);
        this.caractirestiqueRepository.save(caracteristique);
        return caracteristique;
    }

    public Radio saveUserAndMultimedias(List<Multimedia> multimedias, Radio radio) {
        this.radioRepository.save(radio);
        if (multimedias != null && !multimedias.isEmpty()) {
            List<Multimedia> savedMultimedias = new ArrayList();
            multimedias.forEach((multimedia) -> {
                multimedia.setRadio(radio);
            });
            savedMultimedias.addAll(multimedias);
            radio.setMultimediaList(savedMultimedias);
            this.multimediaRepository.saveAll(savedMultimedias);
        }

        return radio;
    }
}
