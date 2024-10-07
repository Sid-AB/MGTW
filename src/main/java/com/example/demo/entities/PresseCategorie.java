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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(
        name = "presseCategorie"
)
public class PresseCategorie {
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

    @Column(name = "name_en") // Nom de la colonne dans la base de données
    private String nameEn; // Nom de l'établissement en anglais

    @Column(name = "description_fr", // Nom de la colonne dans la base de données
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String descriptionFr; // Description de l'établissement en fr

    @Column(name = "descriptio_en", // Nom de la colonne dans la base de données
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String descriptionEn; // Description de l'établissement en en

    @ManyToMany(
            mappedBy = "presseCategories",
            cascade = {CascadeType.ALL}
    )
    private List<Presse> presses = new ArrayList();
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

    public static PresseCategorie.PresseCategorieBuilder builder() {
        return new PresseCategorie.PresseCategorieBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    // Getter pour nameFr et en
    public String getNameFr() { 
        return this.nameFr; 
    }

    public String getNameEn() {
        return nameEn;
    }

    // Getter pour descriptionFr
    public String getDescriptionFr() { 
        return this.descriptionFr; 
    }

    // Getter pour descriptionEn
    public String getDescriptionEn() { 
        return this.descriptionEn; 
    }

    public List<Presse> getPresses() {
        return this.presses;
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

    public void setDescription(final String description) {
        this.description = description;
    }

     // Setter pour nameFr
     public void setNameFr(final String nameFr) {
        this.nameFr = nameFr;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    // Setter pour descriptionFr
    public void setDescriptionFr(final String descriptionFr) {
        this.descriptionFr = descriptionFr;
    }

    // Setter pour descriptionEn
    public void setDescriptionEn(final String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public void setPresses(final List<Presse> presses) {
        this.presses = presses;
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
        } else if (!(o instanceof PresseCategorie)) {
            return false;
        } else {
            PresseCategorie other = (PresseCategorie)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$id = this.getId();
                Object other$id = other.getId();
                if (this$id == null) {
                    if (other$id != null) {
                        return false;
                    }
                } else if (!this$id.equals(other$id)) {
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

                Object this$description = this.getDescription();
                Object other$description = other.getDescription();
                if (this$description == null) {
                    if (other$description != null) {
                        return false;
                    }
                } else if (!this$description.equals(other$description)) {
                    return false;
                }

                Object this$descriptionFr = this.getDescriptionFr();
                Object other$descriptionFr = other.getDescriptionFr();
                if (this$descriptionFr == null) {
                    if (other$descriptionFr != null) {
                        return false;
                    }
                } else if (!this$descriptionFr.equals(other$descriptionFr)) {
                    return false;
                }

                Object this$descriptionEn = this.getDescriptionEn();
                Object other$descriptionEn = other.getDescriptionEn();
                if (this$descriptionEn == null) {
                    if (other$descriptionEn != null) {
                        return false;
                    }
                } else if (!this$descriptionEn.equals(other$descriptionEn)) {
                    return false;
                }

                label62: {
                    Object this$presses = this.getPresses();
                    Object other$presses = other.getPresses();
                    if (this$presses == null) {
                        if (other$presses == null) {
                            break label62;
                        }
                    } else if (this$presses.equals(other$presses)) {
                        break label62;
                    }

                    return false;
                }

                label55: {
                    Object this$createdAt = this.getCreatedAt();
                    Object other$createdAt = other.getCreatedAt();
                    if (this$createdAt == null) {
                        if (other$createdAt == null) {
                            break label55;
                        }
                    } else if (this$createdAt.equals(other$createdAt)) {
                        break label55;
                    }

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
        return other instanceof PresseCategorie;
    }

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

        Object $nameEn = this.getNameEn(); // Ajout du champ nameEn
        result = result * 59 + ($nameEn == null ? 43 : $nameEn.hashCode()); // Ajout du calcul pour nameEn

        Object $descriptionFr = this.getDescriptionFr();
        result = result * 59 + ($descriptionFr == null ? 43 : $descriptionFr.hashCode());

        Object $descriptionEn = this.getDescriptionEn();
        result = result * 59 + ($descriptionEn == null ? 43 : $descriptionEn.hashCode());

        Object $presses = this.getPresses();
        result = result * 59 + ($presses == null ? 43 : $presses.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
        return result;
    }

    
    public String toString() {
        Long var10000 = this.getId();
        return "PresseCategorie(id=" + var10000 +
                ", name=" + this.getName() +
                ", nameFr=" + this.getNameFr() + // Ajout du nom en français
                ", nameEn=" + this.getNameEn() + // Ajout du nom en anglais
                ", description=" + this.getDescription() +
                ", descriptionFr=" + this.getDescriptionFr() +
                ", descriptionEn=" + this.getDescriptionEn() +
                ", presses=" + String.valueOf(this.getPresses()) +
                ", createdAt=" + String.valueOf(this.getCreatedAt()) +
                ", updatedAt=" + String.valueOf(this.getUpdatedAt()) +
                ")";
    }

    public PresseCategorie(final Long id, final String name, final String nameFr, final String nameEn, final String description, final String descriptionFr, final String descriptionEn, final List<Presse> presses, final LocalDateTime createdAt, final LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;          // Nom en arabe ou français
        this.nameFr = nameFr;     // Nom en français
        this.nameEn = nameEn;     // Nom en anglais
        this.description = description;
        this.descriptionFr = descriptionFr;
        this.descriptionEn = descriptionEn;
        this.presses = presses;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    

    public PresseCategorie() {
    }

    public static class PresseCategorieBuilder {
        private Long id;
        private String name;
        private String nameFr;
        private String nameEn; // Ajout de l'attribut nameEn
        private String description;
        private String descriptionFr;
        private String descriptionEn;
        private List<Presse> presses;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        PresseCategorieBuilder() {
        }

        public PresseCategorie.PresseCategorieBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        public PresseCategorie.PresseCategorieBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public PresseCategorie.PresseCategorieBuilder nameFr(final String nameFr) {
            this.nameFr = nameFr;
            return this;
        }

        // Méthode pour définir nameEn
        public PresseCategorieBuilder nameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }

        public PresseCategorie.PresseCategorieBuilder description(final String description) {
            this.description = description;
            return this;
        }

        public PresseCategorie.PresseCategorieBuilder descriptionFr(final String descriptionFr) {
            this.descriptionFr = descriptionFr;
            return this;
        }
        
        public PresseCategorie.PresseCategorieBuilder descriptionEn(final String descriptionEn) {
            this.descriptionEn = descriptionEn;
            return this;
        }
        

        public PresseCategorie.PresseCategorieBuilder presses(final List<Presse> presses) {
            this.presses = presses;
            return this;
        }

        public PresseCategorie.PresseCategorieBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public PresseCategorie.PresseCategorieBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public PresseCategorie build() {
            return new PresseCategorie(id, name, nameFr, nameEn, description, descriptionFr, descriptionEn, presses,
                    createdAt, updatedAt);
        }

        public String toString() {
            Long var10000 = this.id;
            return "PresseCategorie.PresseCategorieBuilder(id=" + var10000 + 
                   ", name=" + this.name + 
                   ", nameFr=" + this.nameFr + 
                   ", nameEn=" + this.nameEn + // Ajout de nameEn
                   ", description=" + this.description + 
                   ", descriptionFr=" + this.descriptionFr + 
                   ", descriptionEn=" + this.descriptionEn + 
                   ", presses=" + String.valueOf(this.presses) + 
                   ", createdAt=" + String.valueOf(this.createdAt) + 
                   ", updatedAt=" + String.valueOf(this.updatedAt) + ")";
        }
        
        
    }
}
