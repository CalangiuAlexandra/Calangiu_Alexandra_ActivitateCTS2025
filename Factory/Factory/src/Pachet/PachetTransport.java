package Pachet;

public class PachetTransport implements InterfataPachet {
    private double pret;
    private String destinatie;

    public PachetTransport(double pret, String destinatie) {
        this.pret = pret;
        this.destinatie = destinatie;
    }

    @Override
    public String tipPachet() {
        return "Pachet Transport";
    }

    @Override
    public void afisare() {
        System.out.println(this.tipPachet() + " cu destinatia " + this.destinatie + " are pretul de " + this.pret);
    }

    public double getPret() {
        return pret;
    }

    public String getDestinatie() {
        return destinatie;
    }
}
