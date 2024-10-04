package com.example.demo.dto;

import com.example.demo.entities.TextJuridique;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class TextJuridiqueDTO {
    private String name;
    private String description;
    private String nameFr; // Ajout de nameFr
    private String nameEn; // Ajout de nameEn
    private String descriptionFr; // Ajout de descriptionFr
    private String descriptionEn; // Ajout de descriptionEn
    private String path;
    private Long lois;
    private List<MultipartFile> profilFiles;

    public TextJuridique toTextJuridique() {
        TextJuridique textJuridique = new TextJuridique();
        textJuridique.setName(this.getName());
        textJuridique.setDescription(this.getDescription());
        textJuridique.setNameFr(this.getNameFr()); // Assigner nameFr
        textJuridique.setNameEn(this.getNameEn()); // Assigner nameEn
        textJuridique.setDescriptionFr(this.getDescriptionFr()); // Assigner descriptionFr
        textJuridique.setDescriptionEn(this.getDescriptionEn()); // Assigner descriptionEn
        textJuridique.setPath(this.getPath());
        return textJuridique;
    }

    public static com.example.demo.dto.TextJuridiqueDTO.TextJuridiqueDTOBuilder builder() {
        return new com.example.demo.dto.TextJuridiqueDTO.TextJuridiqueDTOBuilder();
    }

    public TextJuridiqueDTO(final String name, final String description, final String nameFr, final String nameEn, final String descriptionFr,
    final String descriptionEn, final String path, final Long lois,
            final List<MultipartFile> profilFiles) {
        this.name = name;
        this.description = description;
        this.nameFr = nameFr; // Initialiser nameFr
        this.nameEn = nameEn; // Initialiser nameEn
        this.descriptionFr = descriptionFr; // Initialiser descriptionFr
        this.descriptionEn = descriptionEn; // Initialiser descriptionEn
        this.path = path;
        this.lois = lois;
        this.profilFiles = profilFiles;
    }

    public TextJuridiqueDTO() {
    }

    public String getName() {
        return this.name;
    }

    // Ajouter le getter pour nameEn
    public String getNameEn() { // Getter pour nameEn
        return this.nameEn;
    }

    public String getNameFr() { // Getter pour nameFr
        return this.nameFr;
    }

    public String getDescriptionFr() { // Getter pour descriptionFr
        return this.descriptionFr;
    }

    public String getDescriptionEn() { // Getter pour descriptionEn
        return this.descriptionEn;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPath() {
        return this.path;
    }

    public Long getLois() {
        return this.lois;
    }

    public List<MultipartFile> getProfilFiles() {
        return this.profilFiles;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setNameFr(final String nameFr) { // Setter pour nameFr et en
        this.nameFr = nameFr;
    }

    // Ajouter le setter pour nameEn
    public void setNameEn(final String nameEn) { // Setter pour nameEn
        this.nameEn = nameEn;
    }

    public void setDescriptionFr(final String descriptionFr) { // Setter pour descriptionFr
        this.descriptionFr = descriptionFr;
    }

    public void setDescriptionEn(final String descriptionEn) { // Setter pour descriptionEn
        this.descriptionEn = descriptionEn;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public void setLois(final Long lois) {
        this.lois = lois;
    }

    public void setProfilFiles(final List<MultipartFile> profilFiles) {
        this.profilFiles = profilFiles;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof TextJuridiqueDTO)) {
            return false;
        } else {
            TextJuridiqueDTO other = (TextJuridiqueDTO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label71: {
                    Object this$lois = this.getLois();
                    Object other$lois = other.getLois();
                    if (this$lois == null) {
                        if (other$lois == null) {
                            break label71;
                        }
                    } else if (this$lois.equals(other$lois)) {
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

                                // Vérification pour 'nameFr et en'
                                Object this$nameFr = this.getNameFr();
                                Object other$nameFr = other.getNameFr();
                                if (this$nameFr == null) {
                                    if (other$nameFr != null) {
                                        return false;
                                    }
                                } else if (!this$nameFr.equals(other$nameFr)) {
                                    return false;
                                }
                
                                // Vérification pour 'nameEn'
                                Object this$nameEn = this.getNameEn();
                                Object other$nameEn = other.getNameEn();
                                if (this$nameEn == null) {
                                    if (other$nameEn != null) {
                                        return false;
                                    }
                                } else if (!this$nameEn.equals(other$nameEn)) {
                                    return false;
                                }

                label57: {
                    Object this$description = this.getDescription();
                    Object other$description = other.getDescription();
                    if (this$description == null) {
                        if (other$description == null) {
                            break label57;
                        }
                    } else if (this$description.equals(other$description)) {
                        break label57;
                    }

                    return false;
                }

                label58: {
                    Object this$descriptionFr = this.getDescriptionFr();
                    Object other$descriptionFr = other.getDescriptionFr();
                    if (this$descriptionFr == null) {
                        if (other$descriptionFr == null) {
                            break label58; // Les deux descriptions en français sont nulles
                        }
                    } else if (this$descriptionFr.equals(other$descriptionFr)) {
                        break label58; // Les deux descriptions en français sont égales
                    }
                    return false; // Les descriptions en français ne sont pas égales
                }
                
                label59: {
                    Object this$descriptionEn = this.getDescriptionEn();
                    Object other$descriptionEn = other.getDescriptionEn();
                    if (this$descriptionEn == null) {
                        if (other$descriptionEn == null) {
                            break label59; // Les deux descriptions en anglais sont nulles
                        }
                    } else if (this$descriptionEn.equals(other$descriptionEn)) {
                        break label59; // Les deux descriptions en anglais sont égales
                    }
                    return false; // Les descriptions en anglais ne sont pas égales
                }

                Object this$path = this.getPath();
                Object other$path = other.getPath();
                if (this$path == null) {
                    if (other$path != null) {
                        return false;
                    }
                } else if (!this$path.equals(other$path)) {
                    return false;
                }

                Object this$profilFiles = this.getProfilFiles();
                Object other$profilFiles = other.getProfilFiles();
                if (this$profilFiles == null) {
                    if (other$profilFiles == null) {
                        return true;
                    }
                } else if (this$profilFiles.equals(other$profilFiles)) {
                    return true;
                }

                return false;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TextJuridiqueDTO;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $lois = this.getLois();
         result = result * 59 + ($lois == null ? 43 : $lois.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $nameFr = this.getNameFr();
        result = result * 59 + ($nameFr == null ? 43 : $nameFr.hashCode());

        Object $nameEn = this.getNameEn();
        result = result * 59 + ($nameEn == null ? 43 : $nameEn.hashCode());

        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());

        Object $descriptionFr = this.getDescriptionFr();
        result = result * 59 + ($descriptionFr == null ? 43 : $descriptionFr.hashCode());

        Object $descriptionEn = this.getDescriptionEn();
        result = result * 59 + ($descriptionEn == null ? 43 : $descriptionEn.hashCode());
        Object $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        Object $profilFiles = this.getProfilFiles();
        result = result * 59 + ($profilFiles == null ? 43 : $profilFiles.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getName();
        return "TextJuridiqueDTO(name=" + var10000 +
        ", nameFr=" + this.getNameFr() +
        ", nameEn=" + this.getNameEn() + // Ajout de nameEn
        ", description=" + this.getDescription() +
        ", descriptionFr=" + this.getDescriptionFr() +
        ", descriptionEn=" + this.getDescriptionEn() +
          ", path=" + this.getPath() + 
          ", lois=" + this.getLois() +
           ", profilFiles=" + String.valueOf(this.getProfilFiles()) +
            ")";
    }

    public static class TextJuridiqueDTOBuilder {
    }
}
