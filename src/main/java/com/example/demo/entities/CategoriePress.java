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
        name = "categoriePresse"
)
public class CategoriePress {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String name;

    @Column(name = "name_fr") // Nom de la colonne dans la base de données
    private String nameFr; // Nom de l'établissement en français
    
    @Column(name = "name_en") // Nom de la colonne pour l'anglais
    private String nameEn; // Nom de l'établissement en anglais

    @OneToMany(
            mappedBy = "categoriePresse",
            cascade = {CascadeType.ALL}
    )
    private List<Presse> PresseList = new ArrayList<>();
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

    public static CategoriePress.CategoriePressBuilder builder() {
        return new CategoriePress.CategoriePressBuilder();
    }
    public CategoriePress(Long id,String name,String nameFr,String nameEn)
    {
        this.id=id;
        this.name=name;
        this.nameFr=nameFr;
        this.nameEn=nameEn;
    }
    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

     // Getter pour nameFr et en
     public String getNameFr() { 
        return this.nameFr; 
    }

    // Getter pour nameEn
    public String getNameEn() {
        return this.nameEn;
    }

    public List<Presse> getPresseList() {
        return this.PresseList;
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

    public void setPresseList(final List<Presse> PresseList) {
        this.PresseList = PresseList;
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
        } else if (!(o instanceof CategoriePress)) {
            return false;
        } else {
            CategoriePress other = (CategoriePress)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label71: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label71;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label71;
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

                label57: {
                    Object this$PresseList = this.getPresseList();
                    Object other$PresseList = other.getPresseList();
                    if (this$PresseList == null) {
                        if (other$PresseList == null) {
                            break label57;
                        }
                    } else if (this$PresseList.equals(other$PresseList)) {
                        break label57;
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
                    if (other$updatedAt == null) {
                        return true;
                    }
                } else if (this$updatedAt.equals(other$updatedAt)) {
                    return true;
                }

                return false;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CategoriePress;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $nameFr = this.getNameFr(); // Récupération du nom en français
        result = result * 59 + ($nameFr == null ? 43 : $nameFr.hashCode()); // Ajout du nom en français au code de hachage
        
        Object $nameEn = this.getNameEn(); // Récupération du nom en anglais
        result = result * 59 + ($nameEn == null ? 43 : $nameEn.hashCode()); // Ajout du nom en anglais au code de hachage
        Object $PresseList = this.getPresseList();
        result = result * 59 + ($PresseList == null ? 43 : $PresseList.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getId();
        return "CategoriePress(id=" + var10000 + ", name=" + this.getName()
                + ", nameFr=" + this.getNameFr() // Ajout de nameFr
                + ", nameEn=" + this.getNameEn() // Ajout de nameEn
                + ", PresseList=" + String.valueOf(this.getPresseList())
                + ", createdAt=" + String.valueOf(this.getCreatedAt())
                + ", updatedAt=" + String.valueOf(this.getUpdatedAt())
                + ")";
    }

    public CategoriePress(final Long id, final String name, final String nameFr, final String nameEn,
            final List<Presse> PresseList, final LocalDateTime createdAt, final LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.nameFr = nameFr; 
        this.nameEn = nameEn; 
        this.PresseList = PresseList;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public CategoriePress() {
    }

    public static class CategoriePressBuilder {
        private Long id;
        private String name;
        private String nameFr; // Ajout de nameFr
        private String nameEn; // Ajout de nameEn
        private List<Presse> PresseList;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        CategoriePressBuilder() {
        }

        public CategoriePress.CategoriePressBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        public CategoriePress.CategoriePressBuilder name(final String name) {
            this.name = name;
            return this;
        }
        public CategoriePress.CategoriePressBuilder nameFr(final String nameFr) {
            this.nameFr = nameFr;
            return this;
        }
        public CategoriePress.CategoriePressBuilder nameEn(final String nameEn) {
            this.nameEn = nameEn;
            return this;
        }

        public CategoriePress.CategoriePressBuilder PresseList(final List<Presse> PresseList) {
            this.PresseList = PresseList;
            return this;
        }

        public CategoriePress.CategoriePressBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public CategoriePress.CategoriePressBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public CategoriePress build() {
            return new CategoriePress(this.id, this.name, this.nameFr,
            this.nameEn, this.PresseList, this.createdAt, this.updatedAt);
        }

        public String toString() {
            Long var10000 = this.id;
            return "CategoriePress.CategoriePressBuilder(id=" + var10000 
            + ", name=" + this.name  
            +", nameFr=" + this.nameFr 
            +", nameEn=" + this.nameEn 
            + ", PresseList=" + String.valueOf(this.PresseList) 
            + ", createdAt=" + String.valueOf(this.createdAt) 
            + ", updatedAt=" + String.valueOf(this.updatedAt) + ")";
        }
    }
}
