import ro.ase.acs.classes.Builder;
import ro.ase.acs.classes.PachetTransport;

public class Main {
    public static void main(String[] args) {
        Builder constructor = new Builder();

        PachetTransport pachet1 = constructor
                .hasAC(true)
                .hasAnimale(true)
                .isFumator(false)
                .build();

        System.out.printf(pachet1.toString());

        PachetTransport pachet2 = constructor
                .hasAC(false)
                .hasAnimale(true)
                .isFumator(true)
                .build();

        System.out.printf(pachet2.toString());
    }
}