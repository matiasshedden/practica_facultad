package practico7.plataformaPeliculas;

public class condicionAND extends condicionBusqueda {
    private condicionBusqueda C1;
    private condicionBusqueda C2;

    public condicionAND(condicionBusqueda c1, condicionBusqueda c2) {
        this.C1 = c1;
        this.C2 = c2;
    }

    @Override
    public boolean cumple(pelicula P) {
        return (this.C1.cumple(P) && this.C2.cumple(P));
    }
}
