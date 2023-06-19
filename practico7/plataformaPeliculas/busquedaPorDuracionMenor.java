package practico7.plataformaPeliculas;

public class busquedaPorDuracionMenor extends condicionBusqueda {
    private int duracion;

    public busquedaPorDuracionMenor(int durac) {
        this.duracion = durac;
    }
    @Override
    public boolean cumple(pelicula P) {
        return P.getDuracion() < this.duracion;
    }
}
