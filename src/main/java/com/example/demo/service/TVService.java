package com.example.demo.service;

import com.example.demo.dto.TVDTO;
import com.example.demo.entities.Agrument;
import com.example.demo.entities.Caracteristique;
import com.example.demo.entities.CategorieChaine;
import com.example.demo.entities.Complexe;
import com.example.demo.entities.Multimedia;
import com.example.demo.entities.TV;
import com.example.demo.repository.AgrumentRepository;
import com.example.demo.repository.CaractirestiqueRepository;
import com.example.demo.repository.CategorieChaineRepository;
import com.example.demo.repository.ComplexeRepository;
import com.example.demo.repository.MultimediaRepository;
import com.example.demo.repository.TVRepository;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class TVService {
    @Autowired
    private TVRepository tvRepository;
    @Autowired
    private AgrumentRepository agrumentRepository;
    @Autowired
    private ComplexeRepository complexeRepository;
    @Autowired
    private CaractirestiqueRepository caractirestiqueRepository;
    @Autowired
    private CategorieChaineRepository categorieChaineRepository;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private MultimediaRepository multimediaRepository;

    public TVService() {
    }

    public Optional<TV> findById(Long id) {
        return this.tvRepository.findById(id);
    }
    public TV findTVById(Long id) {
        return this.tvRepository.findTVById(id);
    }

    public List<TV> findAll() {
        return this.tvRepository.findAll();
    }

    public List<CategorieChaine> findDistinctCategorieChaineByComplexe(Complexe complexe) {
        return this.tvRepository.findDistinctCategorieChaineByComplexe(complexe);
    }

    public List<TV> findAllByCategorieChaine(CategorieChaine categorieChaine) {
        return this.tvRepository.findAllByCategorieChaine(categorieChaine);
    }

    public List<TV> findByDescriptionContainingIgnoreCase(@Param("text") String keyword) {
        return this.tvRepository.findByDescriptionContainingIgnoreCase(keyword);
    }
    public List<TV> findByDescriptionFrContainingIgnoreCase(@Param("text") String keyword) {
        return this.tvRepository.findByDescriptionFrContainingIgnoreCase(keyword);
    }
    public List<TV> findByDescriptionEnContainingIgnoreCase(@Param("text") String keyword) {
        return this.tvRepository.findByDescriptionEnContainingIgnoreCase(keyword);
    }

    public TV saveTV(TVDTO tvdto) {
        TV tv = tvdto.toETV();
        this.tvRepository.save(tv);
        Caracteristique caracteristique = tvdto.toECaractiristique();
        Multimedia multimedia = null;
        List<Multimedia> multimedias = new ArrayList<>();
        if (!((MultipartFile)tvdto.getProfilFiles().get(0)).isEmpty()) {
            multimedias.addAll(this.filesStorageService.saveFiles(tvdto.getProfilFiles(), "profileDoc"));
        }

        TV tv1 = this.saveUserAndMultimedias(multimedias, tv);
        tv1.setComplexe(this.complexeRepository.findComplexeById(tvdto.getComplexe()));
        this.tvRepository.save(tv1);
        tv1.setCategorieChaine(this.categorieChaineRepository.findCategorieChaineById(tvdto.getCategorieChaines()));
        this.tvRepository.save(tv1);
        this.saveCaracteristique(tv1, caracteristique);
        return tv1;
    }

    public Caracteristique saveCaracteristique(TV tv, Caracteristique caracteristique) {
        caracteristique.setTv(tv);
        this.caractirestiqueRepository.save(caracteristique);
        return caracteristique;
    }

    public TV saveUserAndMultimedias(List<Multimedia> multimedias, TV tv) {
        this.tvRepository.save(tv);
        if (multimedias != null && !multimedias.isEmpty()) {
            List<Multimedia> savedMultimedias = new ArrayList<>();
            multimedias.forEach((multimedia) -> {
                multimedia.setTv(tv);
            });
            savedMultimedias.addAll(multimedias);
            tv.setMultimediaList(savedMultimedias);
            this.multimediaRepository.saveAll(savedMultimedias);
        }

        return tv;
    }

    public List<TV> findTVSByComplexe(Complexe complexe) {
        return null;
    }

    public List<TV> findTVSPublic() {
        List<Agrument> agruments = new ArrayList<>();
        agruments.add(this.agrumentRepository.findAgrumentByName("tv"));
        List<Complexe> complexes = this.complexeRepository.findComplexeByAgrumentListAndType(agruments, "public");
        List<TV> tvs = new ArrayList<>();
        Iterator var4 = complexes.iterator();

        while(var4.hasNext()) {
            Complexe complexe = (Complexe)var4.next();
            tvs.addAll(complexe.getTvList());
        }

        return tvs;
    }
    
    public List<TV> findTVSPrive(String name) {
        List<Agrument> agruments = new ArrayList<>();
        agruments.add(this.agrumentRepository.findAgrumentByName("tv"));
        List<Complexe> complexes = this.complexeRepository.findComplexeByAgrumentListAndTypeAndName(agruments, "prive", name);
        List<TV> tvs = new ArrayList<>();
        Iterator var5 = complexes.iterator();

        while(var5.hasNext()) {
            Complexe complexe = (Complexe)var5.next();
            tvs.addAll(complexe.getTvList());
            PrintStream var10000 = System.out;
            String var10001 = complexe.getName();
            var10000.println("complexez " + var10001 + complexes.size());
        }

        return tvs;
    }

    public Boolean updateDataTV(TV TV, Long userId,Optional<TV> existingTV,List<MultipartFile> multimediaFiles) {
        if (existingTV.isPresent()) {
            TV tv = existingTV.get();
            tv.setName(TV.getName());
            tv.setNameFr(TV.getNameFr());
            tv.setNameEn(TV.getNameEn());
            tv.setAdresse(TV.getAdresse());
            tv.setAdresseFr(TV.getAdresseFr());
            tv.setAdresseEn(TV.getAdresseEn());
            tv.setDescription(TV.getDescription());
            tv.setDescriptionFr(TV.getDescriptionFr());
            tv.setDescriptionEn(TV.getDescriptionEn());
            tv.setStreaminglink(TV.getStreaminglink());
            tv.setEmail(TV.getEmail());
            tv.setFax(TV.getFax());
            tv.setPhone(TV.getPhone());
            tv.setLocalisation(TV.getLocalisation());
            System.out.println("testing -- "+TV.getEmail());
            if (multimediaFiles != null && !multimediaFiles.isEmpty()) {
                List<Multimedia> multimediaList = new ArrayList<>();
                for (MultipartFile file : multimediaFiles) {
                    if (!file.isEmpty()) {
                        // Create a Multimedia entity
                        Multimedia multimedia = this.multimediaRepository.findFirstByTvOrderByIdAsc(TV);
                        multimedia.setFileName(file.getOriginalFilename());
    
                        // Save file to filesystem and get the file path
                        multimedia = this.filesStorageService.save(file,"TVDoc");
                       // multimedia.setFilePath(filePath);
    
                        // Set the etablissement reference in multimedia
                        multimedia.setTv(tv);
    
                        // Add multimedia to the list
                        multimediaList.add(multimedia);
                    }
                }
    
                // Save the multimedia files
                multimediaRepository.saveAll(multimediaList);
            }


            this.tvRepository.save(tv);
      /*  if (multimedias.isPresent()) {
            List<Multimedia> savedMultimedias = new ArrayList<>();
            multimedias.ifPresent((multimedia) -> {
                multimedia.settv(existingTV);
            });
            multimedias.ifPresent(savedMultimedias::addAll);
            savedMultimedias.ifPresent(existingTV::setMultimediaList);
            this.multimediaRepository.saveAll(savedMultimedias);
        } */
        return true;
    }
    else
    {
        return false;
    }
      //  return existingTV;
    }
    public void DeleteTvById(Long Id)
    {
        TV tv=this.findTVById(Id);
        this.tvRepository.delete(tv);
    }
    
}
