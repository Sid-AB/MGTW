package com.example.demo.service;


import com.example.demo.dto.CaracterstiqueDTO;
import com.example.demo.entities.Caracteristique;
import com.example.demo.repository.CaractirestiqueRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaracterstiqueService {
    @Autowired
    private CaractirestiqueRepository caractirestiqueRepository;
    @Autowired
    private TVService tvService;
    @Autowired
    private RadioService radioService;

    public CaracterstiqueService() {
    }

    public List<Caracteristique> findAll() {
        return this.caractirestiqueRepository.findAll();
    }

    public Caracteristique saveCaracteristique(CaracterstiqueDTO caracterstiqueDTO) {
        Caracteristique caracteristique = caracterstiqueDTO.toECaractiristique();
        caracteristique.setTv(this.tvService.findTVById(Long.valueOf(caracterstiqueDTO.getIdmedia())));
        this.caractirestiqueRepository.save(caracteristique);
        return caracteristique;
    }

    public Caracteristique saveRadioCaracteristique(CaracterstiqueDTO caracterstiqueDTO) {
        Caracteristique caracteristique = caracterstiqueDTO.toECaractiristique();
        caracteristique.setRadio(this.radioService.findRadioById(Long.valueOf(caracterstiqueDTO.getIdmedia())));
        this.caractirestiqueRepository.save(caracteristique);
        return caracteristique;
    }
}