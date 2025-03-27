import Pachet.InterfataPachet;
import Pachet.PachetCazare;
import Pachet.PachetComplet;
import Pachet.PachetTransport;

public class PachetFactory {
    public static InterfataPachet createInstance(String tipProdus, String destinatie, double pret) {
        return switch (tipProdus) {
            case "cazare" -> new PachetCazare(pret, destinatie);
            case "transport" -> new PachetTransport(pret, destinatie);
            default -> new PachetComplet(pret, destinatie);
        };
    }
}
