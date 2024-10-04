package com.example.demo.dto;

        import com.example.demo.entities.Lois;

public class LoisDTO {
    private String name;
    private String description;
    private String nameFr; // Ajout de nameFr
    private String nameEn; // Ajout de nameEn
    private String descriptionFr; // Ajout de descriptionFr
    private String descriptionEn; // Ajout de descriptionEn

    public Lois toLois() {
        Lois lois = new Lois();
        lois.setName(this.getName());
        lois.setDescription(this.getDescription());
        lois.setNameFr(this.getNameFr()); // Assigner nameFr
        lois.setDescriptionFr(this.getDescriptionFr()); // Assigner descriptionFr
        lois.setDescriptionEn(this.getDescriptionEn()); // Assigner descriptionEn
        lois.setNameEn(this.getNameEn()); // Assigner nameEn
        return lois;
    }

    public static com.example.demo.dto.LoisDTO.LoisDTOBuilder builder() {
        return new com.example.demo.dto.LoisDTO.LoisDTOBuilder();
    }

    public LoisDTO(final String name, final String description, final String nameFr,
    final String nameEn,
    final String descriptionFr,
    final String descriptionEn) {
        this.name = name;
        this.description = description;
        this.nameFr = nameFr; // Initialisation de nameFr
        this.nameEn = nameEn; // Initialisation de nameEn
        this.descriptionFr = descriptionFr; // Initialisation de descriptionFr
        this.descriptionEn = descriptionEn; // Initialisation de descriptionEn
    }

    public LoisDTO() {
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
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof LoisDTO)) {
            return false;
        } else {
            LoisDTO other = (LoisDTO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }

                 // Vérification pour 'nameFr et en'
                 Object this$nameFr = this.getNameFr();
                 Object other$nameFr = other.getNameFr();
                 if (this$nameFr == null) {
                     if (other$nameFr != null) {
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
 
                 // Vérification pour 'descriptionFr'
                 Object this$descriptionFr = this.getDescriptionFr();
                 Object other$descriptionFr = other.getDescriptionFr();
                 if (this$descriptionFr == null) {
                     if (other$descriptionFr != null) {
                         return false;
                     }
                 } else if (!this$descriptionFr.equals(other$descriptionFr)) {
                     return false;
                 }
 
                 // Vérification pour 'descriptionEn'
                 Object this$descriptionEn = this.getDescriptionEn();
                 Object other$descriptionEn = other.getDescriptionEn();
                 if (this$descriptionEn == null) {
                     if (other$descriptionEn != null) {
                         return false;
                     }
                 } else if (!this$descriptionEn.equals(other$descriptionEn)) {
                     return false;
                 }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LoisDTO;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $nameFr = this.getNameFr();
         result = result * 59 + ($nameFr == null ? 43 : $nameFr.hashCode());
 
         Object $nameEn = this.getNameEn();
         result = result * 59 + ($nameEn == null ? 43 : $nameEn.hashCode());
 
         Object $description = this.getDescription();
         result = result * 59 + ($description == null ? 43 : $description.hashCode());
 
         Object $descriptionFr = this.getDescriptionFr();
         result = result * 59 + ($descriptionFr == null ? 43 : $descriptionFr.hashCode());
 
         Object $descriptionEn = this.getDescriptionEn();
         result = result * 59 + ($descriptionEn == null ? 43 : $descriptionEn.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getName();
        return "LoisDTO(name=" + var10000 + 
        ", nameFr=" + this.getNameFr() +
        ", nameEn=" + this.getNameEn() + // Ajout de nameEn
        ", description=" + this.getDescription() +
        ", descriptionFr=" + this.getDescriptionFr() +
        ", descriptionEn=" + this.getDescriptionEn() +
         ")";
    }

    public static class LoisDTOBuilder {
    }
}
