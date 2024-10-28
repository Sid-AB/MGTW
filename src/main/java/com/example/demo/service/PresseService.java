package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import com.example.demo.dto.PresseDTO;
import com.example.demo.entities.Multimedia;
import com.example.demo.entities.Presse;
import com.example.demo.entities.PresseCategorie;
import com.example.demo.repository.ComplexeRepository;
import com.example.demo.repository.MultimediaRepository;
import com.example.demo.repository.PresseRepository;
import com.example.demo.repository.PressejrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class PresseService {
    @Autowired
    private PresseRepository presseRepository;
    Autowired
    private PressejrRepository PressejrRepository;
    @Autowired
    private ComplexeRepository complexeRepository;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private MultimediaRepository multimediaRepository;
    @Autowired
    private MultimediaService multimediaService;
    @Autowired
    private PresseCategorieService presseCategorieService;

    public PresseService() {
    }

    public Presse findPresseById(Long id) {
        return this.presseRepository.findPresseById(id);
    }

    public Optional<Presse> findById(Long id) {
        return this.presseRepository.findById(id);
    }
    

    public List<Presse> findAll() {
        return this.presseRepository.findAll();
    }


    public List<Presse> findPresseByPresseCategories(List<PresseCategorie> categories) {
        return this.presseRepository.findPresseByPresseCategories(categories);
    }

    public List<Presse> findPresseByPresseCategoriesAndTypepbpr(List<PresseCategorie> categories, String string) {
        return this.presseRepository.findPresseByPresseCategoriesAndTypepbpr(categories, string);
    }
    public List<Presse> findByDescriptionContainingIgnoreCase(String keyword) {
        return this.presseRepository.findByDescriptionContainingIgnoreCase(keyword);
    }
    public List<Presse> findByDescriptionFrContainingIgnoreCase(String keyword) {
        return this.presseRepository.findByDescriptionFrContainingIgnoreCase(keyword);
    }
    public List<Presse> findByDescriptionEnContainingIgnoreCase(String keyword) {
        return this.presseRepository.findByDescriptionEnContainingIgnoreCase(keyword);
    }
    public Presse saveRadio(PresseDTO presseDTO) {
        Presse presse = presseDTO.toEPresse();
        this.presseRepository.save(presse);
        List<Long> categoriepressesID = presseDTO.getSelectedCategorie();
        Iterator multimedia;
        if (!categoriepressesID.isEmpty()) {
            multimedia = categoriepressesID.iterator();

            while(multimedia.hasNext()) {
                Long categoriepresseID = (Long)multimedia.next();
                Optional<PresseCategorie> presseCategorie = this.presseCategorieService.findPresseCategorieById(categoriepresseID);
                presse.getPresseCategories().add((PresseCategorie)presseCategorie.get());
                this.presseRepository.save(presse);
            }
        }

        multimedia = null;
        List<Multimedia> multimedias = new ArrayList();
        if (!((MultipartFile)presseDTO.getProfilFiles().get(0)).isEmpty()) {
            multimedias.addAll(this.filesStorageService.saveFiles(presseDTO.getProfilFiles(), "profileDoc"));
        } 

        Presse presse1 = this.saveUserAndMultimedias(multimedias, presse);
        presse1.setComplexe(this.complexeRepository.findComplexeById(presseDTO.getComplexe()));
        presse1.setPressejr(this.complexeRepository.findComplexeById(presseDTO.getComplexe()));
        this.presseRepository.save(presse1);
        return presse1;
    }

     public Presse saveUserAndMultimedias(List<Multimedia> multimedias, Presse presse) {
        this.presseRepository.save(presse);
        if (multimedias != null && !multimedias.isEmpty()) {
            List<Multimedia> savedMultimedias = new ArrayList();
            multimedias.forEach((multimedia) -> {
                multimedia.setPresse(presse);
            });
            savedMultimedias.addAll(multimedias);
            presse.setMultimediaList(savedMultimedias);
            this.multimediaRepository.saveAll(savedMultimedias);
        }

        return presse;
    }


    public Boolean updateDataPresse(Presse Presse, Long userId,Optional<Presse> existingPress,List<MultipartFile> multimediaFiles,Optional<Long> cat) {
        if (existingPress.isPresent()) {
          
            Presse press = existingPress.get();
            press.setName(Presse.getName());
            press.setNameFr(Presse.getNameFr());
            press.setNameEn(Presse.getNameEn());
            press.setAdresse(Presse.getAdresse());
            press.setAdresseFr(Presse.getAdresseFr());
            press.setAdresseEn(Presse.getAdresseEn());
            press.setDescription(Presse.getDescription());
            press.setDescriptionFr(Presse.getDescriptionFr());
            press.setDescriptionEn(Presse.getDescriptionEn());
            press.setEmail(Presse.getEmail());
            press.setSite(Presse.getSite());
            press.setWebsite(Presse.getWebsite());
         //   press.setPresseCategories(Presse.getPresseCategories());
            press.setPhone(Presse.getPhone());
            press.setFax(Presse.getFax());
            press.setCategoriePresse(Presse.getCategoriePresse());

            press.setPressejr(Presse.getPressejr());
            
            press.setLanguage(Presse.getLanguage());

            if (multimediaFiles != null && !multimediaFiles.isEmpty()) {
                List<Multimedia> multimediaList = new ArrayList<>();
                for (MultipartFile file : multimediaFiles) {
                    if (!file.isEmpty()) {
                        // Create a Multimedia entity
                        Multimedia multimedia = this.multimediaRepository.findFirstByPressOrderByIdAsc(Presse);
                        multimedia.setFileName(file.getOriginalFilename());
    
                        // Save file to filesystem and get the file path
                        multimedia = this.filesStorageService.save(file,"PressDoc");
                       // multimedia.setFilePath(filePath);
    
                        // Set the etablissement reference in multimedia
                        multimedia.setPresse(press);
    
                        // Add multimedia to the list
                        multimediaList.add(multimedia);
                    }
                }
    
                // Save the multimedia files
                multimediaRepository.saveAll(multimediaList);
            }
            if(!cat.isEmpty())
            {
                Optional<Long> categoriepressesID = cat;

                categoriepressesID
                    .flatMap(this.presseCategorieService::findPresseCategorieById)
                    .ifPresent(press.getPresseCategories()::add); 
            }
            else
            {
                this.presseRepository.save(press);
     
            }

            this.presseRepository.save(press);
     
        return true;
    }
    else
    {
        return false;
    }
      //  return existingPresse;
    }
}
