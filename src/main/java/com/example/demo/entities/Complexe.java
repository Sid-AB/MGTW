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
        name = "complexe"
)
public class Complexe {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String name;
    private String type;
    @Column(
            name = "description",
            columnDefinition = "TEXT"
    )
    private String description;
    private String adresse;
    private String phone;
    private String email;
    private String site;
    @OneToOne(
            mappedBy = "complexe"
    )
    private Etablissement etablissement;
    @ManyToMany(
            cascade = {CascadeType.ALL},
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "complexe_agrument",
            joinColumns = {@JoinColumn(
                    name = "complexe_id"
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "agrument_id"
            )}
    )
    @JsonIgnore
    private List<Agrument> agrumentList = new ArrayList();
    @OneToMany(
            mappedBy = "complexe",
            cascade = {CascadeType.ALL}
    )
    private List<TV> tvList = new ArrayList();
    @OneToMany(
            mappedBy = "complexe",
            cascade = {CascadeType.ALL}
    )
    private List<Radio> radioList = new ArrayList();
    @OneToMany(
            mappedBy = "complexe",
            cascade = {CascadeType.ALL}
    )
    private List<Presse> presseList = new ArrayList();
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

    public static Complexe.ComplexeBuilder builder() {
        return new Complexe.ComplexeBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSite() {
        return this.site;
    }

    public Etablissement getEtablissement() {
        return this.etablissement;
    }

    public List<Agrument> getAgrumentList() {
        return this.agrumentList;
    }

    public List<TV> getTvList() {
        return this.tvList;
    }

    public List<Radio> getRadioList() {
        return this.radioList;
    }

    public List<Presse> getPresseList() {
        return this.presseList;
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

    public void setType(final String type) {
        this.type = type;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setAdresse(final String adresse) {
        this.adresse = adresse;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setSite(final String site) {
        this.site = site;
    }

    public void setEtablissement(final Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    @JsonIgnore
    public void setAgrumentList(final List<Agrument> agrumentList) {
        this.agrumentList = agrumentList;
    }

    public void setTvList(final List<TV> tvList) {
        this.tvList = tvList;
    }

    public void setRadioList(final List<Radio> radioList) {
        this.radioList = radioList;
    }

    public void setPresseList(final List<Presse> presseList) {
        this.presseList = presseList;
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
        } else if (!(o instanceof Complexe)) {
            return false;
        } else {
            Complexe other = (Complexe)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label191: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label191;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label191;
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

                Object this$type = this.getType();
                Object other$type = other.getType();
                if (this$type == null) {
                    if (other$type != null) {
                        return false;
                    }
                } else if (!this$type.equals(other$type)) {
                    return false;
                }

                label170: {
                    Object this$description = this.getDescription();
                    Object other$description = other.getDescription();
                    if (this$description == null) {
                        if (other$description == null) {
                            break label170;
                        }
                    } else if (this$description.equals(other$description)) {
                        break label170;
                    }

                    return false;
                }

                label163: {
                    Object this$adresse = this.getAdresse();
                    Object other$adresse = other.getAdresse();
                    if (this$adresse == null) {
                        if (other$adresse == null) {
                            break label163;
                        }
                    } else if (this$adresse.equals(other$adresse)) {
                        break label163;
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

                Object this$email = this.getEmail();
                Object other$email = other.getEmail();
                if (this$email == null) {
                    if (other$email != null) {
                        return false;
                    }
                } else if (!this$email.equals(other$email)) {
                    return false;
                }

                label142: {
                    Object this$site = this.getSite();
                    Object other$site = other.getSite();
                    if (this$site == null) {
                        if (other$site == null) {
                            break label142;
                        }
                    } else if (this$site.equals(other$site)) {
                        break label142;
                    }

                    return false;
                }

                label135: {
                    Object this$etablissement = this.getEtablissement();
                    Object other$etablissement = other.getEtablissement();
                    if (this$etablissement == null) {
                        if (other$etablissement == null) {
                            break label135;
                        }
                    } else if (this$etablissement.equals(other$etablissement)) {
                        break label135;
                    }

                    return false;
                }

                Object this$agrumentList = this.getAgrumentList();
                Object other$agrumentList = other.getAgrumentList();
                if (this$agrumentList == null) {
                    if (other$agrumentList != null) {
                        return false;
                    }
                } else if (!this$agrumentList.equals(other$agrumentList)) {
                    return false;
                }

                label121: {
                    Object this$tvList = this.getTvList();
                    Object other$tvList = other.getTvList();
                    if (this$tvList == null) {
                        if (other$tvList == null) {
                            break label121;
                        }
                    } else if (this$tvList.equals(other$tvList)) {
                        break label121;
                    }

                    return false;
                }

                Object this$radioList = this.getRadioList();
                Object other$radioList = other.getRadioList();
                if (this$radioList == null) {
                    if (other$radioList != null) {
                        return false;
                    }
                } else if (!this$radioList.equals(other$radioList)) {
                    return false;
                }

                label107: {
                    Object this$presseList = this.getPresseList();
                    Object other$presseList = other.getPresseList();
                    if (this$presseList == null) {
                        if (other$presseList == null) {
                            break label107;
                        }
                    } else if (this$presseList.equals(other$presseList)) {
                        break label107;
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
        return other instanceof Complexe;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        Object $adresse = this.getAdresse();
        result = result * 59 + ($adresse == null ? 43 : $adresse.hashCode());
        Object $phone = this.getPhone();
        result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        Object $site = this.getSite();
        result = result * 59 + ($site == null ? 43 : $site.hashCode());
        Object $etablissement = this.getEtablissement();
        result = result * 59 + ($etablissement == null ? 43 : $etablissement.hashCode());
        Object $agrumentList = this.getAgrumentList();
        result = result * 59 + ($agrumentList == null ? 43 : $agrumentList.hashCode());
        Object $tvList = this.getTvList();
        result = result * 59 + ($tvList == null ? 43 : $tvList.hashCode());
        Object $radioList = this.getRadioList();
        result = result * 59 + ($radioList == null ? 43 : $radioList.hashCode());
        Object $presseList = this.getPresseList();
        result = result * 59 + ($presseList == null ? 43 : $presseList.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getId();
        return "Complexe(id=" + var10000 + ", name=" + this.getName() + ", type=" + this.getType() + ", description=" + this.getDescription() + ", adresse=" + this.getAdresse() + ", phone=" + this.getPhone() + ", email=" + this.getEmail() + ", site=" + this.getSite() + ", etablissement=" + String.valueOf(this.getEtablissement()) + ", agrumentList=" + String.valueOf(this.getAgrumentList()) + ", tvList=" + String.valueOf(this.getTvList()) + ", radioList=" + String.valueOf(this.getRadioList()) + ", presseList=" + String.valueOf(this.getPresseList()) + ", createdAt=" + String.valueOf(this.getCreatedAt()) + ", updatedAt=" + String.valueOf(this.getUpdatedAt()) + ")";
    }

    public Complexe(final Long id, final String name, final String type, final String description, final String adresse, final String phone, final String email, final String site, final Etablissement etablissement, final List<Agrument> agrumentList, final List<TV> tvList, final List<Radio> radioList, final List<Presse> presseList, final LocalDateTime createdAt, final LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.adresse = adresse;
        this.phone = phone;
        this.email = email;
        this.site = site;
        this.etablissement = etablissement;
        this.agrumentList = agrumentList;
        this.tvList = tvList;
        this.radioList = radioList;
        this.presseList = presseList;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Complexe() {
    }

    public static class ComplexeBuilder {
        private Long id;
        private String name;
        private String type;
        private String description;
        private String adresse;
        private String phone;
        private String email;
        private String site;
        private Etablissement etablissement;
        private List<Agrument> agrumentList;
        private List<TV> tvList;
        private List<Radio> radioList;
        private List<Presse> presseList;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        ComplexeBuilder() {
        }

        public Complexe.ComplexeBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        public Complexe.ComplexeBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public Complexe.ComplexeBuilder type(final String type) {
            this.type = type;
            return this;
        }

        public Complexe.ComplexeBuilder description(final String description) {
            this.description = description;
            return this;
        }

        public Complexe.ComplexeBuilder adresse(final String adresse) {
            this.adresse = adresse;
            return this;
        }

        public Complexe.ComplexeBuilder phone(final String phone) {
            this.phone = phone;
            return this;
        }

        public Complexe.ComplexeBuilder email(final String email) {
            this.email = email;
            return this;
        }

        public Complexe.ComplexeBuilder site(final String site) {
            this.site = site;
            return this;
        }

        public Complexe.ComplexeBuilder etablissement(final Etablissement etablissement) {
            this.etablissement = etablissement;
            return this;
        }

        @JsonIgnore
        public Complexe.ComplexeBuilder agrumentList(final List<Agrument> agrumentList) {
            this.agrumentList = agrumentList;
            return this;
        }

        public Complexe.ComplexeBuilder tvList(final List<TV> tvList) {
            this.tvList = tvList;
            return this;
        }

        public Complexe.ComplexeBuilder radioList(final List<Radio> radioList) {
            this.radioList = radioList;
            return this;
        }

        public Complexe.ComplexeBuilder presseList(final List<Presse> presseList) {
            this.presseList = presseList;
            return this;
        }

        public Complexe.ComplexeBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Complexe.ComplexeBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Complexe build() {
            return new Complexe(this.id, this.name, this.type, this.description, this.adresse, this.phone, this.email, this.site, this.etablissement, this.agrumentList, this.tvList, this.radioList, this.presseList, this.createdAt, this.updatedAt);
        }

        public String toString() {
            Long var10000 = this.id;
            return "Complexe.ComplexeBuilder(id=" + var10000 + ", name=" + this.name + ", type=" + this.type + ", description=" + this.description + ", adresse=" + this.adresse + ", phone=" + this.phone + ", email=" + this.email + ", site=" + this.site + ", etablissement=" + String.valueOf(this.etablissement) + ", agrumentList=" + String.valueOf(this.agrumentList) + ", tvList=" + String.valueOf(this.tvList) + ", radioList=" + String.valueOf(this.radioList) + ", presseList=" + String.valueOf(this.presseList) + ", createdAt=" + String.valueOf(this.createdAt) + ", updatedAt=" + String.valueOf(this.updatedAt) + ")";
        }
    }
}
