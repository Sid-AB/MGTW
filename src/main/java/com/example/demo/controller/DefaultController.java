package com.example.demo.controller;

import com.example.demo.entities.Complexe;
import com.example.demo.entities.Etablissement;
import com.example.demo.entities.Lois;
import com.example.demo.service.ComplexeService;
import com.example.demo.service.EtablissementService;
import com.example.demo.service.LoisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
    @Autowired
    private MessageSource messageSource;
    @Autowired
    private ComplexeService complexeService;
    @Autowired
    private LoisService loisService;
    @Autowired
    private EtablissementService etablissementService;

    public DefaultController() {
    }

    @GetMapping({"/home"})
    public String index1(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        model.addAttribute("username", username);
        return "authenticated/home";
    }

    @GetMapping({"/index", "", "/"})
    public String index(Model model) {
     //    String greetingMessage = messageSource.getMessage("etablissement", null, LocaleContextHolder.getLocale());
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        List<Etablissement> etablissementsSoustutelle = this.etablissementService.findEtablissementsByType("soustutelle");
        model.addAttribute("etablissementsSoustutelle", etablissementsSoustutelle);
        List<Etablissement> etablissementsReglementationsectorielle = this.etablissementService.findEtablissementsByType("reglementationsectorielle");
        model.addAttribute("etablissementsReglementationsectorielle", etablissementsReglementationsectorielle);
        
        List<Etablissement> etablissementsAps = this.etablissementService.findEtablissementsSoustutelleSansApsEtSociete();
        model.addAttribute("etablissementsAps", etablissementsAps);
       // System.out.println("Etablissements APS: " + etablissementsAps.size());
        //  model.addAttribute("etablissement", greetingMessage);
        
        List  <Etablissement> etablissementImprssion= etablissementService.findEtablissementsByTypeEtablissmnt("société d'impression");
        model.addAttribute("etablissementImprssion", etablissementImprssion);
        
        return "notAuthenticated/index";
    }

     @GetMapping({"/login"})
    public String login() {
        return "notAuthenticated/login";
    }
}
