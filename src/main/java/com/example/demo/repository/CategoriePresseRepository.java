package com.example.demo.repository;


import com.example.demo.entities.CategoriePress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriePresseRepository extends JpaRepository<CategoriePress, Long> {
    CategoriePress findCategoriePresseById(Long id);

    CategoriePress findCategoriePresseByName(String string);
    CategoriePress findCategoriePresseByNameFr(String string);
    CategoriePress findCategoriePresseByNameEn(String string);
}
