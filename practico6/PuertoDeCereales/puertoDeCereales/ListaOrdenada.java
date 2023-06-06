package puertoDeCereales;

import java.util.ArrayList;

public class ListaOrdenada {
    private ArrayList<Comparable> elementos;

    public ListaOrdenada() {
        elementos = new ArrayList<>();
    }

    public void insertar(Comparable elemento){
        int pos = 0;
        while (pos < elementos.size() &&
                elementos.get(pos).compareTo(elemento) > 0)
            pos++;
        this.elementos.add(pos, elemento);
    }

    public Comparable siguiente(){
        return elementos.remove(0);
    }

    public boolean vacia(){
        return elementos.isEmpty();
    }
}
