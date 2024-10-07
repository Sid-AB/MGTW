package com.example.demo.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class SousDirectionDTO {
 

    private String nomsousDirection;
    private String nomsousDirectionFr;
    private String nomsousDirectionEn;
    private String nomsousDirecteur;
    private String nomsousDirecteurFr;
    private String prenomsousDirecteur;
    private String prenomsousDirecteurFr;
    private String emailsousDirecteur;
    private Integer phonesousDirecteur;
    private Long direction; 

    // constructeurs
    public SousDirectionDTO() {
    }

    public SousDirectionDTO( String nomsousDirection, String nomsousDirectionFr, String nomsousDirectionEn, String nomsousDirecteur,
            String nomsousDirecteurFr, String prenomsousDirecteur,
            String prenomsousDirecteurFr, String emailsousDirecteur,Integer phonesousDirecteur,Long direction) {
        
        this.nomsousDirection = nomsousDirection;
        this.nomsousDirectionFr = nomsousDirectionFr;
        this.nomsousDirectionEn = nomsousDirectionEn;
        this.nomsousDirecteur = nomsousDirecteur;
        this.nomsousDirecteurFr = nomsousDirecteurFr;
        this.prenomsousDirecteur = prenomsousDirecteur;
        this.prenomsousDirecteurFr = prenomsousDirecteurFr;
        this.emailsousDirecteur = emailsousDirecteur;
        this.phonesousDirecteur = phonesousDirecteur;
        this.direction = direction;

       
    }

    // Getters
   

    public String getNomsousDirection() {
        return nomsousDirection;
    }
    public String getNomsousDirectionFr() {
        return nomsousDirectionFr;
    }

    public String getNomsousDirectionEn() {
        return nomsousDirectionEn;
    }

    public String getNomsousDirecteur() {
        return nomsousDirecteur;
    }

    public String getPrenomsousDirecteur() {
        return prenomsousDirecteur;
    }

    public String getEmailsousDirecteur() {
        return emailsousDirecteur;
    }

    public Integer getPhonesousDirecteur() {
        return phonesousDirecteur;
    }

    public String getNomsousDirecteurFr() {
        return nomsousDirecteurFr;
    }

 
    public String getPrenomsousDirecteurFr() {
        return prenomsousDirecteurFr;
    }

  

    // Setters

    public void setNomsousDirection(String nomsousDirection) {
        this.nomsousDirection = nomsousDirection;
    }
    public void setNomsousDirectionFr(String nomsousDirectionFr) {
        this.nomsousDirectionFr = nomsousDirectionFr;
    }

    public void setNomsousDirectionEn(String nomsousDirectionEn) {
        this.nomsousDirectionEn = nomsousDirectionEn;
    }
    public void setNomsousDirecteur(String nomsousDirecteur) {
        this.nomsousDirecteur = nomsousDirecteur;
    }

    public void setPrenomsousDirecteur(String prenomsousDirecteur) {
        this.prenomsousDirecteur = prenomsousDirecteur;
    }

    public void setEmailsousDirecteur(String emailsousDirecteur) {
        this.emailsousDirecteur = emailsousDirecteur;
    }

    public void setPhonesousDirecteur(Integer phonesousDirecteur) {
        this.phonesousDirecteur = phonesousDirecteur;
    }

    public void setNomsousDirecteurFr(String nomsousDirecteurFr) {
        this.nomsousDirecteurFr = nomsousDirecteurFr;
    }

    public void setPrenomsousDirecteurFr(String prenomsousDirecteurFr) {
        this.prenomsousDirecteurFr = prenomsousDirecteurFr;
    }

      public Long getDirection() {
        return direction;
    }

    public void setDirection(Long direction) {
        this.direction = direction;
    }
}
