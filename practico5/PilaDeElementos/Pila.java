package practico5.PilaDeElementos;

import java.util.ArrayList;

public class Pila {
    private ArrayList<Object> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    public void push(Object elemento) {elementos.add(elemento); //Agrega elementos
    }

    public Object pop() {
        if (!elementos.isEmpty()) {
            return elementos.remove(elementos.size() - 1);
        }
        return null; // Si la pila está vacía, retornamos null
    }

    public Object top() {
        if (!elementos.isEmpty()) {
            return elementos.get(elementos.size() - 1);
        }
        return null; // Consulto el tope. Si la pila está vacía, retornamos null
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public int tamanio() {
        return elementos.size();
    }

    public ArrayList copiaPila() {
        ArrayList<Object> copia = (ArrayList<Object>) elementos.clone();
        return copia;
    }

    public ArrayList copiaPilaInvertida() {
        ArrayList<Object> copia = new ArrayList<Object>();
        while (!elementos.isEmpty())
            copia.add(elementos.remove(elementos.size()-1));
        return copia;
    }


}
