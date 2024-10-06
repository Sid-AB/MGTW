package com.example.demo.repository;


import com.example.demo.entities.CategorieChaine;
import com.example.demo.entities.Complexe;
import com.example.demo.entities.TV;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface TVRepository extends JpaRepository<TV, Long> {
    TV findTVById(Long id);
    Optional<TV> findById(Long id);

    List<TV> findTVSByComplexe(Complexe complexe);

    @Query("SELECT DISTINCT t.categorieChaine FROM TV t")
    List<CategorieChaine> findDistinctCategorieChaines();

    @Query("SELECT DISTINCT t.categorieChaine FROM TV t WHERE t.complexe = :complexe")
    List<CategorieChaine> findDistinctCategorieChaineByComplexe(Complexe complexe);

    List<TV> findAllByCategorieChaine(CategorieChaine categorieChaine);

    List<TV> findByDescriptionContainingIgnoreCase(@Param("text") String keyword);

    // Ajout de la recherche par descriptionFr
    List<TV> findByDescriptionFrContainingIgnoreCase(@Param("text") String keyword);

    // Ajout de la recherche par descriptionEn
    List<TV> findByDescriptionEnContainingIgnoreCase(@Param("text") String keyword);
}
