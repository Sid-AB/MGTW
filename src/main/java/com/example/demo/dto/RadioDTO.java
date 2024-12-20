package com.example.demo.dto;

import com.example.demo.entities.Caracteristique;
import com.example.demo.entities.Radio;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class RadioDTO {
    private String name;
    private String nameFr; // Ajout de nameFr
    private String nameEn; // Ajout de nameEn
    private String description;
    private String descriptionFr; // Ajout de descriptionFr
    private String descriptionEn; // Ajout de descriptionEn
    private String type;
    private String categorie;
    private String website;
    private String streaminglink;
    private String adresse;
    private String adresseFr; // Ajout de adresseFr
    private String adresseEn; // Ajout de adresseEn
    private String phone;
    private String fax;
    private String email;
    private String satellite;
    private String frequency;
    private String polarization;
    private String symbolrate;
    private String fec;
    private String transmission;
    private String modulation;
    private Long complexe;
    private String localisation;
    private List<MultipartFile> profilFiles;

    public Radio toERadio() {
        Radio radio = new Radio();
        radio.setName(this.getName());
        radio.setNameFr(this.getNameFr()); // Inclure nameFr
        radio.setNameEn(this.getNameEn()); // Inclure nameEn
        radio.setDescription(this.getDescription());
        radio.setDescriptionFr(this.getDescriptionFr()); // Inclure descriptionFr
        radio.setDescriptionEn(this.getDescriptionEn()); // Inclure descriptionEn
        radio.setType(this.getType());
        radio.setAdresse(this.getAdresse());
        radio.setAdresseFr(this.getAdresseFr()); // Assigner adresseFr
        radio.setAdresseEn(this.getAdresseEn());
        radio.setCategorie(this.getCategorie());
        radio.setWebsite(this.getWebsite());
        radio.setStreaminglink(this.getStreaminglink());
        radio.setLocalisation(this.getLocalisation());
        radio.setPhone(this.getPhone());
        radio.setFax(this.getFax());
        radio.setEmail(this.getEmail());
        return radio;
    }

    public Caracteristique toECaractiristique() {
        Caracteristique caracteristique = new Caracteristique();
        caracteristique.setSatellite(this.getSatellite());
        caracteristique.setFrequency(this.getFrequency());
        caracteristique.setPolarization(this.getPolarization());
        caracteristique.setSymbolrate(this.getSymbolrate());
        caracteristique.setFec(this.getFec());
        caracteristique.setTransmission(this.getTransmission());
        caracteristique.setModulation(this.getModulation());
        return caracteristique;
    }

    public static com.example.demo.dto.RadioDTO.RadioDTOBuilder builder() {
        return new com.example.demo.dto.RadioDTO.RadioDTOBuilder();
    }

    public RadioDTO(final String name, final String nameFr, final String nameEn, 
    final String description, final String descriptionFr, final String descriptionEn, 
    final String type, final String categorie, final String website, 
    final String streaminglink, final String adresse, final String adresseFr,
    final String adresseEn, final String phone, 
    final String fax, final String email, final String satellite, 
    final String frequency, final String polarization, 
    final String symbolrate, final String fec, 
    final String transmission, final String modulation, 
    final Long complexe, final String localisation, 
    final List<MultipartFile> profilFiles) {
this.name = name;
this.nameFr = nameFr; // Ajout de nameFr
this.nameEn = nameEn; // Ajout de nameEn
this.description = description;
this.descriptionFr = descriptionFr; // Ajout de descriptionFr
this.descriptionEn = descriptionEn; // Ajout de descriptionEn
this.adresseFr = adresseFr; // Initialiser adresseFr
this.adresseEn = adresseEn; // Initialiser adresseEn
this.type = type;
this.categorie = categorie;
this.website = website;
this.streaminglink = streaminglink;
this.adresse = adresse;
this.phone = phone;
this.fax = fax;
this.email = email;
this.satellite = satellite;
this.frequency = frequency;
this.polarization = polarization;
this.symbolrate = symbolrate;
this.fec = fec;
this.transmission = transmission;
this.modulation = modulation;
this.complexe = complexe;
this.localisation = localisation;
this.profilFiles = profilFiles;
}


    public RadioDTO() {
    }

    public String getName() {
        return this.name;
    }

    // Getters and Setters pour les nouveaux attributs
    public String getNameFr() {
        return nameFr;
    }
    public String getNameEn() {
        return nameEn;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDescriptionFr() {
        return descriptionFr;
    }
    public String getDescriptionEn() {
        return descriptionEn;
    }
    public String getType() {
        return this.type;
    }

    public String getCategorie() {
        return this.categorie;
    }

    public String getWebsite() {
        return this.website;
    }

    public String getStreaminglink() {
        return this.streaminglink;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public String getAdresseFr() {
        return adresseFr;
    }

    public void setAdresseFr(String adresseFr) {
        this.adresseFr = adresseFr;
    }

    public String getAdresseEn() {
        return adresseEn;
    }

    public void setAdresseEn(String adresseEn) {
        this.adresseEn = adresseEn;
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

    public String getSatellite() {
        return this.satellite;
    }

    public String getFrequency() {
        return this.frequency;
    }

    public String getPolarization() {
        return this.polarization;
    }

    public String getSymbolrate() {
        return this.symbolrate;
    }

    public String getFec() {
        return this.fec;
    }

    public String getTransmission() {
        return this.transmission;
    }

    public String getModulation() {
        return this.modulation;
    }

    public Long getComplexe() {
        return this.complexe;
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

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
    public void setDescription(final String description) {
        this.description = description;
    }
    public void setDescriptionFr(String descriptionFr) {
        this.descriptionFr = descriptionFr;
    }
    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }
    public void setType(final String type) {
        this.type = type;
    }

    public void setCategorie(final String categorie) {
        this.categorie = categorie;
    }

    public void setWebsite(final String website) {
        this.website = website;
    }

    public void setStreaminglink(final String streaminglink) {
        this.streaminglink = streaminglink;
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

    public void setSatellite(final String satellite) {
        this.satellite = satellite;
    }

    public void setFrequency(final String frequency) {
        this.frequency = frequency;
    }

    public void setPolarization(final String polarization) {
        this.polarization = polarization;
    }

    public void setSymbolrate(final String symbolrate) {
        this.symbolrate = symbolrate;
    }

    public void setFec(final String fec) {
        this.fec = fec;
    }

    public void setTransmission(final String transmission) {
        this.transmission = transmission;
    }

    public void setModulation(final String modulation) {
        this.modulation = modulation;
    }

    public void setComplexe(final Long complexe) {
        this.complexe = complexe;
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
        } else if (!(o instanceof RadioDTO)) {
            return false;
        } else {
            RadioDTO other = (RadioDTO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label251: {
                    Object this$complexe = this.getComplexe();
                    Object other$complexe = other.getComplexe();
                    if (this$complexe == null) {
                        if (other$complexe == null) {
                            break label251;
                        }
                    } else if (this$complexe.equals(other$complexe)) {
                        break label251;
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
            
                Object this$nameFr = this.getNameFr(); // Ajout pour nameFr
                Object other$nameFr = other.getNameFr(); // Ajout pour nameFr
                if (this$nameFr == null) {
                    if (other$nameFr != null) {
                        return false;
                    }
                } else if (!this$nameFr.equals(other$nameFr)) {
                    return false;
                }
            
                Object this$nameEn = this.getNameEn(); // Ajout pour nameEn
                Object other$nameEn = other.getNameEn(); // Ajout pour nameEn
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
            
                Object this$descriptionFr = this.getDescriptionFr(); // Ajout pour descriptionFr
                Object other$descriptionFr = other.getDescriptionFr(); // Ajout pour descriptionFr
                if (this$descriptionFr == null) {
                    if (other$descriptionFr != null) {
                        return false;
                    }
                } else if (!this$descriptionFr.equals(other$descriptionFr)) {
                    return false;
                }
            
                Object this$descriptionEn = this.getDescriptionEn(); // Ajout pour descriptionEn
                Object other$descriptionEn = other.getDescriptionEn(); // Ajout pour descriptionEn
                if (this$descriptionEn == null) {
                    if (other$descriptionEn != null) {
                        return false;
                    }
                } else if (!this$descriptionEn.equals(other$descriptionEn)) {
                    return false;
                }

                label230: {
                    Object this$type = this.getType();
                    Object other$type = other.getType();
                    if (this$type == null) {
                        if (other$type == null) {
                            break label230;
                        }
                    } else if (this$type.equals(other$type)) {
                        break label230;
                    }

                    return false;
                }

                label223: {
                    Object this$categorie = this.getCategorie();
                    Object other$categorie = other.getCategorie();
                    if (this$categorie == null) {
                        if (other$categorie == null) {
                            break label223;
                        }
                    } else if (this$categorie.equals(other$categorie)) {
                        break label223;
                    }

                    return false;
                }

                label216: {
                    Object this$website = this.getWebsite();
                    Object other$website = other.getWebsite();
                    if (this$website == null) {
                        if (other$website == null) {
                            break label216;
                        }
                    } else if (this$website.equals(other$website)) {
                        break label216;
                    }

                    return false;
                }

                Object this$streaminglink = this.getStreaminglink();
                Object other$streaminglink = other.getStreaminglink();
                if (this$streaminglink == null) {
                    if (other$streaminglink != null) {
                        return false;
                    }
                } else if (!this$streaminglink.equals(other$streaminglink)) {
                    return false;
                }

                label202: {
                    Object this$adresse = this.getAdresse();
                    Object other$adresse = other.getAdresse();
                    if (this$adresse == null) {
                        if (other$adresse == null) {
                            break label202;
                        }
                    } else if (this$adresse.equals(other$adresse)) {
                        break label202;
                    }

                    return false;
                }


                 // Vérification pour 'adresseFr'
                 label203: {
                    Object this$adresseFr = this.getAdresseFr();
                    Object other$adresseFr = other.getAdresseFr();
                    if (this$adresseFr == null) {
                        if (other$adresseFr == null) {
                            break label203;
                        }
                    } else if (this$adresseFr.equals(other$adresseFr)) {
                        break label203;
                    }
                    return false;
                }

                // Vérification pour 'adresseEn'
                label204: {
                    Object this$adresseEn = this.getAdresseEn();
                    Object other$adresseEn = other.getAdresseEn();
                    if (this$adresseEn == null) {
                        if (other$adresseEn == null) {
                            break label204;
                        }
                    } else if (this$adresseEn.equals(other$adresseEn)) {
                        break label204;
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

                label188: {
                    Object this$fax = this.getFax();
                    Object other$fax = other.getFax();
                    if (this$fax == null) {
                        if (other$fax == null) {
                            break label188;
                        }
                    } else if (this$fax.equals(other$fax)) {
                        break label188;
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

                Object this$satellite = this.getSatellite();
                Object other$satellite = other.getSatellite();
                if (this$satellite == null) {
                    if (other$satellite != null) {
                        return false;
                    }
                } else if (!this$satellite.equals(other$satellite)) {
                    return false;
                }

                label167: {
                    Object this$frequency = this.getFrequency();
                    Object other$frequency = other.getFrequency();
                    if (this$frequency == null) {
                        if (other$frequency == null) {
                            break label167;
                        }
                    } else if (this$frequency.equals(other$frequency)) {
                        break label167;
                    }

                    return false;
                }

                label160: {
                    Object this$polarization = this.getPolarization();
                    Object other$polarization = other.getPolarization();
                    if (this$polarization == null) {
                        if (other$polarization == null) {
                            break label160;
                        }
                    } else if (this$polarization.equals(other$polarization)) {
                        break label160;
                    }

                    return false;
                }

                Object this$symbolrate = this.getSymbolrate();
                Object other$symbolrate = other.getSymbolrate();
                if (this$symbolrate == null) {
                    if (other$symbolrate != null) {
                        return false;
                    }
                } else if (!this$symbolrate.equals(other$symbolrate)) {
                    return false;
                }

                Object this$fec = this.getFec();
                Object other$fec = other.getFec();
                if (this$fec == null) {
                    if (other$fec != null) {
                        return false;
                    }
                } else if (!this$fec.equals(other$fec)) {
                    return false;
                }

                label139: {
                    Object this$transmission = this.getTransmission();
                    Object other$transmission = other.getTransmission();
                    if (this$transmission == null) {
                        if (other$transmission == null) {
                            break label139;
                        }
                    } else if (this$transmission.equals(other$transmission)) {
                        break label139;
                    }

                    return false;
                }

                Object this$modulation = this.getModulation();
                Object other$modulation = other.getModulation();
                if (this$modulation == null) {
                    if (other$modulation != null) {
                        return false;
                    }
                } else if (!this$modulation.equals(other$modulation)) {
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
        return other instanceof RadioDTO;
    }


    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
    
        Object $complexe = this.getComplexe();
        result = result * 59 + ($complexe == null ? 43 : $complexe.hashCode());
        
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        
        Object $nameFr = this.getNameFr(); // Ajout pour nameFr
        result = result * 59 + ($nameFr == null ? 43 : $nameFr.hashCode()); // Ajout pour nameFr
        
        Object $nameEn = this.getNameEn(); // Ajout pour nameEn
        result = result * 59 + ($nameEn == null ? 43 : $nameEn.hashCode()); // Ajout pour nameEn
        
        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        
        Object $descriptionFr = this.getDescriptionFr(); // Ajout pour descriptionFr
        result = result * 59 + ($descriptionFr == null ? 43 : $descriptionFr.hashCode()); // Ajout pour descriptionFr
        
        Object $descriptionEn = this.getDescriptionEn(); // Ajout pour descriptionEn
        result = result * 59 + ($descriptionEn == null ? 43 : $descriptionEn.hashCode()); // Ajout pour descriptionEn
        
        Object $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        
        Object $categorie = this.getCategorie();
        result = result * 59 + ($categorie == null ? 43 : $categorie.hashCode());
        
        Object $website = this.getWebsite();
        result = result * 59 + ($website == null ? 43 : $website.hashCode());
        
        Object $streaminglink = this.getStreaminglink();
        result = result * 59 + ($streaminglink == null ? 43 : $streaminglink.hashCode());
        
        Object $adresse = this.getAdresse();
        result = result * 59 + ($adresse == null ? 43 : $adresse.hashCode());
        
        // Ajout de adresseFr
        Object $adresseFr = this.getAdresseFr();
        result = result * 59 + ($adresseFr == null ? 43 : $adresseFr.hashCode());

        // Ajout de adresseEn
        Object $adresseEn = this.getAdresseEn();
        result = result * 59 + ($adresseEn == null ? 43 : $adresseEn.hashCode());

        Object $phone = this.getPhone();
        result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
        
        Object $fax = this.getFax();
        result = result * 59 + ($fax == null ? 43 : $fax.hashCode());
        
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        
        Object $satellite = this.getSatellite();
        result = result * 59 + ($satellite == null ? 43 : $satellite.hashCode());
        
        Object $frequency = this.getFrequency();
        result = result * 59 + ($frequency == null ? 43 : $frequency.hashCode());
        
        Object $polarization = this.getPolarization();
        result = result * 59 + ($polarization == null ? 43 : $polarization.hashCode());
        
        Object $symbolrate = this.getSymbolrate();
        result = result * 59 + ($symbolrate == null ? 43 : $symbolrate.hashCode());
        
        Object $fec = this.getFec();
        result = result * 59 + ($fec == null ? 43 : $fec.hashCode());
        
        Object $transmission = this.getTransmission();
        result = result * 59 + ($transmission == null ? 43 : $transmission.hashCode());
        
        Object $modulation = this.getModulation();
        result = result * 59 + ($modulation == null ? 43 : $modulation.hashCode());
        
        Object $localisation = this.getLocalisation();
        result = result * 59 + ($localisation == null ? 43 : $localisation.hashCode());
        
        Object $profilFiles = this.getProfilFiles();
        result = result * 59 + ($profilFiles == null ? 43 : $profilFiles.hashCode());
        
        return result;
    }
    

    public String toString() {
        return "RadioDTO(name=" + this.getName() +
                ", nameFr=" + this.getNameFr() + // Ajout de nameFr
                ", nameEn=" + this.getNameEn() + // Ajout de nameEn
                ", description=" + this.getDescription() +
                ", descriptionFr=" + this.getDescriptionFr() + // Ajout de descriptionFr
                ", descriptionEn=" + this.getDescriptionEn() + // Ajout de descriptionEn
                ", type=" + this.getType() +
                ", categorie=" + this.getCategorie() +
                ", website=" + this.getWebsite() +
                ", streaminglink=" + this.getStreaminglink() +
                ", adresse=" + this.getAdresse() +
                ", adresseFr=" + this.getAdresseFr() + // Ajout de adresseFr
                ", adresseEn=" + this.getAdresseEn() + // Ajout de adresseEn
                ", phone=" + this.getPhone() +
                ", fax=" + this.getFax() +
                ", email=" + this.getEmail() +
                ", satellite=" + this.getSatellite() +
                ", frequency=" + this.getFrequency() +
                ", polarization=" + this.getPolarization() +
                ", symbolrate=" + this.getSymbolrate() +
                ", fec=" + this.getFec() +
                ", transmission=" + this.getTransmission() +
                ", modulation=" + this.getModulation() +
                ", complexe=" + this.getComplexe() +
                ", localisation=" + this.getLocalisation() +
                ", profilFiles=" + String.valueOf(this.getProfilFiles()) + ")";
    }


    public static class RadioDTOBuilder {
    }
}
