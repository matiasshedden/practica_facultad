package parcialito3;

public class BusquedaNot extends condicionBusqueda {
    private condicionBusqueda cond1;

    public BusquedaNot (condicionBusqueda cond) { this.cond1 = cond; }
    @Override
    public boolean cumple(corredor c) {
        return (!cond1.cumple(c));
    }
}
