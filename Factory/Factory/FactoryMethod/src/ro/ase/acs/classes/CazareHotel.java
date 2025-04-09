package ro.ase.acs.classes;

public class CazareHotel implements PachetTuristic {
    private String nume;
    private String adresa;

    CazareHotel(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    @Override
    public String descriere() {
        return "Cazare Hotel";
    }

    @Override
    public void afisare() {
        System.out.println(this.descriere() + ": " + this.nume + ", " + this.adresa);
    }
}
