import ro.ase.acs.classes.AgentieTurism;

public class Main {
    public static void main(String[] args) {
        AgentieTurism agentieTurism = AgentieTurism.getAgentie();
        agentieTurism.adaugaPachete("Roma");
        agentieTurism.afiseaza();

        AgentieTurism agentieTurism1 = AgentieTurism.getAgentie();
        agentieTurism1.adaugaPachete("Barcelona");
        agentieTurism1.afiseaza();
        }
}