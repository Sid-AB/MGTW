package com.example.demo.entities;

import jakarta.persistence.*;

@Entity

@Table(name = "direction")

public class Direction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire genereé auto

    private Long id;

    @Column(name = "nom_direction")
    private String nomDirection;

    @Column(name = "nom_direction_fr")
    private String nomDirectionFr;

    @Column(name = "nom_direction_en")
    private String nomDirectionEn;

    @Column(name = "nom_directeur")
    private String nomDirecteur;

    @Column(name = "nom_directeur_fr")
    private String nomDirecteurFr;

    @Column(name = "nom_directeur_en")
    private String nomDirecteurEn;

    @Column(name = "prenom_directeur")
    private String prenomDirecteur;

    @Column(name = "prenom_directeur_fr")
    private String prenomDirecteurFr;

    @Column(name = "prenom_directeur_en")
    private String prenomDirecteurEn;

    @Column(name = "email_directeur")
    private String emailDirecteur;

    @Column(name = "phone_directeur")
    private Integer phoneDirecteur;

    // constructeurs
    public Direction() {
    }

    public Direction(long id, String nomDirection, String nomDirecteur, String prenomDirecteur, String emailDirecteur,
            Integer phoneDirecteur, String nomDirecteurFr, String nomDirecteurEn,
            String nomDirectionFr, String nomDirectionEn, String prenomDirecteurFr, String prenomDirecteurEn) {
        this.id = id; // Initialisation de l'id
        this.nomDirection = nomDirection;
        this.nomDirecteur = nomDirecteur;
        this.prenomDirecteur = prenomDirecteur;
        this.emailDirecteur = emailDirecteur;
        this.phoneDirecteur = phoneDirecteur;

        // Initialisation des nouveaux attributs
        this.nomDirecteurFr = nomDirecteurFr;
        this.nomDirecteurEn = nomDirecteurEn;
        this.nomDirectionFr = nomDirectionFr;
        this.nomDirectionEn = nomDirectionEn;
        this.prenomDirecteurFr = prenomDirecteurFr;
        this.prenomDirecteurEn = prenomDirecteurEn;
    }

    // Getters
    public long getId() { // Getter pour id
        return id;
    }

    public String getNomDirection() {
        return nomDirection;
    }

    public String getNomDirecteur() {
        return nomDirecteur;
    }

    public String getPrenomDirecteur() {
        return prenomDirecteur;
    }

    public String getEmailDirecteur() {
        return emailDirecteur;
    }

    public Integer getPhoneDirecteur() {
        return phoneDirecteur;
    }

    public String getNomDirecteurFr() {
        return nomDirecteurFr;
    }

    public String getNomDirecteurEn() {
        return nomDirecteurEn;
    }

    public String getNomDirectionFr() {
        return nomDirectionFr;
    }

    public String getNomDirectionEn() {
        return nomDirectionEn;
    }

    public String getPrenomDirecteurFr() {
        return prenomDirecteurFr;
    }

    public String getPrenomDirecteurEn() {
        return prenomDirecteurEn;
    }

    // Setters
    public void setId(long id) { // Setter pour id
        this.id = id;
    }

    public void setNomDirection(String nomDirection) {
        this.nomDirection = nomDirection;
    }

    public void setNomDirecteur(String nomDirecteur) {
        this.nomDirecteur = nomDirecteur;
    }

    public void setPrenomDirecteur(String prenomDirecteur) {
        this.prenomDirecteur = prenomDirecteur;
    }

    public void setEmailDirecteur(String emailDirecteur) {
        this.emailDirecteur = emailDirecteur;
    }

    public void setPhoneDirecteur(Integer phoneDirecteur) {
        this.phoneDirecteur = phoneDirecteur;
    }

    public void setNomDirecteurFr(String nomDirecteurFr) {
        this.nomDirecteurFr = nomDirecteurFr;
    }

    public void setNomDirecteurEn(String nomDirecteurEn) {
        this.nomDirecteurEn = nomDirecteurEn;
    }

    public void setNomDirectionFr(String nomDirectionFr) {
        this.nomDirectionFr = nomDirectionFr;
    }

    public void setNomDirectionEn(String nomDirectionEn) {
        this.nomDirectionEn = nomDirectionEn;
    }

    public void setPrenomDirecteurFr(String prenomDirecteurFr) {
        this.prenomDirecteurFr = prenomDirecteurFr;
    }

    public void setPrenomDirecteurEn(String prenomDirecteurEn) {
        this.prenomDirecteurEn = prenomDirecteurEn;
    }
}
