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

                Object this$description = this.getDescription();
                Object other$description = other.getDescription();
                if (this$description == null) {
                    if (other$description != null) {
                        return false;
                    }
                } else if (!this$description.equals(other$description)) {
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
        return "PresseCategorie(id=" + var10000 + ", name=" + this.getName() + ", description=" + this.getDescription() + ", presses=" + String.valueOf(this.getPresses()) + ", createdAt=" + String.valueOf(this.getCreatedAt()) + ", updatedAt=" + String.valueOf(this.getUpdatedAt()) + ")";
    }

    public PresseCategorie(final Long id, final String name, final String description, final List<Presse> presses, final LocalDateTime createdAt, final LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.presses = presses;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public PresseCategorie() {
    }

    public static class PresseCategorieBuilder {
        private Long id;
        private String name;
        private String description;
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

        public PresseCategorie.PresseCategorieBuilder description(final String description) {
            this.description = description;
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
            return new PresseCategorie(this.id, this.name, this.description, this.presses, this.createdAt, this.updatedAt);
        }

        public String toString() {
            Long var10000 = this.id;
            return "PresseCategorie.PresseCategorieBuilder(id=" + var10000 + ", name=" + this.name + ", description=" + this.description + ", presses=" + String.valueOf(this.presses) + ", createdAt=" + String.valueOf(this.createdAt) + ", updatedAt=" + String.valueOf(this.updatedAt) + ")";
        }
    }
}
