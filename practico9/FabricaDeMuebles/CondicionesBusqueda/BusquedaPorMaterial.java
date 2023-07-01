package practico9.FabricaDeMuebles.CondicionesBusqueda;

import practico9.FabricaDeMuebles.Mueble;

public class BusquedaPorMaterial extends condicionBusqueda {
    private String material;

    public BusquedaPorMaterial(String material) {
        this.material = material;
    }
    @Override
    public boolean cumple(Mueble M) { return M.getMaterial().equals(material); }
}
