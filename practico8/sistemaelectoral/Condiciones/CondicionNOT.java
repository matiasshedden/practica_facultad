package practico8.sistemaelectoral.Condiciones;
import practico8.sistemaelectoral.voto;

public class CondicionNOT extends condicionBusqueda{
    private condicionBusqueda cond;

    public CondicionNOT(condicionBusqueda cond){
        this.cond = cond;
    }

    public boolean cumple(voto v) {
        return !(cond.cumple(v));
    }
}
