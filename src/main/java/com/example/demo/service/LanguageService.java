package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dto.LanguageDTO;

import com.example.demo.entities.Language;

import com.example.demo.repository.LanguageRepository;

@Service
public class LanguageService {
    @Autowired
    private LanguageRepository LanguageRepository;

    public LanguageService() {
    }

    public Language findLanguageById(Long id) {
        return this.LanguageRepository.findLanguageById(id);
    }

    public List<Language> findAll() {
        return this.LanguageRepository.findAll();
    }

    public Language saveLangue(LanguageDTO LanguageDTO) {
        Language Language = LanguageDTO.toLanguage();
        this.LanguageRepository.save(Language);
        return Language;
    }
}
