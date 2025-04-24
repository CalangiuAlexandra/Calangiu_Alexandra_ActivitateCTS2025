package ro.ase.acs.classes;

import java.util.Objects;

public class FabricaBrasov implements FabricaPacheteTuristice {
    public PachetCazare crearePachetCazare(String nume, String adresa)
    {
        if (Objects.equals(nume, "cabana")) {
            return new CazareCabana("Cabana Brasov", "Strada Orhideea");
        }

        return new CazareHotel("Hotel Brasov", "Strada Bucuresti");
    }

    public PachetTransport crearePachetTransport(String nume, String adresa)
    {
        if (Objects.equals(nume, "autobuz")) {
            return new TransportAutobuz("Autobuz Brasov", "Strada Orhideea");
        }

        return new TransportMicrobuz("Microbuz Brasov", "Strada Rasnov");
    }
}
