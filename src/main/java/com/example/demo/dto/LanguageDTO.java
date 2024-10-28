package com.example.demo.dto;

import com.example.demo.entities.Language;


public class LanguageDTO {
     private String name;
    private String nameFr;
    private String nameEn;

    public Language toLanguage() {
        Language Language = new Language();
        Language.setName(this.getName());
        Language.setNameFr(this.getNameFr());
        Language.setNameEn(this.getNameEn());
        return Language;
    }

    
    public LanguageDTO(final String name, final String nameFr, final String nameEn) {
        this.name = name;
        this.nameEn = nameEn;
        this.nameFr = nameFr;
    }

    public LanguageDTO() {
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
        } else if (!(o instanceof LanguageDTO)) {
            return false;
        } else {
            LanguageDTO other = (LanguageDTO)o;
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
        return other instanceof LanguageDTO;
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
        return "LanguageDTO(name=" + this.getName()
        + ", nameFr=" + this.getNameFr() // Ajout de nameFr
        + ", nameEn=" + this.getNameEn() // Ajout de nameEn 
        + ")";
    }

    public static class LanguageDTOBuilder {
    
    }
}
