package com.example.demo.service;

import com.example.demo.entities.Multimedia;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Stream;

@Service
public class FilesStorageServiceImpl implements FilesStorageService {
    @Value("${upload.path}")
    private String uploadPath;
    private final Path root = Paths.get("src/main/resources/static/multimedia");

    public FilesStorageServiceImpl() {
    }

    public void init() {
        try {
            Files.createDirectories(this.root);
        } catch (IOException var2) {
            throw new RuntimeException("Could not initialize folder for upload!");
        }
    }

    public Multimedia save(MultipartFile file, String docType) {
        Multimedia multimedia = new Multimedia();

        try {
            String fileType = this.determineFileType(file.getContentType());
            String var10000 = UUID.randomUUID().toString();
            String fileName = var10000 + "_" + file.getOriginalFilename();
            Path subFolderPath = Paths.get(this.uploadPath, fileType);
            Files.createDirectories(subFolderPath);
            Path filePath = subFolderPath.resolve(fileName);
            Files.copy(file.getInputStream(), filePath, new CopyOption[0]);
            multimedia.setDocType(docType);
            multimedia.setFileName(fileName);
            multimedia.setType(file.getContentType());
            multimedia.setFilePath(fileType);
            return multimedia;
        } catch (Exception var8) {
            if (var8 instanceof FileAlreadyExistsException) {
                throw new RuntimeException("A file of that name already exists.");
            } else {
                throw new RuntimeException(var8.getMessage());
            }
        }
    }



    public Multimedia savepdfText(MultipartFile file, String docType,String lang) {
        Multimedia multimedia = new Multimedia();

        try {
            String fileType = this.determineFileType(file.getContentType());
            String var10000 = UUID.randomUUID().toString();
            String fileName = var10000 + "_" + file.getOriginalFilename();
            Path subFolderPath = Paths.get(this.uploadPath, fileType);
            if(lang == "en" || lang =="fr")
            {
                String newPath= fileType+"/"+lang;
                 subFolderPath = Paths.get(this.uploadPath, newPath);
                Files.createDirectories(subFolderPath);
            }
            else
            {
                String newPath= fileType+"/"+lang;
              
                subFolderPath = Paths.get(this.uploadPath, newPath);
                //System.out.println("new path to save"+subFolderPath);
                Files.createDirectories(subFolderPath);
            }
            
            Path filePath = subFolderPath.resolve(fileName);
            Files.copy(file.getInputStream(), filePath, new CopyOption[0]);
            multimedia.setDocType(docType);
            multimedia.setFileName(fileName);
           
            multimedia.setType(file.getContentType());
            multimedia.setFilePath(fileType);
            return multimedia;
        } catch (Exception var8) {
            if (var8 instanceof FileAlreadyExistsException) {
                throw new RuntimeException("A file of that name already exists.");
            } else {
                throw new RuntimeException(var8.getMessage());
            }
        }
    }


    public Resource load(String filename) {
        try {
            Path file = this.root.resolve(filename);
            Resource resource = new UrlResource(file.toUri());
            int i = 0;

            while(!resource.exists() || !resource.isReadable()) {
                Thread.sleep(100L);
                ++i;
                if (i == 20) {
                    break;
                }
            }

            return resource;
        } catch (MalformedURLException var5) {
            throw new RuntimeException("Error: " + var5.getMessage());
        } catch (InterruptedException var6) {
            throw new RuntimeException("Could not read the file!");
        }
    }

    public boolean delete(String filename) {
        try {
            Path file = this.root.resolve(filename);
            return Files.deleteIfExists(file);
        } catch (IOException var3) {
            throw new RuntimeException("Error: " + var3.getMessage());
        }
    }

    public List<Multimedia> saveFiles(List<MultipartFile> multipartFiles, String docType) {
        List<Multimedia> savedMultimedias = new ArrayList();
        Iterator var4 = multipartFiles.iterator();

        while(var4.hasNext()) {
            MultipartFile file = (MultipartFile)var4.next();
            savedMultimedias.add(this.save(file, docType));
        }

        return savedMultimedias;
    }

    public List<Multimedia> saveFilesPdfText(List<MultipartFile> multipartFiles, String docType,String lang) {
        List<Multimedia> savedMultimedias = new ArrayList();
        Iterator var4 = multipartFiles.iterator();

        while(var4.hasNext()) {
            MultipartFile file = (MultipartFile)var4.next();
            savedMultimedias.add(this.savepdfText(file, docType,lang));
        }

        return savedMultimedias;
    }

    public void deleteAll() {
        FileSystemUtils.deleteRecursively(this.root.toFile());
    }

    public Stream<Path> loadAll() {
        try {
            Stream<Path> var10000 = Files.walk(this.root, 1, new FileVisitOption[0]).filter((path) -> {
                return !path.equals(this.root);
            });
            Path var10001 = this.root;
            Objects.requireNonNull(var10001);
            return var10000.map(var10001::relativize);
        } catch (IOException var2) {
            throw new RuntimeException("Could not load the files!");
        }
    }

    public String determineFileType(String contentType) {
        if (contentType.startsWith("image")) {
            return "images";
        } else if (contentType.startsWith("video")) {
            return "videos";
        } else {
            return contentType.startsWith("application/pdf") ? "pdfs" : "other";
        }
    }
}
