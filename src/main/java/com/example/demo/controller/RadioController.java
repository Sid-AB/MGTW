package com.example.demo.controller;

import com.example.demo.dto.RadioDTO;
import com.example.demo.entities.*;
import com.example.demo.repository.AgrumentRepository;
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
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping({"/radio"})
public class RadioController {
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private RadioService radioService;
    @Autowired
    private LoisService loisService;
    @Autowired
    private ComplexeService complexeService;
    @Autowired
    private CategorieChaineService categorieChaineService;
    @Autowired
    private AgrumentRepository agrumentRepository;
    @Autowired
    private MultimediaService multimediaService;


    @Autowired
    private EtablissementService etablissementService;

    public RadioController() {
    }

    @GetMapping({"/add"})
    public String agrumentAdd(Model model) {
        List<Complexe> complexes = this.complexeService.findAll();
        List<CategorieChaine> categorieChaines = this.categorieChaineService.findAll();
        model.addAttribute("complexes", complexes);
        model.addAttribute("categorieChaines", categorieChaines);
        return "/authenticated/radio/radioAdd";
    }

    @PostMapping({"/save"})
    public String saveTV(@ModelAttribute("tvdto") RadioDTO radioDTO) {
        this.radioService.saveRadio(radioDTO);
        return "redirect:/radio/radios";
    }

    @GetMapping({"/radios"})
    public String radio(Model model) {
        List<Radio> radios = this.radioService.findAll();
        model.addAttribute("radios", radios);
        return "authenticated/radio/radios";
    }

    @GetMapping({"/{id}"})
    public String findTVById(Model model, @PathVariable Long id) {
        Radio radio = this.radioService.findRadioById(id);
        List radios;
        if (radio.getCategorie().toString().equals("national")) {
            radios = this.radioService.findRadioByCategorie("national");
        } else {
            radios = this.radioService.findRadioByCategorie("local");
        }

        model.addAttribute("radio", radio);
        model.addAttribute("radios", radios);
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);

        List  <Etablissement> etablissementImprssion= etablissementService.findEtablissementsByTypeEtablissmnt("société d'impression");
        model.addAttribute("etablissementImprssion", etablissementImprssion);
        return "notAuthenticated/radio/radioDetails";
    }

    @GetMapping({"/public", "/public/"})
    public String cPublic(Model model) {
        List<Radio> radiosNational = this.radioService.findRadioByCategorie("national");
        List<Radio> radiosLocal = this.radioService.findRadioByCategorie("local");
        List<Lois> loisForNavBar = this.loisService.findAll();
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        model.addAttribute("loisForNavBar", loisForNavBar);
        model.addAttribute("radiosNational", radiosNational);
        model.addAttribute("radiosLocal", radiosLocal);

        List  <Etablissement> etablissementImprssion= etablissementService.findEtablissementsByTypeEtablissmnt("société d'impression");
        model.addAttribute("etablissementImprssion", etablissementImprssion);
        return "notAuthenticated/radio/radioGeneral";
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
        Radio radio = this.radioService.findRadioById(id);
        Optional<Multimedia> multimedia = this.multimediaService.findFirstByRadioOrderByIdDesc(radio);
        if (multimedia.isPresent()) {
            String filename = ((Multimedia)multimedia.get()).getFileName();
            Resource file = this.filesStorageService.load(folder.concat("/" + filename));
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + file.getFilename() + "\""})).body(file);
        } else {
            Resource file = this.filesStorageService.load("staticImage".concat("/nothing.png"));
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + file.getFilename() + "\""})).body(file);
        }
    }

    @GetMapping({"/RadioEdit/{id}"})
    public String FindRadioById(Model model, @PathVariable Long id)
    {
        Radio radio=this.radioService.findRadioById(id);
        model.addAttribute("radio",radio);
        return "authenticated/radio/radioEdit";
    }


    @PostMapping({"/update/{id}"})
    public RedirectView updatedRadio(@PathVariable Long id,@ModelAttribute  Radio updateRadio,@RequestParam("profilFiles") List<MultipartFile> multimediaFiles)
    {
        Radio presse = this.radioService.findRadioById(id);
       // Optional<Multimedia> multimedia=this.multimediaService.findFirstByEtablissement(etablissement);
       Optional<Radio> existingRadio = this.radioService.findById(id);
       Boolean  check= this.radioService.updateDataRadio(updateRadio,id,existingRadio,multimediaFiles);
       //return "authenticated/etablissement/etablissementsEdit.html";
       return new RedirectView("/radio/radios");
    }
    @GetMapping("/delete/{id}")
    public RedirectView DeleteRadioById(@PathVariable Long id)
     {
        this.radioService.DeleteRadioById(id);
        return new RedirectView("/radio/radios");
    }
    
}