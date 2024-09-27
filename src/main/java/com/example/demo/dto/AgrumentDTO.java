package com.example.demo.dto;

        import com.example.demo.entities.Agrument;

public class AgrumentDTO {
    private String name;
    private String description;
    private String type;

    public Agrument toEAgrument() {
        Agrument agrument = new Agrument();
        agrument.setName(this.getName());
        agrument.setDescription(this.getDescription());
        return agrument;
    }

    public static com.example.demo.dto.AgrumentDTO.AgrumentDTOBuilder builder() {
        return new com.example.demo.dto.AgrumentDTO.AgrumentDTOBuilder();
    }

    public AgrumentDTO(final String name, final String description, final String type) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public AgrumentDTO() {
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

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof AgrumentDTO)) {
            return false;
        } else {
            AgrumentDTO other = (AgrumentDTO)o;
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

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AgrumentDTO;
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
        return result;
    }

    public String toString() {
        String var10000 = this.getName();
        return "AgrumentDTO(name=" + var10000 + ", description=" + this.getDescription() + ", type=" + this.getType() + ")";
    }

    public static class AgrumentDTOBuilder {
    }
}
