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

    public Complexe toComplexe() {
        Complexe complexe = new Complexe();
        complexe.setName(this.getName());
        complexe.setDescription(this.getDescription());
        complexe.setType(this.getType());
        complexe.setAdresse(this.getAdresse());
        complexe.setPhone(this.getPhone());
        complexe.setEmail(this.getEmail());
        complexe.setSite(this.getSite());
        return complexe;
    }

    public static com.example.demo.dto.ComplexeDTO.ComplexeDTOBuilder builder() {
        return new com.example.demo.dto.ComplexeDTO.ComplexeDTOBuilder();
    }

    public ComplexeDTO(final String name, final String description, final String type, final List<Long> selectedAgrument, final String adresse, final String phone, final String email, final String site) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.selectedAgrument = selectedAgrument;
        this.adresse = adresse;
        this.phone = phone;
        this.email = email;
        this.site = site;
    }

    public ComplexeDTO() {
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
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
            ComplexeDTO other = (ComplexeDTO)o;
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

                Object this$description = this.getDescription();
                Object other$description = other.getDescription();
                if (this$description == null) {
                    if (other$description != null) {
                        return false;
                    }
                } else if (!this$description.equals(other$description)) {
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
        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        Object $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        Object $selectedAgrument = this.getSelectedAgrument();
        result = result * 59 + ($selectedAgrument == null ? 43 : $selectedAgrument.hashCode());
        Object $adresse = this.getAdresse();
        result = result * 59 + ($adresse == null ? 43 : $adresse.hashCode());
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
        return "ComplexeDTO(name=" + var10000 + ", description=" + this.getDescription() + ", type=" + this.getType() + ", selectedAgrument=" + String.valueOf(this.getSelectedAgrument()) + ", adresse=" + this.getAdresse() + ", phone=" + this.getPhone() + ", email=" + this.getEmail() + ", site=" + this.getSite() + ")";
    }

    public static class ComplexeDTOBuilder {
    }
}
