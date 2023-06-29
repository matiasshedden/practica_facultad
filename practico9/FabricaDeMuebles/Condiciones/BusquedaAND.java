package practico9.FabricaDeMuebles.Condiciones;

import practico9.FabricaDeMuebles.Mueble;

public class BusquedaAND extends condicionBusqueda{
    private condicionBusqueda cond1;
    private condicionBusqueda cond2;

    public BusquedaAND(condicionBusqueda C1, condicionBusqueda C2) {
        this.cond1 = C1;
        this.cond2 = C2;
    }

    @Override
    public boolean cumple(Mueble M) {
        return (cond1.cumple(M) && cond2.cumple(M));
    }
}
