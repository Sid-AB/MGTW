package com.example.demo.controller;

import com.example.demo.dto.LoisDTO;
import com.example.demo.entities.Complexe;
import com.example.demo.entities.Etablissement;
import com.example.demo.entities.Lois;
import com.example.demo.service.ComplexeService;
import com.example.demo.service.EtablissementService;
import com.example.demo.service.LoisService;
import com.example.demo.service.TextJuridiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping({"/lois"})
public class LoisController {
    @Autowired
    private LoisService loisService;
    @Autowired
    private ComplexeService complexeService;
    
    @Autowired
    private TextJuridiqueService textJuridiqueService;

    @Autowired
    private EtablissementService etablissementService;

    public LoisController() {
    }

    @GetMapping({"/add"})
    public String loisAdd(Model model) {
        return "authenticated/lois/loisAdd";
    }

    @PostMapping({"/save"})
    public String saveProfile(@ModelAttribute("userDTO") LoisDTO loisDTO) {
        this.loisService.saveLois(loisDTO);
        return "redirect:/lois/lois";
    }

    @GetMapping({"/lois"})
    public String users(Model model) {
        List<Lois> lois = this.loisService.findAll();
        model.addAttribute("lois", lois);
        return "authenticated/lois/loiss";
    }

    @GetMapping({"/{id}", "/{id}/"})
    public String cPublic(Model model, @PathVariable Long id) {
        Lois lois = this.loisService.findLoisById(id);
        model.addAttribute("lois", lois);
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);

        List  <Etablissement> etablissementImprssion= etablissementService.findEtablissementsByTypeEtablissmnt("société d'impression");
        model.addAttribute("etablissementImprssion", etablissementImprssion);
         return "notAuthenticated/lois/lois";
    }
}
