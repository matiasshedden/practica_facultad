package practico8.Aseguradora.Busquedas;

import practico8.Aseguradora.Componedor;
import practico8.Aseguradora.Seguro;

public class BusquedaXDescripcion extends CondicionBusqueda {

    private String desc;

    public BusquedaXDescripcion(String D) {
        this.desc = D;
    }
    @Override
    public boolean cumple(Seguro S) {
        return S.getDescripcion().contains(desc);
    }
}
