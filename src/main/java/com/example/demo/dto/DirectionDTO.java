package com.example.demo.dto;





public class DirectionDTO {
    private String nomDirection;
    private String nomDirecteur;
    private String prenomDirecteur;
    private String emailDirecteur;
    private Integer phoneDirecteur;

  // constructeurs
    public DirectionDTO() {}

    public DirectionDTO(String nomDirection, String nomDirecteur, String prenomDirecteur,String emailDirecteur, Integer phoneDirecteur) {
        this.nomDirection = nomDirection;
        this.nomDirecteur = nomDirecteur;
        this.prenomDirecteur = prenomDirecteur;
        this.emailDirecteur = emailDirecteur;
        this.phoneDirecteur = phoneDirecteur;
    
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
