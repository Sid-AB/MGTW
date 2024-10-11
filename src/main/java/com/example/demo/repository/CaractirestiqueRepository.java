package com.example.demo.repository;


import com.example.demo.entities.Caracteristique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaractirestiqueRepository extends JpaRepository<Caracteristique, Long> {
    Caracteristique findCaracteristiqueById(Long id);
}
