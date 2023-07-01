package practico9.FabricaDeMuebles.CondicionesBusqueda;

import practico9.FabricaDeMuebles.Mueble;

public class BusquedaContieneCaracteristica extends condicionBusqueda{
    private String caracteristica;

    public BusquedaContieneCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    public String getCaracteristica() {
        return caracteristica;
    }
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    @Override
    public boolean cumple(Mueble M) {
        return M.getCaracteristica(caracteristica);
    }
}
