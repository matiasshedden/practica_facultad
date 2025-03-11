package EJ6_BusquedaLibros;

import java.util.Hashtable;
import java.util.Scanner;

public class BusquedaLibros {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        Libro L1 = new Libro("Carrie", "Stephen King", "Terror", 1974, 5);
        Libro L2 = new Libro("El resplandor", "Stephen King", "Terror", 1977, 2);
        Libro L3 = new Libro("Dracula", "Bram Stoker", "Terror", 1855, 1);
        Libro L4 = new Libro("Tren bala", "Jacob", "Policial", 1985, 15);
        Libro L5 = new Libro("Silence of the lambs", "Thomas Harris", "Suspenso", 1992, 5);

        Biblioteca B = new Biblioteca();
        B.agregarLibro(L1);
        B.agregarLibro(L2);
        B.agregarLibro(L3);
        B.agregarLibro(L4);
        B.agregarLibro(L5);

       /*System.out.println("Mostrar libros: ");
        B.mostrarLibros();
        System.out.println("Mostrar indice de libros: ");
        B.mostrarIndice();*/

        Hashtable<Integer, Libro> listaLibros = new Hashtable<>();
        listaLibros.put(1, L1);
        listaLibros.put(2, L2);
        listaLibros.put(3, L3);
        listaLibros.put(4, L4);
        listaLibros.put(5, L5);

        System.out.println("Ingrese el nro de libro");
        int nro = lectura.nextInt();
        System.out.println("El libro: " + listaLibros.get(nro).getTitulo() + " tiene " + listaLibros.get(nro).getCant_ejemplares() + " ejemplares");

    }
}