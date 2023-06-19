package practico7.plataformaPeliculas;

public class busquedaXTitulo extends condicionBusqueda{

    private String palabra;

    public busquedaXTitulo(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(pelicula P) {
        return P.getTitulo().contains(this.palabra);
    }
}
