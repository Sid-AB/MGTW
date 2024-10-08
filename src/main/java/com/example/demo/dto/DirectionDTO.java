package com.example.demo.dto;
import java.util.List;




public class DirectionDTO {
    private String nomDirection;
    private String nomDirecteur;
    private String prenomDirecteur;
    private String emailDirecteur;
    private Integer phoneDirecteur;

    // Nouveaux attributs ajoutés
    private String nomDirecteurFr;
    private String nomDirecteurEn;
    private String nomDirectionFr;
    private String nomDirectionEn;
    private String prenomDirecteurFr;
    private String prenomDirecteurEn;
   
    private List<SousDirectionDTO> sousDirection;

    // Constructeurs
    public DirectionDTO() {}

    public DirectionDTO(String nomDirection, String nomDirecteur, String prenomDirecteur, String emailDirecteur,
                       Integer phoneDirecteur, String nomDirecteurFr, String nomDirecteurEn,
                       String nomDirectionFr, String nomDirectionEn, String prenomDirecteurFr, String prenomDirecteurEn) {
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

    // Getters and Setters

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
        this.prenomDirecteur = prenomDirecteur;
    }

    public String getEmailDirecteur() {
        return emailDirecteur;
    }

    public void setEmailDirecteur(String emailDirecteur) {
        this.emailDirecteur = emailDirecteur;
    }

    public Integer getPhoneDirecteur() {
        return phoneDirecteur;
    }

    public void setPhoneDirecteur(Integer phoneDirecteur) {
        this.phoneDirecteur = phoneDirecteur;
    }

    // Getters et Setters pour les nouveaux attributs
    public String getNomDirecteurFr() {
        return nomDirecteurFr;
    }

    public void setNomDirecteurFr(String nomDirecteurFr) {
        this.nomDirecteurFr = nomDirecteurFr;
    }

    public String getNomDirecteurEn() {
        return nomDirecteurEn;
    }

    public void setNomDirecteurEn(String nomDirecteurEn) {
        this.nomDirecteurEn = nomDirecteurEn;
    }

    public String getNomDirectionFr() {
        return nomDirectionFr;
    }

    public void setNomDirectionFr(String nomDirectionFr) {
        this.nomDirectionFr = nomDirectionFr;
    }

    public String getNomDirectionEn() {
        return nomDirectionEn;
    }

    public void setNomDirectionEn(String nomDirectionEn) {
        this.nomDirectionEn = nomDirectionEn;
    }

    public String getPrenomDirecteurFr() {
        return prenomDirecteurFr;
    }

    public void setPrenomDirecteurFr(String prenomDirecteurFr) {
        this.prenomDirecteurFr = prenomDirecteurFr;
    }

    public String getPrenomDirecteurEn() {
        return prenomDirecteurEn;
    }

    public void setPrenomDirecteurEn(String prenomDirecteurEn) {
        this.prenomDirecteurEn = prenomDirecteurEn;
    }
 
        public List<SousDirectionDTO> getSousDirection() {
            return sousDirection;
        }
    
        public void setSousDirection(List<SousDirectionDTO> sousDirection) {
            this.sousDirection = sousDirection;
        }   
    /*    public String toString() {
            return "Direction(nomDirection=" + this.getNomDirection() +
                    ", nomDirectionFr=" + this.getNomDirectionFr() + // Ajout de nameFr
                    ", nomDirectionEn=" + this.getNomDirectionEn() + // Ajout de nameEn
                    ", nomDirecteur=" + this.getNomDirecteur() +
                    ", prenomDirecteur=" + this.getPrenomDirecteur() + // Ajout de descriptionFr
                    ", emailDirecteur=" + this.getEmailDirecteur() + // Ajout de descriptionEn
                    ", phoneDirecteur=" + this.getPhoneDirecteur() +
                    ", nomDirecteurFr=" + this.getNomDirecteurFr() +
                    ", prenomDirecteurFr=" + this.getPrenomDirecteurFr() +
                    ")";
        }
    */
    }


