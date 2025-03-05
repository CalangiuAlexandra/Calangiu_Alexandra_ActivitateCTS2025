package ro.ase.acs.classes;

import java.util.ArrayList;

public class AgentieTurism {
    private ArrayList<String> pachete;
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

    public void adaugaPachete(String pachetNou) {
        if(pachete.contains(pachetNou)) {
            System.out.println("Ati incercat adaugarea unui pachet existent");
        } else {
            pachete.add(pachetNou);
        }
    }

    public void afiseaza() {
        System.out.println("Compania cu numele: " + nume + " cu numarul de angajati: " + numarAngajati + " are "
                + pachete.size() + " pachete: ");

        for(String x: pachete) {
            System.out.println(x);
        }
    }

}
