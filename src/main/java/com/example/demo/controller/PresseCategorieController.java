package com.example.demo.controller;

import com.example.demo.dto.PresseCategorieDTO;
import com.example.demo.entities.PresseCategorie;
import com.example.demo.service.PresseCategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping({"/pressecategorie"})
public class PresseCategorieController {
    @Autowired
    private PresseCategorieService presseCategorieService;

    public PresseCategorieController() {
    }

    @GetMapping({"/add"})
    public String agrumentAdd(Model model) {
        return "authenticated/presseCategorie/presseCategorieAdd.html";
    }

    @PostMapping({"/save"})
    public String saveProfile(@ModelAttribute("userDTO") PresseCategorieDTO presseCategorieDTO) {
        this.presseCategorieService.savePresseCategorie(presseCategorieDTO);
        return "redirect:/pressecategorie/pressecategories";
    }

    @GetMapping({"/pressecategories"})
    public String users(Model model) {
        List<PresseCategorie> presseCategories = this.presseCategorieService.findAll();
        model.addAttribute("presseCategories", presseCategories);
        return "authenticated/presseCategorie/pressecategories";
    }
}
