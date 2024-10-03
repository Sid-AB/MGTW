package com.example.demo.entities;


import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;



@Entity

@Table(
        name = "Direction"
)


public class Direction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //clé primaire genereé auto
    
    private Long id;

    private String nomDirection;

   
    private String nomDirecteur;

    private String prenomDirecteur;

    private String emailDirecteur;

    private Integer phoneDirecteur;

  // constructeurs
    public Direction() {}

    public Direction(String nomDirection, String nomDirecteur, String prenomDirecteur,String emailDirecteur, Integer phoneDirecteur) {
        this.nomDirection = nomDirection;
        this.nomDirecteur = nomDirecteur;
        this.prenomDirecteur = prenomDirecteur;
        this.emailDirecteur = emailDirecteur;
        this.phoneDirecteur = phoneDirecteur;
    
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomDirection() {
        return nomDirection;
    }

    public void setNomDirection(String nomDirection) {
        this.nomDirection = nomDirection;
    }

    public String getNomDirecteur() {
        return nomDirecteur;
    }

    public void setNomDirecteur(String nomDirecteur) {
        this.nomDirecteur = nomDirecteur;
    }


    public String getPrenomDirecteur() {
        return prenomDirecteur;
    }

    public void setPrenomDirecteur(String prenomDirecteur) {
        this.prenomDirecteur= prenomDirecteur;
    }

    public String getEmailDirecteur() {
        return emailDirecteur;
    }

    public void setEmailDirecteur(String emailDirecteur ) {
        this.emailDirecteur = emailDirecteur;
    }

    public Integer getPhoneDirecteur() {
        return phoneDirecteur;
    }

    public void setPhoneDirecteur(Integer phoneDirecteur) {
        this.phoneDirecteur = phoneDirecteur;
    }
}
