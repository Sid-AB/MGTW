package com.example.demo.entities;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(
        name = "caracteristique"
)
public class Caracteristique {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String satellite;
    private String frequency;
    private String polarization;
    private String symbolrate;
    private String fec;
    private String transmission;
    private String modulation;
    @ManyToOne
    @JoinColumn(
            name = "tv_id"
    )
    private TV tv;
    @ManyToOne
    @JoinColumn(
            name = "radio_id"
    )
    private Radio radio;
    @CreationTimestamp
    @Column(
            name = "created_at"
    )
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(
            name = "updated_at"
    )
    private LocalDateTime updatedAt;

    public static Caracteristique.CaracteristiqueBuilder builder() {
        return new Caracteristique.CaracteristiqueBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getSatellite() {
        return this.satellite;
    }

    public String getFrequency() {
        return this.frequency;
    }

    public String getPolarization() {
        return this.polarization;
    }

    public String getSymbolrate() {
        return this.symbolrate;
    }

    public String getFec() {
        return this.fec;
    }

    public String getTransmission() {
        return this.transmission;
    }

    public String getModulation() {
        return this.modulation;
    }

    public TV getTv() {
        return this.tv;
    }

    public Radio getRadio() {
        return this.radio;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setSatellite(final String satellite) {
        this.satellite = satellite;
    }

    public void setFrequency(final String frequency) {
        this.frequency = frequency;
    }

    public void setPolarization(final String polarization) {
        this.polarization = polarization;
    }

    public void setSymbolrate(final String symbolrate) {
        this.symbolrate = symbolrate;
    }

    public void setFec(final String fec) {
        this.fec = fec;
    }

    public void setTransmission(final String transmission) {
        this.transmission = transmission;
    }

    public void setModulation(final String modulation) {
        this.modulation = modulation;
    }

    public void setTv(final TV tv) {
        this.tv = tv;
    }

    public void setRadio(final Radio radio) {
        this.radio = radio;
    }

    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(final LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Caracteristique)) {
            return false;
        } else {
            Caracteristique other = (Caracteristique)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label155: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label155;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label155;
                    }

                    return false;
                }

                Object this$satellite = this.getSatellite();
                Object other$satellite = other.getSatellite();
                if (this$satellite == null) {
                    if (other$satellite != null) {
                        return false;
                    }
                } else if (!this$satellite.equals(other$satellite)) {
                    return false;
                }

                Object this$frequency = this.getFrequency();
                Object other$frequency = other.getFrequency();
                if (this$frequency == null) {
                    if (other$frequency != null) {
                        return false;
                    }
                } else if (!this$frequency.equals(other$frequency)) {
                    return false;
                }

                label134: {
                    Object this$polarization = this.getPolarization();
                    Object other$polarization = other.getPolarization();
                    if (this$polarization == null) {
                        if (other$polarization == null) {
                            break label134;
                        }
                    } else if (this$polarization.equals(other$polarization)) {
                        break label134;
                    }

                    return false;
                }

                label127: {
                    Object this$symbolrate = this.getSymbolrate();
                    Object other$symbolrate = other.getSymbolrate();
                    if (this$symbolrate == null) {
                        if (other$symbolrate == null) {
                            break label127;
                        }
                    } else if (this$symbolrate.equals(other$symbolrate)) {
                        break label127;
                    }

                    return false;
                }

                label120: {
                    Object this$fec = this.getFec();
                    Object other$fec = other.getFec();
                    if (this$fec == null) {
                        if (other$fec == null) {
                            break label120;
                        }
                    } else if (this$fec.equals(other$fec)) {
                        break label120;
                    }

                    return false;
                }

                Object this$transmission = this.getTransmission();
                Object other$transmission = other.getTransmission();
                if (this$transmission == null) {
                    if (other$transmission != null) {
                        return false;
                    }
                } else if (!this$transmission.equals(other$transmission)) {
                    return false;
                }

                label106: {
                    Object this$modulation = this.getModulation();
                    Object other$modulation = other.getModulation();
                    if (this$modulation == null) {
                        if (other$modulation == null) {
                            break label106;
                        }
                    } else if (this$modulation.equals(other$modulation)) {
                        break label106;
                    }

                    return false;
                }

                Object this$tv = this.getTv();
                Object other$tv = other.getTv();
                if (this$tv == null) {
                    if (other$tv != null) {
                        return false;
                    }
                } else if (!this$tv.equals(other$tv)) {
                    return false;
                }

                label92: {
                    Object this$radio = this.getRadio();
                    Object other$radio = other.getRadio();
                    if (this$radio == null) {
                        if (other$radio == null) {
                            break label92;
                        }
                    } else if (this$radio.equals(other$radio)) {
                        break label92;
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
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Caracteristique;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $satellite = this.getSatellite();
        result = result * 59 + ($satellite == null ? 43 : $satellite.hashCode());
        Object $frequency = this.getFrequency();
        result = result * 59 + ($frequency == null ? 43 : $frequency.hashCode());
        Object $polarization = this.getPolarization();
        result = result * 59 + ($polarization == null ? 43 : $polarization.hashCode());
        Object $symbolrate = this.getSymbolrate();
        result = result * 59 + ($symbolrate == null ? 43 : $symbolrate.hashCode());
        Object $fec = this.getFec();
        result = result * 59 + ($fec == null ? 43 : $fec.hashCode());
        Object $transmission = this.getTransmission();
        result = result * 59 + ($transmission == null ? 43 : $transmission.hashCode());
        Object $modulation = this.getModulation();
        result = result * 59 + ($modulation == null ? 43 : $modulation.hashCode());
        Object $tv = this.getTv();
        result = result * 59 + ($tv == null ? 43 : $tv.hashCode());
        Object $radio = this.getRadio();
        result = result * 59 + ($radio == null ? 43 : $radio.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getId();
        return "Caracteristique(id=" + var10000 + ", satellite=" + this.getSatellite() + ", frequency=" + this.getFrequency() + ", polarization=" + this.getPolarization() + ", symbolrate=" + this.getSymbolrate() + ", fec=" + this.getFec() + ", transmission=" + this.getTransmission() + ", modulation=" + this.getModulation() + ", tv=" + String.valueOf(this.getTv()) + ", radio=" + String.valueOf(this.getRadio()) + ", createdAt=" + String.valueOf(this.getCreatedAt()) + ", updatedAt=" + String.valueOf(this.getUpdatedAt()) + ")";
    }

    public Caracteristique(final Long id, final String satellite, final String frequency, final String polarization, final String symbolrate, final String fec, final String transmission, final String modulation, final TV tv, final Radio radio, final LocalDateTime createdAt, final LocalDateTime updatedAt) {
        this.id = id;
        this.satellite = satellite;
        this.frequency = frequency;
        this.polarization = polarization;
        this.symbolrate = symbolrate;
        this.fec = fec;
        this.transmission = transmission;
        this.modulation = modulation;
        this.tv = tv;
        this.radio = radio;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Caracteristique() {
    }

    public static class CaracteristiqueBuilder {
        private Long id;
        private String satellite;
        private String frequency;
        private String polarization;
        private String symbolrate;
        private String fec;
        private String transmission;
        private String modulation;
        private TV tv;
        private Radio radio;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        CaracteristiqueBuilder() {
        }

        public Caracteristique.CaracteristiqueBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        public Caracteristique.CaracteristiqueBuilder satellite(final String satellite) {
            this.satellite = satellite;
            return this;
        }

        public Caracteristique.CaracteristiqueBuilder frequency(final String frequency) {
            this.frequency = frequency;
            return this;
        }

        public Caracteristique.CaracteristiqueBuilder polarization(final String polarization) {
            this.polarization = polarization;
            return this;
        }

        public Caracteristique.CaracteristiqueBuilder symbolrate(final String symbolrate) {
            this.symbolrate = symbolrate;
            return this;
        }

        public Caracteristique.CaracteristiqueBuilder fec(final String fec) {
            this.fec = fec;
            return this;
        }

        public Caracteristique.CaracteristiqueBuilder transmission(final String transmission) {
            this.transmission = transmission;
            return this;
        }

        public Caracteristique.CaracteristiqueBuilder modulation(final String modulation) {
            this.modulation = modulation;
            return this;
        }

        public Caracteristique.CaracteristiqueBuilder tv(final TV tv) {
            this.tv = tv;
            return this;
        }

        public Caracteristique.CaracteristiqueBuilder radio(final Radio radio) {
            this.radio = radio;
            return this;
        }

        public Caracteristique.CaracteristiqueBuilder createdAt(final LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Caracteristique.CaracteristiqueBuilder updatedAt(final LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Caracteristique build() {
            return new Caracteristique(this.id, this.satellite, this.frequency, this.polarization, this.symbolrate, this.fec, this.transmission, this.modulation, this.tv, this.radio, this.createdAt, this.updatedAt);
        }

        public String toString() {
            Long var10000 = this.id;
            return "Caracteristique.CaracteristiqueBuilder(id=" + var10000 + ", satellite=" + this.satellite + ", frequency=" + this.frequency + ", polarization=" + this.polarization + ", symbolrate=" + this.symbolrate + ", fec=" + this.fec + ", transmission=" + this.transmission + ", modulation=" + this.modulation + ", tv=" + String.valueOf(this.tv) + ", radio=" + String.valueOf(this.radio) + ", createdAt=" + String.valueOf(this.createdAt) + ", updatedAt=" + String.valueOf(this.updatedAt) + ")";
        }
    }
}
