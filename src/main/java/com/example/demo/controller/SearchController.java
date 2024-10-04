package com.example.demo.controller;


import com.example.demo.entities.Complexe;
import com.example.demo.entities.Lois;
import com.example.demo.service.ComplexeService;
import com.example.demo.service.EtablissementService;
import com.example.demo.service.LoisService;
import com.example.demo.service.PresseService;
import com.example.demo.service.RadioService;
import com.example.demo.service.TVService;
import com.example.demo.service.TextJuridiqueService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping({"/search"})
    public String search(@RequestParam("query") String query, Model model) {
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);

        model.addAttribute("textJuridiques", this.textJuridiqueService.findByDescriptionContainingIgnoreCase(query));
        model.addAttribute("textJuridiques", this.textJuridiqueService.findByDescriptionFrContainingIgnoreCase(query));
        model.addAttribute("textJuridiques", this.textJuridiqueService.findByDescriptionEnContainingIgnoreCase(query));

        model.addAttribute("presses", this.presseService.findByDescriptionContainingIgnoreCase(query));
        model.addAttribute("presses", this.presseService.findByDescriptionFrContainingIgnoreCase(query));
        model.addAttribute("presses", this.presseService.findByDescriptionEnContainingIgnoreCase(query));

        model.addAttribute("radios", this.radioService.findByDescriptionContainingIgnoreCase(query));
        model.addAttribute("radios", this.radioService.findByDescriptionFrContainingIgnoreCase(query));
        model.addAttribute("radios", this.radioService.findByDescriptionEnContainingIgnoreCase(query));

        model.addAttribute("etablissements", this.etablissementService.findByDescriptionContainingIgnoreCase(query));
        model.addAttribute("etablissements", this.etablissementService.findByDescriptionFrContainingIgnoreCase(query));
        model.addAttribute("etablissements", this.etablissementService.findByDescriptionEnContainingIgnoreCase(query));

        model.addAttribute("tvs", this.tvService.findByDescriptionContainingIgnoreCase(query));
        model.addAttribute("tvs", this.tvService.findByDescriptionFrContainingIgnoreCase(query));
        model.addAttribute("tvs", this.tvService.findByDescriptionEnContainingIgnoreCase(query));
        return "notAuthenticated/search";
    }
}
