package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dto.PressejrDTO;

import com.example.demo.entities.Pressejr;

import com.example.demo.repository.PressejrRepository;

@Service
public class PressejrService {
    @Autowired
    private PressejrRepository PressejrRepository;

    public PressejrService() {
    }

    public Pressejr findPressejrById(Long id) {
        return this.PressejrRepository.findPressejreById(id);
    }

    public List<Pressejr> findAll() {
        return this.PressejrRepository.findAll();
    }

    public Pressejr saveCategorie(PressejrDTO PressejrDTO) {
        Pressejr Pressejr = PressejrDTO.toPressejr();
        this.PressejrRepository.save(Pressejr);
        return Pressejr;
    }
}
