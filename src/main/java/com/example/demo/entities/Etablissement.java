package com.example.demo.entities;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(
        name = "etablissement"
)
public class Etablissement {
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
    private String type;
    private String adresse;
    private String phone;
    private String fax;
    private String email;
    private String site;
    @Column(
            name = "localisation",
            columnDefinition = "TEXT"
    )
    private String localisation;
    @OneToOne(
            cascade = {CascadeType.ALL},
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "complexe_id",
            referencedColumnName = "id"
    )
    private Complexe complexe;
    @OneToMany(
            mappedBy = "etablissement",
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

    public static Etablissement.EtablissementBuilder builder() {
        return new Etablissement.EtablissementBuilder();
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

    public String getType() {
        return this.type;
    }

    public String getAdresse() {
        return this.adresse;
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

    public String getLocalisation() {
        return this.localisation;
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

    public void setId(final Long id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setAdresse(final String adresse) {
        this.adresse = adresse;
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

    public void setLocalisation(final String localisation) {
        this.localisation = localisation;
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

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Etablissement)) {
            return false;
        } else {
            Etablissement other = (Etablissement)o;
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

                label158: {
                    Object this$type = this.getType();
                    Object other$type = other.getType();
                    if (this$type == null) {
                        if (other$type == null) {
                            break label158;
                        }
                    } else if (this$type.equals(other$type)) {
                        break label158;
                    }

                    return false;
                }

                label151: {
                    Object this$adresse = this.getAdresse();
                    Object other$adresse = other.getAdresse();
                    if (this$adresse == null) {
                        if (other$adresse == null) {
                            break label151;
                        }
                    } else if (this$adresse.equals(other$adresse)) {
                        break label151;
                    }

                    return false;
                }

                Object this$phone = this.getPhone();
                Object other$phone = other.getPhone();
                if (this$phone == null) {
                    if (other$phone != null) {
                        return false;
                    }
                } else if (!this$phone.equals(other$phone)) {
                    return false;
                }

                label137: {
                    Object this$fax = this.getFax();
                    Object other$fax = other.getFax();
                    if (this$fax == null) {
                        if (other$fax == null) {
                            break label137;
                        }
                    } else if (this$fax.equals(other$fax)) {
                        break label137;
                    }

                    return false;
                }

                label130: {
                    Object this$email = this.getEmail();
                    Object other$email = other.getEmail();
                    if (this$email == null) {
                        if (other$email == null) {
                            break label130;
                        }
                    } else if (this$email.equals(other$email)) {
                        break label130;
                    }

                    return false;
                }

                Object this$site = this.getSite();
                Object other$site = other.getSite();
                if (this$site == null) {
                    if (other$site != null) {
                        return false;
                    }
                } else if (!this$site.equals(other$site)) {
                    return false;
                }

                Object this$localisation = this.getLocalisation();
                Object other$localisation = other.getLocalisation();
                if (this$localisation == null) {
                    if (other$localisation != null) {
                        return false;
                    }
                } else if (!this$localisation.equals(other$localisation)) {
                    return false;
                }

                label109: {
                    Object this$complexe = this.getComplexe();
                    Object other$complexe = other.getComplexe();
                    if (this$complexe == null) {
                        if (other$complexe == null) {
                            break label109;
                        }
                    } else if (this$complexe.equals(other$complexe)) {
                        break label109;
                    }

                    return false;
                }

                label102: {
                    Object this$multimediaList = this.getMultimediaList();
                    Object other$multimediaList = other.getMultimediaList();
                    if (this$multimediaList == null) {
                        if (other$multimediaList == null) {
                            break label102;
                        }
                    } else if (this$multimediaList.equals(other$multimediaList)) {
                        break label102;
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
        return other instanceof Etablissement;
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
        Object $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        Object $adresse = this.getAdresse();
        result = result * 59 + ($adresse == null ? 43 : $adresse.hashCode());
        Object $phone = this.getPhone();
        result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
        Object $fax = this.getFax();
        result = result * 59 + ($fax == null ? 43 : $fax.hashCode());
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        Object $site = this.getSite();
        result = result * 59 + ($site == null ? 43 : $site.hashCode());
        Object $localisation = this.getLocalisation();
        result = result * 59 + ($localisation == null ? 43 : $localisation.hashCode());
        Object $complexe = this.getComplexe();
        result = result * 59 + ($complexe == null ? 43 : $complexe.hashCode());
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
        return "Etablissement(id=" + var10000 + ", name=" + this.getName() + ", description=" + this.getDescription() + ", type=" + this.getType() + ", adresse=" + this.getAdresse() + ", phone=" + this.getPhone() + ", fax=" + this.getFax() + ", email=" + this.getEmail() + ", site=" + this.getSite() + ", localisation=" + this.getLocalisation() + ", complexe=" + String.valueOf(this.getComplexe()) + ", multimediaList=" + String.valueOf(this.getMultimediaList()) + ", createdAt=" + String.valueOf(this.getCreatedAt()) + ", updatedAt=" + String.valueOf(this.getUpdatedAt()) + ")";
    }

    public Etablissement(final Long id, final String name, final String description, final String type, final String adresse, final String phone, final String fax, final String email, final String site, final String localisation, final Complexe complexe, final List<Multimedia> multimediaList, final LocalDateTime createdAt, final LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.adresse = adresse;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.site = site;
        this.localisation = localisation;
        this.complexe = complexe;
        this.multimediaList = multimediaList;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Etablissement() {
    }

    public static class EtablissementBuilder {
        private Long id;
        private String name;
        private String description;
        private String type;
        private String adresse;
        private String phone;
        private String fax;
        private String email;
        private String site;
        private String localisation;
        private Complexe complexe;
        private List<Multimedia> multimediaList;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        EtablissementBuilder() {
        }

        public Etablissement.EtablissementBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        public Etablissement.EtablissementBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public Etablissement.EtablissementBuilder description(final String description) {
            this.description = description;
            return this;
        }

        public Etablissement.EtablissementBuilder type(final String type) {
            this.type = type;
            return this;
        }

        public Etablissement.EtablissementBuilder adresse(final String adresse) {
            this.adresse = adresse;
            return this;
        }

        public Etablissement.EtablissementBuilder phone(final String phone) {
            this.phone = phone;
            return this;
        }

        public Etablissement.EtablissementBuilder fax(final String fax) {
            this.fax = fax;
            return this;
        }

        public Etablissement.EtablissementBuilder email(final String email) {
            this.email = email;
            return this;
        }

        public Etablissement.EtablissementBuilder site(final String site) {
            this.site = site;
            return this;
        }

        public Etablissement.EtablissementBuilder localisation(final String localisation) {
            this.localisation = localisation;
            return this;
        }

        public Etablissement.EtablissementBuilder complexe(final Complexe complexe) {
            this.complexe = complexe;
            return this;
        }

        public Etablissement.EtablissementBuilder multimediaList(final List<Multimedia> multimediaList) {
            this.multimediaList = multimediaList;
            return this;
        }

        public Etablissement.EtablissementBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Etablissement.EtablissementBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Etablissement build() {
            return new Etablissement(this.id, this.name, this.description, this.type, this.adresse, this.phone, this.fax, this.email, this.site, this.localisation, this.complexe, this.multimediaList, this.createdAt, this.updatedAt);
        }

        public String toString() {
            Long var10000 = this.id;
            return "Etablissement.EtablissementBuilder(id=" + var10000 + ", name=" + this.name + ", description=" + this.description + ", type=" + this.type + ", adresse=" + this.adresse + ", phone=" + this.phone + ", fax=" + this.fax + ", email=" + this.email + ", site=" + this.site + ", localisation=" + this.localisation + ", complexe=" + String.valueOf(this.complexe) + ", multimediaList=" + String.valueOf(this.multimediaList) + ", createdAt=" + String.valueOf(this.createdAt) + ", updatedAt=" + String.valueOf(this.updatedAt) + ")";
        }
    }
}
