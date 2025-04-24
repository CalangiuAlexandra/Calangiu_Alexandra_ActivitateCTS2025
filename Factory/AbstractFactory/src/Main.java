import ro.ase.acs.classes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AgentieTurism agentieTurism = AgentieTurism.getAgentie();
        FabricaPacheteTuristice fabricaBali = new FabricaBali();
        FabricaPacheteTuristice fabricaBrasov = new FabricaBrasov();

        agentieTurism.adaugaPacheteTransport(fabricaBali.crearePachetTransport("autobuz", "Strada Bucuresti, Bucuresti"));
        agentieTurism.adaugaPacheteTransport(fabricaBrasov.crearePachetTransport("ASIG", "Strada Dambovita, Iasi"));
        agentieTurism.adaugaPacheteCazare(fabricaBali.crearePachetCazare("cabana", "Mamaia Nord"));
        agentieTurism.adaugaPacheteCazare(fabricaBrasov.crearePachetCazare("hotel", "Bulevardul Magheru, Bucuresti"));

        agentieTurism.afiseaza();
    }
}