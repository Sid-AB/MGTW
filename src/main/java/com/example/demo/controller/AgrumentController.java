package com.example.demo.controller;

import com.example.demo.dto.AgrumentDTO;
import com.example.demo.entities.Agrument;
import com.example.demo.service.AgrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping({"/agrument"})
public class AgrumentController {
    @Autowired
    private AgrumentService agrumentService;

    public AgrumentController() {
    }

    @GetMapping({"/add"})
    public String agrumentAdd(Model model) {
        return "authenticated/agrument/agrumentAdd";
    }

    @PostMapping({"/save"})
    public String saveProfile(@ModelAttribute("userDTO") AgrumentDTO agrumentDTO) {
        this.agrumentService.saveAgrument(agrumentDTO);
        return "redirect:/agrument/agruments";
    }

    @GetMapping({"/agruments"})
    public String users(Model model) {
        List<Agrument> agruments = this.agrumentService.findAll();
        model.addAttribute("agruments", agruments);
        return "authenticated/agrument/agruments";
    }
}
