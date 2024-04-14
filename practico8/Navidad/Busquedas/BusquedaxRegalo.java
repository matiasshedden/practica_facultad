package practico8.Navidad.Busquedas;

import practico8.Navidad.Carta;
import practico8.Navidad.ContenedorBPP;

public class BusquedaxRegalo extends condBusqueda {

    private String regalo;

    public BusquedaxRegalo(String R) {
        this.regalo = R;
    }

    @Override
    public boolean cumple(ContenedorBPP C) {
        return C.tiene_regalo(regalo);
    }
}
