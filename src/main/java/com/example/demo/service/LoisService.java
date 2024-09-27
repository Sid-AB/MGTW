package com.example.demo.service;


import com.example.demo.dto.LoisDTO;
import com.example.demo.entities.Lois;
import com.example.demo.repository.LoisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoisService {
    @Autowired
    private LoisRepository loisRepository;

    public LoisService() {
    }

    public Lois findLoisById(Long id) {
        return this.loisRepository.findLoisById(id);
    }

    public List<Lois> findAll() {
        return this.loisRepository.findAll();
    }

    public Lois saveLois(LoisDTO loisDTO) {
        Lois lois = loisDTO.toLois();
        this.loisRepository.save(lois);
        return lois;
    }
}
