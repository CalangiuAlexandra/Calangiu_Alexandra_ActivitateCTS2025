package ro.ase.acs.classes;

import java.util.Objects;

public class FabricaTransport implements FabricaPacheteTuristice {
    @Override
    public PachetTuristic crearePachet(String tipPachet, String nume, String adresa) {
        if (Objects.equals(tipPachet, "autobuz")) {
            return new TransportAutobuz(nume, adresa);
        }

        return new TransportMicrobuz(nume, adresa);
    }
}
