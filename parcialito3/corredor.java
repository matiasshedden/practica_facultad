package parcialito3;

import java.util.ArrayList;

public class corredor {

    private int anio_nac;
    private String nombre;
    private String apellido;
    private int podios;
    private ArrayList <carrera> carreras;

    public corredor(int anio_nac, String nombre, String apellido, int podios) {
        this.anio_nac = anio_nac;
        this.nombre = nombre;
        this.apellido = apellido;
        this.podios = podios;
        this.carreras = new ArrayList<carrera>();
    }

    public int getAnio_nac() {
        return anio_nac;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getPodios() {
        return podios;
    }

    @Override
    public String toString() {
        return "el corredor " + nombre + " " + apellido + " nacio en: " + anio_nac + " con " + podios + " podios";
    }
}
