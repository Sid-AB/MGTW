package com.example.demo.controller;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.repository.SousDirectionRepository;

import com.example.demo.service.DirectionService;
import com.example.demo.service.SousDirectionService;
import jakarta.persistence.EntityNotFoundException;

import com.example.demo.dto.ComplexeDTO;
import com.example.demo.dto.SousDirectionDTO;
import com.example.demo.entities.*;

@Controller
@RequestMapping({"/sousDirection"})

public class SousDirectionController {
     @Autowired
    private SousDirectionService sousdirectionService;
@Autowired
    private DirectionService directionService;
    @Autowired
    private SousDirectionRepository SousdirectionRepository;
   
    public SousDirectionController(){

    }

    // récupérer un sousdirecteur par son id
    @GetMapping({"/{id}"})
    public ResponseEntity<SousDirectionDTO> getsousdirecteurById(@PathVariable Long id) {
        SousDirectionDTO sousdirectionDTO = this.sousdirectionService.getsousDirecteurById(id);
        return ResponseEntity.ok(sousdirectionDTO);
    }
  

     // ajouter un directeur
   /*  @PostMapping("/save")
    public ResponseEntity<DirectionDTO> addDirecteur(@RequestBody DirectionDTO directionDTO) {
        DirectionDTO newDirection = directionService.addDirecteur(directionDTO);
        return ResponseEntity.ok(newDirection);
    }*/

    @GetMapping({"/add"})
    public String dirAddd(Model model) {
        try {
            List<Direction> directions = directionService.findAll();
           System.out.println("Directions récupérées: " + directions); 
            model.addAttribute("sousdirectionDTO", new SousDirectionDTO());
            model.addAttribute("direction", directions); // Ajoute la liste des directions au modèle
            return "authenticated/sousdirection/sousdirectionAdd";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", "Erreur lors du chargement des directions.");
            return "error";
        }
    }
     // récupérer tous les directeurs
     @GetMapping("/all")
     public ResponseEntity<List<SousDirectionDTO>> getAllsousDirecteurs() {
        List<SousDirectionDTO> sousdirectiondto = sousdirectionService.getAllsousDirecteurs();
        return ResponseEntity.ok(sousdirectiondto);
    }
    @PostMapping({"/save"})
    public String saveDir(@ModelAttribute("SousDirectionDTO") SousDirectionDTO sousdirectionDTO) {
        try {
            // Appeler la méthode addDirecteur pour sauvegarder l'entité Direction
            SousDirectionDTO savedsousDirectionDTO = sousdirectionService.addsousDirecteur(sousdirectionDTO);
            
            // Rediriger vers la liste des directeurs après la sauvegarde réussie
            return "redirect:/sousDirection/sousdirection"; 
        } catch (EntityNotFoundException  e) {
            e.printStackTrace();
            // Retourne un message d'erreur en français
            return "Erreur lors de la sauvegarde du sous directeur : " + e.getMessage();
        } catch (Exception e) { // Capture toutes les autres exceptions
            e.printStackTrace();
            // Message d'erreur général
            return "Erreur inattendue : " + e.getMessage();
        }
    }
    @GetMapping({"/sousdirection"})
    public String sousdirection(Model model) {
        List<SousDirection> sousdirection = this.sousdirectionService.findAll();
        model.addAttribute("sousdirection", sousdirection);
        return "authenticated/sousdirection/sousdirection";
    }

    @GetMapping({"/sousDirectionEdit/{id}"})
    public String findSousDirect(Model model,@PathVariable Long id)
    {
        SousDirection sousdict=this.SousdirectionRepository.findSousDirectionById(id);
        List<Direction> dict=this.directionService.findAll();
        model.addAttribute("direction", dict);
        model.addAttribute("sousdict", sousdict);
        return "authenticated/sousdirection/sousdirectionEdit";
    }

   /* // update un sousdirecteur
    @PutMapping("/update/{id}")
    public ResponseEntity<sousDirectionDTO> updatesousDirecteur(@PathVariable Long id, @RequestBody sousDirectionDTO sousdirectionDTO) {
        sousDirectionDTO updatedsousDirection = sousdirectionService.updatesousDirecteur(id, sousdirectionDTO);
        return ResponseEntity.ok(updatedsousDirection);
    }


    // supprimer un sous directeur
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletesousDirecteur(@PathVariable Long id) {
        sousdirectionService.deletesousDirecteur(id);
        return ResponseEntity.noContent().build();
    }*/
}


