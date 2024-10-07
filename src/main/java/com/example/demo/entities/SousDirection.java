package com.example.demo.entities;
import jakarta.persistence.*;

@Entity

@Table(name = "SousDirection")
public class SousDirection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire genereé auto

    
    private Long id;
    //plusiuers sous direction appartient à une seule direction 
    @ManyToOne
    @JoinColumn(name = "direction")
    private Direction direction;


    @Column(name = "nom_sousdirection")
    private String nomsousDirection;

    @Column(name = "nom_sousdirection_fr")
    private String nomsousDirectionFr;

    @Column(name = "nom_sousdirection_en")
    private String nomsousDirectionEn;

    @Column(name = "nom_sousdirecteur")
    private String nomsousDirecteur;

    @Column(name = "nom_sousdirecteur_fr")
    private String nomsousDirecteurFr;

    @Column(name = "prenom_sousdirecteur")
    private String prenomsousDirecteur;

    @Column(name = "prenom_sousdirecteur_fr")
    private String prenomsousDirecteurFr;

    @Column(name = "email_sousdirecteur")
    private String emailsousDirecteur;

    @Column(name = "phone_sousdirecteur")
    private Integer phonesousDirecteur;

    // constructeurs
    public SousDirection() {
    }

    public SousDirection(String nomsousDirection, String nomsousDirectionFr, String nomsousDirectionEn, String nomsousDirecteur,
            String nomsousDirecteurFr, String prenomsousDirecteur,
            String prenomsousDirecteurFr, String emailsousDirecteur,Integer phonesousDirecteur) {
   
        this.nomsousDirection = nomsousDirection;
        this.nomsousDirectionFr = nomsousDirectionFr;
        this.nomsousDirectionEn = nomsousDirectionEn;
        this.nomsousDirecteur = nomsousDirecteur;
        this.nomsousDirecteurFr = nomsousDirecteurFr;
        this.prenomsousDirecteur = prenomsousDirecteur;
        this.prenomsousDirecteurFr = prenomsousDirecteurFr;
        this.emailsousDirecteur = emailsousDirecteur;
        this.phonesousDirecteur = phonesousDirecteur;
       
    }

    // Getters
    public long getId() { // Getter pour id
        return id;
    }

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
    public void setId(long id) { // Setter pour id
        this.id = id;
    }

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

     public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
