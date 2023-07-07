package prefinal2022;

import prefinal2022.condicionesBusqueda.busqueda;

import java.util.ArrayList;

public class Comentario {
    private String autor;
    private String texto;

    public Comentario(String autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
