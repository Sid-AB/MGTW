package com.example.demo.service;


import com.example.demo.dto.TextJuridiqueDTO;
import com.example.demo.entities.Lois;
import com.example.demo.entities.Minister;
import com.example.demo.entities.Multimedia;
import com.example.demo.entities.TextJuridique;
import com.example.demo.repository.LoisRepository;
import com.example.demo.repository.MultimediaRepository;
import com.example.demo.repository.TextJuridiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TextJuridiqueService {
    @Autowired
    private TextJuridiqueRepository textJuridiqueRepository;
    @Autowired
    private LoisService loisService;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private LoisRepository loisRepository;
    @Autowired
    private MultimediaRepository multimediaRepository;

    public TextJuridiqueService() {
    }

    public List<TextJuridique> findAll() {
        return this.textJuridiqueRepository.findAll();
    }
    public Optional<TextJuridique> findById(Long id) {
        return this.textJuridiqueRepository.findById(id);
    }
    public TextJuridique findTextJuridiqueById(Long id) {
        return this.textJuridiqueRepository.findTextJuridiqueById(id);
    }

    public List<TextJuridique> findByDescriptionContainingIgnoreCase(String keyword) {
        return this.textJuridiqueRepository.findByDescriptionContainingIgnoreCase(keyword);
    }
    public List<TextJuridique> findByDescriptionEnContainingIgnoreCase(String keyword) {
        return this.textJuridiqueRepository.findByDescriptionEnContainingIgnoreCase(keyword);
    }
    public List<TextJuridique> findByDescriptionFrContainingIgnoreCase(String keyword) {
        return this.textJuridiqueRepository.findByDescriptionFrContainingIgnoreCase(keyword);
    }

    public TextJuridique saveTextJuridique(TextJuridiqueDTO textJuridiqueDTO) {
        TextJuridique textJuridique = textJuridiqueDTO.toTextJuridique();
        this.textJuridiqueRepository.save(textJuridique);
        Lois lois = this.loisRepository.findLoisById(textJuridiqueDTO.getLois());
        List<Multimedia> multimedias = new ArrayList<>();
        if (!((MultipartFile)textJuridiqueDTO.getProfilFiles().get(0)).isEmpty() && !((MultipartFile)textJuridiqueDTO.getProfilFilesFr().get(0)).isEmpty()) {
            String lang=textJuridique.getPath();
            System.out.println("befor insertion"+lang+" leng"+lang.split("_").length);
            int leng=lang.split("_").length;
            if(leng >= 2)
            {
                System.out.println("Both inserition"+lang);
                multimedias.addAll(this.filesStorageService.saveFilesPdfText(textJuridiqueDTO.getProfilFiles(), "profileDoc","ar"));
                multimedias.addAll(this.filesStorageService.saveFilesPdfText(textJuridiqueDTO.getProfilFilesFr(), "profileDoc","fr"));
            }
            else
            {
            System.out.println("Singl inseretion"+lang);
            multimedias.addAll(this.filesStorageService.saveFilesPdfText(textJuridiqueDTO.getProfilFiles(), "profileDoc",lang));
            }
        }

        this.saveUserAndMultimedias(multimedias, textJuridique);
        textJuridique.setLois(lois);
        this.textJuridiqueRepository.save(textJuridique);
        return textJuridique;
    }

    public TextJuridique saveUserAndMultimedias(List<Multimedia> multimedias, TextJuridique textJuridique) {
        this.textJuridiqueRepository.save(textJuridique);
       
        if (multimedias != null && !multimedias.isEmpty()) {
            List<Multimedia> savedMultimedias = new ArrayList<>();
           
            String lang=textJuridique.getPath();
            String[] langs=lang.split("_");
            int i = 0;
            for (Multimedia multimedia : multimedias) {
                if (langs[i].equals("ar")) {  // Use .equals() instead of ==
                    multimedia.setTextJuridique(textJuridique);
                    multimedia.setFilePath("pdfs/ar");
                } else {
                    multimedia.setTextJuridique(textJuridique);
                    multimedia.setFilePath("pdfs/fr");
                }
                i++;
            }
            savedMultimedias.addAll(multimedias);
            textJuridique.setMultimediaList(savedMultimedias);
            this.multimediaRepository.saveAll(savedMultimedias);
        }

        return textJuridique;
    }

    public Boolean updateDataMins(TextJuridique textjuridique, Long userId,Optional<TextJuridique> existingMin/*, Optional<Multimedia> multimedias */) {
        if (existingMin.isPresent()) {
            TextJuridique mins = existingMin.get();
            mins.setName(textjuridique.getName());
            mins.setNameFr(textjuridique.getNameFr());
            mins.setNameEn(textjuridique.getNameEn());
            mins.setDescription(textjuridique.getDescription());
            mins.setDescriptionFr(textjuridique.getDescriptionFr());
            mins.setDescriptionEn(textjuridique.getDescriptionEn());
            this.textJuridiqueRepository.save(mins);
          /* List<Multimedia> multimedias = new ArrayList<>();
            if (!((MultipartFile)textJuridiqueDTO.getProfilFiles().get(0)).isEmpty()) {
                String lang = mins.getPath();
                multimedias.addAll(this.filesStorageService.saveFilesPdfText(textJuridiqueDTO.getProfilFiles(), "profileDoc",lang));
            }
    
            this.saveUserAndMultimedias(multimedias, textJuridique);*/ 
      /*  if (multimedias.isPresent()) {
            List<Multimedia> savedMultimedias = new ArrayList();
            multimedias.ifPresent((multimedia) -> {
                multimedia.setRadio(existingRadio);
            });
            multimedias.ifPresent(savedMultimedias::addAll);
            savedMultimedias.ifPresent(existingRadio::setMultimediaList);
            this.multimediaRepository.saveAll(savedMultimedias);
        } */
        return true;
    }
    else
    {
        return false;
    }
      //  return existingRadio;
    }
    public void deleteTextJuridique(Long id)
    {
        TextJuridique mins = this.textJuridiqueRepository.findTextJuridiqueById(id);
        this.textJuridiqueRepository.delete(mins);
    }
}
