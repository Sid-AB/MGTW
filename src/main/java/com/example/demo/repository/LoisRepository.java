package com.example.demo.repository;


import com.example.demo.entities.Lois;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoisRepository extends JpaRepository<Lois, Long> {
    Lois findLoisById(Long id);
}
