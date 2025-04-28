import ro.ase.acs.classes.IListaOferte;
import ro.ase.acs.classes.ListaOferte;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IListaOferte listaOferte = new ListaOferte();
        listaOferte.citeste();

        IListaOferte copie = listaOferte.copiaza();
        copie.afiseaza();
    }
}