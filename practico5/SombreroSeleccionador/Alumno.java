package practico5.SombreroSeleccionador;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private ArrayList <String> familia;
    private ArrayList <String> cualidades;

    public Alumno(String nombre) {
        this.nombre = nombre;
        cualidades = new ArrayList<String>();
        familia = new ArrayList<>();
    }

    public boolean tieneCualidad (String C) {
        if (cualidades.contains(C))
            return true;
        return false;
    }

    public void addcualidad (String c) {
        cualidades.add(c);
    }

    public String getNombre() {
        return nombre;
    }
}
