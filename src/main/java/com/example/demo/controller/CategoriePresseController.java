package com.example.demo.controller;

import com.example.demo.dto.CategoriePresseDTO;
import com.example.demo.service.CategoriePresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/categoriePresse"})
public class CategoriePresseController {
    @Autowired
    private CategoriePresseService categoriePresseService;

    public CategoriePresseController() {
    }

    @GetMapping({"/add"})
    public String agrumentAdd(Model model) {
        return "authenticated/categoriePresse/categoriePresseAdd";
    }

    @PostMapping({"/save"})
    public String saveProfile(@ModelAttribute("userDTO") CategoriePresseDTO categoriePresseDTO) {
        this.categoriePresseService.saveCategorie(categoriePresseDTO);
        return "redirect:/presse/presses";
    }
}
