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

// Annotation pour indiquer que cette classe est une entité JPA
@Entity
@Table(
        name = "etablissement" // Nom de la table dans la base de données
)
public class Etablissement {
    @Id // Indique que ce champ est la clé primaire
    @GeneratedValue(
            strategy = GenerationType.IDENTITY // La stratégie de génération de valeur de la clé primaire
    )
    private Long id; // Identifiant unique de l'établissement
    private String name; // Nom de l'établissement
    
    @Column(name = "description", // Nom de la colonne dans la base de données
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String description; // Description de l'établissement
    
    @Column(name = "name_fr") // Nom de la colonne dans la base de données
    private String nameFr; // Nom de l'établissement en fr et en

    @Column(name = "description_fr", // Nom de la colonne dans la base de données
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String descriptionFr; // Description de l'établissement en fr

    @Column(name = "description_en", // Nom de la colonne dans la base de données
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String descriptionEn; // Description de l'établissement en en
    
    private String type; // Type de l'établissement
    private String adresse; // Adresse de l'établissement
    private String phone; // Numéro de téléphone de l'établissement
    private String fax; // Numéro de fax de l'établissement
    private String email; // Adresse e-mail de l'établissement
    private String site; // Site web de l'établissement
    @Column(
            name = "localisation", // Nom de la colonne pour la localisation
            columnDefinition = "TEXT" // Type de la colonne
    )
    private String localisation; // Localisation de l'établissement
    @OneToOne(
            cascade = {CascadeType.ALL}, // Cascade toutes les opérations (ajout, mise à jour, suppression)
            fetch = FetchType.EAGER // Récupère le complexe associé de manière immédiate
    )
    @JoinColumn(
            name = "complexe_id", // Nom de la colonne de jointure
            referencedColumnName = "id" // Colonne référencée dans la table complexe
    )
    private Complexe complexe; // Complexe associé à l'établissement
    @OneToMany(
            mappedBy = "etablissement", // Propriété de l'autre entité qui est mappée
            cascade = {CascadeType.ALL} // Cascade toutes les opérations
    )
    private List<Multimedia> multimediaList = new ArrayList(); // Liste des multimédias associés à l'établissement
    @CreationTimestamp // Annotation pour indiquer que ce champ sera rempli automatiquement avec la date de création
    @Column(
            name = "created_at" // Nom de la colonne pour la date de création
    )
    private LocalDateTime createdAt; // Date de création de l'établissement
    @UpdateTimestamp // Annotation pour indiquer que ce champ sera mis à jour automatiquement à chaque modification
    @Column(
            name = "updated_at" // Nom de la colonne pour la date de mise à jour
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

    // Getter pour name_fr et en
    public String getName_fr() { 
        return this.nameFr; 
    }

    // Getter pour description_fr
    public String getDescription_fr() { 
        return this.descriptionFr; 
    }

    // Getter pour description_en
    public String getDescription_en() { 
        return this.descriptionEn; 
    }

    public String getType() {
        return this.type;
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

     // Setter pour name_fr
     public void setName_fr(final String name_fr) {
        this.nameFr = name_fr;
    }

    // Setter pour description_fr
    public void setDescription_fr(final String description_fr) {
        this.descriptionFr = description_fr;
    }

    // Setter pour description_en
    public void setDescription_en(final String description_en) {
        this.descriptionEn = description_en;
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
            return false;  // Vérifie si l'objet est une instance de Etablissement
        } else {
            Etablissement other = (Etablissement)o; // Cast de l'objet
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

                 // Vérification pour name_fr et en
            Object this$name_fr = this.getName_fr();
            Object other$name_fr = other.getName_fr();
            if (this$name_fr == null) {
                if (other$name_fr != null) {
                    return false; // Un est nul, l'autre non
                }
            } else if (!this$name_fr.equals(other$name_fr)) {
                return false; // Noms en arabe différents
            }

            // Vérification pour description_fr
            Object this$description_fr = this.getDescription_fr();
            Object other$description_fr = other.getDescription_fr();
            if (this$description_fr == null) {
                if (other$description_fr != null) {
                    return false; // Un est nul, l'autre non
                }
            } else if (!this$description_fr.equals(other$description_fr)) {
                return false; // Descriptions en arabe différentes
            }

            // Vérification pour description_en
            Object this$description_en = this.getDescription_en();
            Object other$description_en = other.getDescription_en();
            if (this$description_en == null) {
                if (other$description_en != null) {
                    return false; // Un est nul, l'autre non
                }
            } else if (!this$description_en.equals(other$description_en)) {
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

    // Méthode pour générer un code de hachage pour l'objet
    public int hashCode() {
        boolean PRIME = true;
        int result = 1;// Initialisation du résultat
        Object $id = this.getId();// Récupération de l'id
        result = result * 59 + ($id == null ? 43 : $id.hashCode());// Ajout de l'id au code de hachage
        Object $name = this.getName(); // Récupération du nom
        result = result * 59 + ($name == null ? 43 : $name.hashCode()); // Ajout du nom au code de hachage
        Object $description = this.getDescription(); // Récupération de la description
        result = result * 59 + ($description == null ? 43 : $description.hashCode()); // Ajout de la description au code de hachage
        Object $name_fr = this.getName_fr(); // Récupération du nom en arabe
        result = result * 59 + ($name_fr == null ? 43 : $name_fr.hashCode()); // Ajout du nom en arabe au code de hachage
        Object $description_fr = this.getDescription_fr(); // Récupération de la description en arabe
        result = result * 59 + ($description_fr == null ? 43 : $description_fr.hashCode()); // Ajout de la description en arabe au code de hachage
        Object $description_en = this.getDescription_en(); // Récupération de la description en en
        result = result * 59 + ($description_en == null ? 43 : $description_en.hashCode()); // Ajout de la description en arabe au code de hachage
        Object $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
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
        Object $complexe = this.getComplexe();
        result = result * 59 + ($complexe == null ? 43 : $complexe.hashCode());
        Object $multimediaList = this.getMultimediaList();
        result = result * 59 + ($multimediaList == null ? 43 : $multimediaList.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
        return result;
    }

    // Méthode pour convertir l'objet en chaîne de caractères
    public String toString() {
        Long var10000 = this.getId(); // Récupération de l'id
        return "Etablissement(id=" + var10000 
            + ", name=" + this.getName() 
            + ", description=" + this.getDescription() 
            + ", name_fr=" + this.getName_fr() // Ajout de name_fr
            + ", description_fr=" + this.getDescription_fr() // Ajout de description_fr
            + ", description_en=" + this.getDescription_en() // Ajout de description_en
            + ", type=" + this.getType() 
            + ", adresse=" + this.getAdresse() 
            + ", phone=" + this.getPhone() 
            + ", fax=" + this.getFax() 
            + ", email=" + this.getEmail() 
            + ", site=" + this.getSite() 
            + ", localisation=" + this.getLocalisation() 
            + ", complexe=" + String.valueOf(this.getComplexe()) 
            + ", multimediaList=" + String.valueOf(this.getMultimediaList()) 
            + ", createdAt=" + String.valueOf(this.getCreatedAt()) 
            + ", updatedAt=" + String.valueOf(this.getUpdatedAt()) 
            + ")"; // Retourne la chaîne formatée
    }

    // Constructeur
    public Etablissement(final Long id, final String name, final String description, final String nameFr, final String descriptionFr,final String descriptionEn, final String type, final String adresse, final String phone, final String fax, final String email, final String site, final String localisation, final Complexe complexe, final List<Multimedia> multimediaList, final LocalDateTime createdAt, final LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.nameFr = nameFr; // Initialisation de name_fr
        this.descriptionFr = descriptionFr; // Initialisation de description_fr
        this.descriptionEn = descriptionEn; // Initialisation de description_en
        this.type = type;
        this.adresse = adresse;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.site = site;
        this.localisation = localisation;
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
        private String name_fr; // Ajout de name_fr
        private String description_fr; // Ajout de description_fr
        private String description_en; // Ajout de description_en
        private String type;
        private String adresse;
        private String phone;
        private String fax;
        private String email;
        private String site;
        private String localisation;
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
    
        public Etablissement.EtablissementBuilder name_fr(final String name_fr) { // Ajout de la méthode pour name_fr
            this.name_fr = name_fr;
            return this; // Retourne l'instance de builder
        }
    
        public Etablissement.EtablissementBuilder description_fr(final String description_fr) { // Ajout de la méthode pour description_fr
            this.description_fr = description_fr;
            return this; // Retourne l'instance de builder
        }

        public Etablissement.EtablissementBuilder description_en(final String description_en) { // Ajout de la méthode pour description_en
            this.description_en = description_en;
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
            return new Etablissement(this.id, this.name, this.description, this.name_fr, this.description_fr,this.description_en, this.type, this.adresse, this.phone, this.fax, this.email, this.site, this.localisation, this.complexe, this.multimediaList, this.createdAt, this.updatedAt);
        }
    
        public String toString() {
            Long var10000 = this.id;
            return "Etablissement.EtablissementBuilder(id=" + var10000 + 
                   ", name=" + this.name + 
                   ", description=" + this.description + 
                   ", name_fr=" + this.name_fr + 
                   ", description_fr=" + this.description_fr + 
                   ", description_en=" + this.description_en + 
                   ", type=" + this.type + 
                   ", adresse=" + this.adresse + 
                   ", phone=" + this.phone + 
                   ", fax=" + this.fax + 
                   ", email=" + this.email + 
                   ", site=" + this.site + 
                   ", localisation=" + this.localisation + 
                   ", complexe=" + String.valueOf(this.complexe) + 
                   ", multimediaList=" + String.valueOf(this.multimediaList) + 
                   ", createdAt=" + String.valueOf(this.createdAt) + 
                   ", updatedAt=" + String.valueOf(this.updatedAt) + ")";
        }
    }
    
}
