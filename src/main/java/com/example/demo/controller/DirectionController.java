package com.example.demo.controller;

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
        DirectionDTO directionDTO = directionService.getdirecteurById(id);
        return ResponseEntity.ok(directionDTO);
    }
  

     // ajouter un directeur
    @PostMapping("/save")
    public ResponseEntity<DirectionDTO> addDirecteur(@RequestBody DirectionDTO directionDTO) {
        DirectionDTO newDirection = directionService.addDirecteur(directionDTO);
        return ResponseEntity.ok(newDirection);
    }

    @GetMapping({"/add"})
    public String dirAdd(Model model) {
        return "authenticated/direction/directionAdd";
    }
     // récupérer tous les directeurs
     @GetMapping("/all")
     public ResponseEntity<List<DirectionDTO>> getAllDirecteurs() {
        List<DirectionDTO> directions = directionService.getAllDirecteurs();
        return ResponseEntity.ok(directions);
    }
    
    @GetMapping({"/direction"})
    public String direction(Model model) {
        List<Direction> direction = this.directionService.findAll();
        model.addAttribute("direction", direction);
        return "authenticated/direction/direcreurs";
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
