package com.example.demo.controller;

import com.example.demo.dto.LanguageDTO;
import com.example.demo.dto.PressejrDTO;
import com.example.demo.entities.Language;
import com.example.demo.entities.Pressejr;
import com.example.demo.service.LanguageService;
import com.example.demo.service.PressejrService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/Language"})
public class LanguageController {
    @Autowired
    private LanguageService LanguageService;

    public LanguageController() {
    }

    @GetMapping({"/add"})
    public String agrumentAdd(Model model) {
        return "authenticated/Language/LanguageAdd";
    }

    @PostMapping({"/save"})
    public String saveProfile(@ModelAttribute("userDTO") LanguageDTO LanguageDTO) {
        this.LanguageService.saveLangue(LanguageDTO);
       // return "redirect:/Language/Languagee";
       return "redirect:/presse/presses";
    }

    
    /*@GetMapping({"/Languagee"})
    public String users(Model model) {
        List<Language>  Language = this.LanguageService.findAll();
        model.addAttribute("Language", Language);
        return "authenticated/Language/Language";
    }*/
}
