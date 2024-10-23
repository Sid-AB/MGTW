package com.example.demo.service;

import com.example.demo.dto.CategoriePresseDTO;
import com.example.demo.entities.CategoriePress;
import com.example.demo.repository.CategoriePresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriePresseService {
    @Autowired
    private CategoriePresseRepository categoriePresseRepository;

    public CategoriePresseService() {
    }

    public CategoriePress findCategoriePresseById(Long id) {
        return this.categoriePresseRepository.findCategoriePresseById(id);
    }

    public List<CategoriePress> findAll() {
        return this.categoriePresseRepository.findAll();
    }

    public CategoriePress saveCategorie(CategoriePresseDTO categoriePresseDTO) {
        CategoriePress categoriePresse = categoriePresseDTO.toECategoriePresse();
        this.categoriePresseRepository.save(categoriePresse);
        return categoriePresse;
    }
}
