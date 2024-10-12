package com.example.demo.repository;


import com.example.demo.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface MultimediaRepository extends JpaRepository<Multimedia, Long> {
    List<Multimedia> findAllById(Long id);

    Multimedia findMultimediaById(Long id);

    @Query(value = "SELECT m FROM Multimedia m WHERE m.etablissement = :etablissement ORDER BY m.id DESC LIMIT 1")
    Multimedia findFirstByEtablissementOrderByIdAsc(@Param("etablissement") Etablissement etablissement);

    Multimedia findByEtablissement(Etablissement etablissement);

    void deleteById(Long id);

    Optional<Multimedia> findFirstByUserAndDocTypeOrderByCreatedAtDesc(User user, String docType);

    Optional<Multimedia> findFirstByTv(TV tv);

    Optional<Multimedia> findFirstByRadio(Radio radio);

    Optional<Multimedia> findFirstByPresse(Presse presse);

    Optional<Multimedia> findFirstByEtablissementOrderByIdDesc(Etablissement etablissement);

    Optional<Multimedia> findFirstByTextJuridique(TextJuridique textJuridique);

    Optional<Multimedia> findFirstByMinister(Minister minister);
}
