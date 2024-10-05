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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(
        name = "lois"
)
public class Lois {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String name;
    @Column(name = "name_fr") 
    private String nameFr; 

    @Column(name = "name_en") 
    private String nameEn; 

    @Column(name = "description_fr", columnDefinition = "TEXT")
    private String descriptionFr; // Description de l'établissement en fr

    @Column(name = "description_en", columnDefinition = "TEXT")
    private String descriptionEn; // Description de l'établissement en en

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @OneToMany(mappedBy = "lois", cascade = { CascadeType.ALL })
    private List<TextJuridique> textJuridiqueList = new ArrayList<>();
    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public static Lois.LoisBuilder builder() {
        return new Lois.LoisBuilder();
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

    // Getter pour nameEn
    public String getNameEn() {
        return this.nameEn;
    }

    // Getter pour descriptionFr
    public String getDescriptionFr() {
        return this.descriptionFr;
    }

    // Getter pour descriptionEn
    public String getDescriptionEn() {
        return this.descriptionEn;
    }

    public List<TextJuridique> getTextJuridiqueList() {
        return this.textJuridiqueList;
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

    // Setter pour nameEn
    public void setNameEn(final String nameEn) {
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

    public void setTextJuridiqueList(final List<TextJuridique> textJuridiqueList) {
        this.textJuridiqueList = textJuridiqueList;
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
        } else if (!(o instanceof Lois)) {
            return false;
        } else {
            Lois other = (Lois)o;
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

                /*Object this$nameFr = this.getNameFr();
                Object other$nameFr = other.getNameFr();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }
                Object this$nameEn = this.getNameEn();
                Object other$nameEn = other.getNameEn();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }*/

                Object this$description = this.getDescription();
                Object other$description = other.getDescription();
                if (this$description == null) {
                    if (other$description != null) {
                        return false;
                    }
                } else if (!this$description.equals(other$description)) {
                    return false;
                }

                // Vérification pour nameFr
                Object this$nameFr = this.getNameFr();
                Object other$nameFr = other.getNameFr();
                if (this$nameFr == null) {
                    if (other$nameFr != null) {
                        return false; // Un est nul, l'autre non
                    }
                } else if (!this$nameFr.equals(other$nameFr)) {
                    return false; // Noms en français différents
                }

                // Vérification pour nameEn
                Object this$nameEn = this.getNameEn();
                Object other$nameEn = other.getNameEn();
                if (this$nameEn == null) {
                    if (other$nameEn != null) {
                        return false; // Un est nul, l'autre non
                    }
                } else if (!this$nameEn.equals(other$nameEn)) {
                    return false; // Noms en anglais différents
                }

                // Vérification pour descriptionFr
                Object this$descriptionFr = this.getDescriptionFr();
                Object other$descriptionFr = other.getDescriptionFr();
                if (this$descriptionFr == null) {
                    if (other$descriptionFr != null) {
                        return false; // Un est nul, l'autre non
                    }
                } else if (!this$descriptionFr.equals(other$descriptionFr)) {
                    return false; // Descriptions en arabe différentes
                }

                // Vérification pour descriptionEn
                Object this$descriptionEn = this.getDescriptionEn();
                Object other$descriptionEn = other.getDescriptionEn();
                if (this$descriptionEn == null) {
                    if (other$descriptionEn != null) {
                        return false; // Un est nul, l'autre non
                    }
                } else if (!this$descriptionEn.equals(other$descriptionEn)) {
                    return false; // Descriptions en arabe différentes
                }

                label62: {
                    Object this$textJuridiqueList = this.getTextJuridiqueList();
                    Object other$textJuridiqueList = other.getTextJuridiqueList();
                    if (this$textJuridiqueList == null) {
                        if (other$textJuridiqueList == null) {
                            break label62;
                        }
                    } else if (this$textJuridiqueList.equals(other$textJuridiqueList)) {
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
        return other instanceof Lois;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
         // Ajout du nom en français
        Object $nameFr = this.getNameFr();
        result = result * 59 + ($nameFr == null ? 43 : $nameFr.hashCode());

        // Ajout du nom en anglais
        Object $nameEn = this.getNameEn();
        result = result * 59 + ($nameEn == null ? 43 : $nameEn.hashCode());

        // Ajout de la description
        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());

        // Ajout de la description en français
        Object $descriptionFr = this.getDescriptionFr();
        result = result * 59 + ($descriptionFr == null ? 43 : $descriptionFr.hashCode());

        // Ajout de la description en anglais
        Object $descriptionEn = this.getDescriptionEn();
        result = result * 59 + ($descriptionEn == null ? 43 : $descriptionEn.hashCode());
        Object $textJuridiqueList = this.getTextJuridiqueList();
        result = result * 59 + ($textJuridiqueList == null ? 43 : $textJuridiqueList.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getId();
        return "Lois(id=" + var10000 +
                ", name=" + this.getName() +
                ", description=" + this.getDescription()
                + ", nameFr=" + this.getNameFr() // Ajout de nameFr
                + ", nameEn=" + this.getNameEn() // Ajout de nameEn
                + ", descriptionFr=" + this.getDescriptionFr() // Ajout de descriptionFr
                + ", descriptionEn=" + this.getDescriptionEn() // Ajout de descriptionEn
                + ", textJuridiqueList=" + String.valueOf(this.getTextJuridiqueList()) +
                ", createdAt=" + String.valueOf(this.getCreatedAt()) +
                ", updatedAt=" + String.valueOf(this.getUpdatedAt()) +
                ")";
    }

    public Lois(final Long id, final String name, final String description, final List<TextJuridique> textJuridiqueList,
            final LocalDateTime createdAt, final LocalDateTime updatedAt, final String nameFr,final String nameEn,final String descriptionFr,final String descriptionEn) {
        this.id = id;
        this.name = name;
       
        this.description = description;
        this.nameFr = nameFr; // Initialisation de nameFr
        this.nameEn = nameEn; // Initialisation de nameEn
        this.descriptionFr = descriptionFr; // Initialisation de descriptionFr
        this.descriptionEn = descriptionEn; // Initialisation de descriptionEn
        this.textJuridiqueList = textJuridiqueList;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Lois() {
    }

    public static class LoisBuilder {
        private Long id;
        private String name;
    
        private String description;
        private String nameFr; // Ajout de nameFr
        private String nameEn; // Ajout de nameEn
        private String descriptionFr; // Ajout de descriptionFr
        private String descriptionEn; // Ajout de descriptionEn
        private List<TextJuridique> textJuridiqueList;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        LoisBuilder() {
        }

        public Lois.LoisBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        public Lois.LoisBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public Lois.LoisBuilder description(final String description) {
            this.description = description;
            return this;
        }

        // Ajout de méthodes pour les nouveaux attributs
        public LoisBuilder nameFr(final String nameFr) {
            this.nameFr = nameFr;
            return this;
        }

        public LoisBuilder nameEn(final String nameEn) {
            this.nameEn = nameEn;
            return this;
        }

        public LoisBuilder descriptionFr(final String descriptionFr) {
            this.descriptionFr = descriptionFr;
            return this;
        }

        public LoisBuilder descriptionEn(final String descriptionEn) {
            this.descriptionEn = descriptionEn;
            return this;
        }

        public Lois.LoisBuilder textJuridiqueList(final List<TextJuridique> textJuridiqueList) {
            this.textJuridiqueList = textJuridiqueList;
            return this;
        }

        public Lois.LoisBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Lois.LoisBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Lois build() {
            return new Lois(this.id, this.name, this.description,this.textJuridiqueList, this.createdAt, this.updatedAt,this.nameFr, this.nameEn, this.descriptionFr,
                    this.descriptionEn);
        } 

       /* public Lois build() {
            return new Lois(this.id, this.name, this.description, this.nameFr, this.nameEn, this.descriptionFr,
                    this.descriptionEn, this.textJuridiqueList, this.createdAt, this.updatedAt);
        }*/
        public String toString() {
            return "Lois.LoisBuilder(id=" + this.id +
                    ", name=" + this.name +
                    ", description=" + this.description +
                    ", nameFr=" + this.nameFr + // Ajout au toString
                    ", nameEn=" + this.nameEn + // Ajout au toString
                    ", descriptionFr=" + this.descriptionFr + // Ajout au toString
                    ", descriptionEn=" + this.descriptionEn + // Ajout au toString
                    ", textJuridiqueList=" + this.textJuridiqueList +
                    ", createdAt=" + this.createdAt +
                    ", updatedAt=" + this.updatedAt + ")";
        }
    }
}
