package com.example.demo.service;

import com.example.demo.dto.CategorieChaineDTO;
import com.example.demo.entities.CategorieChaine;
import com.example.demo.repository.CategorieChaineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieChaineService {
    @Autowired
    private CategorieChaineRepository categorieChaineRepository;

    public CategorieChaineService() {
    }

    public CategorieChaine findCategorieChaineById(Long id) {
        return this.categorieChaineRepository.findCategorieChaineById(id);
    }

    public List<CategorieChaine> findAll() {
        return this.categorieChaineRepository.findAll();
    }

    public CategorieChaine saveCategorie(CategorieChaineDTO categorieChaineDTO) {
        CategorieChaine categorieChaine = categorieChaineDTO.toECategorieChaine();
        this.categorieChaineRepository.save(categorieChaine);
        return categorieChaine;
    }
}
