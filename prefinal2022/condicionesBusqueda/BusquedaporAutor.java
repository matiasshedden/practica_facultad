package prefinal2022.condicionesBusqueda;

import prefinal2022.Tema;

public class BusquedaporAutor extends busqueda {
    private String autor;

    public BusquedaporAutor(String autor) {
        this.autor = autor;
    }
    @Override
    public boolean cumple(Tema T) {
        return this.autor.equals(T.getAutor());
    }
}
