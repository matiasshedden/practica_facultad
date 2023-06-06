package centroComputos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import centroComputos.comparadores.*;
import centroComputos.comparadores.*;
import fileSystem.Archivo;

public class Pruebas {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>();
        paises.add("Peru");
        paises.add("Argentina");
        paises.add("Chile");
        paises.add("Uruguay");
        paises.add("Bolivia");
        System.out.println(paises);
        Collections.sort(paises);//Ordena la lista "paises" sobre la misma lista
        System.out.println(paises);

        ArrayList<Archivo> archivos = new ArrayList<>();
        Archivo a1 = new Archivo("prueba", "txt", 20324);
        Archivo a2 = new Archivo("ttt", "zip", 2012324);
        Archivo a3 = new Archivo("pwwwrueba", "asf", 20234324);
        Archivo a4 = new Archivo("qqq", "txt", 523);
        archivos.add(a1);
        archivos.add(a2);
        archivos.add(a3);
        archivos.add(a4);

        System.out.println("Ordeno los archivos por extension ascendente");
        Collections.sort(archivos);
        System.out.println(archivos);

        System.out.println("Ordeno los archivos por tamanio ascendente");
        Comparator tamanioMenor = new ComparadorArchivoPorTamanio();
        Collections.sort(archivos, tamanioMenor);
        System.out.println(archivos);

        System.out.println("Ordeno los archivos por tamanio descendente");
        Comparator tamanioMayor = new ComparadorInverso(tamanioMenor);
        Collections.sort(archivos, tamanioMayor);
        System.out.println(archivos);

        Collections.sort(archivos, Collections.reverseOrder());

        Comparator nombreDes = new ComparadorArchivoPorNombre().reversed();
        Collections.sort(archivos, nombreDes);

        Collections.sort(archivos, Collections.reverseOrder(new ComparadorArchivoPorNombre()));

    }
}
