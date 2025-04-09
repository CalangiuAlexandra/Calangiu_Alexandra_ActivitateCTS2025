package ro.ase.acs.classes;

public class TransportMicrobuz implements PachetTuristic {
    private String nume;
    private String adresa;

    TransportMicrobuz(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    @Override
    public String descriere() {
        return "Transport Microbuz";
    }

    @Override
    public void afisare() {
        System.out.println(this.descriere() + ": " + this.nume + ", " + this.adresa);
    }
}
