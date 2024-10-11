package com.example.demo.repository;

import java.util.Optional;

import com.example.demo.entities.Direction;
import com.example.demo.entities.Radio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.SousDirection;

public interface SousDirectionRepository extends JpaRepository<SousDirection, Long> {
    SousDirection findSousDirectionById(Long id);
    Optional<SousDirection> findById(Long id);

    // Recherche par nom et prénom
    //Optional<SousDirection> findByNomAndPrenom(String nomsousDirecteur, String prenomsousDirecteur); // Recherche par nom et prénom dans BDD

    Optional<SousDirection> findByNomsousDirection(String nomsousDirection);
    Optional<SousDirection> findByNomsousDirectionFr(String nomsousDirectionFr);
    
    Optional<SousDirection> findByNomsousDirectionEn(String nomsousDirectionEn);

    Optional<SousDirection> findByNomsousDirecteur(String nomsousDirecteur);
    Optional<SousDirection> findByNomsousDirecteurFr(String nomsousDirecteurFr);
    
    Optional<SousDirection> findByPrenomsousDirecteur(String prenomsousDirecteur);
    Optional<SousDirection> findByPrenomsousDirecteurFr(String prenomsousDirecteurFr);

}
