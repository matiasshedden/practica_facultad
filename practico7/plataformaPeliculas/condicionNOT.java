package practico7.plataformaPeliculas;

public class condicionNOT extends condicionBusqueda{
    private condicionBusqueda condicion;
    public condicionNOT(condicionBusqueda cond) {
        this.condicion = cond;
    }

    @Override
    public boolean cumple(pelicula P) {
        return !condicion.cumple(P);
    }
}
