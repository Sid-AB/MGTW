package com.example.demo.repository;


import com.example.demo.entities.Presse;
import com.example.demo.entities.PresseCategorie;

import jakarta.transaction.Transactional;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PresseRepository extends JpaRepository<Presse, Long> {


    Presse findPresseById(Long id);
    Optional<Presse> findById(Long id);
    List<Presse> findPresseByPresseCategories(List<PresseCategorie> categories);

    List<Presse> findPresseByPresseCategoriesAndTypepbpr(List<PresseCategorie> categories, String string);
    List<Presse> findByDescriptionContainingIgnoreCase(String keyword);
    List<Presse> findByDescriptionFrContainingIgnoreCase(String keyword);
    List<Presse> findByDescriptionEnContainingIgnoreCase(String keyword);

    // Méthodes pour rechercher par name et nameFr
    List<Presse> findByNameContainingIgnoreCase(String name);
    
    List<Presse> findByNameFrContainingIgnoreCase(String nameFr);
    
    List<Presse> findByNameEnContainingIgnoreCase(String nameEn); 
   
}

