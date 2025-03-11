package EJ6_BusquedaLibros;

import java.util.ArrayList;


public class Biblioteca {

    private Tree indice;
    private ArrayList<Libro> libros;

    public Biblioteca() {

        libros = new ArrayList<Libro>();
        indice = new Tree();
    }

    public void agregarLibro(Libro L) {
        indice.add(L.getISBN());
        indice.addLibro(L);
    }

    public void mostrarIndice() {
        indice.imprimirEnOrden();
    }

    public void mostrarLibros() {
        indice.listaLibros();
    }

    public boolean existeLibro(int ISBN) {
        return indice.hasElem(ISBN);
    }


}
