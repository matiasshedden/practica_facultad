package practico9.MisDeportes;

import practico9.MisDeportes.Condiciones.Buscar;

import java.util.ArrayList;

public class Deporte {

    private String nombre;

    private int duracion;
    private int puntos;

    private Buscar condicion;

    public Deporte(String name, int duracion, int puntos) {
        this.nombre = name;
        this.duracion = duracion;
        this.puntos = puntos;
    }

    public Deporte(String name,  int duracion, int puntos, Buscar condicion) {
        this.nombre = name;
        this.duracion = duracion;
        this.puntos = puntos;
        this.condicion = condicion;
    }

}
