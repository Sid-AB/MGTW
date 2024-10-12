package com.example.demo.controller;


import com.example.demo.entities.Complexe;
import com.example.demo.entities.Etablissement;
import com.example.demo.entities.Lois;
import com.example.demo.entities.Presse;
import com.example.demo.entities.Radio;
import com.example.demo.entities.TV;
import com.example.demo.entities.TextJuridique;
import com.example.demo.service.ComplexeService;
import com.example.demo.service.EtablissementService;
import com.example.demo.service.LoisService;
import com.example.demo.service.PresseService;
import com.example.demo.service.RadioService;
import com.example.demo.service.TVService;
import com.example.demo.service.TextJuridiqueService;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
    @Autowired
    private ComplexeService complexeService;
    @Autowired
    private LoisService loisService;
    @Autowired
    private EtablissementService etablissementService;
    @Autowired
    private TVService tvService;
    @Autowired
    private RadioService radioService;
    @Autowired
    private PresseService presseService;
    @Autowired
    private TextJuridiqueService textJuridiqueService;

    public SearchController() {
    }

    @GetMapping({"/search/{query}"})
    /*public String search(@RequestParam("query") String query, Model model) {
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);

        model.addAttribute("textJuridiques", this.textJuridiqueService.findByDescriptionContainingIgnoreCase(query));
        model.addAttribute("textJuridiquesFr", this.textJuridiqueService.findByDescriptionFrContainingIgnoreCase(query));
        model.addAttribute("textJuridiquesEn", this.textJuridiqueService.findByDescriptionEnContainingIgnoreCase(query));

        model.addAttribute("presses", this.presseService.findByDescriptionContainingIgnoreCase(query));
        model.addAttribute("pressesFr", this.presseService.findByDescriptionFrContainingIgnoreCase(query));
        model.addAttribute("pressesEn", this.presseService.findByDescriptionEnContainingIgnoreCase(query));

        model.addAttribute("radios", this.radioService.findByDescriptionContainingIgnoreCase(query));
        model.addAttribute("radiosFr", this.radioService.findByDescriptionFrContainingIgnoreCase(query));
        model.addAttribute("radiosEn", this.radioService.findByDescriptionEnContainingIgnoreCase(query));

        model.addAttribute("etablissements", this.etablissementService.findByDescriptionContainingIgnoreCase(query));
        model.addAttribute("etablissementsFr", this.etablissementService.findByDescriptionFrContainingIgnoreCase(query));
        model.addAttribute("etablissementsEn", this.etablissementService.findByDescriptionEnContainingIgnoreCase(query));

        model.addAttribute("tvs", this.tvService.findByDescriptionContainingIgnoreCase(query));
        model.addAttribute("tvsFr", this.tvService.findByDescriptionFrContainingIgnoreCase(query));
        model.addAttribute("tvsEn", this.tvService.findByDescriptionEnContainingIgnoreCase(query));
        return "notAuthenticated/search";
    } */
   public String search(@PathVariable("query") String query, Model model) {
    // Récupérer les complexes pour la barre de navigation
    List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
    model.addAttribute("complexesForNavBar", complexesForNavBar);
    
    // Récupérer toutes les lois pour la barre de navigation
    List<Lois> loisForNavBar = this.loisService.findAll();
    model.addAttribute("loisForNavBar", loisForNavBar);

    // Rechercher des textes juridiques en fonction de la description en français ou en anglais
    List<TextJuridique> textJuridiquesFr = this.textJuridiqueService.findByDescriptionFrContainingIgnoreCase(query);
    List<TextJuridique> textJuridiquesEn = this.textJuridiqueService.findByDescriptionEnContainingIgnoreCase(query);
    List<TextJuridique> textJuridiquesAr = this.textJuridiqueService.findByDescriptionContainingIgnoreCase(query);

    // Combiner les résultats
    List<TextJuridique> textJuridiques = new ArrayList<>();
    textJuridiques.addAll(textJuridiquesFr);
    textJuridiques.addAll(textJuridiquesEn);
    textJuridiques.addAll(textJuridiquesAr);
    model.addAttribute("textJuridiques", textJuridiques);

    // Rechercher les presses
    List<Presse> pressesFr = this.presseService.findByDescriptionFrContainingIgnoreCase(query);
    List<Presse> pressesEn = this.presseService.findByDescriptionEnContainingIgnoreCase(query);
    List<Presse> pressesAr = this.presseService.findByDescriptionContainingIgnoreCase(query);

    // Combiner les résultats des presses
    List<Presse> presses = new ArrayList<>();
    presses.addAll(pressesFr);
    presses.addAll(pressesEn);
    presses.addAll(pressesAr);
    model.addAttribute("presses", presses);

    // Rechercher les radios
    List<Radio> radiosFr = this.radioService.findByDescriptionFrContainingIgnoreCase(query);
    List<Radio> radiosEn = this.radioService.findByDescriptionEnContainingIgnoreCase(query);
    List<Radio> radiosAr = this.radioService.findByDescriptionContainingIgnoreCase(query);

    // Combiner les résultats des radios
    List<Radio> radios = new ArrayList<>();
    radios.addAll(radiosFr);
    radios.addAll(radiosEn);
    radios.addAll(radiosAr);
    model.addAttribute("radios", radios);

    // Rechercher les établissements
    List<Etablissement> etablissementsFr = this.etablissementService.findByDescriptionFrContainingIgnoreCase(query);
    List<Etablissement> etablissementsEn = this.etablissementService.findByDescriptionEnContainingIgnoreCase(query);
    List<Etablissement> etablissementsAr = this.etablissementService.findByDescriptionContainingIgnoreCase(query);

    // Combiner les résultats des établissements
    List<Etablissement> etablissements = new ArrayList<>();
    etablissements.addAll(etablissementsFr);
    etablissements.addAll(etablissementsEn);
    etablissements.addAll(etablissementsAr);
    model.addAttribute("etablissements", etablissements);

    // Rechercher les chaînes de télévision
    List<TV> tvsFr = this.tvService.findByDescriptionFrContainingIgnoreCase(query);
    List<TV> tvsEn = this.tvService.findByDescriptionEnContainingIgnoreCase(query);
    List<TV> tvsAr = this.tvService.findByDescriptionContainingIgnoreCase(query);

    // Combiner les résultats des chaînes de télévision
    List<TV> tvs = new ArrayList<>();
    tvs.addAll(tvsFr);
    tvs.addAll(tvsEn);
    tvs.addAll(tvsAr);
    model.addAttribute("tvs", tvs);

    // Retourner la vue
    return "notAuthenticated/search";
}

}
