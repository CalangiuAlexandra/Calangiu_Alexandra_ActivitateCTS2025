import ro.ase.acs.classes.AgentieTurism;
import ro.ase.acs.classes.FabricaCazare;
import ro.ase.acs.classes.FabricaTransport;

public class Main {
    public static void main(String[] args) {
        AgentieTurism agentieTurism = AgentieTurism.getAgentie();
        FabricaCazare fabricaCazare = new FabricaCazare();
        FabricaTransport fabricaTransport = new FabricaTransport();

        agentieTurism.adaugaPachete(fabricaTransport.crearePachet("autobuz", "ASIROM", "Strada Bucuresti, Bucuresti"));
        agentieTurism.adaugaPachete(fabricaTransport.crearePachet("", "ASIG", "Strada Dambovita, Iasi"));
        agentieTurism.adaugaPachete(fabricaTransport.crearePachet("autobuz", "POSLA", "Strada Judeteana, Ciorogarla"));
        agentieTurism.adaugaPachete(fabricaCazare.crearePachet("hotel", "Belvedere", "Mamaia Nord"));
        agentieTurism.adaugaPachete(fabricaCazare.crearePachet("hotel", "Lido", "Bulevardul Magheru, Bucuresti"));
        agentieTurism.adaugaPachete(fabricaCazare.crearePachet("", "Belciugatele", "Strada Sperantei, Belciugatele"));

        agentieTurism.afiseaza();
    }
}