package com.example.demo.controller;


import com.example.demo.dto.ComplexeDTO;
import com.example.demo.entities.Agrument;
import com.example.demo.entities.Complexe;
import com.example.demo.entities.TV;
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
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Optional;
import java.util.Locale;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
        
        model.addAttribute("agruments", agruments);
        model.addAttribute("complexeDTO", new ComplexeDTO());
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

     @GetMapping({"/ComplexEdit/{id}"})
    public String FindComplexById(Model model, @PathVariable Long id)
    { List<Agrument> agruments = this.agrumentService.findAll();
        model.addAttribute("complexeDTO", new ComplexeDTO());
        model.addAttribute("agruments", agruments);
        Complexe complex=this.complexeService.findComplexeById(id);
        model.addAttribute("complexe",complex);
        return "authenticated/complexe/complexesEdit";
    }


    @PostMapping({"/update/{id}"})
    public RedirectView  updatedTV(@PathVariable Long id,@ModelAttribute  Complexe updateComplexe,@RequestParam("selectedAgrument") List<Long> arg)
    //return "authenticated/etablissement/etablissementsEdit.html"; )
    {

        Complexe complexe = this.complexeService.findComplexeById(id);
       // Optional<Multimedia> multimedia=this.multimediaService.findFirstByEtablissement(etablissement);
       Optional<Complexe> existingTV = this.complexeService.findById(id);
       Boolean  check= this.complexeService.updateDataComplexe(updateComplexe,id,existingTV/*,multimedia */,arg);
       return new RedirectView("/complexe/complexes");
    }
    @GetMapping("/delete/{id}")
    public RedirectView getMethodName(@PathVariable Long id) {

        this.complexeService.DeleteComplexByid(id);
        return new RedirectView("/complexe/complexes");
    }
    
}
