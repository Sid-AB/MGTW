package com.example.demo.entities;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
        name = "radio"
)
public class Radio {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    
    @Column(name = "name")
    private String name;
    @Column(name = "name_fr") // Nom de la colonne pour le champ en français
    private String nameFr;

    @Column(name = "name_en") // Nom de la colonne pour le champ en anglais
    private String nameEn;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "description_fr", columnDefinition = "TEXT") // Nom de la colonne pour la description en français
    private String descriptionFr;

    @Column(name = "description_en", columnDefinition = "TEXT") // Nom de la colonne pour la description en anglais
    private String descriptionEn;

    private String adresse;
    private String localisation;
    private String type;
    private String categorie;
    private String phone;
    private String fax;
    private String email;
    private String website;
    private String streaminglink;
    @ManyToOne
    @JoinColumn(
            name = "complexe_id"
    )
    private Complexe complexe;
    @OneToMany(
            mappedBy = "radio",
            cascade = {CascadeType.ALL}
    )
    private List<Caracteristique> caracteristiqueList = new ArrayList();
    @OneToMany(
            mappedBy = "radio",
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

    public static Radio.RadioBuilder builder() {
        return new Radio.RadioBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getNameFr() {
        return nameFr;
    }
    public String getNameEn() {
        return nameEn;
    }
    public String getDescription() {
        return this.description;
    }

    public String getDescriptionFr() {
        return descriptionFr;
    }
    public String getDescriptionEn() {
        return descriptionEn;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public String getLocalisation() {
        return this.localisation;
    }

    public String getType() {
        return this.type;
    }

    public String getCategorie() {
        return this.categorie;
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

    public String getWebsite() {
        return this.website;
    }

    public String getStreaminglink() {
        return this.streaminglink;
    }

    public Complexe getComplexe() {
        return this.complexe;
    }

    public List<Caracteristique> getCaracteristiqueList() {
        return this.caracteristiqueList;
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

    public void setId(final Long id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
    public void setDescription(final String description) {
        this.description = description;
    }

    public void setDescriptionFr(String descriptionFr) {
        this.descriptionFr = descriptionFr;
    }
    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }
    public void setAdresse(final String adresse) {
        this.adresse = adresse;
    }

    public void setLocalisation(final String localisation) {
        this.localisation = localisation;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setCategorie(final String categorie) {
        this.categorie = categorie;
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

    public void setWebsite(final String website) {
        this.website = website;
    }

    public void setStreaminglink(final String streaminglink) {
        this.streaminglink = streaminglink;
    }

    public void setComplexe(final Complexe complexe) {
        this.complexe = complexe;
    }

    public void setCaracteristiqueList(final List<Caracteristique> caracteristiqueList) {
        this.caracteristiqueList = caracteristiqueList;
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

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio)o;
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

                // Comparaison de nameFr
                Object this$nameFr = this.getNameFr();
                Object other$nameFr = other.getNameFr();
                if (this$nameFr == null) {
                    if (other$nameFr != null) {
                        return false;
                    }
                } else if (!this$nameFr.equals(other$nameFr)) {
                    return false;
                }

                // Comparaison de nameEn
                Object this$nameEn = this.getNameEn();
                Object other$nameEn = other.getNameEn();
                if (this$nameEn == null) {
                    if (other$nameEn != null) {
                        return false;
                    }
                } else if (!this$nameEn.equals(other$nameEn)) {
                    return false;
                }

                // Comparaison de description
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

                // Comparaison de descriptionFr
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

                // Comparaison de descriptionEn
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

                Object this$adresse = this.getAdresse();
                Object other$adresse = other.getAdresse();
                if (this$adresse == null) {
                    if (other$adresse != null) {
                        return false;
                    }
                } else if (!this$adresse.equals(other$adresse)) {
                    return false;
                }

                label187: {
                    Object this$localisation = this.getLocalisation();
                    Object other$localisation = other.getLocalisation();
                    if (this$localisation == null) {
                        if (other$localisation == null) {
                            break label187;
                        }
                    } else if (this$localisation.equals(other$localisation)) {
                        break label187;
                    }

                    return false;
                }

                Object this$type = this.getType();
                Object other$type = other.getType();
                if (this$type == null) {
                    if (other$type != null) {
                        return false;
                    }
                } else if (!this$type.equals(other$type)) {
                    return false;
                }

                label173: {
                    Object this$categorie = this.getCategorie();
                    Object other$categorie = other.getCategorie();
                    if (this$categorie == null) {
                        if (other$categorie == null) {
                            break label173;
                        }
                    } else if (this$categorie.equals(other$categorie)) {
                        break label173;
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
                    Object this$website = this.getWebsite();
                    Object other$website = other.getWebsite();
                    if (this$website == null) {
                        if (other$website == null) {
                            break label145;
                        }
                    } else if (this$website.equals(other$website)) {
                        break label145;
                    }

                    return false;
                }

                Object this$streaminglink = this.getStreaminglink();
                Object other$streaminglink = other.getStreaminglink();
                if (this$streaminglink == null) {
                    if (other$streaminglink != null) {
                        return false;
                    }
                } else if (!this$streaminglink.equals(other$streaminglink)) {
                    return false;
                }

                Object this$complexe = this.getComplexe();
                Object other$complexe = other.getComplexe();
                if (this$complexe == null) {
                    if (other$complexe != null) {
                        return false;
                    }
                } else if (!this$complexe.equals(other$complexe)) {
                    return false;
                }

                label124: {
                    Object this$caracteristiqueList = this.getCaracteristiqueList();
                    Object other$caracteristiqueList = other.getCaracteristiqueList();
                    if (this$caracteristiqueList == null) {
                        if (other$caracteristiqueList == null) {
                            break label124;
                        }
                    } else if (this$caracteristiqueList.equals(other$caracteristiqueList)) {
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
        return other instanceof Radio;
    }

    @Override
public int hashCode() {
    boolean PRIME = true;
    int result = 1;

    Object $id = this.getId();
    result = result * 59 + ($id == null ? 43 : $id.hashCode());
    
    Object $name = this.getName();
    result = result * 59 + ($name == null ? 43 : $name.hashCode());
    
    Object $nameFr = this.getNameFr();
    result = result * 59 + ($nameFr == null ? 43 : $nameFr.hashCode());
    
    Object $nameEn = this.getNameEn();
    result = result * 59 + ($nameEn == null ? 43 : $nameEn.hashCode());

    Object $description = this.getDescription();
    result = result * 59 + ($description == null ? 43 : $description.hashCode());
    
    Object $descriptionFr = this.getDescriptionFr();
    result = result * 59 + ($descriptionFr == null ? 43 : $descriptionFr.hashCode());

    Object $descriptionEn = this.getDescriptionEn();
    result = result * 59 + ($descriptionEn == null ? 43 : $descriptionEn.hashCode());

    Object $adresse = this.getAdresse();
    result = result * 59 + ($adresse == null ? 43 : $adresse.hashCode());
    
    Object $localisation = this.getLocalisation();
    result = result * 59 + ($localisation == null ? 43 : $localisation.hashCode());
    
    Object $type = this.getType();
    result = result * 59 + ($type == null ? 43 : $type.hashCode());
    
    Object $categorie = this.getCategorie();
    result = result * 59 + ($categorie == null ? 43 : $categorie.hashCode());
    
    Object $phone = this.getPhone();
    result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
    
    Object $fax = this.getFax();
    result = result * 59 + ($fax == null ? 43 : $fax.hashCode());
    
    Object $email = this.getEmail();
    result = result * 59 + ($email == null ? 43 : $email.hashCode());
    
    Object $website = this.getWebsite();
    result = result * 59 + ($website == null ? 43 : $website.hashCode());
    
    Object $streaminglink = this.getStreaminglink();
    result = result * 59 + ($streaminglink == null ? 43 : $streaminglink.hashCode());
    
    Object $complexe = this.getComplexe();
    result = result * 59 + ($complexe == null ? 43 : $complexe.hashCode());
    
    Object $caracteristiqueList = this.getCaracteristiqueList();
    result = result * 59 + ($caracteristiqueList == null ? 43 : $caracteristiqueList.hashCode());
    
    Object $multimediaList = this.getMultimediaList();
    result = result * 59 + ($multimediaList == null ? 43 : $multimediaList.hashCode());
    
    Object $createdAt = this.getCreatedAt();
    result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
    
    Object $updatedAt = this.getUpdatedAt();
    result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
    
    return result;
}


@Override
public String toString() {
    Long var10000 = this.getId();
    return "Radio(id=" + var10000 + 
           ", name=" + this.getName() + 
           ", nameFr=" + this.getNameFr() + 
           ", nameEn=" + this.getNameEn() + 
           ", description=" + this.getDescription() + 
           ", descriptionFr=" + this.getDescriptionFr() + 
           ", descriptionEn=" + this.getDescriptionEn() + 
           ", adresse=" + this.getAdresse() + 
           ", localisation=" + this.getLocalisation() + 
           ", type=" + this.getType() + 
           ", categorie=" + this.getCategorie() + 
           ", phone=" + this.getPhone() + 
           ", fax=" + this.getFax() + 
           ", email=" + this.getEmail() + 
           ", website=" + this.getWebsite() + 
           ", streaminglink=" + this.getStreaminglink() + 
           ", complexe=" + String.valueOf(this.getComplexe()) + 
           ", caracteristiqueList=" + String.valueOf(this.getCaracteristiqueList()) + 
           ", multimediaList=" + String.valueOf(this.getMultimediaList()) + 
           ", createdAt=" + String.valueOf(this.getCreatedAt()) + 
           ", updatedAt=" + String.valueOf(this.getUpdatedAt()) + 
           ")";
}


public Radio(final Long id, final String name, final String nameFr, final String nameEn,
final String description, final String descriptionFr, final String descriptionEn,
final String adresse, final String localisation, final String type, 
final String categorie, final String phone, final String fax, 
final String email, final String website, final String streaminglink, 
final Complexe complexe, final List<Caracteristique> caracteristiqueList, 
final List<Multimedia> multimediaList, 
final LocalDateTime createdAt, final LocalDateTime updatedAt) {
this.id = id;
this.name = name;
this.nameFr = nameFr;  // Ajout de l'attribut nameFr
this.nameEn = nameEn;  // Ajout de l'attribut nameEn
this.description = description;
this.descriptionFr = descriptionFr;  // Ajout de l'attribut descriptionFr
this.descriptionEn = descriptionEn;  // Ajout de l'attribut descriptionEn
this.adresse = adresse;
this.localisation = localisation;
this.type = type;
this.categorie = categorie;
this.phone = phone;
this.fax = fax;
this.email = email;
this.website = website;
this.streaminglink = streaminglink;
this.complexe = complexe;
this.caracteristiqueList = caracteristiqueList;
this.multimediaList = multimediaList;
this.createdAt = createdAt;
this.updatedAt = updatedAt;
}


    public Radio() {
    }

    public static class RadioBuilder {
        private Long id;
        private String name;
        private String nameFr; // Ajout de l'attribut nameFr
        private String nameEn; // Ajout de l'attribut nameEn
        private String description;
        private String descriptionFr; // Ajout de l'attribut descriptionFr
        private String descriptionEn; // Ajout de l'attribut descriptionEn
        private String adresse;
        private String localisation;
        private String type;
        private String categorie;
        private String phone;
        private String fax;
        private String email;
        private String website;
        private String streaminglink;
        private Complexe complexe;
        private List<Caracteristique> caracteristiqueList;
        private List<Multimedia> multimediaList;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
    
        RadioBuilder() {
        }

        public Radio.RadioBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        public Radio.RadioBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public RadioBuilder nameFr(String nameFr) { // Méthode pour nameFr
            this.nameFr = nameFr;
            return this;
        }
    
        public RadioBuilder nameEn(String nameEn) { // Méthode pour nameEn
            this.nameEn = nameEn;
            return this;
        }
    
        public RadioBuilder description(String description) {
            this.description = description;
            return this;
        }
    
        public RadioBuilder descriptionFr(String descriptionFr) { // Méthode pour descriptionFr
            this.descriptionFr = descriptionFr;
            return this;
        }
    
        public RadioBuilder descriptionEn(String descriptionEn) { // Méthode pour descriptionEn
            this.descriptionEn = descriptionEn;
            return this;
        }

        public Radio.RadioBuilder adresse(final String adresse) {
            this.adresse = adresse;
            return this;
        }

        public Radio.RadioBuilder localisation(final String localisation) {
            this.localisation = localisation;
            return this;
        }

        public Radio.RadioBuilder type(final String type) {
            this.type = type;
            return this;
        }

        public Radio.RadioBuilder categorie(final String categorie) {
            this.categorie = categorie;
            return this;
        }

        public Radio.RadioBuilder phone(final String phone) {
            this.phone = phone;
            return this;
        }

        public Radio.RadioBuilder fax(final String fax) {
            this.fax = fax;
            return this;
        }

        public Radio.RadioBuilder email(final String email) {
            this.email = email;
            return this;
        }

        public Radio.RadioBuilder website(final String website) {
            this.website = website;
            return this;
        }

        public Radio.RadioBuilder streaminglink(final String streaminglink) {
            this.streaminglink = streaminglink;
            return this;
        }

        public Radio.RadioBuilder complexe(final Complexe complexe) {
            this.complexe = complexe;
            return this;
        }

        public Radio.RadioBuilder caracteristiqueList(final List<Caracteristique> caracteristiqueList) {
            this.caracteristiqueList = caracteristiqueList;
            return this;
        }

        public Radio.RadioBuilder multimediaList(final List<Multimedia> multimediaList) {
            this.multimediaList = multimediaList;
            return this;
        }

        public Radio.RadioBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Radio.RadioBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Radio build() {
            return new Radio(
                this.id,
                this.name,
                this.nameFr, // Ajout de nameFr
                this.nameEn, // Ajout de nameEn
                this.description,
                this.descriptionFr, // Ajout de descriptionFr
                this.descriptionEn, // Ajout de descriptionEn
                this.adresse,
                this.localisation,
                this.type,
                this.categorie,
                this.phone,
                this.fax,
                this.email,
                this.website,
                this.streaminglink,
                this.complexe,
                this.caracteristiqueList,
                this.multimediaList,
                this.createdAt,
                this.updatedAt
            );
        }
        

        public String toString() {
            Long var10000 = this.id;
            return "Radio.RadioBuilder(id=" + var10000 
                    + ", name=" + this.name 
                    + ", nameFr=" + this.nameFr // Ajout de nameFr
                    + ", nameEn=" + this.nameEn // Ajout de nameEn
                    + ", description=" + this.description 
                    + ", descriptionFr=" + this.descriptionFr // Ajout de descriptionFr
                    + ", descriptionEn=" + this.descriptionEn // Ajout de descriptionEn
                    + ", adresse=" + this.adresse 
                    + ", localisation=" + this.localisation 
                    + ", type=" + this.type 
                    + ", categorie=" + this.categorie 
                    + ", phone=" + this.phone 
                    + ", fax=" + this.fax 
                    + ", email=" + this.email 
                    + ", website=" + this.website 
                    + ", streaminglink=" + this.streaminglink 
                    + ", complexe=" + String.valueOf(this.complexe) 
                    + ", caracteristiqueList=" + String.valueOf(this.caracteristiqueList) 
                    + ", multimediaList=" + String.valueOf(this.multimediaList) 
                    + ", createdAt=" + String.valueOf(this.createdAt) 
                    + ", updatedAt=" + String.valueOf(this.updatedAt) + ")";
        }
        
    }
}
