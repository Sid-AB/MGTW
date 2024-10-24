package com.example.demo.entities;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(
        name = "presse"
)
public class Presse {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String name;
    @Column(
            name = "description",
            columnDefinition = "TEXT"
    )
    private String description;

    @Column(name = "name_fr") // Nom de la colonne dans la base de données
    private String nameFr; // Nom de l'établissement en fr et en

    @Column(name = "name_en") 
    private String nameEn; 

    @Column(name = "description_fr", // Nom de la colonne dans la base de données
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String descriptionFr; // Description de l'établissement en fr

    @Column(name = "description_en", // Nom de la colonne dans la base de données
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String descriptionEn; // Description de l'établissement en en

    private String website;
    private String typepbpr;
    private String categorieelec;
    private String adresse;
    private String phone;
    private String fax;
    private String email;
    private String site;
    @Column(name = "adresse_fr", columnDefinition = "TEXT")
    private String adresseFr;
    @Column(name = "adresse_en", columnDefinition = "TEXT")
    private String adresseEn;
    @ManyToMany(
            cascade = {CascadeType.ALL},
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "presse_pressecatrgorie",
            joinColumns = {@JoinColumn(
                    name = "presse_id"
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "pressecatrgorie_id"
            )}
    )
    @JsonIgnore
    private List<PresseCategorie> presseCategories = new ArrayList();
    @ManyToOne
    @JoinColumn(
            name = "complexe_id"
    )
    private Complexe complexe;
    @ManyToOne
    @JoinColumn(name = "categoriePresse_id")
    private CategoriePress categoriePresse;
    @OneToMany(
            mappedBy = "presse",
            cascade = {CascadeType.ALL}
    )
    private List<Multimedia> multimediaList = new ArrayList();
    @CreationTimestamp
    @Column(
            name = "created_at"
    )
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(
            name = "updated_at"
    )
    private LocalDateTime updatedAt;

    public static Presse.PresseBuilder builder() {
        return new Presse.PresseBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getDescription() {
        return this.description;
    }

    // Getter pour nameFr et en
    public String getNameFr() { 
        return this.nameFr; 
    }

    // Getter pour descriptionFr
    public String getDescriptionFr() { 
        return this.descriptionFr; 
    }

    // Getter pour descriptionEn
    public String getDescriptionEn() { 
        return this.descriptionEn; 
    }

    public String getWebsite() {
        return this.website;
    }

    public String getTypepbpr() {
        return this.typepbpr;
    }

    public String getCategorieelec() {
        return this.categorieelec;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public String getAdresseFr() {
        return this.adresseFr;
    }

    public String getAdresseEn() {
        return this.adresseEn;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getFax() {
        return this.fax;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSite() {
        return this.site;
    }



    public List<PresseCategorie> getPresseCategories() {
        return this.presseCategories;
    }

    public Complexe getComplexe() {
        return this.complexe;
    }

    public List<Multimedia> getMultimediaList() {
        return this.multimediaList;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public CategoriePress getCategoriePresse()
    {
        return categoriePresse;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }

    // Setter pour nameFr
    public void setNameFr(final String nameFr) {
        this.nameFr = nameFr;
    }

    // Setter pour descriptionFr
    public void setDescriptionFr(final String descriptionFr) {
        this.descriptionFr = descriptionFr;
    }

    // Setter pour descriptionEn
    public void setDescriptionEn(final String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public void setWebsite(final String website) {
        this.website = website;
    }

    public void setTypepbpr(final String typepbpr) {
        this.typepbpr = typepbpr;
    }

    public void setCategorieelec(final String categorieelec) {
        this.categorieelec = categorieelec;
    }

    public void setAdresse(final String adresse) {
        this.adresse = adresse;
    }

    public void setAdresseFr(final String adresseFr) {
        this.adresseFr = adresseFr;
    }
    public void setAdresseEn(final String adresseEn) {
        this.adresseEn = adresseEn;
    }
    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public void setFax(final String fax) {
        this.fax = fax;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setSite(final String site) {
        this.site = site;
    }

   

    @JsonIgnore
    public void setPresseCategories(final List<PresseCategorie> presseCategories) {
        this.presseCategories = presseCategories;
    }

    public void setComplexe(final Complexe complexe) {
        this.complexe = complexe;
    }

    public void setMultimediaList(final List<Multimedia> multimediaList) {
        this.multimediaList = multimediaList;
    }

    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(final LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCategoriePresse(CategoriePress categoriePresse)
    {
        this.categoriePresse=categoriePresse;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Presse)) {
            return false;
        } else {
            Presse other = (Presse)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label215: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label215;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label215;
                    }

                    return false;
                }

                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }
            
                Object this$nameFr = this.getNameFr();
                Object other$nameFr = other.getNameFr();
                if (this$nameFr == null) {
                    if (other$nameFr != null) {
                        return false;
                    }
                } else if (!this$nameFr.equals(other$nameFr)) {
                    return false;
                }
            
                Object this$nameEn = this.getNameEn(); // Ajout du champ nameEn
                Object other$nameEn = other.getNameEn();
                if (this$nameEn == null) {
                    if (other$nameEn != null) {
                        return false;
                    }
                } else if (!this$nameEn.equals(other$nameEn)) {
                    return false;
                }


                label201: {
                    Object this$description = this.getDescription();
                    Object other$description = other.getDescription();
                    if (this$description == null) {
                        if (other$description == null) {
                            break label201;
                        }
                    } else if (this$description.equals(other$description)) {
                        break label201;
                    }

                    return false;
                }

                label202: {
                    Object this$descriptionFr = this.getDescriptionFr();
                    Object other$descriptionFr = other.getDescriptionFr();
                    if (this$descriptionFr == null) {
                        if (other$descriptionFr == null) {
                            break label202;
                        }
                    } else if (this$descriptionFr.equals(other$descriptionFr)) {
                        break label202;
                    }
                
                    return false;
                }

                label203: {
                    Object this$descriptionEn = this.getDescriptionEn();
                    Object other$descriptionEn = other.getDescriptionEn();
                    if (this$descriptionEn == null) {
                        if (other$descriptionEn == null) {
                            break label203;
                        }
                    } else if (this$descriptionEn.equals(other$descriptionEn)) {
                        break label203;
                    }
                
                    return false;
                }
                

                Object this$website = this.getWebsite();
                Object other$website = other.getWebsite();
                if (this$website == null) {
                    if (other$website != null) {
                        return false;
                    }
                } else if (!this$website.equals(other$website)) {
                    return false;
                }

                label187: {
                    Object this$typepbpr = this.getTypepbpr();
                    Object other$typepbpr = other.getTypepbpr();
                    if (this$typepbpr == null) {
                        if (other$typepbpr == null) {
                            break label187;
                        }
                    } else if (this$typepbpr.equals(other$typepbpr)) {
                        break label187;
                    }

                    return false;
                }

                Object this$categorieelec = this.getCategorieelec();
                Object other$categorieelec = other.getCategorieelec();
                if (this$categorieelec == null) {
                    if (other$categorieelec != null) {
                        return false;
                    }
                } else if (!this$categorieelec.equals(other$categorieelec)) {
                    return false;
                }

                label173: {
                    Object this$adresse = this.getAdresse();
                    Object other$adresse = other.getAdresse();
                    if (this$adresse == null) {
                        if (other$adresse == null) {
                            break label173;
                        }
                    } else if (this$adresse.equals(other$adresse)) {
                        break label173;
                    }

                    return false;
                }

                label174: {
                    Object this$adresseFr = this.getAdresseFr();
                    Object other$adresseFr = other.getAdresseFr();
                    if (this$adresseFr == null) {
                        if (other$adresseFr == null) {
                            break label174;
                        }
                    } else if (this$adresseFr.equals(other$adresseFr)) {
                        break label174;
                    }

                    return false;
                }

                label175: {
                    Object this$adresseEn = this.getAdresseEn();
                    Object other$adresseEn = other.getAdresseEn();
                    if (this$adresseEn == null) {
                        if (other$adresseEn == null) {
                            break label175;
                        }
                    } else if (this$adresseEn.equals(other$adresseEn)) {
                        break label175;
                    }

                    return false;
                }

                label166: {
                    Object this$phone = this.getPhone();
                    Object other$phone = other.getPhone();
                    if (this$phone == null) {
                        if (other$phone == null) {
                            break label166;
                        }
                    } else if (this$phone.equals(other$phone)) {
                        break label166;
                    }

                    return false;
                }

                Object this$fax = this.getFax();
                Object other$fax = other.getFax();
                if (this$fax == null) {
                    if (other$fax != null) {
                        return false;
                    }
                } else if (!this$fax.equals(other$fax)) {
                    return false;
                }

                label152: {
                    Object this$email = this.getEmail();
                    Object other$email = other.getEmail();
                    if (this$email == null) {
                        if (other$email == null) {
                            break label152;
                        }
                    } else if (this$email.equals(other$email)) {
                        break label152;
                    }

                    return false;
                }

                label145: {
                    Object this$site = this.getSite();
                    Object other$site = other.getSite();
                    if (this$site == null) {
                        if (other$site == null) {
                            break label145;
                        }
                    } else if (this$site.equals(other$site)) {
                        break label145;
                    }

                    return false;
                }

               

                Object this$presseCategories = this.getPresseCategories();
                Object other$presseCategories = other.getPresseCategories();
                if (this$presseCategories == null) {
                    if (other$presseCategories != null) {
                        return false;
                    }
                } else if (!this$presseCategories.equals(other$presseCategories)) {
                    return false;
                }

                label124: {
                    Object this$complexe = this.getComplexe();
                    Object other$complexe = other.getComplexe();
                    if (this$complexe == null) {
                        if (other$complexe == null) {
                            break label124;
                        }
                    } else if (this$complexe.equals(other$complexe)) {
                        break label124;
                    }

                    return false;
                }

                Object this$multimediaList = this.getMultimediaList();
                Object other$multimediaList = other.getMultimediaList();
                if (this$multimediaList == null) {
                    if (other$multimediaList != null) {
                        return false;
                    }
                } else if (!this$multimediaList.equals(other$multimediaList)) {
                    return false;
                }

                Object this$categoriePresse = this.getCategoriePresse();
                Object other$categoriePresse = other.getCategoriePresse();
                if (this$categoriePresse == null) {
                    if (other$categoriePresse != null) {
                        return false;
                    }
                } else if (!this$categoriePresse.equals(other$categoriePresse)) {
                    return false;
                }

                Object this$createdAt = this.getCreatedAt();
                Object other$createdAt = other.getCreatedAt();
                if (this$createdAt == null) {
                    if (other$createdAt != null) {
                        return false;
                    }
                } else if (!this$createdAt.equals(other$createdAt)) {
                    return false;
                }

                Object this$updatedAt = this.getUpdatedAt();
                Object other$updatedAt = other.getUpdatedAt();
                if (this$updatedAt == null) {
                    if (other$updatedAt != null) {
                        return false;
                    }
                } else if (!this$updatedAt.equals(other$updatedAt)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Presse;
    }

    @Override
public int hashCode() {
    boolean PRIME = true;
    int result = 1;

    Object $id = this.getId();
    result = result * 59 + ($id == null ? 43 : $id.hashCode());

    Object $name = this.getName();
    result = result * 59 + ($name == null ? 43 : $name.hashCode());

    Object $description = this.getDescription();
    result = result * 59 + ($description == null ? 43 : $description.hashCode());

    Object $nameFr = this.getNameFr();
    result = result * 59 + ($nameFr == null ? 43 : $nameFr.hashCode());

    Object $descriptionFr = this.getDescriptionFr();
    result = result * 59 + ($descriptionFr == null ? 43 : $descriptionFr.hashCode());

    Object $descriptionEn = this.getDescriptionEn();
    result = result * 59 + ($descriptionEn == null ? 43 : $descriptionEn.hashCode());

    Object $nameEn = this.getNameEn(); // Ajout du champ nameEn
    result = result * 59 + ($nameEn == null ? 43 : $nameEn.hashCode()); // Ajout du calcul pour nameEn

    Object $website = this.getWebsite();
    result = result * 59 + ($website == null ? 43 : $website.hashCode());

    Object $typepbpr = this.getTypepbpr();
    result = result * 59 + ($typepbpr == null ? 43 : $typepbpr.hashCode());

    Object $categorieelec = this.getCategorieelec();
    result = result * 59 + ($categorieelec == null ? 43 : $categorieelec.hashCode());

    Object $adresse = this.getAdresse();
    result = result * 59 + ($adresse == null ? 43 : $adresse.hashCode());
    Object $adresseFr = this.getAdresseFr();
    result = result * 59 + ($adresseFr == null ? 43 : $adresseFr.hashCode());
    Object $adresseEn = this.getAdresseEn();
    result = result * 59 + ($adresseEn == null ? 43 : $adresseEn.hashCode());

    Object $phone = this.getPhone();
    result = result * 59 + ($phone == null ? 43 : $phone.hashCode());

    Object $fax = this.getFax();
    result = result * 59 + ($fax == null ? 43 : $fax.hashCode());

    Object $email = this.getEmail();
    result = result * 59 + ($email == null ? 43 : $email.hashCode());

    Object $site = this.getSite();
    result = result * 59 + ($site == null ? 43 : $site.hashCode());

   

    Object $presseCategories = this.getPresseCategories();
    result = result * 59 + ($presseCategories == null ? 43 : $presseCategories.hashCode());

    Object $complexe = this.getComplexe();
    result = result * 59 + ($complexe == null ? 43 : $complexe.hashCode());

    Object $multimediaList = this.getMultimediaList();
    result = result * 59 + ($multimediaList == null ? 43 : $multimediaList.hashCode());

    Object $categoriePresse = this.getCategoriePresse();
    result = result * 59 + ($multimediaList == null ? 43 : $categoriePresse.hashCode());

    Object $createdAt = this.getCreatedAt();
    result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());

    Object $updatedAt = this.getUpdatedAt();
    result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());

    return result;
}


public String toString() {
    Long var10000 = this.getId();
    return "Presse(id=" + var10000 
        + ", name=" + this.getName() 
        + ", nameFr=" + this.getNameFr() // Correction de la concaténation pour nameFr
        + ", nameEn=" + this.getNameEn() // Ajout du champ nameEn
        + ", description=" + this.getDescription() 
        + ", descriptionFr=" + this.getDescriptionFr() 
        + ", descriptionEn=" + this.getDescriptionEn() 
        + ", website=" + this.getWebsite() 
        + ", typepbpr=" + this.getTypepbpr() 
        + ", categorieelec=" + this.getCategorieelec() 
        + ", adresse=" + this.getAdresse() 
        + ", adresseFr=" + this.getAdresseFr() 
        + ", adresseEn=" + this.getAdresseEn() 
        + ", phone=" + this.getPhone() 
        + ", fax=" + this.getFax() 
        + ", email=" + this.getEmail() 
        + ", site=" + this.getSite() 
        + ", presseCategories=" + String.valueOf(this.getPresseCategories()) 
        + ", complexe=" + String.valueOf(this.getComplexe()) 
        + ", multimediaList=" + String.valueOf(this.getMultimediaList()) 
        + ", createdAt=" + String.valueOf(this.getCreatedAt()) 
        + ", updatedAt=" + String.valueOf(this.getUpdatedAt()) 
        + ")";
}

public Presse(final Long id, final String name, final String nameFr, final String nameEn, final String description,
        final String descriptionFr, final String descriptionEn, final String website, final String typepbpr,
        final String categorieelec, final String adresse, final String adresseFr, final String adresseEn, final String phone, final String fax, final String email,
        final String site, final List<PresseCategorie> presseCategories,final CategoriePress categoriePresse,
        final Complexe complexe, final List<Multimedia> multimediaList, final LocalDateTime createdAt,
        final LocalDateTime updatedAt) {
    this.id = id;
    this.name = name; // Assignation du nom en arabe ou français
    this.nameFr = nameFr; // Nom en français
    this.nameEn = nameEn; // Nom en anglais
    this.description = description;
    this.descriptionFr = descriptionFr;
    this.descriptionEn = descriptionEn;
    this.website = website;
    this.typepbpr = typepbpr;
    this.categorieelec = categorieelec;
    this.adresse = adresse;
    this.adresseFr = adresseFr;
    this.adresseEn = adresseEn;
    this.phone = phone;
    this.fax = fax;
    this.email = email;
    this.site = site;
    this.categoriePresse=categoriePresse;
    this.presseCategories = presseCategories;
    this.complexe = complexe;
    this.multimediaList = multimediaList;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
}

    public Presse() {
    }

    public static class PresseBuilder {
        private Long id;
        private String name;
        private String nameFr;  // Nom en français
        private String nameEn;  // Nom en anglais
        private String description;
        private String descriptionFr;
        private String descriptionEn;
        private String website;
        private String typepbpr;
        private String categorieelec;
        private String adresse;
        private String adresseFr;
        private String adresseEn;
        private String phone;
        private String fax;
        private String email;
        private String site;
        private CategoriePress categoriePresse;
        private List<PresseCategorie> presseCategories;
        private Complexe complexe;
        private List<Multimedia> multimediaList;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        PresseBuilder() {
        }

        public Presse.PresseBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        public Presse.PresseBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public Presse.PresseBuilder description(final String description) {
            this.description = description;
            return this;
        }

        public Presse.PresseBuilder nameFr(final String nameFr) {
            this.nameFr = nameFr;
            return this;
        }
        
        public PresseBuilder nameEn(String nameEn) {
            this.nameEn = nameEn;  // Ajout de la méthode pour définir nameEn
            return this;
        }

        public Presse.PresseBuilder descriptionFr(final String descriptionFr) {
            this.descriptionFr = descriptionFr;
            return this;
        }
        
        public Presse.PresseBuilder descriptionEn(final String descriptionEn) {
            this.descriptionEn = descriptionEn;
            return this;
        }        

        public Presse.PresseBuilder website(final String website) {
            this.website = website;
            return this;
        }

        public Presse.PresseBuilder typepbpr(final String typepbpr) {
            this.typepbpr = typepbpr;
            return this;
        }

        public Presse.PresseBuilder categorieelec(final String categorieelec) {
            this.categorieelec = categorieelec;
            return this;
        }

        public Presse.PresseBuilder adresse(final String adresse) {
            this.adresse = adresse;
            return this;
        }
        public Presse.PresseBuilder adresseFr(final String adresseFr) {
            this.adresseFr = adresseFr;
            return this;
        }
        public Presse.PresseBuilder adresseEn(final String adresseEn) {
            this.adresseEn = adresseEn;
            return this;
        }
        public Presse.PresseBuilder phone(final String phone) {
            this.phone = phone;
            return this;
        }

        public Presse.PresseBuilder fax(final String fax) {
            this.fax = fax;
            return this;
        }

        public Presse.PresseBuilder email(final String email) {
            this.email = email;
            return this;
        }

        public Presse.PresseBuilder site(final String site) {
            this.site = site;
            return this;
        }

       

        @JsonIgnore
        public Presse.PresseBuilder presseCategories(final List<PresseCategorie> presseCategories) {
            this.presseCategories = presseCategories;
            return this;
        }

        public Presse.PresseBuilder categoriePresse(final CategoriePress categoriePresse)
        {
            this.categoriePresse=categoriePresse;
            return this;
        }

        public Presse.PresseBuilder complexe(final Complexe complexe) {
            this.complexe = complexe;
            return this;
        }

        public Presse.PresseBuilder multimediaList(final List<Multimedia> multimediaList) {
            this.multimediaList = multimediaList;
            return this;
        }

        public Presse.PresseBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Presse.PresseBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        // Méthode pour construire l'objet Presse
        public Presse build() {
            return new Presse(id, name, nameFr, nameEn, description, descriptionFr, descriptionEn, website, typepbpr,
                    categorieelec, adresse, adresseEn, adresseFr, phone, fax, email, site, presseCategories,categoriePresse ,complexe,
                    multimediaList, createdAt, updatedAt);
        }

        public String toString() {
            Long var10000 = this.id;
            return "Presse.PresseBuilder(id=" + var10000 + 
                   ", name=" + this.name + 
                   ", nameFr=" + this.nameFr + 
                   ", nameEn=" + this.nameEn +   // Ajout de nameEn
                   ", description=" + this.description + 
                   ", descriptionFr=" + this.descriptionFr + 
                   ", descriptionEn=" + this.descriptionEn + 
                   ", website=" + this.website + 
                   ", typepbpr=" + this.typepbpr + 
                   ", categorieelec=" + this.categorieelec + 
                   ", adresse=" + this.adresse + 
                   ", adresseFr=" + this.adresseFr + 
                   ", adresseEn=" + this.adresseEn + 
                   ", phone=" + this.phone + 
                   ", fax=" + this.fax + 
                   ", email=" + this.email + 
                   ", site=" + this.site + 
                   ", presseCategories=" + String.valueOf(this.presseCategories) + 
                   ",categoriePresse="+String.valueOf(this.categoriePresse)+
                   ", complexe=" + String.valueOf(this.complexe) + 
                   ", multimediaList=" + String.valueOf(this.multimediaList) + 
                   ", createdAt=" + String.valueOf(this.createdAt) + 
                   ", updatedAt=" + String.valueOf(this.updatedAt) + ")";
        }

    }
}
