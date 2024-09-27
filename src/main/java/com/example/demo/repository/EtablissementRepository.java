package com.example.demo.repository;


import com.example.demo.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {
    Etablissement findEtablissementById(Long id);

    Optional<Etablissement> findEtablissementByName(String name);

    List<Etablissement> findEtablissementsByType(String type);
    List<Etablissement> findByDescriptionContainingIgnoreCase(String keyword);
}
