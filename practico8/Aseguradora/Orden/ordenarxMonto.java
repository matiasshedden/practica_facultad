package practico8.Aseguradora.Orden;

import practico8.Aseguradora.Componedor;
import practico8.Aseguradora.Seguro;

import java.util.Comparator;

public class ordenarxMonto implements Comparator<Componedor> {
    @Override
    public int compare(Componedor o1, Componedor o2) {
        return (int) (o1.get_monto() - o2.get_monto());
    }
}
