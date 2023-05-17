package practico5.PilaDeElementos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.push("Elemento 1");
        pila.push("Elemento 2");
        pila.push("Elemento 3");


        ArrayList aux = pila.copiaPila();
        ArrayList aux1 = pila.copiaPilaInvertida();
        System.out.println("Pila original: " + pila);
        System.out.println("Pila copia: " + aux);
        System.out.println("Pila copia invertida: " + aux1);
        }
    }

