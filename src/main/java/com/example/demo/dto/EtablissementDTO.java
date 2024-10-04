package com.example.demo.dto;

import com.example.demo.entities.Etablissement;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class EtablissementDTO {
    private String name;
    private String description;
<<<<<<< HEAD
    private String nameFr;  // Ajout de name_fr
    private String descriptionFr;  // Ajout de description_fr
    private String descriptionEn;  // Ajout de description_fr
=======
    private String nameFr;  // Ajout de nameFr
    private String nameEn;  // Ajout de nameFr
    private String descriptionFr;  // Ajout de descriptionFr
    private String descriptionEn;  // Ajout de descriptionFr
>>>>>>> cb3f5d367d498769acf935d94d172e80f9cfce83
    private String type;
    private List<MultipartFile> etablissementFiles;
    private String adresse;
    private String phone;
    private String fax;
    private String email;
    private String site;
    private String localisation;

    public Etablissement toEtablissement() {
        Etablissement etablissement = new Etablissement();
        etablissement.setName(this.getName()); // Assigner name arabe
        etablissement.setDescription(this.getDescription()); // Assigner description arabe
<<<<<<< HEAD
        etablissement.setNameFr(this.getNameFr());  // Assigner name_fr et en
        etablissement.setDescriptionFr(this.getDescriptionFr());  // Assigner description_fr
        etablissement.setDescriptionEn(this.getDescriptionEn());  // Assigner description_en
=======
        etablissement.setNameFr(this.getNameFr());  // Assigner nameFr
        etablissement.setDescriptionFr(this.getDescriptionFr());  // Assigner descriptionFr
        etablissement.setDescriptionEn(this.getDescriptionEn());  // Assigner descriptionEn
        etablissement.setNameEn(this.getNameEn());  // Assigner nameEn
>>>>>>> cb3f5d367d498769acf935d94d172e80f9cfce83
        etablissement.setType(this.getType());
        etablissement.setAdresse(this.getAdresse());
        etablissement.setPhone(this.getPhone());
        etablissement.setFax(this.getFax());
        etablissement.setEmail(this.getEmail());
        etablissement.setSite(this.getType());
        etablissement.setLocalisation(this.getLocalisation());
        return etablissement;
    }
    

    public static com.example.demo.dto.EtablissementDTO.EtablissementDTOBuilder builder() {
        return new com.example.demo.dto.EtablissementDTO.EtablissementDTOBuilder();
    }

<<<<<<< HEAD
    public EtablissementDTO(final String name, final String description, final String type, final List<MultipartFile> etablissementFiles, final String adresse, final String phone, final String fax, final String email, final String site, final String localisation, final String name_fr, final String description_fr,final String description_en) {
=======
    public EtablissementDTO(final String name, final String nameFr, final String nameEn, final String descriptionFr, final String descriptionEn, final String description, final String type, final List<MultipartFile> etablissementFiles, final String adresse, final String phone, final String fax, final String email, final String site, final String localisation) {
>>>>>>> cb3f5d367d498769acf935d94d172e80f9cfce83
        this.name = name;
        this.description = description;
        this.type = type;
        this.etablissementFiles = etablissementFiles;
        this.adresse = adresse;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.site = site;
        this.localisation = localisation;
<<<<<<< HEAD
        this.nameFr = name_fr;  // Initialiser name_fr
        this.descriptionFr = description_fr;  // Initialiser description_fr
        this.descriptionEn = description_en;  // Initialiser description_fr
=======
        this.nameFr = nameFr;  // Initialiser nameFr
        this.descriptionFr = descriptionFr;  // Initialiser descriptionFr
        this.descriptionEn = descriptionEn;  // Initialiser descriptionEn
        this.nameEn = nameEn;  // Initialiser nameEn
>>>>>>> cb3f5d367d498769acf935d94d172e80f9cfce83
    }
    

    public EtablissementDTO() {
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

<<<<<<< HEAD
    public String getNameFr() {  // Getter pour name_fr
        return this.nameFr;
    }

    public String getDescriptionFr() {  // Getter pour description_fr
        return this.descriptionFr;
    }

    public String getNameEn() {  // Getter pour name_en
        return this.nameFr;
    }

    public String getDescriptionEn() {  // Getter pour description_en
=======
    // Ajouter le getter pour nameEn
    public String getNameEn() { // Getter pour nameEn
        return this.nameEn;
    }

    public String getNameFr() {  // Getter pour nameFr
        return this.nameFr;
    }

    public String getDescriptionFr() {  // Getter pour descriptionFr
        return this.descriptionFr;
    }


    public String getDescriptionEn() {  // Getter pour descriptionEn
>>>>>>> cb3f5d367d498769acf935d94d172e80f9cfce83
        return this.descriptionEn;
    }

    public String getType() {
        return this.type;
    }

    public List<MultipartFile> getEtablissementFiles() {
        return this.etablissementFiles;
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

    public void setName(final String name) { // Setter pour name arabe
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

<<<<<<< HEAD
    public void setNameFr(final String name_fr) {  // Setter pour name_fr et en
        this.nameFr = name_fr;
    }

    public void setDescriptionFr(final String description_fr) {  // Setter pour description_fr
        this.descriptionFr = description_fr;
    }

    public void setName_en(final String name_fr) {  // Setter pour name_fr en en
        this.nameFr = name_fr;
    }

    public void setDescriptionEn(final String description_fr) {  // Setter pour description_en
        this.descriptionEn = description_fr;
=======
    public void setNameFr(final String nameFr) {  // Setter pour nameFr et en
        this.nameFr = nameFr;
    }

    // Ajouter le setter pour nameEn
    public void setNameEn(final String nameEn) { // Setter pour nameEn
        this.nameEn = nameEn;
    }

    public void setDescriptionFr(final String descriptionFr) {  // Setter pour descriptionFr
        this.descriptionFr = descriptionFr;
    }

    public void setDescriptionEn(final String descriptionEn) {  // Setter pour descriptionEn
        this.descriptionEn = descriptionEn;
>>>>>>> cb3f5d367d498769acf935d94d172e80f9cfce83
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setEtablissementFiles(final List<MultipartFile> etablissementFiles) {
        this.etablissementFiles = etablissementFiles;
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

public boolean equals(final Object o) {
    if (o == this) {
        return true;
    } else if (!(o instanceof EtablissementDTO)) {
        return false;
    } else {
        EtablissementDTO other = (EtablissementDTO)o;
        if (!other.canEqual(this)) {
            return false;
        } else {
            // Vérification pour 'name arabe'
            Object this$name = this.getName();
            Object other$name = other.getName();
            if (this$name == null) {
                if (other$name != null) {
                    return false;
                }
            } else if (!this$name.equals(other$name)) {
                return false;
            }

<<<<<<< HEAD
            // Vérification pour 'name_fr et en'
            Object this$name_fr = this.getNameFr();
            Object other$name_fr = other.getNameFr();
            if (this$name_fr == null) {
                if (other$name_fr != null) {
=======
            // Vérification pour 'nameFr et en'
            Object this$nameFr = this.getNameFr();
            Object other$nameFr = other.getNameFr();
            if (this$nameFr == null) {
                if (other$nameFr != null) {
>>>>>>> cb3f5d367d498769acf935d94d172e80f9cfce83
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
            // Vérification pour 'description arabe'
            Object this$description = this.getDescription();
            Object other$description = other.getDescription();
            if (this$description == null) {
                if (other$description != null) {
                    return false;
                }
            } else if (!this$description.equals(other$description)) {
                return false;
            }

<<<<<<< HEAD
            // Vérification pour 'description_fr'
            Object this$description_fr = this.getDescriptionFr();
            Object other$description_fr = other.getDescriptionFr();
            if (this$description_fr == null) {
                if (other$description_fr != null) {
=======
            // Vérification pour 'descriptionFr'
            Object this$descriptionFr = this.getDescriptionFr();
            Object other$descriptionFr = other.getDescriptionFr();
            if (this$descriptionFr == null) {
                if (other$descriptionFr != null) {
>>>>>>> cb3f5d367d498769acf935d94d172e80f9cfce83
                    return false;
                }
            } else if (!this$descriptionFr.equals(other$descriptionFr)) {
                return false;
            }

<<<<<<< HEAD
            // Vérification pour 'description_en'
            Object this$description_en = this.getDescriptionEn();
            Object other$description_en = other.getDescriptionEn();
            if (this$description_en == null) {
                if (other$description_en != null) {
=======
            // Vérification pour 'descriptionEn'
            Object this$descriptionEn = this.getDescriptionEn();
            Object other$descriptionEn = other.getDescriptionEn();
            if (this$descriptionEn == null) {
                if (other$descriptionEn != null) {
>>>>>>> cb3f5d367d498769acf935d94d172e80f9cfce83
                    return false;
                }
            } else if (!this$descriptionEn.equals(other$descriptionEn)) {
                return false;
            }

            // Vérification pour 'type'
            Object this$type = this.getType();
            Object other$type = other.getType();
            if (this$type == null) {
                if (other$type != null) {
                    return false;
                }
            } else if (!this$type.equals(other$type)) {
                return false;
            }

            // Vérification pour 'etablissementFiles'
            label110: {
                Object this$etablissementFiles = this.getEtablissementFiles();
                Object other$etablissementFiles = other.getEtablissementFiles();
                if (this$etablissementFiles == null) {
                    if (other$etablissementFiles == null) {
                        break label110;
                    }
                } else if (this$etablissementFiles.equals(other$etablissementFiles)) {
                    break label110;
                }
                return false;
            }

            // Vérification pour 'adresse'
            label103: {
                Object this$adresse = this.getAdresse();
                Object other$adresse = other.getAdresse();
                if (this$adresse == null) {
                    if (other$adresse == null) {
                        break label103;
                    }
                } else if (this$adresse.equals(other$adresse)) {
                    break label103;
                }
                return false;
            }

            // Vérification pour 'phone'
            Object this$phone = this.getPhone();
            Object other$phone = other.getPhone();
            if (this$phone == null) {
                if (other$phone != null) {
                    return false;
                }
            } else if (!this$phone.equals(other$phone)) {
                return false;
            }

            // Vérification pour 'fax'
            label89: {
                Object this$fax = this.getFax();
                Object other$fax = other.getFax();
                if (this$fax == null) {
                    if (other$fax == null) {
                        break label89;
                    }
                } else if (this$fax.equals(other$fax)) {
                    break label89;
                }
                return false;
            }

            // Vérification pour 'email'
            label82: {
                Object this$email = this.getEmail();
                Object other$email = other.getEmail();
                if (this$email == null) {
                    if (other$email == null) {
                        break label82;
                    }
                } else if (this$email.equals(other$email)) {
                    break label82;
                }
                return false;
            }

            // Vérification pour 'site'
            Object this$site = this.getSite();
            Object other$site = other.getSite();
            if (this$site == null) {
                if (other$site != null) {
                    return false;
                }
            } else if (!this$site.equals(other$site)) {
                return false;
            }

            // Vérification pour 'localisation'
            Object this$localisation = this.getLocalisation();
            Object other$localisation = other.getLocalisation();
            if (this$localisation == null) {
                if (other$localisation != null) {
                    return false;
                }
            } else if (!this$localisation.equals(other$localisation)) {
                return false;
            }

            return true;
        }
    }
}

    protected boolean canEqual(final Object other) {
        return other instanceof EtablissementDTO;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        
<<<<<<< HEAD
        Object $name_fr = this.getNameFr();
        result = result * 59 + ($name_fr == null ? 43 : $name_fr.hashCode());
=======
        Object $nameFr = this.getNameFr();
        result = result * 59 + ($nameFr == null ? 43 : $nameFr.hashCode());

        // Ajouter nameEn
        Object $nameEn = this.getNameEn();
        result = result * 59 + ($nameEn == null ? 43 : $nameEn.hashCode());
>>>>>>> cb3f5d367d498769acf935d94d172e80f9cfce83
        
        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        
<<<<<<< HEAD
        Object $description_fr = this.getDescriptionFr();
        result = result * 59 + ($description_fr == null ? 43 : $description_fr.hashCode());

        Object $description_en = this.getDescriptionEn();
        result = result * 59 + ($description_en == null ? 43 : $description_en.hashCode());
=======
        Object $descriptionFr = this.getDescriptionFr();
        result = result * 59 + ($descriptionFr == null ? 43 : $descriptionFr.hashCode());

        Object $descriptionEn = this.getDescriptionEn();
        result = result * 59 + ($descriptionEn == null ? 43 : $descriptionEn.hashCode());
>>>>>>> cb3f5d367d498769acf935d94d172e80f9cfce83
        
        Object $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        
        Object $etablissementFiles = this.getEtablissementFiles();
        result = result * 59 + ($etablissementFiles == null ? 43 : $etablissementFiles.hashCode());
        
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
        
        return result;
    }
    
    public String toString() {
        String var10000 = this.getName();
        return "EtablissementDTO(name=" + var10000 + 
<<<<<<< HEAD
               ", name_fr=" + this.getNameFr() + 
               ", description=" + this.getDescription() + 
               ", description_fr=" + this.getDescriptionFr() + 
               ", description_en=" + this.getDescriptionEn() + 
=======
               ", nameFr=" + this.getNameFr() + 
               ", nameEn=" + this.getNameEn() +  // Ajout de nameEn
               ", description=" + this.getDescription() + 
               ", descriptionFr=" + this.getDescriptionFr() + 
               ", descriptionEn=" + this.getDescriptionEn() + 
>>>>>>> cb3f5d367d498769acf935d94d172e80f9cfce83
               ", type=" + this.getType() + 
               ", etablissementFiles=" + String.valueOf(this.getEtablissementFiles()) + 
               ", adresse=" + this.getAdresse() + 
               ", phone=" + this.getPhone() + 
               ", fax=" + this.getFax() + 
               ", email=" + this.getEmail() + 
               ", site=" + this.getSite() + 
               ", localisation=" + this.getLocalisation() + ")";
    }
    
    

    public static class EtablissementDTOBuilder {
    }
}