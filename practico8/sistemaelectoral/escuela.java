package practico8.sistemaelectoral;

import java.util.ArrayList;

public class escuela extends ESL{
    private String nombre;
    private ArrayList<ESL> elementos;

    public escuela(String nombre) {
        this.nombre = nombre;
        elementos = new ArrayList<ESL>();
    }

    @Override
    public int recuentoVotosTotales() {
        int aux=0;
        for (ESL elem:elementos)
            aux += elem.recuentoVotosTotales();
        return aux;
    }
}
