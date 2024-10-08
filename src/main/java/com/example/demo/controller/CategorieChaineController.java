package com.example.demo.controller;

import com.example.demo.dto.CategorieChaineDTO;
import com.example.demo.service.CategorieChaineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/categorieChaine"})
public class CategorieChaineController {
    @Autowired
    private CategorieChaineService categorieChaineService;

    public CategorieChaineController() {
    }

    @GetMapping({"/add"})
    public String agrumentAdd(Model model) {
        return "authenticated/categorieChaine/categoriechaineAdd";
    }

    @PostMapping({"/save"})
    public String saveProfile(@ModelAttribute("userDTO") CategorieChaineDTO categorieChaineDTO) {
        this.categorieChaineService.saveCategorie(categorieChaineDTO);
        return "redirect:/tv/tvs";
    }
}
