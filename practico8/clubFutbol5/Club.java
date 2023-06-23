package practico8.clubFutbol5;

import java.util.ArrayList;

public class Club {
    private ArrayList <socio> Socios;

    public Club () {
        Socios = new ArrayList<socio>();
    }

    public void addSocio(socio S) {
        Socios.add(S);
    }
}
