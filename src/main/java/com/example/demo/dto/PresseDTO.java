package com.example.demo.dto;


import com.example.demo.entities.CategoriePress;
import com.example.demo.entities.Presse;
import com.example.demo.entities.Pressejr;
import com.example.demo.entities.Language;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class PresseDTO {
    private String name;
    private String nameEn;
    private String nameFr;
    private String description;
    private String descriptionFr;
    private String descriptionEn;
    private String type;
    private String website;
    private String categorie;
    private List<Long> selectedCategorie;
    private Long complexe;
    private Long categoriePresses;
    private String adresse;
    private String adresseFr;
    private String adresseEn;
    private String phone;
    private String fax;
    private String email;
    private String site;
    private Long Pressejr;
    private Long Language;
    private List<MultipartFile> profilFiles;

    public Presse toEPresse() {
        Presse presse = new Presse();
        presse.setName(this.getName()); // Nom en arabe
        presse.setDescription(this.getDescription()); // Description en arabe
        presse.setNameFr(this.getNameFr()); // Nom en français
        presse.setDescriptionFr(this.getDescriptionFr()); // Description en français
        presse.setDescriptionEn(this.getDescriptionEn()); // Description en anglais
        presse.setTypepbpr(this.getType()); // Type
        presse.setWebsite(this.getWebsite()); // Site web
        presse.setCategorieelec(this.getCategorie()); // Catégorie
        presse.setAdresse(this.getAdresse()); // Adresse
        presse.setAdresseFr(this.getAdresseFr()); // Adresse
        presse.setAdresseEn(this.getAdresseEn()); // Adresse
        presse.setPhone(this.getPhone()); // Téléphone
        presse.setFax(this.getFax()); // Fax
        presse.setEmail(this.getEmail()); // Email
        presse.setSite(this.getSite()); // Autre site
        presse.setNameEn(this.getNameEn()); // Ajout de nameEn
        /*presse.setCategoriePresse(this.getCategoriePresses());
        presse.setPressejr(this.getPressejr()); 
        presse.setLanguage(this.getLanguage()); */
        return presse;
    }
    

    public static com.example.demo.dto.PresseDTO.PresseDTOBuilder builder() {
        return new com.example.demo.dto.PresseDTO.PresseDTOBuilder();
    }

    public PresseDTO(final String name, final String nameFr, final String nameEn, final String description,
            final String descriptionFr, final String descriptionEn, final String type, final String website,
            final String categorie, final List<Long> selectedCategorie, final Long complexe,final Long categoriePresses, 
            final long Pressejr,final long Language, final String adresse,final String adresseFr, final String adresseEn,
            final String phone, final String fax, final String email, final String site, final String localisation,
            final List<MultipartFile> profilFiles) {
        this.name = name; // Nom en arabe
        this.nameFr = nameFr; // Nom en français
        this.nameEn = nameEn; // Nom en anglais (ajouté)
        this.description = description; // Description en arabe
        this.descriptionFr = descriptionFr; // Description en français
        this.descriptionEn = descriptionEn; // Description en anglais
        this.type = type;
        this.website = website;
        this.categorie = categorie;
        this.categoriePresses=categoriePresses;
        this.selectedCategorie = selectedCategorie;
        this.complexe = complexe;
        this.adresse = adresse;
        this.adresseFr = adresseFr;
        this.adresseEn = adresseEn;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.site = site;
        this.profilFiles = profilFiles;
        this.Pressejr = Pressejr;
        this.Language = Language;
    }
    

    public PresseDTO() {
    }

    public String getName() {
        return this.name;
    }

    public String getNameFr() {
        return this.nameFr;
    }

    // Ajoutez les getters et setters pour nameEn
    public String getNameEn() {
        return nameEn;
    }
    public String getDescription() {
        return this.description;
    }
    public String getDescriptionFr() {
        return this.descriptionFr;
    }
    public String getDescriptionEn() {
        return this.descriptionEn;
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

    public Long getCategoriePresses()
    {
        return this.categoriePresses;
    }

    public String getAdresse() {
        return this.adresse;
    }  

    public Long getPressejr() {
        return this.Pressejr;
    }
    
    public Long getLanguage() {
        return this.Language;
    }
    public String getAdresseFr() {
        return this.adresseFr;
    }
    public String getAdresseEn() {
        return this.adresseEn;
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


    public List<MultipartFile> getProfilFiles() {
        return this.profilFiles;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setNameFr(final String nameFr) {
        this.nameFr = nameFr;
    }
    
    public void setDescriptionFr(final String descriptionFr) {
        this.descriptionFr = descriptionFr;
    }

    public void setDescriptionEn(final String descriptionEn) {
        this.descriptionEn = descriptionEn;
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

    public void setCategoriePresses(final Long categoriePresses)
    {
        this.categoriePresses=categoriePresses;
    }

    public void setAdresse(final String adresse) {
        this.adresse = adresse;
    }

    public void setAdresseFr(final String adresseFr) {
        this.adresseFr = adresseFr;
    }
    public void setPressejr(final Long Pressejr) {
        this.Pressejr = Pressejr;
    }
    public void setLanguage(final Long Language) {
        this.Language = Language;
    }
    public void setAdresseEn(final String adresseEn) {
        this.adresseEn = adresseEn;
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

                // Comparaison pour nameFr
                Object this$nameFr = this.getNameFr();
                Object other$nameFr = other.getNameFr();
                if (this$nameFr == null) {
                    if (other$nameFr != null) {
                        return false;
                    }
                } else if (!this$nameFr.equals(other$nameFr)) {
                    return false;
                }

                // Comparaison pour nameEn (ajouté)
                Object this$nameEn = this.getNameEn(); // Assurez-vous d'avoir cette méthode dans votre classe
                Object other$nameEn = other.getNameEn(); // Assurez-vous d'avoir cette méthode dans votre classe
                if (this$nameEn == null) {
                    if (other$nameEn != null) {
                        return false;
                    }
                } else if (!this$nameEn.equals(other$nameEn)) {
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

                Object this$Pressejr = this.getPressejr();
                Object other$Pressejr = other.getPressejr();
                if (this$Pressejr == null) {
                    if (other$Pressejr != null) {
                        return false;
                    }
                } else if (!this$Pressejr.equals(other$Pressejr)) {
                    return false;
                }

                
                Object this$Language = this.getLanguage();
                Object other$Language = other.getLanguage();
                if (this$Language == null) {
                    if (other$Language != null) {
                        return false;
                    }
                } else if (!this$Language.equals(other$Language)) {
                    return false;
                }

                Object this$categoriePresse = this.getCategoriePresses();
                Object other$categoriePresse = other.getCategoriePresses();
                if (this$categoriePresse == null) {
                    if (other$categoriePresse != null) {
                        return false;
                    }
                } else if (!this$categoriePresse.equals(other$categoriePresse)) {
                    return false;
                }

                Object this$descriptionFr = this.getDescriptionFr();
                Object other$descriptionFr = other.getDescriptionFr();
                if (this$descriptionFr == null) {
                    if (other$descriptionFr != null) {
                        return false;
                    }
                } else if (!this$descriptionFr.equals(other$descriptionFr)) {
                    return false;
                }

                Object this$descriptionEn = this.getDescriptionEn();
                Object other$descriptionEn = other.getDescriptionEn();
                if (this$descriptionEn == null) {
                    if (other$descriptionEn != null) {
                        return false;
                    }
                } else if (!this$descriptionEn.equals(other$descriptionEn)) {
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

                label131: {
                    Object this$adresseFr = this.getAdresseFr();
                    Object other$adresseFr = other.getAdresseFr();
                    if (this$adresseFr == null) {
                        if (other$adresseFr == null) {
                            break label131;
                        }
                    } else if (this$adresseFr.equals(other$adresseFr)) {
                        break label131;
                    }

                    return false;
                }

                label132: {
                    Object this$adresseEn = this.getAdresseEn();
                    Object other$adresseEn = other.getAdresseEn();
                    if (this$adresseEn == null) {
                        if (other$adresseEn == null) {
                            break label132;
                        }
                    } else if (this$adresseEn.equals(other$adresseEn)) {
                        break label132;
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
    
        Object $nameFr = this.getNameFr();
        result = result * 59 + ($nameFr == null ? 43 : $nameFr.hashCode());
    
        Object $descriptionFr = this.getDescriptionFr();
        result = result * 59 + ($descriptionFr == null ? 43 : $descriptionFr.hashCode());
    
        Object $descriptionEn = this.getDescriptionEn();
        result = result * 59 + ($descriptionEn == null ? 43 : $descriptionEn.hashCode());
    
        Object $nameEn = this.getNameEn(); // Ajouté pour le champ nameEn
        result = result * 59 + ($nameEn == null ? 43 : $nameEn.hashCode()); // Ajout de la ligne pour le hashCode de nameEn
    
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

        Object $adresseFr = this.getAdresseFr();
        result = result * 59 + ($adresseFr == null ? 43 : $adresseFr.hashCode());

        Object $adresseEn = this.getAdresseEn();
        result = result * 59 + ($adresseEn == null ? 43 : $adresseEn.hashCode());
    
        Object $phone = this.getPhone();
        result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
    
        Object $fax = this.getFax();
        result = result * 59 + ($fax == null ? 43 : $fax.hashCode());
    
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
    
        Object $site = this.getSite();
        result = result * 59 + ($site == null ? 43 : $site.hashCode());
    
        Object $profilFiles = this.getProfilFiles();
        result = result * 59 + ($profilFiles == null ? 43 : $profilFiles.hashCode());
        
        Object $Pressejr = this.getPressejr();
        result = result * 59 + ($Pressejr == null ? 43 : $Pressejr.hashCode());
            
        Object $Language = this.getLanguage();
        result = result * 59 + ($Language == null ? 43 : $Language.hashCode());
            
        Object $categoriePresse = this.getCategoriePresses();
        result = result * 59 + ($categoriePresse == null ? 43 : $categoriePresse.hashCode());
        return result;
    }
    

    public String toString() {
        String var10000 = this.getName();
        return "PresseDTO(name=" + var10000 + 
               ", nameFr=" + this.getNameFr() + 
               ", description=" + this.getDescription() + 
               ", descriptionFr=" + this.getDescriptionFr() + 
               ", descriptionEn=" + this.getDescriptionEn() + 
               ", nameEn=" + this.getNameEn() +  // Ajout du champ nameEn
               ", type=" + this.getType() + 
               ", website=" + this.getWebsite() + 
               ", categorie=" + this.getCategorie() + 
               ", selectedCategorie=" + String.valueOf(this.getSelectedCategorie()) + 
               ", complexe=" + this.getComplexe() + 
               ", adresse=" + this.getAdresse() + 
               ", adresseFr=" + this.getAdresseFr() + 
               ", adresseEn=" + this.getAdresseEn() + 
               ", phone=" + this.getPhone() + 
               ", fax=" + this.getFax() + 
               ", email=" + this.getEmail() + 
               ", site=" + this.getSite() + 
               ", Pressejr=" + this.getPressejr() + 
               ", Language=" + this.getLanguage() + 
               ", categoriePresse=" + this.getCategoriePresses() + 
               ", profilFiles=" + String.valueOf(this.getProfilFiles()) + 
               ")";
    }
    

    public static class PresseDTOBuilder {
    }
}
