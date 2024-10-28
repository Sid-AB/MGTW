package com.example.demo.controller;


import com.example.demo.dto.PresseDTO;
import com.example.demo.entities.*;
import com.example.demo.repository.PresseCategorieRepository;
import com.example.demo.service.*;

import net.sf.jsqlparser.statement.ExplainStatement.Option;

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
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;


@Controller
@RequestMapping({"/presse"})
public class PresseController {
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private LoisService loisService;
    @Autowired
    private PresseService presseService;
    @Autowired
    private ComplexeService complexeService;
    @Autowired
    private PresseCategorieService presseCategorieService;
    @Autowired
    private PresseCategorieRepository presseCategorieRepository;
    @Autowired
    private MultimediaService multimediaService;

    @Autowired
    private EtablissementService etablissementService;
    @Autowired
    private CategoriePresseService categoriePresseService;
    
    @Autowired
    private LanguageService LanguageService;
    
    @Autowired
    private PressejrService PressejrService;
    public PresseController() {
    }

    @GetMapping({"/add"})
    public String presseAdd(Model model) {
        List<Complexe> complexes = this.complexeService.findAll();
        List<PresseCategorie> presseCategories = this.presseCategorieService.findAll();
        List<CategoriePress> categoriePresses = this.categoriePresseService.findAll();
        List<Pressejr> Pressejr = this.PressejrService.findAll();
        List<Language> Language = this.LanguageService.findAll();

        model.addAttribute("complexes", complexes);
        model.addAttribute("presseDTO", new PresseDTO());
        model.addAttribute("presseCategories", presseCategories);
        model.addAttribute("categoriePresses", categoriePresses);
        model.addAttribute("Pressejr", Pressejr);
        model.addAttribute("Language", Language);
        return "authenticated/presse/presseAdd";
    }

    @PostMapping({"/save"})
    public String savepresse(@ModelAttribute("presseDTO") PresseDTO presseDTO) {
        this.presseService.saveRadio(presseDTO);
        return "redirect:/presse/presses";
    }

    @GetMapping({"/presses"})
    public String presse(Model model) {
        List<Presse> presses = this.presseService.findAll();
        model.addAttribute("presses", presses);
        return "authenticated/presse/presses";
    }

    /*@GetMapping({"/public", "/public/"})
    public String cPublic(Model model) {
        List<PresseCategorie> presseCategories = new ArrayList<>();
        presseCategories.add(this.presseCategorieRepository.findPresseCategorieByName("مكتوبة"));
        List<Presse> pressesEcritPublic = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories, "public");
        List<Presse> pressesEcritPrive = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories, "prive");
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        model.addAttribute("pressesEcritPublic", pressesEcritPublic);
        model.addAttribute("pressesEcritPrive", pressesEcritPrive);
        return "notAuthenticated/presse/presseGeneral";
    } */
    @GetMapping({"/public", "/public/"})
    public String cPublic(Model model) {
        // Créer une liste pour stocker les catégories de presse
        List<PresseCategorie> presseCategories = new ArrayList<>();
        
        // Ajouter les catégories de presse par leur nom
        presseCategories.add(this.presseCategorieRepository.findPresseCategorieByName("مكتوبة"));
        // Vous pouvez ajouter d'autres catégories ici si nécessaire
        presseCategories.add(this.presseCategorieRepository.findPresseCategorieByName("رقمية/مكتوبة")); // Exemples
      
        // Récupérer les presses publiques et privées pour chaque catégorie
        List<Presse> pressesEcritPublic = new ArrayList<>();
        List<Presse> pressesEcritPrive = new ArrayList<>();
    
        for (PresseCategorie categorie : presseCategories) {
            pressesEcritPublic.addAll(this.presseService.findPresseByPresseCategoriesAndTypepbpr(Collections.singletonList(categorie), "public"));
            pressesEcritPrive.addAll(this.presseService.findPresseByPresseCategoriesAndTypepbpr(Collections.singletonList(categorie), "prive"));
        }

 
        // Récupérer les complexes pour la barre de navigation
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
    
        // Récupérer les lois pour la barre de navigation
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
    
        // Ajouter les presses au modèle
        model.addAttribute("pressesEcritPublic", pressesEcritPublic);
        model.addAttribute("pressesEcritPrive", pressesEcritPrive);
    
        List  <Etablissement> etablissementImprssion= etablissementService.findEtablissementsByTypeEtablissmnt("société d'impression");
        model.addAttribute("etablissementImprssion", etablissementImprssion);
        List<CategoriePress> presseListDistinctByCategoriePresse=this.categoriePresseService.findAll();
        System.out.println("size of "+pressesEcritPublic.get(0).getNameFr());
        model.addAttribute("presseListDistinctByCategoriePresses", presseListDistinctByCategoriePresse);

        List<Pressejr> presseListDistinctByPressejr=this.PressejrService.findAll();
        model.addAttribute("presseListDistinctByPressejr", presseListDistinctByPressejr);

        List<Language> presseListDistinctByLanguage=this.LanguageService.findAll();
        model.addAttribute("presseListDistinctByLanguage", presseListDistinctByLanguage);
        // Retourner la vue
        return "notAuthenticated/presse/presseGeneral";
    }

    
    /*@GetMapping({"/public/electronique", "/public/electronique/"})
    public String cPublicElectronique(Model model) {
        new ArrayList<>();
        List<PresseCategorie> presseCategories1 = new ArrayList<>();
        presseCategories1.add(this.presseCategorieRepository.findPresseCategorieByName("electronique"));
        List<Presse> pressesElectroniquePublic = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories1, "public");
        List<Presse> pressesElectroniquePrive = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories1, "prive");
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        model.addAttribute("pressesElectroniquePublic", pressesElectroniquePublic);
        model.addAttribute("pressesElectroniquePrive", pressesElectroniquePrive);
        return "notAuthenticated/presse/presseGeneralelectronique";
    } */

    /*@GetMapping({"/public/electronique", "/public/electronique/"})
    public String cPublicElectronique(Model model) {
        new ArrayList<>();
        List<PresseCategorie> presseCategories1 = new ArrayList<>();
        presseCategories1.add(this.presseCategorieRepository.findPresseCategorieByName("رقمية"));


        List<Presse> pressesElectroniquePublic = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories1, "public");
        List<Presse> pressesElectroniquePrive = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories1, "prive");

        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        model.addAttribute("pressesElectroniquePublic", pressesElectroniquePublic);
        model.addAttribute("pressesElectroniquePrive", pressesElectroniquePrive);
        return "notAuthenticated/presse/presseGeneralelectronique";
    } */

    @GetMapping({"/public/electronique", "/public/electronique/"})
    public String cPublicElectronique(Model model) {
        // Créer une liste pour stocker les catégories de presse
        List<PresseCategorie> presseCategories = new ArrayList<>();
        
        // Récupérer les catégories par leur nom
        PresseCategorie categorieElectronique = this.presseCategorieRepository.findPresseCategorieByName("رقمية");
        PresseCategorie categorieMixte = this.presseCategorieRepository.findPresseCategorieByName("رقمية/مكتوبة");
        
        // Vérifiez que les catégories sont correctement récupérées
        if (categorieElectronique != null) {
            presseCategories.add(categorieElectronique);
        } else {
            System.out.println("Catégorie 'رقمية' non trouvée.");
        }
        
        if (categorieMixte != null) {
            presseCategories.add(categorieMixte);
        } else {
            System.out.println("Catégorie 'رقمية/مكتوبة' non trouvée.");
        }
        
       // System.out.println("presseCategories: " + presseCategories.size());
        
        // Récupérer les presses publiques et privées pour chaque catégorie
        List<Presse> pressesElectroniquePublic = new ArrayList<>();
        List<Presse> pressesElectroniquePrive = new ArrayList<>();
        
        for (PresseCategorie categorie : presseCategories) {
            // Vérification de la catégorie avant de faire la requête
            if (categorie != null) {
                pressesElectroniquePublic.addAll(this.presseService.findPresseByPresseCategoriesAndTypepbpr(Collections.singletonList(categorie), "public"));
                pressesElectroniquePrive.addAll(this.presseService.findPresseByPresseCategoriesAndTypepbpr(Collections.singletonList(categorie), "prive"));
            }
        }
        
        //System.out.println("Public Presses: " + pressesElectroniquePublic.size());
      //  System.out.println("Private Presses: " + pressesElectroniquePrive.size());
    
        // Récupérer les complexes pour la barre de navigation
        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        
        // Récupérer les lois pour la barre de navigation
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
    
        // Ajouter les presses au modèle
        model.addAttribute("pressesElectroniquePublic", pressesElectroniquePublic);
        model.addAttribute("pressesElectroniquePrive", pressesElectroniquePrive);
        
        List  <Etablissement> etablissementImprssion= etablissementService.findEtablissementsByTypeEtablissmnt("société d'impression");
        model.addAttribute("etablissementImprssion", etablissementImprssion);
        List<CategoriePress> presseListDistinctByCategoriePresse=this.categoriePresseService.findAll();
        model.addAttribute("presseListDistinctByCategoriePresses", presseListDistinctByCategoriePresse);

       /*  List<Pressejr> presseListDistinctByPressejr=this.PressejrService.findAll();
        model.addAttribute("presseListDistinctByPressejr", presseListDistinctByPressejr);*/
        List<Language> presseListDistinctByLanguage=this.LanguageService.findAll();
        model.addAttribute("presseListDistinctByLanguage", presseListDistinctByLanguage);
        // Retourner la vue
        return "notAuthenticated/presse/presseGeneralelectronique";
    }
    
/*    
   @GetMapping({"/{id}"})
    public String findTVById(Model model, @PathVariable Long id) {
        Presse presse = this.presseService.findPresseById(id);
        List<Presse> pressesElectroniquePublic = new ArrayList<>();
        List<Presse> pressesElectroniquePrive = new ArrayList<>();
        List<Presse> pressesEcritPublic = new ArrayList<>();
        List<Presse> pressesEcritPrive = new ArrayList<>();
        List<Presse> pressesList = new ArrayList<>();
        List<PresseCategorie> presseCategories1 = new ArrayList<>();
        presseCategories1.add(this.presseCategorieRepository.findPresseCategorieByName("رقمية"));
        List<PresseCategorie> presseCategories = new ArrayList<>();
        presseCategories.add(this.presseCategorieRepository.findPresseCategorieByName("مكتوبة"));
        List<PresseCategorie> presseCategories2 = new ArrayList<>();
        presseCategories2.add(this.presseCategorieRepository.findPresseCategorieByName("رقمية/مكتوبة"));
        Iterator var12;
        PresseCategorie presseCategorie;
        if (presse.getTypepbpr().toString().equals("public")) {
            var12 = presse.getPresseCategories().iterator();

            while(var12.hasNext()) {
                presseCategorie = (PresseCategorie)var12.next();
                if (presseCategorie.getName().equals("رقمية") || presseCategorie.getName().equals("رقمية/مكتوبة")) {
                    pressesElectroniquePublic = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories1, "public");
                    pressesElectroniquePublic = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories2, "public");
                } else {
                    pressesElectroniquePrive = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories1, "prive");
                    pressesElectroniquePrive = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories2, "prive");
                }
            }
        } else {
            var12 = presse.getPresseCategories().iterator();
         

            while(var12.hasNext()) {
                presseCategorie = (PresseCategorie)var12.next();
                if (presseCategorie.getName().equals("رقمية/مكتوبة")|| presseCategorie.getName().equals("مكتوبة")) {
                    pressesEcritPublic = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories, "public");
                    pressesEcritPublic = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories2, "public");
                } else {
                    pressesEcritPrive = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories, "prive");
                    pressesEcritPrive = this.presseService.findPresseByPresseCategoriesAndTypepbpr(presseCategories2, "prive");
                }
            }
        }

        pressesList.addAll((Collection)pressesElectroniquePublic);
        pressesList.addAll((Collection)pressesElectroniquePrive);
        pressesList.addAll((Collection)pressesEcritPublic);
        pressesList.addAll((Collection)pressesEcritPrive);

        List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
        model.addAttribute("complexesForNavBar", complexesForNavBar);
        List<Lois> loisForNavBar = this.loisService.findAll();
        model.addAttribute("loisForNavBar", loisForNavBar);
        model.addAttribute("presse", presse);
        model.addAttribute("pressesList", pressesList);
        return "notAuthenticated/presse/presseDetails";
    } 

 */
@GetMapping({"/{id}"})
public String findTVById(Model model, @PathVariable Long id) {
    Presse presse = this.presseService.findPresseById(id);
    
    // Listes de presse par type et catégorie
    List<Presse> pressesElectroniquePublic = new ArrayList<>();
    List<Presse> pressesElectroniquePrive = new ArrayList<>();
    List<Presse> pressesEcritPublic = new ArrayList<>();
    List<Presse> pressesEcritPrive = new ArrayList<>();
    List<Presse> pressesList = new ArrayList<>();

    // Catégories de presse
    PresseCategorie categorieElectronique = this.presseCategorieRepository.findPresseCategorieByName("رقمية");
    PresseCategorie categorieEcrit = this.presseCategorieRepository.findPresseCategorieByName("مكتوبة");
    PresseCategorie categorieMixte = this.presseCategorieRepository.findPresseCategorieByName("رقمية/مكتوبة");

    // Traitement des catégories pour la presse actuelle
    for (PresseCategorie categorie : presse.getPresseCategories()) {
        if (categorie.getName().equals("رقمية") || categorie.getName().equals("رقمية/مكتوبة")) {
            // Presse numérique (public et privé)
            pressesElectroniquePublic.addAll(this.presseService.findPresseByPresseCategoriesAndTypepbpr(List.of(categorieElectronique), "public"));
            pressesElectroniquePrive.addAll(this.presseService.findPresseByPresseCategoriesAndTypepbpr(List.of(categorieElectronique), "prive"));
            pressesElectroniquePublic.addAll(this.presseService.findPresseByPresseCategoriesAndTypepbpr(List.of(categorieMixte), "public"));
            pressesElectroniquePrive.addAll(this.presseService.findPresseByPresseCategoriesAndTypepbpr(List.of(categorieMixte), "prive"));
        } 
        if (categorie.getName().equals("مكتوبة") || categorie.getName().equals("رقمية/مكتوبة")) {
            // Presse écrite (public et privé)
            pressesEcritPublic.addAll(this.presseService.findPresseByPresseCategoriesAndTypepbpr(List.of(categorieEcrit), "public"));
            pressesEcritPrive.addAll(this.presseService.findPresseByPresseCategoriesAndTypepbpr(List.of(categorieEcrit), "prive"));
            pressesEcritPublic.addAll(this.presseService.findPresseByPresseCategoriesAndTypepbpr(List.of(categorieMixte), "public"));
            pressesEcritPrive.addAll(this.presseService.findPresseByPresseCategoriesAndTypepbpr(List.of(categorieMixte), "prive"));
        }
    }

    // Ajout des listes de presse dans une liste globale
    pressesList.addAll(pressesElectroniquePublic);
    pressesList.addAll(pressesElectroniquePrive);
    pressesList.addAll(pressesEcritPublic);
    pressesList.addAll(pressesEcritPrive);

    // Ajout des autres données au modèle (navigation bar)
    List<Complexe> complexesForNavBar = this.complexeService.findComplexesByType("prive");
    model.addAttribute("complexesForNavBar", complexesForNavBar);
    List<Lois> loisForNavBar = this.loisService.findAll();
    model.addAttribute("loisForNavBar", loisForNavBar);

    // Ajout des informations de la presse au modèle
    model.addAttribute("presse", presse);
    model.addAttribute("pressesList", pressesList);

    List  <Etablissement> etablissementImprssion= etablissementService.findEtablissementsByTypeEtablissmnt("société d'impression");
    model.addAttribute("etablissementImprssion", etablissementImprssion);
    // Retourner la vue
    return "notAuthenticated/presse/presseDetails";
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
        Presse presse = this.presseService.findPresseById(id);
        Optional<Multimedia> multimedia = this.multimediaService.findFirstByPresseOrderByIdDesc(presse);
        if (multimedia.isPresent()) {
            String filename = ((Multimedia)multimedia.get()).getFileName();
            Resource file = this.filesStorageService.load(folder.concat("/" + filename));
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + file.getFilename() + "\""})).body(file);
        } else {
            Resource file = this.filesStorageService.load("staticImage".concat("/nothing.png"));
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + file.getFilename() + "\""})).body(file);
        }
    }

    @GetMapping({"/pressesEdit/{id}"})
    public String FindPressById(Model model, @PathVariable Long id)
    {
        Presse press=this.presseService.findPresseById(id);
        model.addAttribute("press",press);
        List<Complexe> complexes = this.complexeService.findAll();
        List<PresseCategorie> presseCategories = this.presseCategorieService.findAll();
        Optional<PresseCategorie> selectCate=this.presseCategorieService.findPresseCategorieById(id);
        System.out.println(id+" is to"+selectCate);
        model.addAttribute("complexes", complexes);
        model.addAttribute("presseDTO", new PresseDTO());
        model.addAttribute("presseCategories", presseCategories);
        model.addAttribute("Selected", selectCate);
        List<CategoriePress> categoriePresses = this.categoriePresseService.findAll();
        model.addAttribute("categoriePresses", categoriePresses);

        List<Pressejr> Pressejr = this.PressejrService.findAll();
        model.addAttribute("Pressejr", Pressejr);

        List<Language> Language = this.LanguageService.findAll();
        model.addAttribute("Language", Language);
        return "authenticated/presse/PressEdit";
    }


    @PostMapping({"/update/{id}"})
    public RedirectView updatedPress(@PathVariable Long id,@ModelAttribute  Presse updatePress,@RequestParam("profilFiles") List<MultipartFile> multimediaFiles,@RequestParam("selectedCategorie") Optional<Long> cat)
    {
        Presse presse = this.presseService.findPresseById(id);
      // Optional<Multimedia> multimedia=this.multimediaService.findFirstByEtablissement(etablissement);
       Optional<Presse> existingPress = this.presseService.findById(id);
       System.out.println(cat+" testing");
       Boolean  check= this.presseService.updateDataPresse(updatePress,id,existingPress,multimediaFiles,cat);
       //return "authenticated/etablissement/etablissementsEdit.html";
       return new RedirectView("/presse/presses");
    }
    @GetMapping("/delete/{id}")
    public RedirectView Deletepress(@PathVariable Long id) {
        this.presseService.deletePressByid(id);
        return new RedirectView("/presse/presses");
    }
    
}
