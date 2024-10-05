
package com.example.demo.controller;

import com.example.demo.dto.MinisterDTO;
import com.example.demo.entities.Multimedia;
import com.example.demo.entities.Radio;
import com.example.demo.entities.Minister;
import com.example.demo.service.MinisterService;
import com.example.demo.service.MultimediaService;
import com.example.demo.service.FilesStorageService;
import com.example.demo.repository.MultimediaRepository;
import com.example.demo.repository.MinisterRepository;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.i18n.LocaleContextHolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@Controller
@RequestMapping({"/ministers"})
public class MinisterController {

    @Value("${upload.path}")
    private String uploadPath;
    @Autowired
    private MinisterService ministerService;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private MultimediaService multimediaService;
    @Autowired
    private MinisterRepository ministerRepository;
    @Autowired
    private MultimediaRepository multimediaRepository;
    public MinisterController()
    {
       

    }

   /*  @PostMapping
    public ResponseEntity<MinisterDTO> createMinister(@RequestBody MinisterDTO ministerDTO) {
        MinisterDTO createdMinister = ministerService.createMinister(ministerDTO);
     
        return ResponseEntity.ok(createdMinister);
    }*/

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
        try {
            Minister savedMinister = ministerService.addMinisterWithProfilePicture(ministerDTO);
            return "redirect:/ministers/Mins";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error while saving minister: " + e.getMessage();
        }
    }   
    @GetMapping({"/list"})
    public String minpublic(Model model) {
        List<Minister> Mins = this.ministerService.findAll();
        //System.out.println("Nombre de ministres trouvés: " + Mins.size());
  
        model.addAttribute("Mins", Mins);
        return "notAuthenticated/minister/minlist";
    }
    /*@GetMapping({"/list"})
    public String minpublic(Model model) {
        // Récupérer votre liste de ministres
        List<Minister> ministers = this.ministerService.findAll(); // Assurez-vous que cette ligne récupère la liste
        //System.out.println("Number of ministers: " + ministers.size());
        DateTimeFormatter formatterYear = DateTimeFormatter.ofPattern("yyyy");
        DateTimeFormatter formatterMonth = DateTimeFormatter.ofPattern("yyyy-MM");
    
        List<MinisterDTO> ministerDTOs = new ArrayList<>(); // Liste pour les DTOs
    
        for (Minister minister : ministers) {
            MinisterDTO dto = new MinisterDTO();
            dto.setFirstName(minister.getFirstName());
            dto.setLastName(minister.getLastName());
            // Appliquer le formatage
            String formattedDateDebut = formatDate(minister.getStartFrom(), formatterYear, formatterMonth);
    String formattedDateFin = formatDate(minister.getUntil(), formatterYear, formatterMonth);
    
    dto.setFormattedDateDebut(formattedDateDebut);
    dto.setFormattedDateFin(formattedDateFin);
    
    // Affichez les informations du DTO
    System.out.println("Minister DTO: " + dto.getFirstName() + " " + dto.getLastName() +
                       " - Start Date: " + formattedDateDebut +
                       " - End Date: " + formattedDateFin);
    
            ministerDTOs .add(dto); // Ajouter le DTO à la liste
          
        }
    
        model.addAttribute("ministers",ministerDTOs ); // Passer les DTOs à la vue
       // System.out.println("Number of ministerDTOs: " + ministerDTOs.size());
        return "notAuthenticated/minister/minlist"; // Retourner le nom de la vue
    }
    */
    /*private String formatDate(LocalDate date, DateTimeFormatter formatterYear, DateTimeFormatter formatterMonth) {
        if (date == null) {
            System.out.println("Date is null."); // Ajoutez ceci pour vérifier les dates nulles
            return "Aucune date"; // Gérer le cas où la date est nulle
        }
    
        System.out.println("Original date: " + date); // Affichez la date originale
    
        String formattedDate;
        if (date.getDayOfMonth() == 1 && date.getMonthValue() == 1) {
            formattedDate = date.format(formatterYear); // Affiche uniquement l'année
        } else if (date.getDayOfMonth() == 1) {
            formattedDate = date.format(formatterMonth); // Affiche année et mois
        } else {
            formattedDate = date.format(formatterMonth); // Affiche année et mois
        }
    
        System.out.println("Formatted date: " + formattedDate); // Affichez la date formatée
        return formattedDate;
    }*/

  /*  @GetMapping({"/pic/{id}"})
    public ResponseEntity<byte[]> getMinisterImage(@PathVariable Long id) {
            Minister mins=this.ministerRepository.findMinisterById(id);
            Optional<Multimedia> multimedia = this.multimediaRepository.findFirstByMinister(mins);
            System.out.println("testing"+multimedia);
            if (multimedia.isPresent()) {
            Multimedia multi = multimedia.get();
            byte[] imageBytes = java.util.Base64.getDecoder().decode(multi.getFilePath());
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);
            return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new byte[0], HttpStatus.NOT_FOUND);
        }
    }*/
    
    @GetMapping({"/pic/{id}"})
    public ResponseEntity<Resource> getImage(@PathVariable("id") Long id) {
        try{
        //String folder = "images";
      /*  Minister minister = this.ministerService.findMinisterById(id);
        Optional<Multimedia> multimedia = this.multimediaService.findFirstByMinister(minister);*/
        final String baseDirectory = "src/main/resources/static/multimedia/";
       String pathnew= ministerService.getMinisterImagePath(id);
     //   System.out.println("-"+minister.getId());
           Path filePath = Paths.get(baseDirectory).resolve(pathnew).normalize();
            Resource filename = new UrlResource(filePath.toUri());
        if (filename.exists() && filename.isReadable()) {
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + filename.getFilename() + "\""})).body(filename);
        } else {
            Resource file = this.filesStorageService.load("staticImage".concat("/profile-img.jpg"));
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + filename.getFilename() + "\""})).body(filename);
        }
    }catch (Exception e) {
        return ResponseEntity.status(500).build();
    }
    }

}