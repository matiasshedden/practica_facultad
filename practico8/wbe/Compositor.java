package practico8.wbe;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Compositor {

    private String nombre;
    private String estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public abstract LocalDate getFechaInicio();
    public abstract LocalDate getFechaFinal();
    public abstract ArrayList<Compositor> ListaDeTareasAtrasadas();
    public abstract void addTareas (Compositor T);
    public abstract void addRecurso(Recurso R);
    public abstract int getDuration ();
    public abstract ArrayList<Recurso> getRecursosInvolucrados();
}
