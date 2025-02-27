package com.example.demo.controller;

import com.example.demo.dto.TextJuridiqueDTO;
import com.example.demo.entities.Complexe;
import com.example.demo.entities.Etablissement;
import com.example.demo.entities.Lois;
import com.example.demo.entities.Minister;
import com.example.demo.entities.Multimedia;
import com.example.demo.entities.TextJuridique;
import com.example.demo.service.ComplexeService;
import com.example.demo.service.EtablissementService;
import com.example.demo.service.FilesStorageService;
import com.example.demo.service.LoisService;
import com.example.demo.service.MultimediaService;
import com.example.demo.service.TextJuridiqueService;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping({"/textJuridique"})
public class TextJuridiqueController {
    @Autowired
    private LoisService loisService;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private TextJuridiqueService textJuridiqueService;
    @Autowired
    private MultimediaService multimediaService;

    @Autowired
    private ComplexeService complexeService;

    @Autowired
    private EtablissementService etablissementService;

    public TextJuridiqueController() {
    }

    @GetMapping({"/add"})
    public String agrumentAdd(Model model) {
        List<Lois> lois = this.loisService.findAll();
        model.addAttribute("lois", lois);
        return "authenticated/textJuridique/textJuridiqueAdd";
    }

    @PostMapping({"/save"})
    public String saveProfile(@ModelAttribute("textJuridiqueDTO") TextJuridiqueDTO textJuridiqueDTO) {
        this.textJuridiqueService.saveTextJuridique(textJuridiqueDTO);
        return "redirect:/textJuridique/textJuridiques";
    }

    @GetMapping({"/textJuridiques"})
    public String users(Model model) {
        List<TextJuridique> textJuridiques = this.textJuridiqueService.findAll();
        model.addAttribute("textJuridiques", textJuridiques);
        return "authenticated/textJuridique/textJuridiques";
    }

    @GetMapping({"/Edit/{id}"})
    public String usersEdit(Model model,@PathVariable Long id) {
        TextJuridique textJuridique = this.textJuridiqueService.findTextJuridiqueById(id);
        model.addAttribute("textJuridique", textJuridique);
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        List<Lois> lois = this.loisService.findAll();
        model.addAttribute("lois", lois);


        List  <Etablissement> etablissementImprssion= etablissementService.findEtablissementsByTypeEtablissmnt("société d'impression");
        model.addAttribute("etablissementImprssion", etablissementImprssion);
        return "authenticated/textJuridique/textJuridiqueEdit";
    }

    @GetMapping({"/multimedia/{folder}/{filename}"})
    public ResponseEntity<Resource> getFile(@PathVariable String filename, @PathVariable String folder) throws IOException {
        Resource file = this.filesStorageService.load(folder.concat("/" + filename));
        String contentType = Files.probeContentType(file.getFile().toPath());
        return ((BodyBuilder)ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType)).header("Content-Disposition", new String[]{"inline; filename=\"" + file.getFilename() + "\""})).body(new InputStreamResource(file.getInputStream()));
    }

/*    @GetMapping({"/pdf/{id}"})
    public ResponseEntity<Resource> getImage(@PathVariable("id") Long id) {
        String folder = "pdfs";
        TextJuridique textJuridique = this.textJuridiqueService.findTextJuridiqueById(id);
        Optional<Multimedia> multimedia = this.multimediaService.findFirstByTextJuridique(textJuridique);
        if (multimedia.isPresent()) {
            String filename = ((Multimedia)multimedia.get()).getFileName();
            Resource file = this.filesStorageService.load(folder.concat("/" + filename));
            String contentType = null;

            try {
                contentType = Files.probeContentType(file.getFile().toPath());
            } catch (IOException var10) {
                throw new RuntimeException(var10);
            }

            try {
                return ((BodyBuilder)ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType)).header("Content-Disposition", new String[]{"inline; filename=\"" + file.getFilename() + "\""})).body(new InputStreamResource(file.getInputStream()));
            } catch (IOException var9) {
                throw new RuntimeException(var9);
            }
        } else {
            Resource file = this.filesStorageService.load("staticImage".concat("/profile-img.jpg"));
            String contentType = null;

            try {
                contentType = Files.probeContentType(file.getFile().toPath());
            } catch (IOException var12) {
                throw new RuntimeException(var12);
            }

            try {
                return ((BodyBuilder)ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType)).header("Content-Disposition", new String[]{"inline; filename=\"" + file.getFilename() + "\""})).body(new InputStreamResource(file.getInputStream()));
            } catch (IOException var11) {
                throw new RuntimeException(var11);
            }
        }
    } */

    @GetMapping("/pdf/{id}/{lang}")
    public ResponseEntity<Resource> getImage(@PathVariable("id") Long id, @PathVariable("lang") String lang) {
        String folder = "pdfs";
        TextJuridique textJuridique = this.textJuridiqueService.findTextJuridiqueById(id);


       
       
        String folderFr="pdfs/fr";
        String folderAr="pdfs/ar";

        if ("en".equals(lang) || "fr".equals(lang)) {
            folder = folderFr; // Change lang à "fr" si il est "en"
        }
        else
        {
            folder=folderAr;
        }
        Multimedia multimedia = this.multimediaService.findByTextJuridiqueAndFilePath(textJuridique,folder);
        if (multimedia != null) {
            String filename = multimedia.getFileName(); // Supposons que ce soit la colonne unique
    
            // Vérifie la langue et change "en" en "fr"
          
    
            // Construire le chemin du fichier
            String filePath = folder.concat( "/" + filename);
         //   System.out.println("hb55 "+ filePath); // Log du chemin
    
            Resource file = this.filesStorageService.load(filePath);
            String contentType;
         //   System.out.println("filedd "+ file); // Log du chemin
    
            // Détection du type MIME
            try {
                contentType = Files.probeContentType(file.getFile().toPath());
            } catch (IOException e) {
                throw new RuntimeException("Erreur lors de la détection du type MIME : " + e.getMessage());
            }
    
            try {
                return ResponseEntity.ok()
                        .contentType(MediaType.parseMediaType(contentType))
                        .header("Content-Disposition", "inline; filename=\"" + file.getFilename() + "\"")
                        .body(new InputStreamResource(file.getInputStream()));
            } catch (IOException e) {
                throw new RuntimeException("Erreur lors de la lecture du fichier : " + e.getMessage());
            }
        } else {
            // Fichier par défaut si aucun fichier multimedia n'est trouvé
            Resource file = this.filesStorageService.load("staticImage/profile-img.jpg");
            String contentType;
    
            try {
                contentType = Files.probeContentType(file.getFile().toPath());
            } catch (IOException e) {
                throw new RuntimeException("Erreur lors de la détection du type MIME : " + e.getMessage());
            }
    
            try {
                return ResponseEntity.ok()
                        .contentType(MediaType.parseMediaType(contentType))
                        .header("Content-Disposition", "inline; filename=\"" + file.getFilename() + "\"")
                        .body(new InputStreamResource(file.getInputStream()));
            } catch (IOException e) {
                throw new RuntimeException("Erreur lors de la lecture du fichier : " + e.getMessage());
            }
        }
    }
    
    

 @PostMapping({"/update/{id}"})
    public RedirectView updatedRadio(@PathVariable Long id,@ModelAttribute  TextJuridique updateMin)
    {
        TextJuridique mins = this.textJuridiqueService.findTextJuridiqueById(id);
       // Optional<Multimedia> multimedia=this.multimediaService.findFirstByEtablissement(etablissement);
       Optional<TextJuridique> existingMins = this.textJuridiqueService.findById(id);
       Boolean  check= this.textJuridiqueService.updateDataMins(updateMin,id,existingMins/*,multimedia */);
        if(check)
        {
            return new RedirectView("/textJuridique/textJuridiques");
        }
        else
        {
            return new RedirectView("/home");
        }
     
    }
      
@GetMapping("/delete/{id}")
public RedirectView getMethodName(@PathVariable Long id) {
    this.textJuridiqueService.deleteTextJuridique(id);
    return new RedirectView("/textJuridique/textJuridiques");
}

    
    
}
