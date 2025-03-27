import Pachet.InterfataPachet;

import java.util.ArrayList;

public class AgentieTurism {
    private ArrayList<InterfataPachet> pachete;
    private String nume;
    private int numarAngajati;

    private static AgentieTurism agentie;

    private AgentieTurism(String nume, int numarAngajati) {
        this.nume = nume;
        this.numarAngajati = numarAngajati;
        this.pachete = new ArrayList<>();
    }

    public static AgentieTurism getAgentie() {
        if (agentie == null) {
            agentie = new AgentieTurism("HappyVaccay", 30);
        }

        return agentie;
    }

    public void adaugaPachete(InterfataPachet pachetNou) {
        pachete.add(pachetNou);
    }

    public void afiseaza() {
        System.out.println("Compania cu numele: " + nume + " cu numarul de angajati: " + numarAngajati + " are "
                + pachete.size() + " pachete: ");

        for(InterfataPachet x: pachete) {
            x.afisare();
        }
    }

}