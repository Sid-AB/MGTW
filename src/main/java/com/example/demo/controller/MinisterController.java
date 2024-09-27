
package com.example.demo.controller;

import com.example.demo.dto.MinisterDTO;
import com.example.demo.entities.Multimedia;
import com.example.demo.entities.Minister;
import com.example.demo.service.MinisterService;
import com.example.demo.service.MultimediaService;
import com.example.demo.service.FilesStorageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping({"/ministers"})
public class MinisterController {

    @Autowired
    private MinisterService ministerService;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private MultimediaService multimediaService;

    public MinisterController()
    {
        
    }

    @PostMapping
    public ResponseEntity<MinisterDTO> createMinister(@RequestBody MinisterDTO ministerDTO) {
        MinisterDTO createdMinister = ministerService.createMinister(ministerDTO);
        return ResponseEntity.ok(createdMinister);
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<MinisterDTO> getMinister(@PathVariable Long id) {
        MinisterDTO ministerDTO = ministerService.getMinister(id);
        return ResponseEntity.ok(ministerDTO);
    }
    @GetMapping({"/add"})
    public String minAdd(Model model) {
        return "authenticated/minister/ministerAdd";
    }
    @GetMapping({"/Mins"})
    public String mins(Model model) {
        List<Minister> Mins = this.ministerService.findAll();
        model.addAttribute("Mins", Mins);
        return "authenticated/minister/ministers";
    }
    @PostMapping({"/save"})
    public String saveMin(@ModelAttribute("MinisterDTO") MinisterDTO ministerDTO) {
        this.ministerService.createMinister(ministerDTO);
        return "redirect:/ministers/Mins";
    }
    @GetMapping({"/list"})
    public String minpublic(Model model) {
        List<Minister> Mins = this.ministerService.findAll();
        model.addAttribute("Mins", Mins);
        return "notAuthenticated/minister/minlist";
    }
}