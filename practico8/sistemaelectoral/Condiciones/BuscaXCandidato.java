package practico8.sistemaelectoral.Condiciones;

import practico8.sistemaelectoral.voto;

public class BuscaXCandidato extends condicionBusqueda {
    private String nombre;

    public BuscaXCandidato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(voto v) {
        if (v.getCandidato() != null)
            return (v.getCandidato().getNombre().equals(nombre));
        return false;
    }
}
