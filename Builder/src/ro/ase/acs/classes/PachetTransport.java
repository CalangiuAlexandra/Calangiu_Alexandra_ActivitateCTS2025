package ro.ase.acs.classes;

public class PachetTransport {
    private Boolean hasWifi;
    private Boolean hasAnimale;
    private Boolean isFumator;
    private Boolean hasAC;
    private Boolean hasTV;

    public PachetTransport(Boolean hasWifi, Boolean hasAnimale, Boolean isFumator, Boolean hasAC, Boolean hasTV) {
        this.hasWifi = hasWifi;
        this.hasAnimale = hasAnimale;
        this.isFumator = isFumator;
        this.hasAC = hasAC;
        this.hasTV = hasTV;
    }

    public Boolean getHasAC() {
        return hasAC;
    }

    public Boolean getHasWifi() {
        return hasWifi;
    }

    public Boolean getHasAnimale() {
        return hasAnimale;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTransport{");
        sb.append("hasWifi=").append(hasWifi);
        sb.append(", hasAnimale=").append(hasAnimale);
        sb.append(", isFumator=").append(isFumator);
        sb.append(", hasAC=").append(hasAC);
        sb.append(", hasTV=").append(hasTV);
        sb.append('}');
        return sb.toString();
    }

    public Boolean getFumator() {
        return isFumator;
    }

    public Boolean getHasTV() {
        return hasTV;
    }
}
