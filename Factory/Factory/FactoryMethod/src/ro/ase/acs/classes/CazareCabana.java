package ro.ase.acs.classes;

public class CazareCabana implements PachetTuristic {
    private String nume;
    private String adresa;

    CazareCabana(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    @Override
    public String descriere() {
        return "Cazare Cabana";
    }

    @Override
    public void afisare() {
        System.out.println(this.descriere() + ": " + this.nume + ", " + this.adresa);
    }
}
