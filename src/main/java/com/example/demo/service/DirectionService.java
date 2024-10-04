package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Direction;

import com.example.demo.repository.DirectionRepository;

import jakarta.persistence.EntityNotFoundException;

import com.example.demo.dto.DirectionDTO;


@Service
public class DirectionService {

    @Autowired
    private DirectionRepository directionRepository;


    public DirectionService() {
    }


  public List<Direction> findAll() {
        return this.directionRepository.findAll();  //elle va recuperer toutes lignes de la ttable (tous les directeurs) 
    }

    /*Optional<Direction> findByNomAndPrenom(String nomDirecteur, String prenomDirecteur){
        return this.directionRepository.findByNomAndPrenom( nomDirecteur,  prenomDirecteur);
    }*/

    public Optional<Direction> findByNomDirection(String nomDirection) {
        return this.directionRepository.findByNomDirection(nomDirection);
    }

    public Optional<Direction> findByNomDirectionFr(String nomDirectionFr) {
        return this.directionRepository.findByNomDirectionFr(nomDirectionFr);
    }

    public Optional<Direction> findByNomDirectionEn(String nomDirectionEn) {
        return this.directionRepository.findByNomDirectionEn(nomDirectionEn);
    }

   

     //insrer or create la table direction 
     public DirectionDTO addDirecteur(DirectionDTO directionDTO) {
        Direction direction = new Direction();
        
        // Assignation des attributs à partir de DirectionDTO
        direction.setNomDirection(directionDTO.getNomDirection());
        direction.setNomDirecteur(directionDTO.getNomDirecteur());
        direction.setPrenomDirecteur(directionDTO.getPrenomDirecteur());
        direction.setEmailDirecteur(directionDTO.getEmailDirecteur());
        direction.setPhoneDirecteur(directionDTO.getPhoneDirecteur());
        
        // Assignation des nouveaux attributs
        direction.setNomDirecteurFr(directionDTO.getNomDirecteurFr());
        direction.setNomDirecteurEn(directionDTO.getNomDirecteurEn());
        direction.setNomDirectionFr(directionDTO.getNomDirectionFr());
        direction.setNomDirectionEn(directionDTO.getNomDirectionEn());
        direction.setPrenomDirecteurFr(directionDTO.getPrenomDirecteurFr());
        direction.setPrenomDirecteurEn(directionDTO.getPrenomDirecteurEn());
    
    //soit ça ou avec mapDTO return new DirectionDTO(direction.getNomDirection(), direction.getNomDirecteur(), direction.getPrenomDirecteur(),direction.getEmailDirecteur(),direction.getPhoneDirecteur());

   // Sauvegarder l'entité Direction dans la base de données
   Direction savedDirection = directionRepository.save(direction);
    
   // Convertir l'objet Direction sauvegardé en DirectionDTO avant de le retourner
   return mapToDTO(savedDirection);
}
 
     //convertir l'objet direction à un objet directionDTO
     private DirectionDTO mapToDTO(Direction direction) {
        DirectionDTO directionDTO = new DirectionDTO();
        
        // Assignation des attributs existants
        directionDTO.setNomDirection(direction.getNomDirection());
        directionDTO.setNomDirecteur(direction.getNomDirecteur());
        directionDTO.setPrenomDirecteur(direction.getPrenomDirecteur());
        directionDTO.setEmailDirecteur(direction.getEmailDirecteur());
        directionDTO.setPhoneDirecteur(direction.getPhoneDirecteur());
        
        // Assignation des nouveaux attributs
        directionDTO.setNomDirecteurFr(direction.getNomDirecteurFr());
        directionDTO.setNomDirecteurEn(direction.getNomDirecteurEn());
        directionDTO.setNomDirectionFr(direction.getNomDirectionFr());
        directionDTO.setNomDirectionEn(direction.getNomDirectionEn());
        directionDTO.setPrenomDirecteurFr(direction.getPrenomDirecteurFr());
        directionDTO.setPrenomDirecteurEn(direction.getPrenomDirecteurEn());
    
        return directionDTO;
    }

    //fct pour recuperer tous les directeurs avec ses infos sous Forme de DTO  à l'aide de Java Stream
        //La méthode map() est utilisée pour transformer chaque objet Direction en un objet DirectionDTO

        public List<DirectionDTO> getAllDirecteurs() {
            return directionRepository.findAll().stream()
                    .map(this::mapToDTO)  // Utilisation de la méthode mapToDTO
                    .collect(Collectors.toList());
        }
    
    //recupérer le directreur par son id 
  
    public DirectionDTO getDirecteurById(Long id) {
        Optional<Direction> direction = directionRepository.findById(id);
        return direction.map(this::mapToDTO)
                .orElseThrow(() -> new EntityNotFoundException("Directeur non trouvé avec l'ID " + id));
    }

    //update direction 
    public DirectionDTO updateDirecteur(Long id, DirectionDTO directionDTO) {
        Direction direction = directionRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Directeur non trouvé avec l'ID " + id));
    
        // Mettez à jour tous les attributs, y compris les nouveaux
        direction.setNomDirection(directionDTO.getNomDirection());
        direction.setNomDirecteur(directionDTO.getNomDirecteur());
        direction.setPrenomDirecteur(directionDTO.getPrenomDirecteur());
        direction.setEmailDirecteur(directionDTO.getEmailDirecteur());
        direction.setPhoneDirecteur(directionDTO.getPhoneDirecteur());
    
        // Ajoutez ici les nouveaux attributs
        direction.setNomDirecteurFr(directionDTO.getNomDirecteurFr());
        direction.setNomDirecteurEn(directionDTO.getNomDirecteurEn());
        direction.setNomDirectionFr(directionDTO.getNomDirectionFr());
        direction.setNomDirectionEn(directionDTO.getNomDirectionEn());
        direction.setPrenomDirecteurFr(directionDTO.getPrenomDirecteurFr());
        direction.setPrenomDirecteurEn(directionDTO.getPrenomDirecteurEn());
    
        direction = directionRepository.save(direction);
    
        // Utilisez mapToDTO pour retourner le DTO mis à jour
        return mapToDTO(direction);
    }

    //supprimer direction 
    public void deleteDirecteur(Long id) {
        if (!directionRepository.existsById(id)) {
            throw new EntityNotFoundException("Directeur non trouvé avec l'ID " + id);
        }
        directionRepository.deleteById(id);
    }

  
}
