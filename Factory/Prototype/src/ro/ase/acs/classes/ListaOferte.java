package ro.ase.acs.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ListaOferte implements IListaOferte {
    private ArrayList<String> oferte = new ArrayList<>();

    public void setOferte(ArrayList<String> oferteNoi)
    {
        this.oferte = oferteNoi;
    }

    public void citeste()
    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("oferte"));

            String oferta;
            while((oferta=reader.readLine())!=null) {
                this.oferte.add(oferta);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public IListaOferte copiaza() {
        ListaOferte listaOferte = new ListaOferte();
        ArrayList<String> listaTemporara = new ArrayList<>(this.oferte);

        listaOferte.setOferte(listaTemporara);

        return listaOferte;
    }

    public void afiseaza() {
        System.out.println("Lista Oferte:");

        for (String oferta: oferte) {
            System.out.println(oferta);
        }
    }
}
