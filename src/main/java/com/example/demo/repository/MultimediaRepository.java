package com.example.demo.repository;


import com.example.demo.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MultimediaRepository extends JpaRepository<Multimedia, Long> {
    List<Multimedia> findAllById(Long id);

    Multimedia findMultimediaById(Long id);

    void deleteById(Long id);

    Optional<Multimedia> findFirstByUserAndDocTypeOrderByCreatedAtDesc(User user, String docType);

    Optional<Multimedia> findFirstByTv(TV tv);

    Optional<Multimedia> findFirstByRadio(Radio radio);

    Optional<Multimedia> findFirstByPresse(Presse presse);

    Optional<Multimedia> findFirstByEtablissement(Etablissement etablissement);

    Optional<Multimedia> findFirstByTextJuridique(TextJuridique textJuridique);

    Optional<Multimedia> findFirstByMinister(Minister minister);
}
