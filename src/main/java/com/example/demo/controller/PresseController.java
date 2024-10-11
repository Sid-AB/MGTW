package com.example.demo.controller;


import com.example.demo.dto.PresseDTO;
import com.example.demo.entities.*;
import com.example.demo.repository.PresseCategorieRepository;
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
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

@Controller
@RequestMapping({"/presse"})
public class PresseController {
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private LoisService loisService;
    @Autowired
    private PresseService presseService;
    @Autowired
    private ComplexeService complexeService;
    @Autowired
    private PresseCategorieService presseCategorieService;
    @Autowired
    private PresseCategorieRepository presseCategorieRepository;
    @Autowired
    private MultimediaService multimediaService;

    public PresseController() {
    }

    @GetMapping({"/add"})
    public String presseAdd(Model model) {
        List<Complexe> complexes = this.complexeService.findAll();
        List<PresseCategorie> presseCategories = this.presseCategorieService.findAll();
        model.addAttribute("complexes", complexes);
        model.addAttribute("presseDTO", new PresseDTO());
        model.addAttribute("presseCategories", presseCategories);
        return "authenticated/presse/presseAdd";
    }

    @PostMapping({"/save"})
    public String savepresse(@ModelAttribute("presseDTO") PresseDTO presseDTO) {
        this.presseService.saveRadio(presseDTO);
        return "redirect:/presse/presses";
    }

    @GetMapping({"/presses"})
    public String presse(Model model) {
        List<Presse> presses = this.presseService.findAll();
        model.addAttribute("presses", presses);
        return "authenticated/presse/presses";
    }

    @GetMapping({"/public", "/public/"})
    public String cPublic(Model model) {
        List<PresseCategorie> presseCategories = new ArrayList<>();
        presseCategories.add(this.presseCategorieRepository.findPresseCategorieByName("مكتوبة"));
        List<Presse> pressesEcritPublic = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories, "public");
        List<Presse> pressesEcritPrive = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories, "prive");
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        model.addAttribute("pressesEcritPublic", pressesEcritPublic);
        model.addAttribute("pressesEcritPrive", pressesEcritPrive);
        return "notAuthenticated/presse/presseGeneral";
    }

    /*@GetMapping({"/public/electronique", "/public/electronique/"})
    public String cPublicElectronique(Model model) {
        new ArrayList<>();
        List<PresseCategorie> presseCategories1 = new ArrayList<>();
        presseCategories1.add(this.presseCategorieRepository.findPresseCategorieByName("electronique"));
        List<Presse> pressesElectroniquePublic = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories1, "public");
        List<Presse> pressesElectroniquePrive = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories1, "prive");
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        model.addAttribute("pressesElectroniquePublic", pressesElectroniquePublic);
        model.addAttribute("pressesElectroniquePrive", pressesElectroniquePrive);
        return "notAuthenticated/presse/presseGeneralelectronique";
    } */

    @GetMapping({"/public/electronique", "/public/electronique/"})
    public String cPublicElectronique(Model model) {
        new ArrayList<>();
        List<PresseCategorie> presseCategories1 = new ArrayList<>();
        presseCategories1.add(this.presseCategorieRepository.findPresseCategorieByName("رقمية"));
        List<Presse> pressesElectroniquePublic = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories1, "public");
        List<Presse> pressesElectroniquePrive = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories1, "prive");
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        model.addAttribute("pressesElectroniquePublic", pressesElectroniquePublic);
        model.addAttribute("pressesElectroniquePrive", pressesElectroniquePrive);
        return "notAuthenticated/presse/presseGeneralelectronique";
    }

    @GetMapping({"/{id}"})
    public String findTVById(Model model, @PathVariable Long id) {
        Presse presse = this.presseService.findPresseById(id);
        List<Presse> pressesElectroniquePublic = new ArrayList<>();
        List<Presse> pressesElectroniquePrive = new ArrayList<>();
        List<Presse> pressesEcritPublic = new ArrayList<>();
        List<Presse> pressesEcritPrive = new ArrayList<>();
        List<Presse> pressesList = new ArrayList<>();
        List<PresseCategorie> presseCategories1 = new ArrayList<>();
        presseCategories1.add(this.presseCategorieRepository.findPresseCategorieByName("رقمية"));
        List<PresseCategorie> presseCategories = new ArrayList<>();
        presseCategories.add(this.presseCategorieRepository.findPresseCategorieByName("مكتوبة"));
        Iterator var12;
        PresseCategorie presseCategorie;
        if (presse.getTypepbpr().toString().equals("public")) {
            var12 = presse.getPresseCategories().iterator();

            while(var12.hasNext()) {
                presseCategorie = (PresseCategorie)var12.next();
                if (presseCategorie.getName().equals("رقمية")) {
                    pressesElectroniquePublic = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories1, "public");
                } else {
                    pressesElectroniquePrive = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories1, "prive");
                }
            }
        } else {
            var12 = presse.getPresseCategories().iterator();

            while(var12.hasNext()) {
                presseCategorie = (PresseCategorie)var12.next();
                if (presseCategorie.getName().equals("مكتوبة")) {
                    pressesEcritPublic = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories, "public");
                } else {
                    pressesEcritPrive = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories, "prive");
                }
            }
        }

        pressesList.addAll((Collection)pressesElectroniquePublic);
        pressesList.addAll((Collection)pressesElectroniquePrive);
        pressesList.addAll((Collection)pressesEcritPublic);
        pressesList.addAll((Collection)pressesEcritPrive);
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        model.addAttribute("presse", presse);
        model.addAttribute("pressesList", pressesList);
        return "notAuthenticated/presse/presseDetails";
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
        Presse presse = this.presseService.findPresseById(id);
        Optional<Multimedia> multimedia = this.multimediaService.findFirstByPresse(presse);
        if (multimedia.isPresent()) {
            String filename = ((Multimedia)multimedia.get()).getFileName();
            Resource file = this.filesStorageService.load(folder.concat("/" + filename));
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + file.getFilename() + "\""})).body(file);
        } else {
            Resource file = this.filesStorageService.load("staticImage".concat("/nothing.png"));
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + file.getFilename() + "\""})).body(file);
        }
    }

    @GetMapping({"/pressesEdit/{id}"})
    public String FindPressById(Model model, @PathVariable Long id)
    {
        Presse press=this.presseService.findPresseById(id);
        model.addAttribute("press",press);
        return "authenticated/presse/pressEdit";
    }


    @PostMapping({"/update/{id}"})
    public RedirectView updatedPress(@PathVariable Long id,@ModelAttribute  Presse updatePress)
    {
        Presse presse = this.presseService.findPresseById(id);
       // Optional<Multimedia> multimedia=this.multimediaService.findFirstByEtablissement(etablissement);
       Optional<Presse> existingPress = this.presseService.findById(id);
       Boolean  check= this.presseService.updateDataPresse(updatePress,id,existingPress/*,multimedia */);
       //return "authenticated/etablissement/etablissementsEdit.html";
       return new RedirectView("/presse/presses");
    }
}
