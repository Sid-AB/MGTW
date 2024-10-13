package com.example.demo.repository;


import com.example.demo.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {
    Etablissement findEtablissementById(Long id);
    Optional<Etablissement> findById(Long id);

    Optional<Etablissement> findEtablissementByName(String name);
    Optional<Etablissement> findEtablissementByNameFr(String name_fr);
    Optional<Etablissement> findEtablissementByNameEn(String name_en);


    List<Etablissement> findEtablissementsByType(String type);
    List<Etablissement> findEtablissementsByTypeEtablissmnt(String typeEtablissmnt);
    List<Etablissement> findByDescriptionContainingIgnoreCase(String keyword);
    List<Etablissement> findByDescriptionFrContainingIgnoreCase(String keyword);
    List<Etablissement> findByDescriptionEnContainingIgnoreCase(String keyword);


}
