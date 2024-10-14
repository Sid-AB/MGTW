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
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
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
        List<Etablissement> etablissements = this.etablissementService.findEtablissementsSoustutelleSansApsEtSociete();
        model.addAttribute("etablissements", etablissements);
        System.out.println("Etablissements added: " + etablissements.size()); 
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
        Optional<Multimedia> multimedia = this.multimediaService.findFirstByEtablissementOrderByIdDesc(etablissement);
        if (multimedia.isPresent()) {
            String filename = ((Multimedia)multimedia.get()).getFileName();
            Resource file = this.filesStorageService.load(folder.concat("/" + filename));
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + file.getFilename() + "\""})).body(file);
        } else {
            Resource file = this.filesStorageService.load(folder.concat("/Frame 4.png"));
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + file.getFilename() + "\""})).body(file);
        }
    }


    @GetMapping({"/{id}"})
    public String findTVById(Model model, @PathVariable Long id) {
        Etablissement etablissement = this.etablissementService.findEtablissementById(id);
        List etablissements;
        List etablissementsByTypeEtablissmnt;
        if (etablissement.getType().toString().equals("soustutelle")) {
            etablissements = this.etablissementService.findEtablissementsByType("soustutelle");
        } else {
            etablissements = this.etablissementService.findEtablissementsByType("reglementationsectorielle");
        }

           //pour le typeEtablisssmnt aps et priinters
           if (etablissement.getTypeEtablissmnt().toString().equals("aps")) {
            etablissementsByTypeEtablissmnt = this.etablissementService.findEtablissementsByTypeEtablissmnt("aps");
        } else if (etablissement.getTypeEtablissmnt().toString().equals("société d'impression")) {
            etablissementsByTypeEtablissmnt = this.etablissementService.findEtablissementsByTypeEtablissmnt("société d'impression");
        } else {
             etablissementsByTypeEtablissmnt = null; //liste vide si aucune 
        }
        model.addAttribute("etablissement", etablissement);
        model.addAttribute("etablissements", etablissements);
        model.addAttribute("etablissementsByTypeEtablissmnt", etablissementsByTypeEtablissmnt);
       
        List  <Etablissement> etablissementImprssion= etablissementService.findEtablissementsByTypeEtablissmnt("société d'impression");
        model.addAttribute("etablissementImprssion", etablissementImprssion);
       
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        return "notAuthenticated/etablissement/etablissementDetails";
    }

    @GetMapping({"/EditEtablissement/{id}"})
    public String findEtablisById(Model model, @PathVariable Long id) {
        Etablissement etablissement = this.etablissementService.findEtablissementById(id);
        List etablissements;
        List etablissementsByTypeEtablissmnt;

        if (etablissement.getType().toString().equals("soustutelle")) {
            etablissements = this.etablissementService.findEtablissementsByType("soustutelle");
        } else {
            etablissements = this.etablissementService.findEtablissementsByType("reglementationsectorielle");
        }
             //pour le typeEtablisssmnt aps et priinters
        if (etablissement.getTypeEtablissmnt().toString().equals("aps")) {
            etablissementsByTypeEtablissmnt = this.etablissementService.findEtablissementsByTypeEtablissmnt("aps");
        } else if (etablissement.getTypeEtablissmnt().toString().equals("société d'impression")) {
            etablissementsByTypeEtablissmnt = this.etablissementService.findEtablissementsByTypeEtablissmnt("société d'impression");
        } else {
             etablissementsByTypeEtablissmnt = null; //liste vide si aucune 
        }
        model.addAttribute("etablissement", etablissement);
        model.addAttribute("etablissements", etablissements);
        
        model.addAttribute("etablissementsByTypeEtablissmnt", etablissementsByTypeEtablissmnt);
        List  <Etablissement> etablissementImprssion= etablissementService.findEtablissementsByTypeEtablissmnt("société d'impression");
        model.addAttribute("etablissementImprssion", etablissementImprssion);

        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        return "authenticated/etablissement/etablissementsEdit.html";
    }
    @PostMapping({"/update/{id}"})
    public RedirectView updatedEtablissement(@PathVariable Long id,@ModelAttribute  Etablissement updateEtablissement,@RequestParam("profilFiles") List<MultipartFile> multimediaFiles)
    {
        Etablissement etablissement = this.etablissementService.findEtablissementById(id);
       // Optional<Multimedia> multimedia=this.multimediaService.findFirstByEtablissementOrderByIdDesc(etablissement);

       Optional<Etablissement> existingEtablissement = this.etablissementService.findById(id);
       Boolean  check= this.etablissementService.updateDataEtablissement(updateEtablissement,id,existingEtablissement,multimediaFiles );
       return new RedirectView("/etablissement/etablissements");
      //  return "redirect:authenticated/etablissement/etablissements";
    }

    //pour afficher type etablissmnt aps
    @GetMapping("/aps")
    public String AfficheAPS(Model model) {
        List <Etablissement> etablissements = etablissementService.findEtablissementsByTypeEtablissmnt("APS");
        Object etablissement; // il peut etre un seul ou liste 
    
        if (etablissements.size() == 1) {
            // if only one APs
            etablissement = etablissements.get(0);
        } else {
            //if y  a plusieurs use llist
            etablissement= etablissements;
        }
    
        model.addAttribute("etablissement", etablissement);
         //System.out.println("Etablissements aps: " + etablissement.size()); 
         List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
         model.addAttribute("complexesForNavBar", complexesForNavBar);
         List<Lois> loisForNavBar = this.loisService.findAll();
         model.addAttribute("loisForNavBar", loisForNavBar);

         List  <Etablissement> etablissementImprssion= etablissementService.findEtablissementsByTypeEtablissmnt("société d'impression");
         model.addAttribute("etablissementImprssion", etablissementImprssion);
         return "notAuthenticated/etablissement/etablissementDetails"; 
     }
 
     
    

    
    @GetMapping("/societe-impression")
    public String AfficheSociete(Model model) {
        List  <Etablissement> etablissement= etablissementService.findEtablissementsByTypeEtablissmnt("société d'impression");
        for (Etablissement etablissements : etablissement) {
         System.out.println("Etablissement name: " + etablissements.getName()); 
     }
        model.addAttribute("etablissement", etablissement);   
       System.out.println("Etablissements size: " + (etablissement != null ? etablissement.size() : "null"));
     
         //System.out.println("Etablissements impresssion: " + etablissement.size()); 
         List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
         model.addAttribute("complexesForNavBar", complexesForNavBar);
         List<Lois> loisForNavBar = this.loisService.findAll();
         model.addAttribute("loisForNavBar", loisForNavBar);
         return "notAuthenticated/etablissement/etablissementDetails"; 
     }
     @GetMapping("/societe-impression/{id}")
     public String AfficheSocieteById(@PathVariable("id") Long id, Model model) {
         
         Etablissement etablissement = etablissementService.findEtablissementById(id);
     
        //condition if societe d'impression
         if (etablissement != null && "société d'impression".equals(etablissement.getTypeEtablissmnt())) {
            // System.out.println("Selected Etablissement name: " + etablissement.getName());
             model.addAttribute("etablissement", etablissement);
         } 
         List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
         model.addAttribute("complexesForNavBar", complexesForNavBar);
     
         List<Lois> loisForNavBar = this.loisService.findAll();
         model.addAttribute("loisForNavBar", loisForNavBar);
     
        
         return "notAuthenticated/etablissement/etablissementDetails";
     }
     
}