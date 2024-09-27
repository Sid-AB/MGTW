package com.example.demo.controller;


import com.example.demo.dto.ComplexeDTO;
import com.example.demo.entities.Agrument;
import com.example.demo.entities.Complexe;
import com.example.demo.service.AgrumentService;
import com.example.demo.service.ComplexeService;
import com.example.demo.service.FilesStorageService;
import com.example.demo.service.MultimediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Controller
@RequestMapping({"/complexe"})
public class ComplexeController {
    @Autowired
    private ComplexeService complexeService;
    @Autowired
    private AgrumentService agrumentService;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private MultimediaService multimediaService;

    public ComplexeController() {
    }

    @GetMapping({"/add"})
    public String complexeAdd(Model model) {
        List<Agrument> agruments = this.agrumentService.findAll();
        model.addAttribute("complexeDTO", new ComplexeDTO());
        model.addAttribute("agruments", agruments);
        return "authenticated/complexe/complexeAdd";
    }

    @PostMapping({"/save"})
    public String saveProfile(@ModelAttribute("userDTO") ComplexeDTO complexeDTO) {
        this.complexeService.saveComplexe(complexeDTO);
        return "redirect:/complexe/complexes";
    }

    @GetMapping({"/complexes"})
    public String users(Model model) {
        List<Complexe> complexes = this.complexeService.findAll();
        model.addAttribute("complexes", complexes);
        return "authenticated/complexe/complexes";
    }

    @GetMapping({"/multimedia/{folder}/{filename}"})
    public ResponseEntity<Resource> getFile(@PathVariable String filename, @PathVariable String folder) throws IOException {
        Resource file = this.filesStorageService.load(folder.concat("/" + filename));
        String contentType = Files.probeContentType(file.getFile().toPath());
        return ((BodyBuilder)ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType)).header("Content-Disposition", new String[]{"inline; filename=\"" + file.getFilename() + "\""})).body(new InputStreamResource(file.getInputStream()));
    }
}
