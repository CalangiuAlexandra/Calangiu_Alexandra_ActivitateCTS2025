package ro.ase.acs.classes;

import java.util.ArrayList;

public interface IListaOferte {
    public IListaOferte copiaza();
    public void afiseaza();
    public void citeste();
    public void setOferte(ArrayList<String> oferteNoi);
}
