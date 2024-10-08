package com.example.demo.controller;

import com.example.demo.dto.TVDTO;
import com.example.demo.entities.*;
import com.example.demo.repository.AgrumentRepository;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping({"/tv"})
public class TVController {
    @Autowired
    private LoisService loisService;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private ComplexeService complexeService;
    @Autowired
    private CategorieChaineService categorieChaineService;
    @Autowired
    private TVService tvService;
    @Autowired
    private AgrumentRepository agrumentRepository;
    @Autowired
    private MultimediaService multimediaService;

    public TVController() {
    }

    @GetMapping({"/add"})
    public String agrumentAdd(Model model) {
        List<Complexe> complexes = this.complexeService.findAll();
        List<CategorieChaine> categorieChaines = this.categorieChaineService.findAll();
        model.addAttribute("complexes", complexes);
        model.addAttribute("categorieChaines", categorieChaines);
        return "authenticated/tv/tvAdd";
    }

    @GetMapping({"/{id}"})
    public String findTVById(Model model, @PathVariable Long id) {
        TV tv = this.tvService.findTVById(id);
        List tvs;
        if (tv.getType().toString().equals("public")) {
            tvs = this.tvService.findTVSPublic();  // Appel avec paramètres
        } else {
            tvs = this.tvService.findTVSPrive(tv.getComplexe().getName());
        }

        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        model.addAttribute("tv", tv);
        model.addAttribute("tvs", tvs);
        System.out.println("tvsz " + tvs.size());
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        return "notAuthenticated/tv/chaineDetails";
    }

    @PostMapping({"/save"})
    public String saveTV(@ModelAttribute("tvdto") TVDTO tvdto) {
        this.tvService.saveTV(tvdto);
        return "redirect:/tv/tvs";
    }

    @GetMapping({"/tvs"})
    public String users(Model model) {
        List<TV> tvs = this.tvService.findAll();
        model.addAttribute("tvs", tvs);
        return "/authenticated/tv/tvs";
    }

    @GetMapping({"/public"})
    public String cPublic(Model model) {
        
        List<TV> tvsPublic = this.tvService.findTVSPublic();
        List<CategorieChaine> categorieChaines = this.categorieChaineService.findAll();
        List<Agrument> agruments = new ArrayList<>();
        agruments.add(this.agrumentRepository.findAgrumentByName("tv"));
        List<Complexe> complexes = this.complexeService.findComplexeByAgrumentListAndType(agruments, "public");
        List<CategorieChaine> tvListDistinctByCategorieChaine = new ArrayList<>();
        if (!tvsPublic.isEmpty()) {
            tvListDistinctByCategorieChaine = this.tvService.findDistinctCategorieChaineByComplexe(((TV)tvsPublic.get(0)).getComplexe());
        }

        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        model.addAttribute("tvListDistinctByCategorieChaines", tvListDistinctByCategorieChaine);
        model.addAttribute("tvs", tvsPublic);
        model.addAttribute("complexes", complexes);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        return "notAuthenticated/tv/tvGeneral";
    }

    @GetMapping({"/prive/{name}"})
    public String cPrive(Model model, @PathVariable String name) {
        List<TV> tvsPrive = this.tvService.findTVSPrive(name);
        List<Agrument> agruments = new ArrayList<>();
        agruments.add(this.agrumentRepository.findAgrumentByName("tv"));
        List<Complexe> complexes = this.complexeService.findComplexeByAgrumentListAndTypeAndName(agruments, "prive", name);
        List<CategorieChaine> tvListDistinctByCategorieChaine = this.tvService.findDistinctCategorieChaineByComplexe(((TV)tvsPrive.get(0)).getComplexe());
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        model.addAttribute("tvListDistinctByCategorieChaines", tvListDistinctByCategorieChaine);
        model.addAttribute("tvs", tvsPrive);
        model.addAttribute("complexes", complexes);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        return "notAuthenticated/tv/tvGeneral";
    }

    @GetMapping({"/multimedia/{folder}/{filename}"})
    public ResponseEntity<Resource> getFile(@PathVariable String filename, @PathVariable String folder) throws IOException {
        Resource file = this.filesStorageService.load(folder.concat("/" + filename));
        String contentType = Files.probeContentType(file.getFile().toPath());
        return ((BodyBuilder)ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType)).header("Content-Disposition", new String[]{"inline; filename=\"" + file.getFilename() + "\""})).body(new InputStreamResource(file.getInputStream()));
    }

    @GetMapping({"/lugo/{id}"})
    public ResponseEntity<Resource> getImage(@PathVariable("id") Long id) {
        String folder = "images";
        System.out.println("userz " + id + " " + folder + " ");
        TV tv = this.tvService.findTVById(id);
        Optional<Multimedia> multimedia = this.multimediaService.findFirstByTvOrderByCreatedAtDesc(tv);
        if (multimedia.isPresent()) {
            String filename = ((Multimedia)multimedia.get()).getFileName();
            Resource file = this.filesStorageService.load(folder.concat("/" + filename));
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + file.getFilename() + "\""})).body(file);
        } else {
            Resource file = this.filesStorageService.load("staticImage".concat("/profile-img.jpg"));
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + file.getFilename() + "\""})).body(file);
        }
    }

    @GetMapping({"/TVEdit/{id}"})
    public String FindTVById(Model model, @PathVariable Long id)
    {
        TV TV=this.tvService.findTVById(id);
        model.addAttribute("tv",TV);
        return "authenticated/tv/TVEdit";
    }


    @PostMapping({"/update/{id}"})
    public RedirectView  updatedTV(@PathVariable Long id,@ModelAttribute  TV updateTV)
    {
        TV tv = this.tvService.findTVById(id);
       // Optional<Multimedia> multimedia=this.multimediaService.findFirstByEtablissement(etablissement);
       Optional<TV> existingTV = this.tvService.findById(id);
       Boolean  check= this.tvService.updateDataTV(updateTV,id,existingTV/*,multimedia */);
       //return "authenticated/etablissement/etablissementsEdit.html";
       return new RedirectView("/tv/tvs");
    }
}
