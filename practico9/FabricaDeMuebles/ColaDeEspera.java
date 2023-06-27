package practico9.FabricaDeMuebles;

import java.util.ArrayList;

public class ColaDeEspera {
    private ArrayList<Comparable> elementos;

    public ColaDeEspera() {
        elementos = new ArrayList<>(); }

    public void agregarElemento(Comparable nuevo){
        boolean inserto = false;
        int i = 0;
        while (!inserto && i<elementos.size()) {
            if (elementos.get(i).compareTo(nuevo) > 0)
                i++;
            else
                inserto = true;
        }
        if (!inserto)
            elementos.add(nuevo);
        else
            elementos.add(i, nuevo);
    }

    @Override
    public String toString() { return elementos.toString(); }
}
