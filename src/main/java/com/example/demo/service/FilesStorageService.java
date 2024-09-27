package com.example.demo.service;


import com.example.demo.entities.Multimedia;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public interface FilesStorageService {
    void init();

    Multimedia save(MultipartFile file, String docType);

    Resource load(String filename);

    boolean delete(String filename);

    List<Multimedia> saveFiles(List<MultipartFile> multipartFiles, String docType);

    void deleteAll();

    Stream<Path> loadAll();
}
