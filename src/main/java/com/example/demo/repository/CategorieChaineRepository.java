package com.example.demo.repository;


import com.example.demo.entities.CategorieChaine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieChaineRepository extends JpaRepository<CategorieChaine, Long> {
    CategorieChaine findCategorieChaineById(Long id);

    CategorieChaine findCategorieChaineByName(String string);
    CategorieChaine findCategorieChaineByNameFr(String string);
    CategorieChaine findCategorieChaineByNameEn(String string);
}
