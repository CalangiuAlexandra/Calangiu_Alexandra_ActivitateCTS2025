package ro.ase.acs.classes;

public class Builder implements BuilderInterface {
    private Boolean hasWifi = false;
    private Boolean hasAnimale = false;
    private Boolean isFumator = false;
    private Boolean hasAC = false;
    private Boolean hasTV = false;

    public Builder setWifi(boolean value)
    {
        this.hasWifi = value;

        return this;
    }

    public Builder hasAnimale(boolean value)
    {
        this.hasAnimale = value;

        return this;
    }

    public Builder isFumator(boolean value)
    {
        this.isFumator = value;

        return this;
    }

    public Builder hasAC(boolean value)
    {
        this.hasAC = value;

        return this;
    }

    public Builder hasTV(boolean value)
    {
        this.hasTV = value;

        return this;
    }

    @Override
    public PachetTransport build() {
        return new PachetTransport(
                this.hasWifi,
                this.hasAnimale,
                this.isFumator,
                this.hasAC,
                this.hasTV
        );
    }
}
