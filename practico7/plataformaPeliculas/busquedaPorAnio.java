package practico7.plataformaPeliculas;

public class busquedaPorAnio extends condicionBusqueda{
    private int anio;

    public busquedaPorAnio(int anio){
        this.anio = anio;
    }
    @Override
    public boolean cumple(pelicula P) {
        return (P.getAnio() < this.anio);
    }
}
