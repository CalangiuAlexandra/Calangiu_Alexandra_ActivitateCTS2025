package ro.ase.acs.classes;

import java.util.Objects;

public class FabricaBali implements FabricaPacheteTuristice {
    public PachetCazare crearePachetCazare(String nume, String adresa)
    {
        if (Objects.equals(nume, "cabana")) {
            return new CazareCabana("Cabana Bali", adresa);
        }

        return new CazareHotel("Hotel Bali", adresa);
    }

    public PachetTransport crearePachetTransport(String nume, String adresa)
    {
        if (Objects.equals(nume, "autobuz")) {
            return new TransportAutobuz("Autobuz Bali", adresa);
        }

        return new TransportMicrobuz("Microbuz Bali", adresa);
    }
}
