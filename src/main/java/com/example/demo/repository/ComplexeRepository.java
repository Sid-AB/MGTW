package com.example.demo.repository;

import com.example.demo.entities.Agrument;
import com.example.demo.entities.Complexe;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;
@Repository
public interface ComplexeRepository extends JpaRepository<Complexe, Long> {
    Complexe findComplexeById(Long id);
    Optional<Complexe> findById(Long id);
 
    List<Complexe> findComplexesByType(String string);

    List<Complexe> findComplexeByAgrumentListAndType(List<Agrument> agruments, String string);

    List<Complexe> findComplexeByAgrumentListAndTypeAndName(List<Agrument> agruments, String string, String name);

    @Modifying
    @Transactional
    @Query(value="DELETE FROM complexe_agrument WHERE complexe_agrument.complexe_id = :id",nativeQuery = true)
    void deleteComplexeById(Long id);
}
