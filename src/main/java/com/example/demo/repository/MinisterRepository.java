package com.example.demo.repository;


import com.example.demo.entities.Minister;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MinisterRepository extends JpaRepository<Minister, Long> {
    Minister findByFirstNameAndLastName(String firstName, String lastName);
}