package ro.ase.acs.classes;

import java.util.ArrayList;

public class AgentieTurism {
    private ArrayList<PachetCazare> pacheteCazare;
    private ArrayList<PachetTransport> pacheteTransport;
    private String nume;
    private int numarAngajati;

    private static AgentieTurism agentie;

    private AgentieTurism(String nume, int numarAngajati) {
        this.nume = nume;
        this.numarAngajati = numarAngajati;
        this.pacheteCazare = new ArrayList<>();
        this.pacheteTransport = new ArrayList<>();
    }

    public static AgentieTurism getAgentie() {
        if (agentie == null) {
            agentie = new AgentieTurism("HappyVaccay", 30);
        }

        return agentie;
    }

    public void adaugaPacheteCazare(PachetCazare pachetNou) {
        pacheteCazare.add(pachetNou);
    }

    public void adaugaPacheteTransport(PachetTransport pachetNou) {
        pacheteTransport.add(pachetNou);
    }

    public void afiseaza() {
        System.out.println("Compania cu numele: " + nume + " cu numarul de angajati: " + numarAngajati + " are "
                + pacheteTransport.size() + " pachete transport: ");

        for(PachetTransport x: pacheteTransport) {
            x.afisare();
        }

        System.out.println("Pachete cazare: ");
        for(PachetCazare x: pacheteCazare) {
            x.afisare();
        }
    }
}
