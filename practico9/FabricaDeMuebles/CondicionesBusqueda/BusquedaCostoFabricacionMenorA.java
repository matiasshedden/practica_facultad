package practico9.FabricaDeMuebles.CondicionesBusqueda;

import practico9.FabricaDeMuebles.Mueble;

public class BusquedaCostoFabricacionMenorA extends condicionBusqueda{
    private double costo;

    public BusquedaCostoFabricacionMenorA(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public boolean cumple(Mueble M) {
        return M.getCosto()<this.costo;
    }
}
