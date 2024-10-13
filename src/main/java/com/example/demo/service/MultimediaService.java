package com.example.demo.service;


import com.example.demo.entities.*;
import com.example.demo.repository.MultimediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MultimediaService {
    @Autowired
    private MultimediaRepository multimediaRepository;

    public MultimediaService() {
    }

    Multimedia findFirstByEtablissementOrderByIdAsc(Etablissement etablissement)
    {
        return this.multimediaRepository.findFirstByEtablissementOrderByIdAsc(etablissement);
    }


    public List<Multimedia> findAllById(Long id) {
        return this.multimediaRepository.findAllById(id);
    }

    public Multimedia findMultimediaById(Long id) {
        return this.multimediaRepository.findMultimediaById(id);
    }

    public void sup(Long id) {
        this.multimediaRepository.deleteById(id);
    }

    public Optional<Multimedia> findMultimediaByUserAndDocType(User user, String docType) {
        return this.multimediaRepository.findFirstByUserAndDocTypeOrderByCreatedAtDesc(user, docType);
    }

    public Optional<Multimedia> findFirstByTvOrderByIdDesc(TV tv) {
        return this.multimediaRepository.findFirstByTvOrderByIdDesc(tv);
    }

    public Optional<Multimedia> findFirstByTvOrderByCreatedAtDesc(TV tv) {
        return this.multimediaRepository.findFirstByTv(tv);
    }

    public Optional<Multimedia> findFirstByRadioOrderByIdDesc(Radio radio) {
        return this.multimediaRepository.findFirstByRadioOrderByIdDesc(radio);
    }

    public Optional<Multimedia> findFirstByMinister(Minister radio) {
        return this.multimediaRepository.findFirstByMinister(radio);
    }

    public Optional<Multimedia> findFirstByPresseOrderByIdDesc(Presse presse) {
        return this.multimediaRepository.findFirstByPresseOrderByIdDesc(presse);
    }

    public Optional<Multimedia> findFirstByEtablissementOrderByIdDesc(Etablissement etablissement) {
        return this.multimediaRepository.findFirstByEtablissementOrderByIdDesc(etablissement);
    }

    public Optional<Multimedia> findFirstByTextJuridique(TextJuridique textJuridique) {
        return this.multimediaRepository.findFirstByTextJuridique(textJuridique);
    }
}
