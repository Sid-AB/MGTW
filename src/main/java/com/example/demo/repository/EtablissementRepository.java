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
    Optional<Etablissement> findEtablissementByNameFr(String nameFr);
    Optional<Etablissement> findEtablissementByNameEn(String nameEn);  // Ajout pour le nom en anglais


    List<Etablissement> findEtablissementsByType(String type);
    List<Etablissement> findByDescriptionContainingIgnoreCase(String keyword);
    List<Etablissement> findByDescriptionFrContainingIgnoreCase(String keyword);
    List<Etablissement> findByDescriptionEnContainingIgnoreCase(String keyword);


}
