package com.example.demo.dto;

import com.example.demo.entities.Complexe;

import java.util.List;

public class ComplexeDTO {
    private String name;
    private String description;
    private String type;
    private List<Long> selectedAgrument;
    private String adresse;
    private String phone;
    private String email;
    private String site;
    // Ajout des nouveaux champs
    private String nameFr;
    private String nameEn;
    private String descriptionFr;
    private String descriptionEn;
    private String adresseFr;  // Nouveau champ
    private String adresseEn;  // Nouveau champ

    public Complexe toComplexe() {
        Complexe complexe = new Complexe();
        complexe.setName(this.getName());
        complexe.setDescription(this.getDescription());
        complexe.setType(this.getType());
        complexe.setAdresse(this.getAdresse());
        complexe.setPhone(this.getPhone());
        complexe.setEmail(this.getEmail());
        complexe.setSite(this.getSite());
        // Ajout des nouveaux champs dans la méthode toComplexe()
        complexe.setNameFr(this.getNameFr());
        complexe.setNameEn(this.getNameEn());
        complexe.setDescriptionFr(this.getDescriptionFr());
        complexe.setDescriptionEn(this.getDescriptionEn());
        complexe.setAdresseFr(this.getAdresseFr());  // Ajout
        complexe.setAdresseEn(this.getAdresseEn());  // Ajout
        return complexe;
    }

    public static com.example.demo.dto.ComplexeDTO.ComplexeDTOBuilder builder() {
        return new com.example.demo.dto.ComplexeDTO.ComplexeDTOBuilder();
    }

    public ComplexeDTO(final String name, final String description, final String type,
            final List<Long> selectedAgrument, final String adresse, final String phone, final String email,
            final String site,
            final String nameFr, final String nameEn, final String descriptionFr, final String descriptionEn,
            final String adresseFr, final String adresseEn) { // Modifié
        this.name = name;
        this.description = description;
        this.type = type;
        this.selectedAgrument = selectedAgrument;
        this.adresse = adresse;
        this.phone = phone;
        this.email = email;
        this.site = site;
        this.nameFr = nameFr;
        this.nameEn = nameEn;
        this.descriptionFr = descriptionFr;
        this.descriptionEn = descriptionEn;
        this.adresseFr = adresseFr; // Ajout
        this.adresseEn = adresseEn; // Ajout
    }

    public ComplexeDTO() {
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

     // Getters et setters pour les nouveaux champs
     public String getNameFr() {
        return nameFr;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getAdresseFr() {  // Ajout
        return adresseFr;
    }

    public void setAdresseFr(String adresseFr) {  // Ajout
        this.adresseFr = adresseFr;
    }

    public String getAdresseEn() {  // Ajout
        return adresseEn;
    }

    public void setAdresseEn(String adresseEn) {  // Ajout
        this.adresseEn = adresseEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getDescriptionFr() {
        return descriptionFr;
    }

    public void setDescriptionFr(String descriptionFr) {
        this.descriptionFr = descriptionFr;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }


    public String getType() {
        return this.type;
    }

    public List<Long> getSelectedAgrument() {
        return this.selectedAgrument;
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

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setSelectedAgrument(final List<Long> selectedAgrument) {
        this.selectedAgrument = selectedAgrument;
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

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ComplexeDTO)) {
            return false;
        } else {
            ComplexeDTO other = (ComplexeDTO) o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label107: {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name == null) {
                            break label107;
                        }
                    } else if (this$name.equals(other$name)) {
                        break label107;
                    }

                    return false;
                }

                label108: {
                    // Comparaison pour nameFr
                    Object this$nameFr = this.getNameFr();
                    Object other$nameFr = other.getNameFr();
                    if (this$nameFr == null) {
                        if (other$nameFr != null) return false;
                    } else if (!this$nameFr.equals(other$nameFr)) return false;
                    break label108; // Ajout du break pour sortir du label
                }
                
                label109: {
                    // Comparaison pour nameEn
                    Object this$nameEn = this.getNameEn();
                    Object other$nameEn = other.getNameEn();
                    if (this$nameEn == null) {
                        if (other$nameEn != null) return false;
                    } else if (!this$nameEn.equals(other$nameEn)) return false;
                    break label109; // Ajout du break pour sortir du label
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

                // Comparaison pour descriptionFr
                Object this$descriptionFr = this.getDescriptionFr();
                Object other$descriptionFr = other.getDescriptionFr();
                if (this$descriptionFr == null) {
                    if (other$descriptionFr != null)
                        return false;
                } else if (!this$descriptionFr.equals(other$descriptionFr))
                    return false;

                // Comparaison pour descriptionEn
                Object this$descriptionEn = this.getDescriptionEn();
                Object other$descriptionEn = other.getDescriptionEn();
                if (this$descriptionEn == null) {
                    if (other$descriptionEn != null)
                        return false;
                } else if (!this$descriptionEn.equals(other$descriptionEn))
                    return false;

                Object this$type = this.getType();
                Object other$type = other.getType();
                if (this$type == null) {
                    if (other$type != null) {
                        return false;
                    }
                } else if (!this$type.equals(other$type)) {
                    return false;
                }

                label86: {
                    Object this$selectedAgrument = this.getSelectedAgrument();
                    Object other$selectedAgrument = other.getSelectedAgrument();
                    if (this$selectedAgrument == null) {
                        if (other$selectedAgrument == null) {
                            break label86;
                        }
                    } else if (this$selectedAgrument.equals(other$selectedAgrument)) {
                        break label86;
                    }

                    return false;
                }

                label79: {
                    Object this$adresse = this.getAdresse();
                    Object other$adresse = other.getAdresse();
                    if (this$adresse == null) {
                        if (other$adresse == null) {
                            break label79;
                        }
                    } else if (this$adresse.equals(other$adresse)) {
                        break label79;
                    }

                    return false;
                }

                label80: {
                    // Comparaison pour adresseFr
                    Object this$adresseFr = this.getAdresseFr();
                    Object other$adresseFr = other.getAdresseFr();
                    if (this$adresseFr == null) {
                        if (other$adresseFr != null) return false;
                    } else if (!this$adresseFr.equals(other$adresseFr)) return false;
                    break label80; // Ajout du break pour sortir du label
                }
                
                label81: {
                    // Comparaison pour adresseEn
                    Object this$adresseEn = this.getAdresseEn();
                    Object other$adresseEn = other.getAdresseEn();
                    if (this$adresseEn == null) {
                        if (other$adresseEn != null) return false;
                    } else if (!this$adresseEn.equals(other$adresseEn)) return false;
                    break label81; // Ajout du break pour sortir du label
                }

                label72: {
                    Object this$phone = this.getPhone();
                    Object other$phone = other.getPhone();
                    if (this$phone == null) {
                        if (other$phone == null) {
                            break label72;
                        }
                    } else if (this$phone.equals(other$phone)) {
                        break label72;
                    }

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

                Object this$site = this.getSite();
                Object other$site = other.getSite();
                if (this$site == null) {
                    if (other$site != null) {
                        return false;
                    }
                } else if (!this$site.equals(other$site)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ComplexeDTO;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $nameFr = this.getNameFr(); // Ajout de nameFr
        result = result * 59 + ($nameFr == null ? 43 : $nameFr.hashCode()); // Calcul du hashCode pour nameFr

        Object $nameEn = this.getNameEn(); // Ajout de nameEn
        result = result * 59 + ($nameEn == null ? 43 : $nameEn.hashCode()); // Calcul du hashCode pour nameEn

        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());

        Object $descriptionFr = this.getDescriptionFr(); // Ajout de descriptionFr
        result = result * 59 + ($descriptionFr == null ? 43 : $descriptionFr.hashCode()); // Calcul du hashCode pour
                                                                                          // descriptionFr

        Object $descriptionEn = this.getDescriptionEn(); // Ajout de descriptionEn
        result = result * 59 + ($descriptionEn == null ? 43 : $descriptionEn.hashCode()); // Calcul du hashCode pour
                                                                                          // descriptionEn

        Object $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        Object $selectedAgrument = this.getSelectedAgrument();
        result = result * 59 + ($selectedAgrument == null ? 43 : $selectedAgrument.hashCode());
        Object $adresse = this.getAdresse();
        result = result * 59 + ($adresse == null ? 43 : $adresse.hashCode());
        Object $adresseFr = this.getAdresseFr(); // Ajout de adresseFr
        result = result * 59 + ($adresseFr == null ? 43 : $adresseFr.hashCode()); // Calcul du hashCode pour adresseFr

        Object $adresseEn = this.getAdresseEn(); // Ajout de adresseEn
        result = result * 59 + ($adresseEn == null ? 43 : $adresseEn.hashCode()); // Calcul du hashCode pour adresseEn

        Object $phone = this.getPhone();
        result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        Object $site = this.getSite();
        result = result * 59 + ($site == null ? 43 : $site.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getName();
        return "ComplexeDTO(name=" + var10000 + 
               ", nameFr=" + this.getNameFr() + // Ajout de nameFr
               ", nameEn=" + this.getNameEn() + // Ajout de nameEn
               ", description=" + this.getDescription() + 
               ", descriptionFr=" + this.getDescriptionFr() + // Ajout de descriptionFr
               ", descriptionEn=" + this.getDescriptionEn() + // Ajout de descriptionEn
               ", type=" + this.getType() + 
               ", selectedAgrument=" + String.valueOf(this.getSelectedAgrument()) + 
               ", adresse=" + this.getAdresse() + 
               ", adresseFr=" + this.getAdresseFr() + // Ajout de adresseFr
               ", adresseEn=" + this.getAdresseEn() +  // Ajout de adresseEn
               ", phone=" + this.getPhone() + 
               ", email=" + this.getEmail() + 
               ", site=" + this.getSite() + 
               ")";
    }
    

    public static class ComplexeDTOBuilder {
    }
}
