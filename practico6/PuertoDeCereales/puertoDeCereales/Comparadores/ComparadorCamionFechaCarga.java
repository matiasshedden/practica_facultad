package puertoDeCereales.Comparadores;

import puertoDeCereales.Camion;

import java.util.Comparator;

public class ComparadorCamionFechaCarga implements Comparator<Camion> {
    @Override
    public int compare(Camion o1, Camion o2) { return o1.getFechaCarga().compareTo(o2.getFechaCarga());}
}
