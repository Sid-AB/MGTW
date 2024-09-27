package com.example.demo.service;

import com.example.demo.dto.PresseCategorieDTO;
import com.example.demo.entities.PresseCategorie;
import com.example.demo.repository.PresseCategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PresseCategorieService {
    @Autowired
    private PresseCategorieRepository presseCategorieRepository;

    public PresseCategorieService() {
    }

    public Optional<PresseCategorie> findPresseCategorieById(Long id) {
        return this.presseCategorieRepository.findPresseCategorieById(id);
    }

    public List<PresseCategorie> findAll() {
        return this.presseCategorieRepository.findAll();
    }

    public PresseCategorie savePresseCategorie(PresseCategorieDTO presseCategorieDTO) {
        PresseCategorie presseCategorie = presseCategorieDTO.toEPresseCategorie();
        this.presseCategorieRepository.save(presseCategorie);
        return presseCategorie;
    }
}
