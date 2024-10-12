package com.example.demo.repository;


import com.example.demo.entities.Presse;
import com.example.demo.entities.PresseCategorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

import java.util.Optional;

@Repository
public interface PresseCategorieRepository extends JpaRepository<PresseCategorie, Long> {
   Optional<PresseCategorie> findPresseCategorieById(Long id);  

    PresseCategorie findPresseCategorieByName(String name);

    // Méthode pour récupérer plusieurs catégories par une liste de noms
    List<PresseCategorie> findByNameIn(List<String> names);  // Ajoutez cette méthode
 
}
