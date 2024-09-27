package com.example.demo.dto;


import com.example.demo.entities.Presse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class PresseDTO {
    private String name;
    private String description;
    private String type;
    private String website;
    private String categorie;
    private List<Long> selectedCategorie;
    private Long complexe;
    private String adresse;
    private String phone;
    private String fax;
    private String email;
    private String site;
    private String localisation;
    private List<MultipartFile> profilFiles;

    public Presse toEPresse() {
        Presse presse = new Presse();
        presse.setName(this.getName());
        presse.setDescription(this.getDescription());
        presse.setTypepbpr(this.getType());
        presse.setWebsite(this.getWebsite());
        presse.setCategorieelec(this.getCategorie());
        presse.setAdresse(this.getAdresse());
        presse.setPhone(this.getPhone());
        presse.setFax(this.getFax());
        presse.setEmail(this.getEmail());
        presse.setSite(this.getSite());
        presse.setLocalisation(this.getLocalisation());
        return presse;
    }

    public static com.example.demo.dto.PresseDTO.PresseDTOBuilder builder() {
        return new com.example.demo.dto.PresseDTO.PresseDTOBuilder();
    }

    public PresseDTO(final String name, final String description, final String type, final String website, final String categorie, final List<Long> selectedCategorie, final Long complexe, final String adresse, final String phone, final String fax, final String email, final String site, final String localisation, final List<MultipartFile> profilFiles) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.website = website;
        this.categorie = categorie;
        this.selectedCategorie = selectedCategorie;
        this.complexe = complexe;
        this.adresse = adresse;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.site = site;
        this.localisation = localisation;
        this.profilFiles = profilFiles;
    }

    public PresseDTO() {
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

    public String getWebsite() {
        return this.website;
    }

    public String getCategorie() {
        return this.categorie;
    }

    public List<Long> getSelectedCategorie() {
        return this.selectedCategorie;
    }

    public Long getComplexe() {
        return this.complexe;
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

    public List<MultipartFile> getProfilFiles() {
        return this.profilFiles;
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

    public void setWebsite(final String website) {
        this.website = website;
    }

    public void setCategorie(final String categorie) {
        this.categorie = categorie;
    }

    public void setSelectedCategorie(final List<Long> selectedCategorie) {
        this.selectedCategorie = selectedCategorie;
    }

    public void setComplexe(final Long complexe) {
        this.complexe = complexe;
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

    public void setProfilFiles(final List<MultipartFile> profilFiles) {
        this.profilFiles = profilFiles;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PresseDTO)) {
            return false;
        } else {
            PresseDTO other = (PresseDTO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$complexe = this.getComplexe();
                Object other$complexe = other.getComplexe();
                if (this$complexe == null) {
                    if (other$complexe != null) {
                        return false;
                    }
                } else if (!this$complexe.equals(other$complexe)) {
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
                    Object this$website = this.getWebsite();
                    Object other$website = other.getWebsite();
                    if (this$website == null) {
                        if (other$website == null) {
                            break label151;
                        }
                    } else if (this$website.equals(other$website)) {
                        break label151;
                    }

                    return false;
                }

                Object this$categorie = this.getCategorie();
                Object other$categorie = other.getCategorie();
                if (this$categorie == null) {
                    if (other$categorie != null) {
                        return false;
                    }
                } else if (!this$categorie.equals(other$categorie)) {
                    return false;
                }

                label137: {
                    Object this$selectedCategorie = this.getSelectedCategorie();
                    Object other$selectedCategorie = other.getSelectedCategorie();
                    if (this$selectedCategorie == null) {
                        if (other$selectedCategorie == null) {
                            break label137;
                        }
                    } else if (this$selectedCategorie.equals(other$selectedCategorie)) {
                        break label137;
                    }

                    return false;
                }

                label130: {
                    Object this$adresse = this.getAdresse();
                    Object other$adresse = other.getAdresse();
                    if (this$adresse == null) {
                        if (other$adresse == null) {
                            break label130;
                        }
                    } else if (this$adresse.equals(other$adresse)) {
                        break label130;
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

                Object this$fax = this.getFax();
                Object other$fax = other.getFax();
                if (this$fax == null) {
                    if (other$fax != null) {
                        return false;
                    }
                } else if (!this$fax.equals(other$fax)) {
                    return false;
                }

                label109: {
                    Object this$email = this.getEmail();
                    Object other$email = other.getEmail();
                    if (this$email == null) {
                        if (other$email == null) {
                            break label109;
                        }
                    } else if (this$email.equals(other$email)) {
                        break label109;
                    }

                    return false;
                }

                label102: {
                    Object this$site = this.getSite();
                    Object other$site = other.getSite();
                    if (this$site == null) {
                        if (other$site == null) {
                            break label102;
                        }
                    } else if (this$site.equals(other$site)) {
                        break label102;
                    }

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

                Object this$profilFiles = this.getProfilFiles();
                Object other$profilFiles = other.getProfilFiles();
                if (this$profilFiles == null) {
                    if (other$profilFiles != null) {
                        return false;
                    }
                } else if (!this$profilFiles.equals(other$profilFiles)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PresseDTO;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $complexe = this.getComplexe();
         result = result * 59 + ($complexe == null ? 43 : $complexe.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        Object $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        Object $website = this.getWebsite();
        result = result * 59 + ($website == null ? 43 : $website.hashCode());
        Object $categorie = this.getCategorie();
        result = result * 59 + ($categorie == null ? 43 : $categorie.hashCode());
        Object $selectedCategorie = this.getSelectedCategorie();
        result = result * 59 + ($selectedCategorie == null ? 43 : $selectedCategorie.hashCode());
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
        Object $profilFiles = this.getProfilFiles();
        result = result * 59 + ($profilFiles == null ? 43 : $profilFiles.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getName();
        return "PresseDTO(name=" + var10000 + ", description=" + this.getDescription() + ", type=" + this.getType() + ", website=" + this.getWebsite() + ", categorie=" + this.getCategorie() + ", selectedCategorie=" + String.valueOf(this.getSelectedCategorie()) + ", complexe=" + this.getComplexe() + ", adresse=" + this.getAdresse() + ", phone=" + this.getPhone() + ", fax=" + this.getFax() + ", email=" + this.getEmail() + ", site=" + this.getSite() + ", localisation=" + this.getLocalisation() + ", profilFiles=" + String.valueOf(this.getProfilFiles()) + ")";
    }

    public static class PresseDTOBuilder {
    }
}
