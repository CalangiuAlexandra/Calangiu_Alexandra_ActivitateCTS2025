package ro.ase.acs.classes;

import java.util.Objects;

public class FabricaCazare implements FabricaPacheteTuristice {
    @Override
    public PachetTuristic crearePachet(String tipPachet, String nume, String adresa) {
        if (Objects.equals(tipPachet, "hotel")) {
            return new CazareHotel(nume, adresa);
        }

        return new CazareCabana(nume, adresa);
    }
}
