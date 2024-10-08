package com.example.demo.repository;
 
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Direction;



public interface DirectionRepository extends JpaRepository<Direction, Long> {

    Direction findDirectionById(Long id);
    //Direction findById(Long id);
   
    // Recherche par nom et prénom
    // Optional<Direction> findByNomAndPrenom(String nomDirecteur, String prenomDirecteur); // Recherche par nom et prénom dans BDD

    Optional<Direction> findByNomDirection(String nomDirection);
    
    // Ajout de méthodes de recherche pour les nouveaux attributs
    Optional<Direction> findByNomDirecteurFr(String nomDirecteurFr);
    
    Optional<Direction> findByNomDirecteurEn(String nomDirecteurEn);
    
    Optional<Direction> findByNomDirectionFr(String nomDirectionFr);
    
    Optional<Direction> findByNomDirectionEn(String nomDirectionEn);
    
    Optional<Direction> findByPrenomDirecteurFr(String prenomDirecteurFr);
    
    Optional<Direction> findByPrenomDirecteurEn(String prenomDirecteurEn);
}