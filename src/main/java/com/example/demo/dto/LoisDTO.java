package com.example.demo.dto;

        import com.example.demo.entities.Lois;

public class LoisDTO {
    private String name;
    private String description;

    public Lois toLois() {
        Lois lois = new Lois();
        lois.setName(this.getName());
        lois.setDescription(this.getDescription());
        return lois;
    }

    public static com.example.demo.dto.LoisDTO.LoisDTOBuilder builder() {
        return new com.example.demo.dto.LoisDTO.LoisDTOBuilder();
    }

    public LoisDTO(final String name, final String description) {
        this.name = name;
        this.description = description;
    }

    public LoisDTO() {
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
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

                Object this$description = this.getDescription();
                Object other$description = other.getDescription();
                if (this$description == null) {
                    if (other$description != null) {
                        return false;
                    }
                } else if (!this$description.equals(other$description)) {
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
        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getName();
        return "LoisDTO(name=" + var10000 + ", description=" + this.getDescription() + ")";
    }

    public static class LoisDTOBuilder {
    }
}
