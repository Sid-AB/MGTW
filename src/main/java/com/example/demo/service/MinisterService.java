package com.example.demo.service;


import com.example.demo.dto.MinisterDTO;
import com.example.demo.entities.Multimedia;
import com.example.demo.entities.Minister;
import com.example.demo.repository.MultimediaRepository;
import com.example.demo.repository.MinisterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class MinisterService {
    @Value("${upload.path}")
    private String uploadPath;
    @Autowired
    private MinisterRepository ministerRepository;

    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private MultimediaRepository multimediaRepository;

    public Minister addMinisterWithProfilePicture(MinisterDTO ministerDTO) throws IOException {
        MultipartFile profilePicture = ministerDTO.getprofilePicture();

        // Save the profile picture to the server
        byte[] bytes = profilePicture.getBytes();
        Path path = Paths.get(uploadPath + profilePicture.getOriginalFilename());
        Files.write(path, bytes);

        // Save multimedia entry for the profile picture
        Multimedia multimedia = new Multimedia();
        multimedia.setFileName(profilePicture.getOriginalFilename());
        multimedia.setFilePath(path.toString());
        multimediaRepository.save(multimedia);

        // Create and save the Minister entity
        Minister minister = new Minister();
        minister.setFirstName(ministerDTO.getFirstName());
        minister.setLastName(ministerDTO.getLastName());
        minister.setBirthday(ministerDTO.getBirthday());
        minister.setAddress(ministerDTO.getAddress());
        minister.setStartFrom(ministerDTO.getStartFrom());
        minister.setUntil(ministerDTO.getUntil());
        minister.setprofilePicture(multimedia); // Associate profile picture

        return ministerRepository.save(minister);
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