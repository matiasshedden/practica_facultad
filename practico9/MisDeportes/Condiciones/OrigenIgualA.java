package practico9.MisDeportes.Condiciones;

import practico9.MisDeportes.Participante;

public class OrigenIgualA extends Buscar {

    private String origenBuscado;

    public OrigenIgualA(String origenBuscado) {
        this.origenBuscado = origenBuscado;
    }

    @Override
    public boolean cumple(Participante P) {
        return P.getCiudad_origen().equals(origenBuscado);
    }
}
