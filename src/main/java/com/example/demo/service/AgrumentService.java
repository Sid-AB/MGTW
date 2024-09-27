package com.example.demo.service;


import com.example.demo.dto.AgrumentDTO;
import com.example.demo.entities.Agrument;
import com.example.demo.repository.AgrumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgrumentService {
    @Autowired
    private AgrumentRepository agrumentRepository;

    public AgrumentService() {
    }

    public Optional<Agrument> findAgrumentById(Long id) {
        return this.agrumentRepository.findAgrumentById(id);
    }

    public List<Agrument> findAll() {
        return this.agrumentRepository.findAll();
    }

    public Agrument saveAgrument(AgrumentDTO agrumentDTO) {
        Agrument agrument = agrumentDTO.toEAgrument();
        this.agrumentRepository.save(agrument);
        return agrument;
    }
}
