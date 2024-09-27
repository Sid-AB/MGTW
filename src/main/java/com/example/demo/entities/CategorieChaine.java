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
        name = "categorieChaine"
)
public class CategorieChaine {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String name;
    @OneToMany(
            mappedBy = "categorieChaine",
            cascade = {CascadeType.ALL}
    )
    private List<TV> tvList = new ArrayList();
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

    public static CategorieChaine.CategorieChaineBuilder builder() {
        return new CategorieChaine.CategorieChaineBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<TV> getTvList() {
        return this.tvList;
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

    public void setTvList(final List<TV> tvList) {
        this.tvList = tvList;
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
        } else if (!(o instanceof CategorieChaine)) {
            return false;
        } else {
            CategorieChaine other = (CategorieChaine)o;
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

                label57: {
                    Object this$tvList = this.getTvList();
                    Object other$tvList = other.getTvList();
                    if (this$tvList == null) {
                        if (other$tvList == null) {
                            break label57;
                        }
                    } else if (this$tvList.equals(other$tvList)) {
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
        return other instanceof CategorieChaine;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $tvList = this.getTvList();
        result = result * 59 + ($tvList == null ? 43 : $tvList.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getId();
        return "CategorieChaine(id=" + var10000 + ", name=" + this.getName() + ", tvList=" + String.valueOf(this.getTvList()) + ", createdAt=" + String.valueOf(this.getCreatedAt()) + ", updatedAt=" + String.valueOf(this.getUpdatedAt()) + ")";
    }

    public CategorieChaine(final Long id, final String name, final List<TV> tvList, final LocalDateTime createdAt, final LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.tvList = tvList;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public CategorieChaine() {
    }

    public static class CategorieChaineBuilder {
        private Long id;
        private String name;
        private List<TV> tvList;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        CategorieChaineBuilder() {
        }

        public CategorieChaine.CategorieChaineBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        public CategorieChaine.CategorieChaineBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public CategorieChaine.CategorieChaineBuilder tvList(final List<TV> tvList) {
            this.tvList = tvList;
            return this;
        }

        public CategorieChaine.CategorieChaineBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public CategorieChaine.CategorieChaineBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public CategorieChaine build() {
            return new CategorieChaine(this.id, this.name, this.tvList, this.createdAt, this.updatedAt);
        }

        public String toString() {
            Long var10000 = this.id;
            return "CategorieChaine.CategorieChaineBuilder(id=" + var10000 + ", name=" + this.name + ", tvList=" + String.valueOf(this.tvList) + ", createdAt=" + String.valueOf(this.createdAt) + ", updatedAt=" + String.valueOf(this.updatedAt) + ")";
        }
    }
}
