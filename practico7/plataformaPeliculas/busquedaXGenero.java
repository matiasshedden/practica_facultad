package practico7.plataformaPeliculas;

public class busquedaXGenero extends condicionBusqueda {

    private String genero;

    public busquedaXGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean cumple(pelicula P) {
        return P.getGenero().contains(this.genero);
    }
}
