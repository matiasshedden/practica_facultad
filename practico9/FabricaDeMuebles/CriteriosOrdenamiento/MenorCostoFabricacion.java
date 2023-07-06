package practico9.FabricaDeMuebles.CriteriosOrdenamiento;

import practico9.FabricaDeMuebles.Mueble;

import java.util.Comparator;

public class MenorCostoFabricacion implements Comparator<Mueble> {
    @Override
    public int compare(Mueble o1, Mueble o2) {
        return (int) (o1.getCosto() - o2.getCosto());
    }
}
