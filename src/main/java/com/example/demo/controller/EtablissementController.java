package com.example.demo.controller;

import com.example.demo.dto.EtablissementDTO;
import com.example.demo.entities.Complexe;
import com.example.demo.entities.Etablissement;
import com.example.demo.entities.Lois;
import com.example.demo.entities.Multimedia;
import com.example.demo.service.*;
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
import java.util.Optional;

@Controller
@RequestMapping({"/etablissement"})
public class EtablissementController {
    @Autowired
    private EtablissementService etablissementService;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private MultimediaService multimediaService;
    @Autowired
    private ComplexeService complexeService;
    @Autowired
    private LoisService loisService;

    public EtablissementController() {
    }

    @GetMapping({"/add"})
    public String etablissementAdd(Model model) {
        return "authenticated/etablissement/etablissementAdd";
    }

    @PostMapping({"/save"})
    public String saveProfile(@ModelAttribute("userDTO") EtablissementDTO etablissementDTO) {
        this.etablissementService.saveEtablissement(etablissementDTO);
        return "redirect:/etablissement/etablissements";
    }

    @GetMapping({"/etablissements"})
    public String users(Model model) {
        List<Etablissement> etablissements = this.etablissementService.findAll();
        model.addAttribute("etablissements", etablissements);
        return "authenticated/etablissement/etablissements";
    }

    @GetMapping({"/multimedia/{folder}/{filename}"})
    public ResponseEntity<Resource> getFile(@PathVariable String filename, @PathVariable String folder) throws IOException {
        Resource file = this.filesStorageService.load(folder.concat("/" + filename));
        String contentType = Files.probeContentType(file.getFile().toPath());
        return ((BodyBuilder)ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType)).header("Content-Disposition", new String[]{"inline; filename=\"" + file.getFilename() + "\""})).body(new InputStreamResource(file.getInputStream()));
    }

    @GetMapping({"/lugo/{id}"})
    public ResponseEntity<Resource> getImage(@PathVariable("id") Long id) {
        String folder = "images";
        Etablissement etablissement = this.etablissementService.findEtablissementById(id);
        Optional<Multimedia> multimedia = this.multimediaService.findFirstByEtablissement(etablissement);
        if (multimedia.isPresent()) {
            String filename = ((Multimedia)multimedia.get()).getFileName();
            Resource file = this.filesStorageService.load(folder.concat("/" + filename));
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + file.getFilename() + "\""})).body(file);
        } else {
            Resource file = this.filesStorageService.load("staticImage".concat("/profile-img.jpg"));
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + file.getFilename() + "\""})).body(file);
        }
    }

    @GetMapping({"/EditEtablissement/{id}"})
    public String findTVById(Model model, @PathVariable Long id) {
        Etablissement etablissement = this.etablissementService.findEtablissementById(id);
        List etablissements;
        if (etablissement.getType().toString().equals("soustutelle")) {
            etablissements = this.etablissementService.findEtablissementsByType("soustutelle");
        } else {
            etablissements = this.etablissementService.findEtablissementsByType("reglementationsectorielle");
        }

        model.addAttribute("etablissement", etablissement);
        model.addAttribute("etablissements", etablissements);
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        return "authenticated/etablissement/etablissementsEdit.html";
    }
    @PutMapping({"/update/{id}"})
    public String updatedEtablissement(@PathVariable Long id,@RequestBody  Etablissement updateEtablissement)
    {
        Etablissement etablissement = this.etablissementService.findEtablissementById(id);
       // Optional<Multimedia> multimedia=this.multimediaService.findFirstByEtablissement(etablissement);
        this.etablissementService.updateDataEtablissement(updateEtablissement,id/*,multimedia */);
        return "redirect:authenticated/etablissement/etablissements";
    }
}
