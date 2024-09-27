package com.example.demo.dto;



        import com.example.demo.entities.Caracteristique;

public class CaracterstiqueDTO {
    private String satellite;
    private String frequency;
    private String polarization;
    private String symbolrate;
    private String fec;
    private String transmission;
    private String modulation;
    private String idmedia;

    public Caracteristique toECaractiristique() {
        Caracteristique caracteristique = new Caracteristique();
        caracteristique.setSatellite(this.getSatellite());
        caracteristique.setFrequency(this.getFrequency());
        caracteristique.setPolarization(this.getPolarization());
        caracteristique.setSymbolrate(this.getSymbolrate());
        caracteristique.setFec(this.getFec());
        caracteristique.setTransmission(this.getTransmission());
        caracteristique.setModulation(this.getModulation());
        return caracteristique;
    }

    public static com.example.demo.dto.CaracterstiqueDTO.CaracterstiqueDTOBuilder builder() {
        return new com.example.demo.dto.CaracterstiqueDTO.CaracterstiqueDTOBuilder();
    }

    public CaracterstiqueDTO(final String satellite, final String frequency, final String polarization, final String symbolrate, final String fec, final String transmission, final String modulation, final String idmedia) {
        this.satellite = satellite;
        this.frequency = frequency;
        this.polarization = polarization;
        this.symbolrate = symbolrate;
        this.fec = fec;
        this.transmission = transmission;
        this.modulation = modulation;
        this.idmedia = idmedia;
    }

    public CaracterstiqueDTO() {
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

    public String getIdmedia() {
        return this.idmedia;
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

    public void setIdmedia(final String idmedia) {
        this.idmedia = idmedia;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof CaracterstiqueDTO)) {
            return false;
        } else {
            CaracterstiqueDTO other = (CaracterstiqueDTO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label107: {
                    Object this$satellite = this.getSatellite();
                    Object other$satellite = other.getSatellite();
                    if (this$satellite == null) {
                        if (other$satellite == null) {
                            break label107;
                        }
                    } else if (this$satellite.equals(other$satellite)) {
                        break label107;
                    }

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

                Object this$polarization = this.getPolarization();
                Object other$polarization = other.getPolarization();
                if (this$polarization == null) {
                    if (other$polarization != null) {
                        return false;
                    }
                } else if (!this$polarization.equals(other$polarization)) {
                    return false;
                }

                label86: {
                    Object this$symbolrate = this.getSymbolrate();
                    Object other$symbolrate = other.getSymbolrate();
                    if (this$symbolrate == null) {
                        if (other$symbolrate == null) {
                            break label86;
                        }
                    } else if (this$symbolrate.equals(other$symbolrate)) {
                        break label86;
                    }

                    return false;
                }

                label79: {
                    Object this$fec = this.getFec();
                    Object other$fec = other.getFec();
                    if (this$fec == null) {
                        if (other$fec == null) {
                            break label79;
                        }
                    } else if (this$fec.equals(other$fec)) {
                        break label79;
                    }

                    return false;
                }

                label72: {
                    Object this$transmission = this.getTransmission();
                    Object other$transmission = other.getTransmission();
                    if (this$transmission == null) {
                        if (other$transmission == null) {
                            break label72;
                        }
                    } else if (this$transmission.equals(other$transmission)) {
                        break label72;
                    }

                    return false;
                }

                Object this$modulation = this.getModulation();
                Object other$modulation = other.getModulation();
                if (this$modulation == null) {
                    if (other$modulation != null) {
                        return false;
                    }
                } else if (!this$modulation.equals(other$modulation)) {
                    return false;
                }

                Object this$idmedia = this.getIdmedia();
                Object other$idmedia = other.getIdmedia();
                if (this$idmedia == null) {
                    if (other$idmedia != null) {
                        return false;
                    }
                } else if (!this$idmedia.equals(other$idmedia)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CaracterstiqueDTO;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
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
        Object $idmedia = this.getIdmedia();
        result = result * 59 + ($idmedia == null ? 43 : $idmedia.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getSatellite();
        return "CaracterstiqueDTO(satellite=" + var10000 + ", frequency=" + this.getFrequency() + ", polarization=" + this.getPolarization() + ", symbolrate=" + this.getSymbolrate() + ", fec=" + this.getFec() + ", transmission=" + this.getTransmission() + ", modulation=" + this.getModulation() + ", idmedia=" + this.getIdmedia() + ")";
    }

    public static class CaracterstiqueDTOBuilder {
    }
}
