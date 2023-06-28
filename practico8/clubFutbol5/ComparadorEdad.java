package practico8.clubFutbol5;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<socio> {

    @Override
    public int compare(socio o1, socio o2) {
        return o1.getEdad() - o2.getEdad();
    }
}
