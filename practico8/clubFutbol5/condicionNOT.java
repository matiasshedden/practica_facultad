package practico8.clubFutbol5;

public class condicionNOT extends condicion {
    private condicion cond;

    public condicionNOT (condicion cond) {
        this.cond = cond;
    }
    @Override
    public boolean cumple(socio S) {
        return !cond.cumple(S);
    }
}
