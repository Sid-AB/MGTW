package com.example.demo.dto;


        import com.example.demo.entities.CategorieChaine;

public class CategorieChaineDTO {
    private String name;
    private String nameFr;
    private String nameEn;

    public CategorieChaine toECategorieChaine() {
        CategorieChaine categorieChaine = new CategorieChaine();
        categorieChaine.setName(this.getName());
        categorieChaine.setNameFr(this.getNameFr());
        categorieChaine.setNameEn(this.getNameEn());
        return categorieChaine;
    }

    public static com.example.demo.dto.CategorieChaineDTO.CategorieChaineDTOBuilder builder() {
        return new com.example.demo.dto.CategorieChaineDTO.CategorieChaineDTOBuilder();
    }

    public CategorieChaineDTO(final String name, final String nameFr, final String nameEn) {
        this.name = name;
        this.nameEn = nameEn;
        this.nameFr = nameFr;
    }

    public CategorieChaineDTO() {
    }

    public String getName() {
        return this.name;
    }

     // Getter pour nameFr et en
     public String getNameFr() { 
        return this.nameFr; 
    }

    // Getter pour nameEn
    public String getNameEn() {
        return this.nameEn;
    }
    public void setName(final String name) {
        this.name = name;
    }
    // Setter pour nameFr
    public void setNameFr(final String nameFr) {
        this.nameFr = nameFr;
    }

    // Setter pour nameEn
    public void setNameEn(final String nameEn) {
        this.nameEn = nameEn;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof CategorieChaineDTO)) {
            return false;
        } else {
            CategorieChaineDTO other = (CategorieChaineDTO)o;
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

                Object this$nameFr = this.getNameFr();
                Object other$nameFr = other.getNameFr();
                if (this$nameFr == null) {
                    if (other$nameFr != null) {
                        return false;
                    }
                } else if (!this$nameFr.equals(other$nameFr)) {
                    return false;
                }

                Object this$nameEn = this.getNameEn();
                Object other$nameEn = other.getNameEn();
                if (this$nameEn == null) {
                    if (other$nameEn != null) {
                        return false;
                    }
                } else if (!this$nameEn.equals(other$nameEn)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CategorieChaineDTO;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());

        Object $nameFr = this.getNameFr(); // Récupération du nom en français
        result = result * 59 + ($nameFr == null ? 43 : $nameFr.hashCode()); // Ajout du nom en français au code de
                                                                            // hachage

        Object $nameEn = this.getNameEn(); // Récupération du nom en anglais
        result = result * 59 + ($nameEn == null ? 43 : $nameEn.hashCode()); // Ajout du nom en anglais au code de
                                                                            // hachage
        return result;
    }

    public String toString() {
        return "CategorieChaineDTO(name=" + this.getName()
        + ", nameFr=" + this.getNameFr() // Ajout de nameFr
        + ", nameEn=" + this.getNameEn() // Ajout de nameEn 
        + ")";
    }

    public static class CategorieChaineDTOBuilder {
    }
}
