package practico9.FabricaDeMuebles.Condiciones;

import practico9.FabricaDeMuebles.Mueble;

public class BusquedaGananciaMayor extends condicionBusqueda {
    private double pisodeganancia;

    public BusquedaGananciaMayor(double piso) {
        this.pisodeganancia = piso;
    }

    @Override
    public boolean cumple(Mueble M) { return M.getGanancia()>this.pisodeganancia; }
}
