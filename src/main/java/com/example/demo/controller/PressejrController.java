package com.example.demo.controller;


import com.example.demo.dto.PressejrDTO;
import com.example.demo.entities.Complexe;
import com.example.demo.entities.Pressejr;
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
@RequestMapping({"/Pressejr"})
public class PressejrController {
    @Autowired
    private PressejrService PressejrService;

    public PressejrController() {
    }

    @GetMapping({"/add"})
    public String agrumentAdd(Model model) {
        return "authenticated/Pressejr/PressejrAdd";
    }

    @PostMapping({"/save"})
    public String saveProfile(@ModelAttribute("userDTO") PressejrDTO PressejrDTO) {
        this.PressejrService.saveCategorie(PressejrDTO);
        return "redirect:/Pressejr/Pressejrr";
    }

    
    @GetMapping({"/Pressejrr"})
    public String users(Model model) {
        List<Pressejr>  Pressejr = this.PressejrService.findAll();
        model.addAttribute("Pressejr", Pressejr);
        return "authenticated/Pressejr/Pressejr";
    }
}
