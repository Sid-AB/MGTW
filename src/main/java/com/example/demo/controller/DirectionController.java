package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.DirectionDTO;

import com.example.demo.entities.Direction;

import com.example.demo.repository.DirectionRepository;


import com.example.demo.service.DirectionService;

import jakarta.persistence.EntityNotFoundException;



@Controller
@RequestMapping({"/Direction"})

public class DirectionController {
     @Autowired
    private DirectionService directionService;

    @Autowired
    private DirectionRepository directionRepository;
   
    public DirectionController(){

    }

    // récupérer un directeur par son id
    @GetMapping({"/{id}"})
    public ResponseEntity<DirectionDTO> getdirecteurById(@PathVariable Long id) {
        DirectionDTO directionDTO = this.directionService.getDirecteurById(id);
        return ResponseEntity.ok(directionDTO);
    }
  

     // ajouter un directeur
   /*  @PostMapping("/save")
    public ResponseEntity<DirectionDTO> addDirecteur(@RequestBody DirectionDTO directionDTO) {
        DirectionDTO newDirection = directionService.addDirecteur(directionDTO);
        return ResponseEntity.ok(newDirection);
    }*/

    @GetMapping({"/add"})
    public String dirAdd(Model model) {
        return "authenticated/Direction/direction.Add";
    }
     // récupérer tous les directeurs
     @GetMapping("/all")
     public ResponseEntity<List<DirectionDTO>> getAllDirecteurs() {
        List<DirectionDTO> directions = directionService.getAllDirecteurs();
        return ResponseEntity.ok(directions);
    }
    @PostMapping({"/save"})
    public String saveDir(@ModelAttribute("DirectionDTO") DirectionDTO directionDTO) {
        try {
            // Appeler la méthode addDirecteur pour sauvegarder l'entité Direction
            DirectionDTO savedDirectionDTO = directionService.addDirecteur(directionDTO);
            
            // Rediriger vers la liste des directeurs après la sauvegarde réussie
            return "redirect:/Direction/direction"; 
        } catch (EntityNotFoundException  e) {
            e.printStackTrace();
            // Retourne un message d'erreur en français
            return "Erreur lors de la sauvegarde du directeur : " + e.getMessage();
        } catch (Exception e) { // Capture toutes les autres exceptions
            e.printStackTrace();
            // Message d'erreur général
            return "Erreur inattendue : " + e.getMessage();
        }
    }
    @GetMapping({"/direction"})
    public String direction(Model model) {
        List<Direction> direction = this.directionService.findAll();
        model.addAttribute("direction", direction);
        return "authenticated/Direction/directeurs";
    }

   /* // update un directeur
    @PutMapping("/update/{id}")
    public ResponseEntity<DirectionDTO> updateDirecteur(@PathVariable Long id, @RequestBody DirectionDTO directionDTO) {
        DirectionDTO updatedDirection = directionService.updateDirecteur(id, directionDTO);
        return ResponseEntity.ok(updatedDirection);
    }


    // supprimer un directeur
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDirecteur(@PathVariable Long id) {
        directionService.deleteDirecteur(id);
        return ResponseEntity.noContent().build();
    }*/
}
