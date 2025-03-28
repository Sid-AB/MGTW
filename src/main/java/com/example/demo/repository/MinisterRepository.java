package com.example.demo.repository;


import com.example.demo.entities.Minister;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;


public interface MinisterRepository extends JpaRepository<Minister, Long> {
    Minister findMinisterById(Long id);
    Optional<Minister> findById(Long id);
    Optional<Minister> findByFirstNameAndLastName(String firstName, String lastName);
    Optional<Minister> findByFirstNameFrAndLastNameFr(String firstNameFr, String lastNameFr);

    @Query(value = "SELECT m.file_name FROM minister min JOIN multimedia m ON min.profile_picture_id = m.id WHERE min.id = :ministerId", nativeQuery = true)
    String findImagePathByMinisterId(@Param("ministerId") Long ministerId);

}