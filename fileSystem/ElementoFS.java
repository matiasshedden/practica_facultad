package fileSystem;

import centroComputos.ObjetoOrdenable;
import fileSystem.condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public abstract class ElementoFS {
    private final LocalDate fCreacion;
    private String nombre;
    private LocalDate fModificacion;

    public ElementoFS(String nombre) {
        this.nombre = nombre;
        fCreacion = LocalDate.now();
        fModificacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.setfModificacion(LocalDate.now());
    }

    public LocalDate getfModificacion() {
        return fModificacion;
    }
    protected void setfModificacion(LocalDate fModificacion) {
        this.fModificacion = fModificacion;
    }

    public abstract double getTamanio();
    public abstract int cantidadArchivos();

    public ArrayList<ElementoFS> buscar(Condicion cond) {
        ArrayList<ElementoFS> resultado = new ArrayList<>();
        if (cond.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }

    /*
       Estos dos métodos siguientes NO VAN EN LA SOLUCION FINAL, se usa el de arriba
     */
    public ArrayList<ElementoFS> buscarNombre(String nombre) {
        ArrayList<ElementoFS> resultado = new ArrayList<>();
        if (this.getNombre().contains(nombre)){
            resultado.add(this);
        }
        return resultado;
    }

    public ArrayList<ElementoFS> tamanioMayor(double min){
        ArrayList<ElementoFS> resultado = new ArrayList<>();
        if (this.getTamanio() > min){
            resultado.add(this);
        }
        return resultado;
    }
}
