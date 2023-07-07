package prefinal2022.condicionesBusqueda;

import prefinal2022.Tema;

public class BusquedaPalabraClave extends busqueda{
    private String palabraBuscada;

    public BusquedaPalabraClave(String palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    @Override
    public boolean cumple(Tema T) {
        return T.contienePalabraClave(palabraBuscada);
    }
}
