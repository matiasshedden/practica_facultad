package practico8.clubFutbol5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Club {
    private ArrayList <socio> Socios;

    public Club () {
        Socios = new ArrayList<socio>();
    }

    public void addSocio(socio S) {
        Socios.add(S);
    }

    public ArrayList<socio> BuscarSocio (condicion Cond) {
        ArrayList<socio> aux = new ArrayList<>();
        for (socio s:Socios)
            if (Cond.cumple(s))
                aux.add(s);
        return aux;
    }

    public void MostrarSocios() {
        for (socio s:Socios)
            System.out.println(s);
    }
}
