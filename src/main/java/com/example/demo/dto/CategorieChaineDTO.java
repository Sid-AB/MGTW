package com.example.demo.dto;


        import com.example.demo.entities.CategorieChaine;

public class CategorieChaineDTO {
    private String name;

    public CategorieChaine toECategorieChaine() {
        CategorieChaine categorieChaine = new CategorieChaine();
        categorieChaine.setName(this.getName());
        return categorieChaine;
    }

    public static com.example.demo.dto.CategorieChaineDTO.CategorieChaineDTOBuilder builder() {
        return new com.example.demo.dto.CategorieChaineDTO.CategorieChaineDTOBuilder();
    }

    public CategorieChaineDTO(final String name) {
        this.name = name;
    }

    public CategorieChaineDTO() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
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
        return result;
    }

    public String toString() {
        return "CategorieChaineDTO(name=" + this.getName() + ")";
    }

    public static class CategorieChaineDTOBuilder {
    }
}
