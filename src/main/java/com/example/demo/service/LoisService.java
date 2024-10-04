package com.example.demo.service;


import com.example.demo.dto.LoisDTO;
import com.example.demo.entities.Lois;
import com.example.demo.repository.LoisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoisService {
    @Autowired
    private LoisRepository loisRepository;

    public LoisService() {
    }

    public Optional<Lois> findById(Long id) {
        return this.loisRepository.findById(id);
    }

    public Lois findLoisById(Long id) {
        return this.loisRepository.findLoisById(id);
    }

    public List<Lois> findAll() {
        return this.loisRepository.findAll();
    }

    public Lois saveLois(LoisDTO loisDTO) {
        Lois lois = loisDTO.toLois();
        this.loisRepository.save(lois);
        return lois;
    }

    public Boolean updateDataLois(Lois lois, Long userId,Optional<Lois> existingLois/*, Optional<Multimedia> multimedias */) {
        if (existingLois.isPresent()) {
            Lois loi = existingLois.get();
            loi.setName(lois.getName());
            loi.setNameFr(lois.getNameFr());
            loi.setDescription(lois.getDescription());
            this.loisRepository.save(loi);
      /*  if (multimedias.isPresent()) {
            List<Multimedia> savedMultimedias = new ArrayList();
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
}
