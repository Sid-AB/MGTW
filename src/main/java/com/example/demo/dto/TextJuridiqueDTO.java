package com.example.demo.dto;

import com.example.demo.entities.TextJuridique;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class TextJuridiqueDTO {
    private String name;
    private String description;
    private String path;
    private Long lois;
    private List<MultipartFile> profilFiles;

    public TextJuridique toTextJuridique() {
        TextJuridique textJuridique = new TextJuridique();
        textJuridique.setName(this.getName());
        textJuridique.setDescription(this.getDescription());
        textJuridique.setPath(this.getPath());
        return textJuridique;
    }

    public static com.example.demo.dto.TextJuridiqueDTO.TextJuridiqueDTOBuilder builder() {
        return new com.example.demo.dto.TextJuridiqueDTO.TextJuridiqueDTOBuilder();
    }

    public TextJuridiqueDTO(final String name, final String description, final String path, final Long lois, final List<MultipartFile> profilFiles) {
        this.name = name;
        this.description = description;
        this.path = path;
        this.lois = lois;
        this.profilFiles = profilFiles;
    }

    public TextJuridiqueDTO() {
    }

    public String getName() {
        return this.name;
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
        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        Object $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        Object $profilFiles = this.getProfilFiles();
        result = result * 59 + ($profilFiles == null ? 43 : $profilFiles.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getName();
        return "TextJuridiqueDTO(name=" + var10000 + ", description=" + this.getDescription() + ", path=" + this.getPath() + ", lois=" + this.getLois() + ", profilFiles=" + String.valueOf(this.getProfilFiles()) + ")";
    }

    public static class TextJuridiqueDTOBuilder {
    }
}
