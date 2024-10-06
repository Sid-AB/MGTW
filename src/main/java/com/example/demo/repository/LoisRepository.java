package com.example.demo.repository;


import com.example.demo.entities.Lois;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface LoisRepository extends JpaRepository<Lois, Long> {
   Optional<Lois> findById(Long id);
    Lois findLoisById(Long id);
}
