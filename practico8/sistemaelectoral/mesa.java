package practico8.sistemaelectoral;

import practico8.sistemaelectoral.Condiciones.*;
import java.util.ArrayList;

public class mesa extends ESL{
    private ArrayList<Integer> padron;
    private ArrayList<voto> votos;

    public mesa() {
        padron = new ArrayList<Integer>();
        votos = new ArrayList<voto>();
    }

    public void addDNI(int i) { padron.add(i); }
    public void addvoto(voto v) { votos.add(v); }
    @Override
    public int recuentoVotosTotales() {
        return votos.size();
    }

    public int buscar (condicionBusqueda condicion) {
        //si cumple con la condicion dada, devuelvo la cantidad de veces que ocurre
        int aux=0;
        for (voto v:votos)
            if (condicion.cumple(v))
                aux++;
        return aux;
    }
}
