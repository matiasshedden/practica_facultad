package prefinal2022.condicionesBusqueda;

import prefinal2022.Tema;

import java.util.ArrayList;

public class BusquedaPorAutorComentario extends busqueda {
    private String AutorComentario;

    public BusquedaPorAutorComentario(String A) {
        this.AutorComentario = A;
    }

    @Override
    public boolean cumple(Tema T) {
        return T.contieneComentarioAutor(this.AutorComentario);
    }
}
