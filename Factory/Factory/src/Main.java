//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AgentieTurism agentieTurism = AgentieTurism.getAgentie();
        agentieTurism.adaugaPachete(PachetFactory.createInstance(
                "cazare", "Roma", 5555.23
        ));
        agentieTurism.adaugaPachete(PachetFactory.createInstance(
                "transport", "Barcelona", 12.3
        ));
        agentieTurism.adaugaPachete(PachetFactory.createInstance(
                "", "Londra", 10000.54
        ));
        agentieTurism.afiseaza();
    }
}