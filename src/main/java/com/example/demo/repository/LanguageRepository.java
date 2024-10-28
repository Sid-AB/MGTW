package com.example.demo.repository;

import com.example.demo.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {
    Language findLanguageById(Long id);

    Language findLanguageByName(String string);
    Language findLanguageByNameFr(String string);
    Language findLanguageByNameEn(String string);
}
