package com.example.demo.entities;
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
        name = "agrument"
)
public class Agrument {
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
            mappedBy = "agrumentList",
            cascade = {CascadeType.ALL}
    )
    private List<Complexe> complexes = new ArrayList();
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

    public static Agrument.AgrumentBuilder builder() {
        return new Agrument.AgrumentBuilder();
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

    public List<Complexe> getComplexes() {
        return this.complexes;
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

    public void setComplexes(final List<Complexe> complexes) {
        this.complexes = complexes;
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
        } else if (!(o instanceof Agrument)) {
            return false;
        } else {
            Agrument other = (Agrument)o;
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
                    Object this$complexes = this.getComplexes();
                    Object other$complexes = other.getComplexes();
                    if (this$complexes == null) {
                        if (other$complexes == null) {
                            break label62;
                        }
                    } else if (this$complexes.equals(other$complexes)) {
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
        return other instanceof Agrument;
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
        Object $complexes = this.getComplexes();
        result = result * 59 + ($complexes == null ? 43 : $complexes.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getId();
        return "Agrument(id=" + var10000 + ", name=" + this.getName() + ", description=" + this.getDescription() + ", complexes=" + String.valueOf(this.getComplexes()) + ", createdAt=" + String.valueOf(this.getCreatedAt()) + ", updatedAt=" + String.valueOf(this.getUpdatedAt()) + ")";
    }

    public Agrument(final Long id, final String name, final String description, final List<Complexe> complexes, final LocalDateTime createdAt, final LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.complexes = complexes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Agrument() {
    }

    public static class AgrumentBuilder {
        private Long id;
        private String name;
        private String description;
        private List<Complexe> complexes;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        AgrumentBuilder() {
        }

        public Agrument.AgrumentBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        public Agrument.AgrumentBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public Agrument.AgrumentBuilder description(final String description) {
            this.description = description;
            return this;
        }

        public Agrument.AgrumentBuilder complexes(final List<Complexe> complexes) {
            this.complexes = complexes;
            return this;
        }

        public Agrument.AgrumentBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Agrument.AgrumentBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Agrument build() {
            return new Agrument(this.id, this.name, this.description, this.complexes, this.createdAt, this.updatedAt);
        }

        public String toString() {
            Long var10000 = this.id;
            return "Agrument.AgrumentBuilder(id=" + var10000 + ", name=" + this.name + ", description=" + this.description + ", complexes=" + String.valueOf(this.complexes) + ", createdAt=" + String.valueOf(this.createdAt) + ", updatedAt=" + String.valueOf(this.updatedAt) + ")";
        }
    }
}
