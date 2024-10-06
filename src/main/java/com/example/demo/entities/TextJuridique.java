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
        name = "textjuridique"
)
public class TextJuridique {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String name;
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    @Column(name = "name_fr") 
    private String nameFr; 

    @Column(name = "name_en") 
    private String nameEn; 

    @Column(name = "description_fr", columnDefinition = "TEXT")
    private String descriptionFr; // Description de l'établissement en fr

    @Column(name = "description_en", columnDefinition = "TEXT")
    private String descriptionEn; // Description de l'établissement en en

    private String path;
    @ManyToOne
    @JoinColumn(name = "lois_id")
    private Lois lois;
    @OneToMany(mappedBy = "textJuridique", cascade = { CascadeType.ALL })
    private List<Multimedia> multimediaList = new ArrayList();
    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public static TextJuridique.TextJuridiqueBuilder builder() {
        return new TextJuridique.TextJuridiqueBuilder();
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

    public String getPath() {
        return this.path;
    }

    public Lois getLois() {
        return this.lois;
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

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public void setLois(final Lois lois) {
        this.lois = lois;
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
        } else if (!(o instanceof TextJuridique)) {
            return false;
        } else {
            TextJuridique other = (TextJuridique)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label107: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label107;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label107;
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

                label86: {
                    Object this$path = this.getPath();
                    Object other$path = other.getPath();
                    if (this$path == null) {
                        if (other$path == null) {
                            break label86;
                        }
                    } else if (this$path.equals(other$path)) {
                        break label86;
                    }

                    return false;
                }

                label79: {
                    Object this$lois = this.getLois();
                    Object other$lois = other.getLois();
                    if (this$lois == null) {
                        if (other$lois == null) {
                            break label79;
                        }
                    } else if (this$lois.equals(other$lois)) {
                        break label79;
                    }

                    return false;
                }

                label72: {
                    Object this$multimediaList = this.getMultimediaList();
                    Object other$multimediaList = other.getMultimediaList();
                    if (this$multimediaList == null) {
                        if (other$multimediaList == null) {
                            break label72;
                        }
                    } else if (this$multimediaList.equals(other$multimediaList)) {
                        break label72;
                    }

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
        return other instanceof TextJuridique;
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
        Object $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        Object $lois = this.getLois();
        result = result * 59 + ($lois == null ? 43 : $lois.hashCode());
        Object $multimediaList = this.getMultimediaList();
        result = result * 59 + ($multimediaList == null ? 43 : $multimediaList.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getId();
        return "TextJuridique(id=" + var10000
                + ", name=" + this.getName()
                + ", description=" + this.getDescription()
                + ", nameFr=" + this.getNameFr() // Ajout de nameFr
                + ", nameEn=" + this.getNameEn() // Ajout de nameEn
                + ", descriptionFr=" + this.getDescriptionFr() // Ajout de descriptionFr
                + ", descriptionEn=" + this.getDescriptionEn() // Ajout de descriptionEn
                + ", path=" + this.getPath()
                + ", lois=" + String.valueOf(this.getLois())
                + ", multimediaList=" + String.valueOf(this.getMultimediaList())
                + ", createdAt=" + String.valueOf(this.getCreatedAt())
                + ", updatedAt=" + String.valueOf(this.getUpdatedAt())
                + ")";
    }

    public TextJuridique(final Long id, final String name, final String description, final String nameFr,
    final String nameEn, // Ajout de nameEn
    final String descriptionFr,
    final String descriptionEn, final String path, final Lois lois,
            final List<Multimedia> multimediaList, final LocalDateTime createdAt, final LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.nameFr = nameFr; // Initialisation de nameFr
        this.nameEn = nameEn; // Initialisation de nameEn
        this.descriptionFr = descriptionFr; // Initialisation de descriptionFr
        this.descriptionEn = descriptionEn; // Initialisation de descriptionEn
        this.path = path;
        this.lois = lois;
        this.multimediaList = multimediaList;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public TextJuridique() {
    }

    public static class TextJuridiqueBuilder {
        private Long id;
        private String name;
        private String description;
        private String nameFr; // Ajout de nameFr
        private String nameEn; // Ajout de nameEn
        private String descriptionFr; // Ajout de descriptionFr
        private String descriptionEn; // Ajout de descriptionEn
        private String path;
        private Lois lois;
        private List<Multimedia> multimediaList;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        TextJuridiqueBuilder() {
        }

        public TextJuridique.TextJuridiqueBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        public TextJuridique.TextJuridiqueBuilder name(final String name) {
            this.name = name;
            return this;
        }
        public TextJuridique.TextJuridiqueBuilder nameFr(final String nameFr) {
            this.nameFr = nameFr;
            return this;
        }
        public TextJuridique.TextJuridiqueBuilder nameEn(final String nameEn) {
            this.nameEn = nameEn;
            return this;
        }

        public TextJuridique.TextJuridiqueBuilder description(final String description) {
            this.description = description;
            return this;
        }
        public TextJuridique.TextJuridiqueBuilder descriptionFr(final String descriptionFr) {
            this.descriptionFr = descriptionFr;
            return this;
        }
        public TextJuridique.TextJuridiqueBuilder descriptionEn(final String descriptionEn) {
            this.descriptionEn = descriptionEn;
            return this;
        }

        public TextJuridique.TextJuridiqueBuilder path(final String path) {
            this.path = path;
            return this;
        }

        public TextJuridique.TextJuridiqueBuilder lois(final Lois lois) {
            this.lois = lois;
            return this;
        }

        public TextJuridique.TextJuridiqueBuilder multimediaList(final List<Multimedia> multimediaList) {
            this.multimediaList = multimediaList;
            return this;
        }

        public TextJuridique.TextJuridiqueBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public TextJuridique.TextJuridiqueBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public TextJuridique build() {
            return new TextJuridique(this.id, this.name, this.description,this.nameFr,
            this.nameEn, 
            this.descriptionFr,
            this.descriptionEn, this.path, this.lois, this.multimediaList,
                    this.createdAt, this.updatedAt);
        }

        public String toString() {
            Long var10000 = this.id;
            return "TextJuridique.TextJuridiqueBuilder(id=" + var10000 +
                    ", name=" + this.name +
                    ", description=" + this.description +
                    ", nameFr=" + this.nameFr +
                    ", nameEn=" + this.nameEn + // Ajout de nameEn ici
                    ", descriptionFr=" + this.descriptionFr +
                    ", descriptionEn=" + this.descriptionEn +
                    ", path=" + this.path +
                    ", lois=" + String.valueOf(this.lois) +
                    ", multimediaList=" + String.valueOf(this.multimediaList) +
                    ", createdAt=" + String.valueOf(this.createdAt) +
                    ", updatedAt=" + String.valueOf(this.updatedAt) +
                    ")";
        }
    }
}
