package com.example.demo.repository;


import com.example.demo.entities.Agrument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AgrumentRepository extends JpaRepository<Agrument, Long> {
    Optional<Agrument> findAgrumentById(Long id);

    Agrument findAgrumentByName(String string);
}
