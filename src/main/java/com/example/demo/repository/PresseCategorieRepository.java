package com.example.demo.repository;


import com.example.demo.entities.PresseCategorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PresseCategorieRepository extends JpaRepository<PresseCategorie, Long> {
    Optional<PresseCategorie> findPresseCategorieById(Long id);

    PresseCategorie findPresseCategorieByName(String string);
   
}
