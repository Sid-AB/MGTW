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
    Multimedia savepdfText(MultipartFile file, String docType,String lang);
    Resource load(String filename);

    boolean delete(String filename);

    List<Multimedia> saveFiles(List<MultipartFile> multipartFiles, String docType);
    List<Multimedia> saveFilesPdfText(List<MultipartFile> multipartFiles, String docType,String lang);

    void deleteAll();

    Stream<Path> loadAll();
}
