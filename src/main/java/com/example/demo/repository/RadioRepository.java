package com.example.demo.repository;


import com.example.demo.entities.Radio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RadioRepository extends JpaRepository<Radio, Long> {
    Radio findRadioById(Long id);
    Optional<Radio> findById(Long id);

    List<Radio> findRadioByCategorie(String string);
    List<Radio> findByDescriptionContainingIgnoreCase(String keyword);
    List<Radio> findByDescriptionFrContainingIgnoreCase(String keyword);
    List<Radio> findByDescriptionEnContainingIgnoreCase(String keyword);
}
