package EJ7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;

public class CD {

    private final int maximocanciones=3;
    private int tamanioCD;
    private ArrayList<Cancion> canciones;
    private Hashtable<String, Integer> contador;

    public CD(int tama) {
        this.tamanioCD = tama;
        canciones = new ArrayList<>();
        contador = new Hashtable<String, Integer>();
    }

    public void addCanciones(Cancion C) { canciones.add(C); }

    public void mostrarCD() {
        Iterator<Cancion> it = canciones.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }

    public ArrayList<Cancion> maximimaCapacidad() {
        ArrayList<Cancion> solucion = new ArrayList<>();
        canciones.sort(new Comparator<Cancion>() {
            @Override
            public int compare(Cancion c1, Cancion c2) {
                return c1.getTamanio() - c2.getTamanio();
            }
        });
        int capacidad=0;
        while (!canciones.isEmpty() && capacidad < tamanioCD) {
            Cancion C = canciones.removeFirst();
            String genero = C.getGenero();
            int count = contador.getOrDefault(genero, 0);
            if (count < maximocanciones) {
                solucion.add(C);
                capacidad += C.getTamanio();
                contador.put(genero, count+1);
            }

        }
        return solucion;
    }
}
