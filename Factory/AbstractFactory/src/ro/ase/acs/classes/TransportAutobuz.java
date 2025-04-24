package ro.ase.acs.classes;

public class TransportAutobuz implements PachetTransport {
    private String nume;
    private String adresa;

    TransportAutobuz(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    @Override
    public String descriere() {
        return "Transport Autobuz";
    }

    @Override
    public void afisare() {
        System.out.println(this.descriere() + ": " + this.nume + ", " + this.adresa);
    }
}
