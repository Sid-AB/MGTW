package com.example.demo.repository;


import com.example.demo.entities.TextJuridique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TextJuridiqueRepository extends JpaRepository<TextJuridique, Long> {
    TextJuridique findTextJuridiqueById(Long id);
    List<TextJuridique> findByDescriptionContainingIgnoreCase(String keyword);
}
