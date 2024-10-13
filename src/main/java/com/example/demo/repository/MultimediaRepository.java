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


    @Query(value = "SELECT m FROM Multimedia m WHERE m.presse = :presse ORDER BY m.id DESC LIMIT 1")
    Multimedia findFirstByPressOrderByIdAsc(@Param("presse") Presse presse);

    @Query(value = "SELECT m FROM Multimedia m WHERE m.radio = :radio ORDER BY m.id DESC LIMIT 1")
    Multimedia findFirstByRadioOrderByIdAsc(@Param("radio") Radio radio);

    @Query(value = "SELECT m FROM Multimedia m WHERE m.tv = :tv ORDER BY m.id DESC LIMIT 1")
    Multimedia findFirstByTvOrderByIdAsc(@Param("tv") TV tv);

    Multimedia findByEtablissement(Etablissement etablissement);

    void deleteById(Long id);

    Optional<Multimedia> findFirstByUserAndDocTypeOrderByCreatedAtDesc(User user, String docType);

    Optional<Multimedia> findFirstByTvOrderByIdDesc(TV tv);

    Optional<Multimedia> findFirstByTv(TV tv);

    Optional<Multimedia> findFirstByRadioOrderByIdDesc(Radio radio);

    Optional<Multimedia> findFirstByPresseOrderByIdDesc(Presse presse);

    Optional<Multimedia> findFirstByEtablissementOrderByIdDesc(Etablissement etablissement);

    Optional<Multimedia> findFirstByTextJuridique(TextJuridique textJuridique);

    Optional<Multimedia> findFirstByMinister(Minister minister);
}
