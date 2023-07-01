package practico9.FabricaDeMuebles.CondicionesBusqueda;

import practico9.FabricaDeMuebles.Mueble;

public class BusquedaNOT extends condicionBusqueda{

    private condicionBusqueda cond1;

    public BusquedaNOT(condicionBusqueda C1) {
        this.cond1 = C1;
    }

    @Override
    public boolean cumple(Mueble M) {
        return !(cond1.cumple(M));
    }
}
