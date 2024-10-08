package com.example.demo.dto;

        import com.example.demo.entities.PresseCategorie;

public class PresseCategorieDTO {
    private String name;
    private String nameEn;
    private String nameFr;
    private String description;
    private String descriptionFr;
    private String descriptionEn;
    private String type;

    public PresseCategorie toEPresseCategorie() {
        PresseCategorie presseCategorie = new PresseCategorie();
        presseCategorie.setName(this.getName());
        presseCategorie.setNameEn(this.getNameEn());
        presseCategorie.setNameFr(this.getNameFr());
        presseCategorie.setDescription(this.getDescription());
        presseCategorie.setDescriptionFr(this.getDescriptionFr());
        presseCategorie.setDescriptionEn(this.getDescriptionEn());
        return presseCategorie;
    }

    public static com.example.demo.dto.PresseCategorieDTO.PresseCategorieDTOBuilder builder() {
        return new com.example.demo.dto.PresseCategorieDTO.PresseCategorieDTOBuilder();
    }

    // Constructeur
    public PresseCategorieDTO(final String name, final String nameFr, final String nameEn, final String description, final String descriptionFr, final String descriptionEn, final String type) {
        this.name = name;
        this.nameFr = nameFr;
        this.nameEn = nameEn; // Initialisation de nameEn
        this.description = description;
        this.descriptionFr = descriptionFr;
        this.descriptionEn = descriptionEn;
        this.type = type;
    }
    
    public PresseCategorieDTO() {
    }

    // Getters et setters pour les attributs
    public String getName() {
        return name;
    }

    public String getNameEn() {
        return nameEn; // Getter pour nameEn
    }

    public String getDescription() {
        return this.description;
    }

    public String getNameFr() {
        return this.nameFr;
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

    public void setDescription(final String description) {
        this.description = description;
    }

     public void setName(String name) {
        this.name = name;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn; // Setter pour nameEn
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

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PresseCategorieDTO)) {
            return false;
        } else {
            PresseCategorieDTO other = (PresseCategorieDTO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name == null) {
                            break label47;
                        }
                    } else if (this$name.equals(other$name)) {
                        break label47;
                    }
                    return false;
                }
                
                label48: {
                    Object this$nameFr = this.getNameFr();
                    Object other$nameFr = other.getNameFr();
                    if (this$nameFr == null) {
                        if (other$nameFr == null) {
                            break label48;
                        }
                    } else if (this$nameFr.equals(other$nameFr)) {
                        break label48;
                    }
                    return false;
                }
                
                label49: { // Ajout d'un nouveau label pour nameEn
                    Object this$nameEn = this.getNameEn();
                    Object other$nameEn = other.getNameEn();
                    if (this$nameEn == null) {
                        if (other$nameEn == null) {
                            break label49;
                        }
                    } else if (this$nameEn.equals(other$nameEn)) {
                        break label49;
                    }
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

                Object this$type = this.getType();
                Object other$type = other.getType();
                if (this$type == null) {
                    if (other$type != null) {
                        return false;
                    }
                } else if (!this$type.equals(other$type)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PresseCategorieDTO;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        
        Object $nameFr = this.getNameFr();
        result = result * 59 + ($nameFr == null ? 43 : $nameFr.hashCode());
        
        Object $nameEn = this.getNameEn(); // Ajout de nameEn
        result = result * 59 + ($nameEn == null ? 43 : $nameEn.hashCode()); // Ajout de la logique pour nameEn
    
        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        
        Object $descriptionFr = this.getDescriptionFr();
        result = result * 59 + ($descriptionFr == null ? 43 : $descriptionFr.hashCode());
        
        Object $descriptionEn = this.getDescriptionEn();
        result = result * 59 + ($descriptionEn == null ? 43 : $descriptionEn.hashCode());
        
        Object $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        
        return result;
    }
    

    public String toString() {
        String var10000 = this.getName();
        return "PresseCategorieDTO(name=" + var10000 
               + ", nameFr=" + this.getNameFr() 
               + ", nameEn=" + this.getNameEn() // Ajout de nameEn
               + ", description=" + this.getDescription() 
               + ", descriptionFr=" + this.getDescriptionFr() 
               + ", descriptionEn=" + this.getDescriptionEn() 
               + ", type=" + this.getType() + ")";
    }
    
    public static class PresseCategorieDTOBuilder {
    }
}
