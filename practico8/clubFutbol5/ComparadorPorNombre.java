package practico8.clubFutbol5;

import java.util.Comparator;

public class ComparadorPorNombre implements Comparator<socio> {


    @Override
    public int compare(socio o1, socio o2) {
        int aux = o1.getApellido().compareTo(o2.getApellido());
        if (aux==0)
            aux = o1.getNombre().compareTo(o2.getNombre());
        return aux;
    }
}
