package com.example.demo.repository;



import com.example.demo.entities.Pressejr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PressejrRepository extends JpaRepository<Pressejr, Long> {
    Pressejr findPressejreById(Long id);

    Pressejr findPressejrByName(String string);
    Pressejr findPressejrByNameFr(String string);
    Pressejr findPressejrByNameEn(String string);
}
