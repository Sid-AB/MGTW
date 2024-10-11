package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dto.SousDirectionDTO;
import com.example.demo.entities.*;
import com.example.demo.repository.DirectionRepository;
import com.example.demo.repository.SousDirectionRepository;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SousDirectionService {

     @Autowired
    private SousDirectionRepository SousdirectionRepository;
    @Autowired
    private DirectionService directionService;
    @Autowired
    private DirectionRepository directionRepository;

    public SousDirectionService() {
    }


  public List<SousDirection> findAll() {
    System.out.println("Méthode findAll() appelée !");
   
        return this.SousdirectionRepository.findAll();  //elle va recuperer toutes lignes de la ttable (tous les directeurs) 
    }
    public SousDirection findsousDirectionById(Long id) {
        return this.SousdirectionRepository.findSousDirectionById(id);
    }

    public Optional<SousDirection> findById(Long id) {
        return this.SousdirectionRepository.findById(id);
    }
    /*Optional<SousDirection> findByNomAndPrenom(String nomsousDirecteur, String prenomsousDirecteur){
        return this.SousdirectionRepository.findByNomAndPrenom( nomsousDirecteur,  prenomsousDirecteur);
    }*/

    public Optional<SousDirection> findByNomsousDirection(String nomsousDirection) {
        return this.SousdirectionRepository.findByNomsousDirection(nomsousDirection);
    }

    public Optional<SousDirection> findByNomsousDirectionFr(String nomsousDirectionFr) {
        return this.SousdirectionRepository.findByNomsousDirectionFr(nomsousDirectionFr);
    }

    public Optional<SousDirection> findByNomsousDirectionEn(String nomsousDirectionEn) {
        return this.SousdirectionRepository.findByNomsousDirectionEn(nomsousDirectionEn);
    }

     //insrer or create la table sousdirection 
     public SousDirectionDTO addsousDirecteur(SousDirectionDTO sousDirectionDTO) {
        SousDirection sousdirection = new SousDirection();
        
        // Assignation des attributs à partir de sousDirectionDTO
        sousdirection.setNomsousDirection(sousDirectionDTO.getNomsousDirection());
        sousdirection.setNomsousDirecteur(sousDirectionDTO.getNomsousDirecteur());
        sousdirection.setPrenomsousDirecteur(sousDirectionDTO.getPrenomsousDirecteur());
        sousdirection.setEmailsousDirecteur(sousDirectionDTO.getEmailsousDirecteur());
        sousdirection.setPhonesousDirecteur(sousDirectionDTO.getPhonesousDirecteur());
        sousdirection.setNomsousDirecteurFr(sousDirectionDTO.getNomsousDirecteurFr());
        sousdirection.setNomsousDirectionFr(sousDirectionDTO.getNomsousDirectionFr());
        sousdirection.setNomsousDirectionEn(sousDirectionDTO.getNomsousDirectionEn());
        sousdirection.setPrenomsousDirecteurFr(sousDirectionDTO.getPrenomsousDirecteurFr());
   
     // récupérer la direction par son ID
     if (sousDirectionDTO.getDirection() != null) {
         Direction direction = this.directionRepository.findDirectionById(sousDirectionDTO.getDirection());
         if (direction != null) {
             sousdirection.setDirection(direction);
         } else {
             throw new IllegalArgumentException("Direction non trouvée avec l'ID fourni");
         }
     } else {
         throw new IllegalArgumentException("ID de direction manquant");
     }

    //soit ça ou avec mapDTO return new DirectionDTO(direction.getNomDirection(), direction.getNomDirecteur(), direction.getPrenomDirecteur(),direction.getEmailDirecteur(),direction.getPhoneDirecteur());

   // sauvegarder l'entité Direction dans la base de données
   SousDirection savedsousDirection = SousdirectionRepository.save(sousdirection);
    
   // Convertir l'objet Direction sauvegardé en DirectionDTO avant de le retourner
   return mapToDTO(savedsousDirection);
}
 
     //convertir l'objet direction à un objet directionDTO
     private SousDirectionDTO mapToDTO(SousDirection sousdirection) {
        SousDirectionDTO sousDirectionDTO = new SousDirectionDTO();
        
        // Assignation des attributs existants
        sousDirectionDTO.setNomsousDirection(sousdirection.getNomsousDirection());
        sousDirectionDTO.setNomsousDirecteur(sousdirection.getNomsousDirecteur());
        sousDirectionDTO.setPrenomsousDirecteur(sousdirection.getPrenomsousDirecteur());
        sousDirectionDTO.setEmailsousDirecteur(sousdirection.getEmailsousDirecteur());
        sousDirectionDTO.setPhonesousDirecteur(sousdirection.getPhonesousDirecteur());
        sousDirectionDTO.setNomsousDirecteurFr(sousdirection.getNomsousDirecteurFr());
        sousDirectionDTO.setNomsousDirectionFr(sousdirection.getNomsousDirectionFr());
        sousDirectionDTO.setNomsousDirectionEn(sousdirection.getNomsousDirectionEn());
        sousDirectionDTO.setPrenomsousDirecteurFr(sousdirection.getPrenomsousDirecteurFr());

    
        return sousDirectionDTO;
    }

    //fct pour recuperer tous les directeurs avec ses infos sous Forme de DTO  à l'aide de Java Stream
        //La méthode map() est utilisée pour transformer chaque objet Direction en un objet DirectionDTO

        public List<SousDirectionDTO> getAllsousDirecteurs() {
            return SousdirectionRepository.findAll().stream()
                    .map(this::mapToDTO)  // Utilisation de la méthode mapToDTO
                    .collect(Collectors.toList());
        }
    
    //recupérer le directreur par son id 
  
    public SousDirectionDTO getsousDirecteurById(Long id) {
        Optional<SousDirection> sousdirection = SousdirectionRepository.findById(id);
        return sousdirection.map(this::mapToDTO)
                .orElseThrow(() -> new EntityNotFoundException("Sous Directeur non trouvé avec l'ID " + id));
    }

    //update direction 
    public SousDirectionDTO updatesousDirecteur(Long id, SousDirectionDTO sousdirectionDTO) {
        SousDirection sousdirection = SousdirectionRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Sous Directeur non trouvé avec l'ID " + id));
    
        // Mettez à jour tous les attributs, y compris les nouveaux
        sousdirection.setNomsousDirection(sousdirectionDTO.getNomsousDirection());
        sousdirection.setNomsousDirecteur(sousdirectionDTO.getNomsousDirecteur());
        sousdirection.setPrenomsousDirecteur(sousdirectionDTO.getPrenomsousDirecteur());
        sousdirection.setEmailsousDirecteur(sousdirectionDTO.getEmailsousDirecteur());
        sousdirection.setPhonesousDirecteur(sousdirectionDTO.getPhonesousDirecteur());
        sousdirection.setNomsousDirecteurFr(sousdirectionDTO.getNomsousDirecteurFr());
        sousdirection.setNomsousDirectionFr(sousdirectionDTO.getNomsousDirectionFr());
        sousdirection.setNomsousDirectionEn(sousdirectionDTO.getNomsousDirectionEn());
        sousdirection.setPrenomsousDirecteurFr(sousdirectionDTO.getPrenomsousDirecteurFr());
   
    
        sousdirection = SousdirectionRepository.save(sousdirection);
    
        // Utilisez mapToDTO pour retourner le DTO mis à jour
        return mapToDTO(sousdirection);
    }

    //supprimer direction 
    public void deletesousDirecteur(Long id) {
        if (!SousdirectionRepository.existsById(id)) {
            throw new EntityNotFoundException("Sous Directeur non trouvé avec l'ID " + id);
        }
        SousdirectionRepository.deleteById(id);
    }

}
