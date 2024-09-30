package com.example.demo.repository;


import com.example.demo.entities.Minister;
import com.example.demo.entities.Radio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MinisterRepository extends JpaRepository<Minister, Long> {
    Minister findMinisterById(Long id);
   // Minister findMinisterById(Long id);
    Optional<Minister> findByFirstNameAndLastName(String firstName, String lastName);


    @Query(value = "SELECT m.file_name FROM Minister min JOIN Multimedia m ON min.profile_picture_id = m.id WHERE min.id = :ministerId", nativeQuery = true)
    String findImagePathByMinisterId(@Param("ministerId") Long ministerId);

}