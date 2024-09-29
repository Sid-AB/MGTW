package com.example.demo.entities;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import jakarta.persistence.*;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(
        name = "multimedia"
)
public class Multimedia {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String fileName;
    private String filePath;
    private String docType;
    private String fromtable;
    private String type;
    @ManyToOne
    @JoinColumn(
            name = "user_id"
    )
    private User user;
    @ManyToOne
    @JoinColumn(
            name = "etablissement_id"
    )
    private Etablissement etablissement;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "minister_id", nullable = true)
    private Minister minister;
    @ManyToOne
    @JoinColumn(
            name = "tv_id"
    )
    private TV tv;
    @ManyToOne
    @JoinColumn(
            name = "radio_id"
    )
    private Radio radio;
    @ManyToOne
    @JoinColumn(
            name = "presse_id"
    )
    private Presse presse;
    @ManyToOne
    @JoinColumn(
            name = "textJuridique_id"
    )
    private TextJuridique textJuridique;
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

    public static Multimedia.MultimediaBuilder builder() {
        return new Multimedia.MultimediaBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getDocType() {
        return this.docType;
    }

    public String getFromtable() {
        return this.fromtable;
    }

    public String getType() {
        return this.type;
    }

    public User getUser() {
        return this.user;
    }

    public Etablissement getEtablissement() {
        return this.etablissement;
    }
    public Minister getMinister() {
        return this.minister;
    }

    public TV getTv() {
        return this.tv;
    }

    public Radio getRadio() {
        return this.radio;
    }

    public Presse getPresse() {
        return this.presse;
    }

    public TextJuridique getTextJuridique() {
        return this.textJuridique;
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

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    public void setFilePath(final String filePath) {
        this.filePath = filePath;
    }

    public void setDocType(final String docType) {
        this.docType = docType;
    }

    public void setFromtable(final String fromtable) {
        this.fromtable = fromtable;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setUser(final User user) {
        this.user = user;
    }

    public void setEtablissement(final Etablissement etablissement) {
        this.etablissement = etablissement;
    }
    public void setMinister(final Minister minister) {
        this.minister = minister;
    }
    public void setTv(final TV tv) {
        this.tv = tv;
    }

    public void setRadio(final Radio radio) {
        this.radio = radio;
    }

    public void setPresse(final Presse presse) {
        this.presse = presse;
    }

    public void setTextJuridique(final TextJuridique textJuridique) {
        this.textJuridique = textJuridique;
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
        } else if (!(o instanceof Multimedia)) {
            return false;
        } else {
            Multimedia other = (Multimedia)o;
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

                Object this$fileName = this.getFileName();
                Object other$fileName = other.getFileName();
                if (this$fileName == null) {
                    if (other$fileName != null) {
                        return false;
                    }
                } else if (!this$fileName.equals(other$fileName)) {
                    return false;
                }

                Object this$filePath = this.getFilePath();
                Object other$filePath = other.getFilePath();
                if (this$filePath == null) {
                    if (other$filePath != null) {
                        return false;
                    }
                } else if (!this$filePath.equals(other$filePath)) {
                    return false;
                }

                label158: {
                    Object this$docType = this.getDocType();
                    Object other$docType = other.getDocType();
                    if (this$docType == null) {
                        if (other$docType == null) {
                            break label158;
                        }
                    } else if (this$docType.equals(other$docType)) {
                        break label158;
                    }

                    return false;
                }

                label151: {
                    Object this$fromtable = this.getFromtable();
                    Object other$fromtable = other.getFromtable();
                    if (this$fromtable == null) {
                        if (other$fromtable == null) {
                            break label151;
                        }
                    } else if (this$fromtable.equals(other$fromtable)) {
                        break label151;
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

                label137: {
                    Object this$user = this.getUser();
                    Object other$user = other.getUser();
                    if (this$user == null) {
                        if (other$user == null) {
                            break label137;
                        }
                    } else if (this$user.equals(other$user)) {
                        break label137;
                    }

                    return false;
                }

                label130: {
                    Object this$etablissement = this.getEtablissement();
                    Object other$etablissement = other.getEtablissement();
                    if (this$etablissement == null) {
                        if (other$etablissement == null) {
                            break label130;
                        }
                    } else if (this$etablissement.equals(other$etablissement)) {
                        break label130;
                    }

                    return false;
                }

                Object this$tv = this.getTv();
                Object other$tv = other.getTv();
                if (this$tv == null) {
                    if (other$tv != null) {
                        return false;
                    }
                } else if (!this$tv.equals(other$tv)) {
                    return false;
                }

                Object this$radio = this.getRadio();
                Object other$radio = other.getRadio();
                if (this$radio == null) {
                    if (other$radio != null) {
                        return false;
                    }
                } else if (!this$radio.equals(other$radio)) {
                    return false;
                }

                label109: {
                    Object this$presse = this.getPresse();
                    Object other$presse = other.getPresse();
                    if (this$presse == null) {
                        if (other$presse == null) {
                            break label109;
                        }
                    } else if (this$presse.equals(other$presse)) {
                        break label109;
                    }

                    return false;
                }

                label102: {
                    Object this$textJuridique = this.getTextJuridique();
                    Object other$textJuridique = other.getTextJuridique();
                    if (this$textJuridique == null) {
                        if (other$textJuridique == null) {
                            break label102;
                        }
                    } else if (this$textJuridique.equals(other$textJuridique)) {
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
        return other instanceof Multimedia;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $fileName = this.getFileName();
        result = result * 59 + ($fileName == null ? 43 : $fileName.hashCode());
        Object $filePath = this.getFilePath();
        result = result * 59 + ($filePath == null ? 43 : $filePath.hashCode());
        Object $docType = this.getDocType();
        result = result * 59 + ($docType == null ? 43 : $docType.hashCode());
        Object $fromtable = this.getFromtable();
        result = result * 59 + ($fromtable == null ? 43 : $fromtable.hashCode());
        Object $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        Object $user = this.getUser();
        result = result * 59 + ($user == null ? 43 : $user.hashCode());
        Object $etablissement = this.getEtablissement();
        result = result * 59 + ($etablissement == null ? 43 : $etablissement.hashCode());
        Object $tv = this.getTv();
        result = result * 59 + ($tv == null ? 43 : $tv.hashCode());
        Object $radio = this.getRadio();
        result = result * 59 + ($radio == null ? 43 : $radio.hashCode());
        Object $presse = this.getPresse();
        result = result * 59 + ($presse == null ? 43 : $presse.hashCode());
        Object $textJuridique = this.getTextJuridique();
        result = result * 59 + ($textJuridique == null ? 43 : $textJuridique.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getId();
        return "Multimedia(id=" + var10000 + ", fileName=" + this.getFileName() + ", filePath=" + this.getFilePath() + ", docType=" + this.getDocType() + ", fromtable=" + this.getFromtable() + ", type=" + this.getType() + ", user=" + String.valueOf(this.getUser()) + ", etablissement=" + String.valueOf(this.getEtablissement()) + ", tv=" + String.valueOf(this.getTv()) + ", radio=" + String.valueOf(this.getRadio()) + ", presse=" + String.valueOf(this.getPresse()) + ", textJuridique=" + String.valueOf(this.getTextJuridique()) + ", createdAt=" + String.valueOf(this.getCreatedAt()) + ", updatedAt=" + String.valueOf(this.getUpdatedAt()) + ")";
    }

    public Multimedia(final Long id, final String fileName, final String filePath, final String docType, final String fromtable, final String type, final User user, final Etablissement etablissement, final TV tv, final Radio radio, final Presse presse, final TextJuridique textJuridique, final LocalDateTime createdAt, final LocalDateTime updatedAt) {
        this.id = id;
        this.fileName = fileName;
        this.filePath = filePath;
        this.docType = docType;
        this.fromtable = fromtable;
        this.type = type;
        this.user = user;
        this.etablissement = etablissement;
        this.tv = tv;
        this.radio = radio;
        this.presse = presse;
        this.textJuridique = textJuridique;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Multimedia() {
    }

    public static class MultimediaBuilder {
        private Long id;
        private String fileName;
        private String filePath;
        private String docType;
        private String fromtable;
        private String type;
        private User user;
        private Etablissement etablissement;
        private TV tv;
        private Radio radio;
        private Presse presse;
        private TextJuridique textJuridique;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        MultimediaBuilder() {
        }

        public Multimedia.MultimediaBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        public Multimedia.MultimediaBuilder fileName(final String fileName) {
            this.fileName = fileName;
            return this;
        }

        public Multimedia.MultimediaBuilder filePath(final String filePath) {
            this.filePath = filePath;
            return this;
        }

        public Multimedia.MultimediaBuilder docType(final String docType) {
            this.docType = docType;
            return this;
        }

        public Multimedia.MultimediaBuilder fromtable(final String fromtable) {
            this.fromtable = fromtable;
            return this;
        }

        public Multimedia.MultimediaBuilder type(final String type) {
            this.type = type;
            return this;
        }

        public Multimedia.MultimediaBuilder user(final User user) {
            this.user = user;
            return this;
        }

        public Multimedia.MultimediaBuilder etablissement(final Etablissement etablissement) {
            this.etablissement = etablissement;
            return this;
        }

        public Multimedia.MultimediaBuilder tv(final TV tv) {
            this.tv = tv;
            return this;
        }

        public Multimedia.MultimediaBuilder radio(final Radio radio) {
            this.radio = radio;
            return this;
        }

        public Multimedia.MultimediaBuilder presse(final Presse presse) {
            this.presse = presse;
            return this;
        }

        public Multimedia.MultimediaBuilder textJuridique(final TextJuridique textJuridique) {
            this.textJuridique = textJuridique;
            return this;
        }

        public Multimedia.MultimediaBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Multimedia.MultimediaBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Multimedia build() {
            return new Multimedia(this.id, this.fileName, this.filePath, this.docType, this.fromtable, this.type, this.user, this.etablissement, this.tv, this.radio, this.presse, this.textJuridique, this.createdAt, this.updatedAt);
        }

        public String toString() {
            Long var10000 = this.id;
            return "Multimedia.MultimediaBuilder(id=" + var10000 + ", fileName=" + this.fileName + ", filePath=" + this.filePath + ", docType=" + this.docType + ", fromtable=" + this.fromtable + ", type=" + this.type + ", user=" + String.valueOf(this.user) + ", etablissement=" + String.valueOf(this.etablissement) + ", tv=" + String.valueOf(this.tv) + ", radio=" + String.valueOf(this.radio) + ", presse=" + String.valueOf(this.presse) + ", textJuridique=" + String.valueOf(this.textJuridique) + ", createdAt=" + String.valueOf(this.createdAt) + ", updatedAt=" + String.valueOf(this.updatedAt) + ")";
        }
    }
}
