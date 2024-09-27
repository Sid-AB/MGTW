package com.example.demo.service;


import com.example.demo.dto.ComplexeDTO;
import com.example.demo.entities.Agrument;
import com.example.demo.entities.Complexe;
import com.example.demo.repository.ComplexeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class ComplexeService {
    @Autowired
    private ComplexeRepository complexeRepository;
    @Autowired
    private AgrumentService agrumentService;

    public ComplexeService() {
    }

    public Complexe findEtablissementById(Long id) {
        return this.complexeRepository.findComplexeById(id);
    }

    public List<Complexe> findComplexesByType(String string) {
        return this.complexeRepository.findComplexesByType(string);
    }

    public List<Complexe> findAll() {
        return this.complexeRepository.findAll();
    }

    public Complexe saveComplexe(ComplexeDTO complexeDTO) {
        Complexe complexe = complexeDTO.toComplexe();
        this.complexeRepository.save(complexe);
        List<Long> agrumentsId = complexeDTO.getSelectedAgrument();
        if (!agrumentsId.isEmpty()) {
            Iterator var4 = agrumentsId.iterator();

            while(var4.hasNext()) {
                Long agrumentId = (Long)var4.next();
                Optional<Agrument> agrument = this.agrumentService.findAgrumentById(agrumentId);
                complexe.getAgrumentList().add((Agrument)agrument.get());
                this.complexeRepository.save(complexe);
            }
        }

        return complexe;
    }

    public List<Complexe> findComplexeByAgrumentListAndType(List<Agrument> agruments, String string) {
        return this.complexeRepository.findComplexeByAgrumentListAndType(agruments, string);
    }

    public List<Complexe> findComplexeByAgrumentListAndTypeAndName(List<Agrument> agruments, String string, String name) {
        return this.complexeRepository.findComplexeByAgrumentListAndTypeAndName(agruments, string, name);
    }
}
