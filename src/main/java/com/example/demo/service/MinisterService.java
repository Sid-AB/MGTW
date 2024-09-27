package com.example.demo.service;


import com.example.demo.dto.MinisterDTO;
import com.example.demo.entities.Multimedia;
import com.example.demo.entities.Minister;
import com.example.demo.repository.MultimediaRepository;
import com.example.demo.repository.MinisterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MinisterService {

    @Autowired
    private MinisterRepository ministerRepository;

    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private MultimediaRepository multimediaRepository;

    public MinisterDTO createMinister(MinisterDTO ministerDTO) {
        Minister minister = new Minister();
        minister.setFirstName(ministerDTO.getFirstName());
        minister.setLastName(ministerDTO.getLastName());
        minister.setBirthday(ministerDTO.getBirthday());
        minister.setAddress(ministerDTO.getAddress());
        minister.setStartFrom(ministerDTO.getStartFrom());
        minister.setUntil(ministerDTO.getUntil());

        ministerRepository.save(minister);
        return mapToDTO(minister);
    }

    public MinisterDTO getMinister(Long id) {
        Optional<Minister> minister = ministerRepository.findById(id);
        return minister.map(this::mapToDTO).orElse(null);
    }

    private MinisterDTO mapToDTO(Minister minister) {
        MinisterDTO ministerDTO = new MinisterDTO();
        ministerDTO.setFirstName(minister.getFirstName());
        ministerDTO.setLastName(minister.getLastName());
        ministerDTO.setBirthday(minister.getBirthday());
        ministerDTO.setAddress(minister.getAddress());
        ministerDTO.setStartFrom(minister.getStartFrom());
        ministerDTO.setUntil(minister.getUntil());
        return ministerDTO;
    }
    public List<Minister> findAll() {
        return this.ministerRepository.findAll();
    }
}