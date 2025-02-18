package com.example.demo.service;


import com.example.demo.dto.MinisterDTO;
import com.example.demo.entities.Multimedia;
import com.example.demo.entities.Radio;
import com.example.demo.entities.Minister;
import com.example.demo.repository.MultimediaRepository;
import com.example.demo.repository.MinisterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Value;

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
        System.out.println("French first name: " + ministerDTO.getFirstNameFr());
        System.out.println("French last name: " + ministerDTO.getLastNameFr());
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
        minister.setFirstNameFr(ministerDTO.getFirstNameFr()); // Set first name in French
        minister.setLastNameFr(ministerDTO.getLastNameFr());   // Set last name in French
        minister.setBirthday(ministerDTO.getBirthday());
        minister.setAddress(ministerDTO.getAddress());
        minister.setStartFrom(ministerDTO.getStartFrom());
        minister.setUntil(ministerDTO.getUntil());
        minister.setprofilePicture(multimedia);

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
        ministerDTO.setFirstNameFr(minister.getFirstNameFr()); // Set first name in French     
        ministerDTO.setLastNameFr(minister.getLastNameFr());   // Set last name in French      
        ministerDTO.setBirthday(minister.getBirthday());
        ministerDTO.setAddress(minister.getAddress());
        ministerDTO.setStartFrom(minister.getStartFrom());
        ministerDTO.setUntil(minister.getUntil());
        return ministerDTO;
    }
    public List<Minister> findAll() {
        return this.ministerRepository.findAll();
    }
    public Minister findMinisterById(Long id) {
        return this.ministerRepository.findMinisterById(id);
    }

    public Optional<Minister> findById(Long id) {
        return this.ministerRepository.findById(id);
    }

    public String getMinisterImagePath(Long ministerId) {
        return ministerRepository.findImagePathByMinisterId(ministerId);
    }

    public Boolean updateDataMins(Minister minister, Long userId,Optional<Minister> existingMin/*, Optional<Multimedia> multimedias */) {
        if (existingMin.isPresent()) {
            Minister mins = existingMin.get();
            mins.setFirstName(minister.getFirstName());
            mins.setFirstNameFr(minister.getFirstNameFr());
            mins.setLastName(minister.getLastName());
            mins.setLastNameFr(minister.getLastNameFr());
            mins.setUntil(minister.getUntil());
            mins.setStartFrom(minister.getStartFrom());
            this.ministerRepository.save(mins);
      /*  if (multimedias.isPresent()) {
            List<Multimedia> savedMultimedias = new ArrayList();
            multimedias.ifPresent((multimedia) -> {
                multimedia.setRadio(existingRadio);
            });
            multimedias.ifPresent(savedMultimedias::addAll);
            savedMultimedias.ifPresent(existingRadio::setMultimediaList);
            this.multimediaRepository.saveAll(savedMultimedias);
        } */
        return true;
    }
    else
    {
        return false;
    }
      //  return existingRadio;
    }

}