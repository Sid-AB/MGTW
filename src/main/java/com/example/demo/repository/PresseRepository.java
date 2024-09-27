package com.example.demo.repository;


import com.example.demo.entities.Presse;
import com.example.demo.entities.PresseCategorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PresseRepository extends JpaRepository<Presse, Long> {
    Presse findPresseById(Long id);

    List<Presse> findPresseByPresseCategories(List<PresseCategorie> categories);

    List<Presse> findPresseByPresseCategoriesAndTypepbpr(List<PresseCategorie> categories, String string);
    List<Presse> findByDescriptionContainingIgnoreCase(String keyword);
}

