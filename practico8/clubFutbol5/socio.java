package practico8.clubFutbol5;

import java.util.ArrayList;

public class socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean cuota;
    private ArrayList<Alquiler> Alquileres;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isCuota() {
        return cuota;
    }

    public void setCuota(boolean cuota) {
        this.cuota = cuota;
    }

    public int getEdad() {
        return edad;
    }

    public void addAlquiler(Alquiler A) { Alquileres.add(A); }
}
