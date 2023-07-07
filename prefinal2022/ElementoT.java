package prefinal2022;

import prefinal2022.condicionesBusqueda.busqueda;

import java.util.ArrayList;

public abstract class ElementoT {

    public ElementoT() {
    }

    public abstract ArrayList<String> getpalabrasClaves();

    public abstract String getejeTematico();

    public abstract ArrayList<Tema> buscarTema(busqueda condicion);
}
