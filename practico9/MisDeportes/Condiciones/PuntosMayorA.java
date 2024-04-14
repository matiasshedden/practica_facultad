package practico9.MisDeportes.Condiciones;

import practico9.MisDeportes.Participante;

public class PuntosMayorA extends Buscar {

    private int puntaje;

    public PuntosMayorA(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public boolean cumple(Participante P) {
        return P.getPuntos_acumulados() > puntaje;
    }
}
