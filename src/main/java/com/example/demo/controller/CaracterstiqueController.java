package com.example.demo.controller;

import com.example.demo.dto.CaracterstiqueDTO;
import com.example.demo.entities.Caracteristique;
import com.example.demo.entities.Radio;
import com.example.demo.entities.TV;
import com.example.demo.service.CaracterstiqueService;
import com.example.demo.service.RadioService;
import com.example.demo.service.TVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/caracterstique"})
public class CaracterstiqueController {
    @Autowired
    private CaracterstiqueService caracterstiqueService;
    @Autowired
    private TVService tvService;
    @Autowired
    private RadioService radioService;

    public CaracterstiqueController() {
    }

    @GetMapping({"/tv/{id}/add"})
    public String caractrstiqueAdd(Model model, @PathVariable Long id) {
        TV tv = this.tvService.findTVById(id);
        model.addAttribute("media", tv);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        model.addAttribute("username", username);
        return "authenticated/caracterstique/caracterstiqueAdd";
    }

    @PostMapping({"/save"})
    public String saveProfile(@ModelAttribute("caracterstiqueDTO") CaracterstiqueDTO caracterstiqueDTO) {
        this.caracterstiqueService.saveCaracteristique(caracterstiqueDTO);
        return "redirect:/tv/tvs";
    }

    @GetMapping({"/radio/{id}/add"})
    public String caractrstiqueRadioAdd(Model model, @PathVariable Long id) {
        Radio radio = this.radioService.findRadioById(id);
        model.addAttribute("media", radio);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        model.addAttribute("username", username);
        return "authenticated/caracterstique/caracterstiqueRadioAdd";
    }

    @PostMapping({"/saveradio"})
    public String saveradioCarac(@ModelAttribute("caracterstiqueDTO") CaracterstiqueDTO caracterstiqueDTO, Model model) {
        this.caracterstiqueService.saveRadioCaracteristique(caracterstiqueDTO);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        model.addAttribute("username", username);
        return "redirect:/radio/radios";
    }
    @DeleteMapping({"/RadioDelete/{id}"})
    public String deleteCartRadio(@PathVariable Long id)
    {
        Radio radio=radioService.findRadioById(id);
        caracterstiqueService.deleteCaracterstiqueById(radio.getId());
        return "redirect:/radio/radios";
    }
    @DeleteMapping({"/TvDelete/{id}"})
    public String deleteCartTV(@PathVariable Long id)
    {   System.out.println("CaracterstiqueController.deleteCartTV()"+id.getClass().getName());

       
        caracterstiqueService.deleteCaracterstiqueById(id);
        return "redirect:/tv/tvs";
    }
    
}