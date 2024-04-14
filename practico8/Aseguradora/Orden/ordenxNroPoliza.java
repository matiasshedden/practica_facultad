package practico8.Aseguradora.Orden;

import practico8.Aseguradora.Componedor;
import practico8.Aseguradora.Seguro;

import java.util.Comparator;

public class ordenxNroPoliza implements Comparator<Componedor> {

    @Override
    public int compare(Componedor o1, Componedor o2) {
        return o2.get_nro_poliza()- o1.get_nro_poliza();
    }
}
