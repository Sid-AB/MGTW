package com.example.demo.entities;

//

// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

// Importation des bibliothèques nécessaires pour la gestion de l'entité et des annotations JPA
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.demo.entities.Etablissement.EtablissementBuilder;

// Annotation pour indiquer que cette classe est une entité JPA
@Entity
@Table(name = "etablissement" // Nom de la table dans la base de données
)
public class Etablissement {
    @Id // Indique que ce champ est la clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY // La stratégie de génération de valeur de la clé primaire
    )
    private Long id; // Identifiant unique de l'établissement
    private String name; // Nom de l'établissement

    @Column(name = "description", // Nom de la colonne dans la base de données
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String description; // Description de l'établissement

    @Column(name = "name_fr") // Nom de la colonne dans la base de données
    private String nameFr; // Nom de l'établissement en français

    @Column(name = "name_en") // Nom de la colonne pour l'anglais
    private String nameEn; // Nom de l'établissement en anglais

    @Column(name = "description_fr", // Nom de la colonne dans la base de données
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String descriptionFr; // Description de l'établissement en fr

    @Column(name = "description_en", // Nom de la colonne dans la base de données
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String descriptionEn; // Description de l'établissement en en

    private String type; // Type de l'établissement
    private String phone; // Numéro de téléphone de l'établissement
    private String fax; // Numéro de fax de l'établissement
    private String email; // Adresse e-mail de l'établissement
    private String site; // Site web de l'établissement

    // Localisation en arabe (ou langue par défaut)
    @Column(name = "localisation", // Nom de la colonne pour la localisation
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String localisation; // Localisation de l'établissement

    // Localisation en français
    @Column(name = "localisation_fr", // Nom de la colonne pour la localisation en français
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String localisationFr; // Localisation de l'établissement en français

    // Localisation en anglais
    @Column(name = "localisation_en", // Nom de la colonne pour la localisation en anglais
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String localisationEn; // Localisation de l'établissement en anglais

    // Adresse en arabe (ou langue par défaut)
    @Column(name = "adresse", // Nom de la colonne pour l'adresse
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String adresse; // Adresse de l'établissement

    // Adresse en français
    @Column(name = "adresse_fr", // Nom de la colonne pour l'adresse en français
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String adresseFr; // Adresse de l'établissement en français

    // Adresse en anglais
    @Column(name = "adresse_en", // Nom de la colonne pour l'adresse en anglais
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String adresseEn; // Adresse de l'établissement en anglais

    @OneToOne(cascade = { CascadeType.ALL }, // Cascade toutes les opérations (ajout, mise à jour, suppression)
            fetch = FetchType.EAGER // Récupère le complexe associé de manière immédiate
    )
    @JoinColumn(name = "complexe_id", // Nom de la colonne de jointure
            referencedColumnName = "id" // Colonne référencée dans la table complexe
    )
    private Complexe complexe; // Complexe associé à l'établissement
    @OneToMany(mappedBy = "etablissement", // Propriété de l'autre entité qui est mappée
            cascade = { CascadeType.ALL } // Cascade toutes les opérations
    )
    private List<Multimedia> multimediaList = new ArrayList(); // Liste des multimédias associés à l'établissement
    @CreationTimestamp // Annotation pour indiquer que ce champ sera rempli automatiquement avec la
                       // date de création
    @Column(name = "created_at" // Nom de la colonne pour la date de création
    )
    private LocalDateTime createdAt; // Date de création de l'établissement
    @UpdateTimestamp // Annotation pour indiquer que ce champ sera mis à jour automatiquement à
                     // chaque modification
    @Column(name = "updated_at" // Nom de la colonne pour la date de mise à jour
    )
    private LocalDateTime updatedAt; // Date de mise à jour de l'établissement

    // Méthode statique pour créer un constructeur de builder
    public static Etablissement.EtablissementBuilder builder() {
        return new Etablissement.EtablissementBuilder();
    }

    // Méthodes d'accès (getters)
    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    // Getter pour nameFr et en
    public String getNameFr() {
        return this.nameFr;
    }

    // Getter pour nameEn
    public String getNameEn() {
        return this.nameEn;
    }

    // Getter pour descriptionFr
    public String getDescriptionFr() {
        return this.descriptionFr;
    }

    // Getter pour descriptionEn
    public String getDescriptionEn() {
        return this.descriptionEn;
    }

    public String getType() {
        return this.type;
    }

    public String getAdresse() {
        return this.adresse;
    }

    // Getter et Setter pour adresseFr
    public String getAdresseFr() {
        return adresseFr;
    }

    public void setAdresseFr(String adresseFr) {
        this.adresseFr = adresseFr;
    }

    // Getter et Setter pour adresseEn
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

    public String getSite() {
        return this.site;
    }

    public String getLocalisation() {
        return this.localisation;
    }

    // Getter et Setter pour localisationFr
    public String getLocalisationFr() {
        return localisationFr;
    }

    public void setLocalisationFr(String localisationFr) {
        this.localisationFr = localisationFr;
    }

    // Getter et Setter pour localisationEn
    public String getLocalisationEn() {
        return localisationEn;
    }

    public void setLocalisationEn(String localisationEn) {
        this.localisationEn = localisationEn;
    }

    public Complexe getComplexe() {
        return this.complexe;
    }

    public List<Multimedia> getMultimediaList() {
        return this.multimediaList;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    // Méthodes de modification (setters)
    public void setId(final Long id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    // Setter pour nameFr
    public void setNameFr(final String nameFr) {
        this.nameFr = nameFr;
    }

    // Setter pour nameEn
    public void setNameEn(final String nameEn) {
        this.nameEn = nameEn;
    }

    // Setter pour descriptionFr
    public void setDescriptionFr(final String descriptionFr) {
        this.descriptionFr = descriptionFr;
    }

    // Setter pour descriptionEn
    public void setDescriptionEn(final String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public void setType(final String type) {
        this.type = type;
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

    public void setComplexe(final Complexe complexe) {
        this.complexe = complexe;
    }

    public void setMultimediaList(final List<Multimedia> multimediaList) {
        this.multimediaList = multimediaList;
    }

    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(final LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    // Méthode pour comparer deux objets Etablissement
    public boolean equals(final Object o) {
        if (o == this) {
            return true; // Vérifie si c'est le même objet
        } else if (!(o instanceof Etablissement)) {
            return false; // Vérifie si l'objet est une instance de Etablissement
        } else {
            Etablissement other = (Etablissement) o; // Cast de l'objet
            if (!other.canEqual(this)) {
                return false; // Vérifie si l'objet peut être égal
            } else {
                Object this$id = this.getId();
                Object other$id = other.getId();
                // Vérification des égalités pour chaque attribut
                if (this$id == null) {
                    if (other$id != null) {
                        return false;
                    }
                } else if (!this$id.equals(other$id)) {
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

                // Vérification pour nameFr
                Object this$nameFr = this.getNameFr();
                Object other$nameFr = other.getNameFr();
                if (this$nameFr == null) {
                    if (other$nameFr != null) {
                        return false; // Un est nul, l'autre non
                    }
                } else if (!this$nameFr.equals(other$nameFr)) {
                    return false; // Noms en français différents
                }

                // Vérification pour nameEn
                Object this$nameEn = this.getNameEn();
                Object other$nameEn = other.getNameEn();
                if (this$nameEn == null) {
                    if (other$nameEn != null) {
                        return false; // Un est nul, l'autre non
                    }
                } else if (!this$nameEn.equals(other$nameEn)) {
                    return false; // Noms en anglais différents
                }

                // Vérification pour descriptionFr
                Object this$descriptionFr = this.getDescriptionFr();
                Object other$descriptionFr = other.getDescriptionFr();
                if (this$descriptionFr == null) {
                    if (other$descriptionFr != null) {
                        return false; // Un est nul, l'autre non
                    }
                } else if (!this$descriptionFr.equals(other$descriptionFr)) {
                    return false; // Descriptions en arabe différentes
                }

                // Vérification pour descriptionEn
                Object this$descriptionEn = this.getDescriptionEn();
                Object other$descriptionEn = other.getDescriptionEn();
                if (this$descriptionEn == null) {
                    if (other$descriptionEn != null) {
                        return false; // Un est nul, l'autre non
                    }
                } else if (!this$descriptionEn.equals(other$descriptionEn)) {
                    return false; // Descriptions en arabe différentes
                }

                label158: {
                    Object this$type = this.getType();
                    Object other$type = other.getType();
                    if (this$type == null) {
                        if (other$type == null) {
                            break label158; // Les deux sont nuls, donc égaux
                        }
                    } else if (this$type.equals(other$type)) {
                        break label158; // Les deux sont égaux
                    }

                    return false; // Types différents
                }

                // Vérification pour 'adresse'
                label151: {
                    Object this$adresse = this.getAdresse();
                    Object other$adresse = other.getAdresse();
                    if (this$adresse == null) {
                        if (other$adresse == null) {
                            break label151; // Les deux adresses sont nulles
                        }
                    } else if (this$adresse.equals(other$adresse)) {
                        break label151; // Les deux adresses sont égales
                    }
                    return false; // Adresses différentes
                }

                // Vérification pour 'adresseFr'
                label152: {
                    Object this$adresseFr = this.getAdresseFr();
                    Object other$adresseFr = other.getAdresseFr();
                    if (this$adresseFr == null) {
                        if (other$adresseFr == null) {
                            break label152; // Les deux adressesFr sont nulles
                        }
                    } else if (this$adresseFr.equals(other$adresseFr)) {
                        break label152; // Les deux adressesFr sont égales
                    }
                    return false; // AdressesFr différentes
                }

                // Vérification pour 'adresseEn'
                label153: {
                    Object this$adresseEn = this.getAdresseEn();
                    Object other$adresseEn = other.getAdresseEn();
                    if (this$adresseEn == null) {
                        if (other$adresseEn == null) {
                            break label153; // Les deux adressesEn sont nulles
                        }
                    } else if (this$adresseEn.equals(other$adresseEn)) {
                        break label153; // Les deux adressesEn sont égales
                    }
                    return false; // AdressesEn différentes
                }

                Object this$phone = this.getPhone();
                Object other$phone = other.getPhone();
                if (this$phone == null) {
                    if (other$phone != null) {
                        return false; // Un est nul, l'autre non
                    }
                } else if (!this$phone.equals(other$phone)) {
                    return false; // Numéros de téléphone différents
                }

                label137: {
                    Object this$fax = this.getFax();
                    Object other$fax = other.getFax();
                    if (this$fax == null) {
                        if (other$fax == null) {
                            break label137; // Les deux fax sont nuls
                        }
                    } else if (this$fax.equals(other$fax)) {
                        break label137; // Les deux fax sont égaux
                    }

                    return false; // Fax différents
                }

                label130: {
                    Object this$email = this.getEmail();
                    Object other$email = other.getEmail();
                    if (this$email == null) {
                        if (other$email == null) {
                            break label130; // Les deux e-mails sont nuls
                        }
                    } else if (this$email.equals(other$email)) {
                        break label130; // Les deux e-mails sont egaux
                    }

                    return false; // E-mails différents
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

                Object this$localisation = this.getLocalisation();
                Object other$localisation = other.getLocalisation();
                if (this$localisation == null) {
                    if (other$localisation != null) {
                        return false;
                    }
                } else if (!this$localisation.equals(other$localisation)) {
                    return false;
                }

                // Vérification pour 'localisationFr'

                Object this$localisationFr = this.getLocalisationFr();
                Object other$localisationFr = other.getLocalisationFr();
                if (this$localisationFr == null) {
                    if (other$localisationFr != null) {
                        return false; // Une localisationFr est nulle, l'autre ne l'est pas
                    }
                } else if (!this$localisationFr.equals(other$localisationFr)) {
                    return false; // Les localisationFr sont différentes
                }

                // Vérification pour 'localisationEn'

                Object this$localisationEn = this.getLocalisationEn();
                Object other$localisationEn = other.getLocalisationEn();
                if (this$localisationEn == null) {
                    if (other$localisationEn != null) {
                        return false; // Une localisationEn est nulle, l'autre ne l'est pas
                    }
                } else if (!this$localisationEn.equals(other$localisationEn)) {
                    return false; // Les localisationEn sont différentes
                }

                label109: {
                    Object this$complexe = this.getComplexe();
                    Object other$complexe = other.getComplexe();
                    if (this$complexe == null) {
                        if (other$complexe == null) {
                            break label109;
                        }
                    } else if (this$complexe.equals(other$complexe)) {
                        break label109;
                    }

                    return false;
                }

                label102: {
                    Object this$multimediaList = this.getMultimediaList();
                    Object other$multimediaList = other.getMultimediaList();
                    if (this$multimediaList == null) {
                        if (other$multimediaList == null) {
                            break label102;
                        }
                    } else if (this$multimediaList.equals(other$multimediaList)) {
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
                    return false; // Dates de mise à jour différentes
                }

                return true;// Tous les attributs sont égaux
            }
        }
    }

    // Méthode pour vérifier si l'objet peut être égal à un autre
    protected boolean canEqual(final Object other) {
        return other instanceof Etablissement; // Vérifie si l'autre est une instance de Etablissement
    }

    @Override
    public int hashCode() {
        boolean PRIME = true;
        int result = 1; // Initialisation du résultat

        // Ajout de l'id
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());

        // Ajout du nom
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());

        // Ajout du nom en français
        Object $nameFr = this.getNameFr();
        result = result * 59 + ($nameFr == null ? 43 : $nameFr.hashCode());

        // Ajout du nom en anglais
        Object $nameEn = this.getNameEn();
        result = result * 59 + ($nameEn == null ? 43 : $nameEn.hashCode());

        // Ajout de la description
        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());

        // Ajout de la description en français
        Object $descriptionFr = this.getDescriptionFr();
        result = result * 59 + ($descriptionFr == null ? 43 : $descriptionFr.hashCode());

        // Ajout de la description en anglais
        Object $descriptionEn = this.getDescriptionEn();
        result = result * 59 + ($descriptionEn == null ? 43 : $descriptionEn.hashCode());

        // Ajout du type
        Object $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());

        // Ajout de l'adresse
        Object $adresse = this.getAdresse();
        result = result * 59 + ($adresse == null ? 43 : $adresse.hashCode());

        // Ajout de l'adresse en français
        Object $adresseFr = this.getAdresseFr();
        result = result * 59 + ($adresseFr == null ? 43 : $adresseFr.hashCode());

        // Ajout de l'adresse en anglais
        Object $adresseEn = this.getAdresseEn();
        result = result * 59 + ($adresseEn == null ? 43 : $adresseEn.hashCode());

        // Ajout du téléphone
        Object $phone = this.getPhone();
        result = result * 59 + ($phone == null ? 43 : $phone.hashCode());

        // Ajout du fax
        Object $fax = this.getFax();
        result = result * 59 + ($fax == null ? 43 : $fax.hashCode());

        // Ajout de l'email
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());

        // Ajout du site
        Object $site = this.getSite();
        result = result * 59 + ($site == null ? 43 : $site.hashCode());

        // Ajout de la localisation
        Object $localisation = this.getLocalisation();
        result = result * 59 + ($localisation == null ? 43 : $localisation.hashCode());

        // Ajout de la localisation en français
        Object $localisationFr = this.getLocalisationFr();
        result = result * 59 + ($localisationFr == null ? 43 : $localisationFr.hashCode());

        // Ajout de la localisation en anglais
        Object $localisationEn = this.getLocalisationEn();
        result = result * 59 + ($localisationEn == null ? 43 : $localisationEn.hashCode());

        // Ajout d'autres attributs si nécessaire...
        Object $complexe = this.getComplexe();
        result = result * 59 + ($complexe == null ? 43 : $complexe.hashCode());

        Object $multimediaList = this.getMultimediaList();
        result = result * 59 + ($multimediaList == null ? 43 : $multimediaList.hashCode());

        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());

        Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());

        return result; // Retourne le code de hachage calculé
    }

    // Méthode pour convertir l'objet en chaîne de caractères
    public String toString() {
        Long var10000 = this.getId(); // Récupération de l'id
        return "Etablissement(id=" + var10000
                + ", name=" + this.getName()
                + ", description=" + this.getDescription()
                + ", nameFr=" + this.getNameFr() // Ajout de nameFr
                + ", nameEn=" + this.getNameEn() // Ajout de nameEn
                + ", descriptionFr=" + this.getDescriptionFr() // Ajout de descriptionFr
                + ", descriptionEn=" + this.getDescriptionEn() // Ajout de descriptionEn
                + ", type=" + this.getType()
                + ", adresse=" + this.getAdresse()
                + ", adresseFr=" + this.getAdresseFr() // Ajout de adresseFr
                + ", adresseEn=" + this.getAdresseEn() // Ajout de adresseEn
                + ", phone=" + this.getPhone()
                + ", fax=" + this.getFax()
                + ", email=" + this.getEmail()
                + ", site=" + this.getSite()
                + ", localisation=" + this.getLocalisation()
                + ", localisationFr=" + this.getLocalisationFr() // Ajout de localisationFr
                + ", localisationEn=" + this.getLocalisationEn() // Ajout de localisationEn
                + ", complexe=" + String.valueOf(this.getComplexe())
                + ", multimediaList=" + String.valueOf(this.getMultimediaList())
                + ", createdAt=" + String.valueOf(this.getCreatedAt())
                + ", updatedAt=" + String.valueOf(this.getUpdatedAt())
                + ")"; // Retourne la chaîne formatée
    }

    // Constructeur
    public Etablissement(final Long id,
            final String name,
            final String description,
            final String nameFr,
            final String nameEn, // Ajout de nameEn
            final String descriptionFr,
            final String descriptionEn,
            final String type,
            final String adresse,
            final String adresseFr, // Ajout de adresseFr
            final String adresseEn, // Ajout de adresseEn
            final String phone,
            final String fax,
            final String email,
            final String site,
            final String localisation,
            final String localisationFr, // Ajout de localisationFr
            final String localisationEn, // Ajout de localisationEn
            final Complexe complexe,
            final List<Multimedia> multimediaList,
            final LocalDateTime createdAt,
            final LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.nameFr = nameFr; // Initialisation de nameFr
        this.nameEn = nameEn; // Initialisation de nameEn
        this.descriptionFr = descriptionFr; // Initialisation de descriptionFr
        this.descriptionEn = descriptionEn; // Initialisation de descriptionEn
        this.type = type;
        this.adresse = adresse;
        this.adresseFr = adresseFr; // Initialisation de adresseFr
        this.adresseEn = adresseEn; // Initialisation de adresseEn
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.site = site;
        this.localisation = localisation;
        this.localisationFr = localisationFr; // Initialisation de localisationFr
        this.localisationEn = localisationEn; // Initialisation de localisationEn
        this.complexe = complexe;
        this.multimediaList = multimediaList;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Etablissement() {
    }

    // Classe interne pour le constructeur de type builder
    public static class EtablissementBuilder {
        private Long id;
        private String name;
        private String description;
        private String nameFr; // Ajout de nameFr
        private String nameEn; // Ajout de nameEn
        private String descriptionFr; // Ajout de descriptionFr
        private String descriptionEn; // Ajout de descriptionEn
        private String type;
        private String adresse;
        private String adresseFr; // Ajout de adresseFr
        private String adresseEn; // Ajout de adresseEn
        private String phone;
        private String fax;
        private String email;
        private String site;
        private String localisation;
        private String localisationFr; // Ajout de localisationFr
        private String localisationEn; // Ajout de localisationEn
        private Complexe complexe;
        private List<Multimedia> multimediaList;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        EtablissementBuilder() {
        }

        // Méthodes pour construire l'objet Etablissement
        public Etablissement.EtablissementBuilder id(final Long id) {
            this.id = id; // Définit l'id
            return this; // Retourne l'instance de builder
        }

        public Etablissement.EtablissementBuilder name(final String name) {
            this.name = name; // Définit le nom
            return this; // Retourne l'instance de builder
        }

        public Etablissement.EtablissementBuilder description(final String description) {
            this.description = description;
            return this;
        }

        public Etablissement.EtablissementBuilder nameFr(final String nameFr) { // Ajout de la méthode pour nameFr
            this.nameFr = nameFr;
            return this; // Retourne l'instance de builder
        }

        public EtablissementBuilder nameEn(final String nameEn) {
            this.nameEn = nameEn; // Setter pour nameEn
            return this;
        }

        public Etablissement.EtablissementBuilder descriptionFr(final String descriptionFr) { // Ajout de la méthode
                                                                                              // pour descriptionFr
            this.descriptionFr = descriptionFr;
            return this; // Retourne l'instance de builder
        }

        public Etablissement.EtablissementBuilder descriptionEn(final String descriptionEn) { // Ajout de la méthode
                                                                                              // pour descriptionEn
            this.descriptionEn = descriptionEn;
            return this; // Retourne l'instance de builder
        }

        public Etablissement.EtablissementBuilder type(final String type) {
            this.type = type;
            return this;
        }

        public Etablissement.EtablissementBuilder adresse(final String adresse) {
            this.adresse = adresse;
            return this;
        }

        public EtablissementBuilder setAdresseFr(String adresseFr) {
            this.adresseFr = adresseFr;
            return this;
        }

        public EtablissementBuilder setAdresseEn(String adresseEn) {
            this.adresseEn = adresseEn;
            return this;
        }

        public Etablissement.EtablissementBuilder phone(final String phone) {
            this.phone = phone;
            return this;
        }

        public Etablissement.EtablissementBuilder fax(final String fax) {
            this.fax = fax;
            return this;
        }

        public Etablissement.EtablissementBuilder email(final String email) {
            this.email = email;
            return this;
        }

        public Etablissement.EtablissementBuilder site(final String site) {
            this.site = site;
            return this;
        }

        public Etablissement.EtablissementBuilder localisation(final String localisation) {
            this.localisation = localisation;
            return this;
        }

        public EtablissementBuilder setLocalisationFr(String localisationFr) {
            this.localisationFr = localisationFr;
            return this;
        }

        public EtablissementBuilder setLocalisationEn(String localisationEn) {
            this.localisationEn = localisationEn;
            return this;
        }

        public Etablissement.EtablissementBuilder complexe(final Complexe complexe) {
            this.complexe = complexe;
            return this;
        }

        public Etablissement.EtablissementBuilder multimediaList(final List<Multimedia> multimediaList) {
            this.multimediaList = multimediaList;
            return this;
        }

        public Etablissement.EtablissementBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Etablissement.EtablissementBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Etablissement build() {
            return new Etablissement(
                    this.id,
                    this.name,
                    this.description,
                    this.nameFr,
                    this.nameEn, // Ajout de nameEn ici
                    this.descriptionFr,
                    this.descriptionEn,
                    this.type,
                    this.adresse,
                    this.adresseFr, // Ajout de adresseFr ici
                    this.adresseEn, // Ajout de adresseEn ici
                    this.phone,
                    this.fax,
                    this.email,
                    this.site,
                    this.localisation,
                    this.localisationFr, // Ajout de localisationFr ici
                    this.localisationEn, // Ajout de localisationEn ici
                    this.complexe,
                    this.multimediaList,
                    this.createdAt,
                    this.updatedAt);
        }

        public String toString() {
            Long var10000 = this.id;
            return "Etablissement.EtablissementBuilder(id=" + var10000 +
                    ", name=" + this.name +
                    ", description=" + this.description +
                    ", nameFr=" + this.nameFr +
                    ", nameEn=" + this.nameEn + // Ajout de nameEn ici
                    ", descriptionFr=" + this.descriptionFr +
                    ", descriptionEn=" + this.descriptionEn +
                    ", type=" + this.type +
                    ", adresse=" + this.adresse +
                    ", adresseFr=" + this.adresseFr + // Ajout de adresseFr ici
                    ", adresseEn=" + this.adresseEn + // Ajout de adresseEn ici
                    ", phone=" + this.phone +
                    ", fax=" + this.fax +
                    ", email=" + this.email +
                    ", site=" + this.site +
                    ", localisation=" + this.localisation +
                    ", localisationFr=" + this.localisationFr + // Ajout de localisationFr ici
                    ", localisationEn=" + this.localisationEn + // Ajout de localisationEn ici
                    ", complexe=" + String.valueOf(this.complexe) +
                    ", multimediaList=" + String.valueOf(this.multimediaList) +
                    ", createdAt=" + String.valueOf(this.createdAt) +
                    ", updatedAt=" + String.valueOf(this.updatedAt) + ")";
        }

    }

}
