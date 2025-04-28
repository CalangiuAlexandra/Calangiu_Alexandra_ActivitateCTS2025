import java.util.ArrayList;

public class Facultate {
    private ArrayList<String> grupe;
    private int nrStudenti;
    private float medieAdmitere;
    private static Facultate facultate;

    private Facultate(int nrStudenti, float medieAdmitere) {
        this.nrStudenti = nrStudenti;
        this.medieAdmitere = medieAdmitere;
        this.grupe = new ArrayList<>();
    }

    public static Facultate getInstance(){
        if(facultate == null){
            facultate = new Facultate(300, 8.50f);
        }
        return facultate;
    }


}
