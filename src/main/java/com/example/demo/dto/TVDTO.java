package com.example.demo.dto;


import com.example.demo.entities.Caracteristique;
import com.example.demo.entities.TV;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class TVDTO {
    private String name;
    private String nameFr;            // Ajout de nameFr
    private String nameEn;            // Ajout de nameEn
    private String description;
    private String descriptionFr;     // Ajout de descriptionFr
    private String descriptionEn;     // Ajout de descriptionEn
    private String adresseFr; // Ajout de adresseFr
    private String adresseEn;
    private String type;
    private String website;
    private String streaminglink;
    private String satellite;
    private String frequency;
    private String polarization;
    private String symbolrate;
    private String fec;
    private String transmission;
    private String modulation;
    private Long categorieChaines;
    private Long complexe;
    private String adresse;
    private String phone;
    private String fax;
    private String email;
    private String localisation;
    private List<MultipartFile> profilFiles;

    public TV toETV() {
        TV tv = new TV();
        tv.setName(this.getName());
        tv.setNameFr(this.getNameFr());                   // Ajout de nameFr
        tv.setNameEn(this.getNameEn());                   // Ajout de nameEn
        tv.setDescription(this.getDescription());
        tv.setDescriptionFr(this.getDescriptionFr());     // Ajout de descriptionFr
        tv.setDescriptionEn(this.getDescriptionEn());    
        tv.setAdresseFr(this.getAdresseFr()); // Assigner adresseFr
        tv.setAdresseEn(this.getAdresseEn());
        tv.setType(this.getType());
        tv.setWebsite(this.getWebsite());
        tv.setStreaminglink(this.getStreaminglink());
        tv.setAdresse(this.getAdresse());
        tv.setPhone(this.getPhone());
        tv.setFax(this.getFax());
        tv.setEmail(this.getEmail());
        tv.setLocalisation(this.getLocalisation());
        return tv;
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

    public static com.example.demo.dto.TVDTO.TVDTOBuilder builder() {
        return new com.example.demo.dto.TVDTO.TVDTOBuilder();
    }

    public TVDTO(final String name, final String nameFr, final String nameEn, // Ajout des nouveaux paramètres
            final String description, final String descriptionFr, final String descriptionEn,
            final String type, final String website, final String streaminglink,
            final String satellite, final String frequency, final String polarization,
            final String symbolrate, final String fec, final String transmission,
            final String modulation, final Long categorieChaines, final Long complexe,
            final String adresse,final String adresseFr,
            final String adresseEn, final String phone, final String fax,
            final String email, final String localisation,
            final List<MultipartFile> profilFiles) {
        this.name = name;
        this.nameFr = nameFr; // Assignation de nameFr
        this.nameEn = nameEn; // Assignation de nameEn
        this.description = description;
        this.descriptionFr = descriptionFr; // Assignation de descriptionFr
        this.descriptionEn = descriptionEn; // Assignation de descriptionEn
        this.type = type;
        this.website = website;
        this.streaminglink = streaminglink;
        this.satellite = satellite;
        this.frequency = frequency;
        this.polarization = polarization;
        this.symbolrate = symbolrate;
        this.fec = fec;
        this.transmission = transmission;
        this.modulation = modulation;
        this.categorieChaines = categorieChaines;
        this.complexe = complexe;
        this.adresse = adresse;
        this.adresseFr = adresseFr; // Initialiser adresseFr
        this.adresseEn = adresseEn;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.localisation = localisation;
        this.profilFiles = profilFiles;
    }

    public TVDTO() {
    }

    public String getName() {
        return this.name;
    }

    public String getNameFr() {
        return nameFr;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    public String getNameEn() {
        return nameEn;
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

    public String getDescription() {
        return this.description;
    }

    
    public String getType() {
        return this.type;
    }

    public String getWebsite() {
        return this.website;
    }

    public String getStreaminglink() {
        return this.streaminglink;
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

    public Long getCategorieChaines() {
        return this.categorieChaines;
    }

    public Long getComplexe() {
        return this.complexe;
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

    public void setStreaminglink(final String streaminglink) {
        this.streaminglink = streaminglink;
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

    public void setCategorieChaines(final Long categorieChaines) {
        this.categorieChaines = categorieChaines;
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

    public void setLocalisation(final String localisation) {
        this.localisation = localisation;
    }

    public void setProfilFiles(final List<MultipartFile> profilFiles) {
        this.profilFiles = profilFiles;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof TVDTO)) {
            return false;
        } else {
            TVDTO other = (TVDTO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label251: {
                    Object this$categorieChaines = this.getCategorieChaines();
                    Object other$categorieChaines = other.getCategorieChaines();
                    if (this$categorieChaines == null) {
                        if (other$categorieChaines == null) {
                            break label251;
                        }
                    } else if (this$categorieChaines.equals(other$categorieChaines)) {
                        break label251;
                    }

                    return false;
                }

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

                // Comparaison pour nameFr
                Object this$nameFr = this.getNameFr(); // Ajoutez la méthode pour récupérer nameFr
                Object other$nameFr = other.getNameFr(); // Idem pour l'autre objet
                if (this$nameFr == null) {
                    if (other$nameFr != null) {
                        return false;
                    }
                } else if (!this$nameFr.equals(other$nameFr)) {
                    return false;
                }

                // Comparaison pour nameEn
                Object this$nameEn = this.getNameEn(); // Ajoutez la méthode pour récupérer nameEn
                Object other$nameEn = other.getNameEn(); // Idem pour l'autre objet
                if (this$nameEn == null) {
                    if (other$nameEn != null) {
                        return false;
                    }
                } else if (!this$nameEn.equals(other$nameEn)) {
                    return false;
                }

                label230: {
                    Object this$description = this.getDescription();
                    Object other$description = other.getDescription();
                    if (this$description == null) {
                        if (other$description == null) {
                            break label230;
                        }
                    } else if (this$description.equals(other$description)) {
                        break label230;
                    }

                    return false;
                }

                label223: {
                    Object this$type = this.getType();
                    Object other$type = other.getType();
                    if (this$type == null) {
                        if (other$type == null) {
                            break label223;
                        }
                    } else if (this$type.equals(other$type)) {
                        break label223;
                    }

                    return false;
                }

                // Comparaison pour descriptionFr
                label231: {
                    Object this$descriptionFr = this.getDescriptionFr(); // Ajoutez la méthode pour récupérer
                                                                         // descriptionFr
                    Object other$descriptionFr = other.getDescriptionFr(); // Idem pour l'autre objet
                    if (this$descriptionFr == null) {
                        if (other$descriptionFr != null) {
                            return false;
                        }
                    } else if (this$descriptionFr.equals(other$descriptionFr)) {
                        break label231; // Passer à la prochaine vérification
                    }

                    return false; // Si les descriptions ne correspondent pas
                }

                // Comparaison pour descriptionEn
                label232: {
                    Object this$descriptionEn = this.getDescriptionEn(); // Ajoutez la méthode pour récupérer
                                                                         // descriptionEn
                    Object other$descriptionEn = other.getDescriptionEn(); // Idem pour l'autre objet
                    if (this$descriptionEn == null) {
                        if (other$descriptionEn != null) {
                            return false;
                        }
                    } else if (this$descriptionEn.equals(other$descriptionEn)) {
                        break label232; // Passer à la prochaine vérification
                    }

                    return false; // Si les descriptions ne correspondent pas
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
                    Object this$satellite = this.getSatellite();
                    Object other$satellite = other.getSatellite();
                    if (this$satellite == null) {
                        if (other$satellite == null) {
                            break label202;
                        }
                    } else if (this$satellite.equals(other$satellite)) {
                        break label202;
                    }

                    return false;
                }

                Object this$frequency = this.getFrequency();
                Object other$frequency = other.getFrequency();
                if (this$frequency == null) {
                    if (other$frequency != null) {
                        return false;
                    }
                } else if (!this$frequency.equals(other$frequency)) {
                    return false;
                }

                label188: {
                    Object this$polarization = this.getPolarization();
                    Object other$polarization = other.getPolarization();
                    if (this$polarization == null) {
                        if (other$polarization == null) {
                            break label188;
                        }
                    } else if (this$polarization.equals(other$polarization)) {
                        break label188;
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

                label167: {
                    Object this$transmission = this.getTransmission();
                    Object other$transmission = other.getTransmission();
                    if (this$transmission == null) {
                        if (other$transmission == null) {
                            break label167;
                        }
                    } else if (this$transmission.equals(other$transmission)) {
                        break label167;
                    }

                    return false;
                }

                label160: {
                    Object this$modulation = this.getModulation();
                    Object other$modulation = other.getModulation();
                    if (this$modulation == null) {
                        if (other$modulation == null) {
                            break label160;
                        }
                    } else if (this$modulation.equals(other$modulation)) {
                        break label160;
                    }

                    return false;
                }

                Object this$adresse = this.getAdresse();
                Object other$adresse = other.getAdresse();
                if (this$adresse == null) {
                    if (other$adresse != null) {
                        return false;
                    }
                } else if (!this$adresse.equals(other$adresse)) {
                    return false;
                }

                Object this$adresseFr = this.getAdresseFr();
                Object other$adresseFr = other.getAdresseFr();
                if (this$adresseFr == null) {
                    if (other$adresseFr != null) {
                        return false;
                    }
                } else if (!this$adresseFr.equals(other$adresseFr)) {
                    return false;
                }

                Object this$adresseEn = this.getAdresseEn();
                Object other$adresseEn = other.getAdresseEn();
                if (this$adresseEn == null) {
                    if (other$adresseEn != null) {
                        return false;
                    }
                } else if (!this$adresseEn.equals(other$adresseEn)) {
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

                label139: {
                    Object this$fax = this.getFax();
                    Object other$fax = other.getFax();
                    if (this$fax == null) {
                        if (other$fax == null) {
                            break label139;
                        }
                    } else if (this$fax.equals(other$fax)) {
                        break label139;
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
        return other instanceof TVDTO;
    }

  
    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
    
        // Ajout des attributs existants
        Object $categorieChaines = this.getCategorieChaines();
        result = result * 59 + ($categorieChaines == null ? 43 : $categorieChaines.hashCode());
        
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
        
        Object $streaminglink = this.getStreaminglink();
        result = result * 59 + ($streaminglink == null ? 43 : $streaminglink.hashCode());
        
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
        
        Object $localisation = this.getLocalisation();
        result = result * 59 + ($localisation == null ? 43 : $localisation.hashCode());
        
        Object $profilFiles = this.getProfilFiles();
        result = result * 59 + ($profilFiles == null ? 43 : $profilFiles.hashCode());
        
        // Ajout des nouveaux attributs
        Object $nameFr = this.getNameFr(); // Assurez-vous d'avoir cette méthode
        result = result * 59 + ($nameFr == null ? 43 : $nameFr.hashCode());
        
        Object $nameEn = this.getNameEn(); // Assurez-vous d'avoir cette méthode
        result = result * 59 + ($nameEn == null ? 43 : $nameEn.hashCode());
        
        Object $descriptionFr = this.getDescriptionFr(); // Assurez-vous d'avoir cette méthode
        result = result * 59 + ($descriptionFr == null ? 43 : $descriptionFr.hashCode());
        
        Object $descriptionEn = this.getDescriptionEn(); // Assurez-vous d'avoir cette méthode
        result = result * 59 + ($descriptionEn == null ? 43 : $descriptionEn.hashCode());
        
        return result;
    }
    

    public String toString() {
        String var10000 = this.getName();
        return "TVDTO(name=" + var10000 + 
               ", nameFr=" + this.getNameFr() +   // Ajout de nameFr
               ", nameEn=" + this.getNameEn() +   // Ajout de nameEn
               ", description=" + this.getDescription() + 
               ", descriptionFr=" + this.getDescriptionFr() + // Ajout de descriptionFr
               ", descriptionEn=" + this.getDescriptionEn() + // Ajout de descriptionEn
               ", type=" + this.getType() + 
               ", website=" + this.getWebsite() + 
               ", streaminglink=" + this.getStreaminglink() + 
               ", satellite=" + this.getSatellite() + 
               ", frequency=" + this.getFrequency() + 
               ", polarization=" + this.getPolarization() + 
               ", symbolrate=" + this.getSymbolrate() + 
               ", fec=" + this.getFec() + 
               ", transmission=" + this.getTransmission() + 
               ", modulation=" + this.getModulation() + 
               ", categorieChaines=" + this.getCategorieChaines() + 
               ", complexe=" + this.getComplexe() + 
               ", adresse=" + this.getAdresse() + 
               ", adresseFr=" + this.getAdresseFr() + // Ajout de adresseFr
                ", adresseEn=" + this.getAdresseEn() +
               ", phone=" + this.getPhone() + 
               ", fax=" + this.getFax() + 
               ", email=" + this.getEmail() + 
               ", localisation=" + this.getLocalisation() + 
               ", profilFiles=" + String.valueOf(this.getProfilFiles()) + 
               ")";
    }
    

    public static class TVDTOBuilder {
    }
}
