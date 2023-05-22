package practico5.SombreroSeleccionador;

import java.util.ArrayList;

public class Casa {
    private final int max_alumnos = 5;
    private String nombre;
    private ArrayList <String> cualidades;
    private int cant_alumnos;


    public String getNombre() {
        return nombre;
    }

    public Casa(String nombre) {
        this.nombre = nombre;
        cualidades = new ArrayList<String>();
        this.cant_alumnos = 0;
    }

    public int getMax_alumnos() {
        return max_alumnos;
    }

    public int getCant_alumnos() {
        return cant_alumnos;
    }

    public boolean tieneCualidad (String C) {
        if (cualidades.contains(C))
            return true;
        return false;
    }

    public void addcualidad (String c) {
        cualidades.add(c);
    }

    public boolean aceptaAlumno(Alumno al) {
        if (cant_alumnos>=max_alumnos)
            return false;
        for (String cualidad:cualidades)
            if (!al.tieneCualidad(cualidad))
                return false;
        cant_alumnos++;
        return true;
    }
}
