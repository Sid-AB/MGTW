package com.example.demo.repository;
 
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Direction;



public interface DirectionRepository extends JpaRepository<Direction, Long> {

    Direction findDirectionById(Long id);
   
    //Optional<Direction> findByNomAndPrenom(String nomDirecteur, String prenomDirecteur); //recherche par nom et prenom dans bdd, va chercher tous les directeurs qui ont à la fois le nom et le prénom

    Optional<Direction> findByNomDirection(String nomDirection);

}