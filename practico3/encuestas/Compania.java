package practico3.encuestas;

import java.util.ArrayList;

/**
 * La clase compania agrega un arreglo de encuestas
 */
public class Compania {

    private ArrayList <encuesta> E;
    private String nombre;

    public void addEncuesta(encuesta e) {
        if (e.isRealizada())
            E.add(e);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void deleteEncuesta(encuesta e){
        E.remove(e);
    }

    public boolean tieneEncuesta(encuesta e){
        return E.contains(e);
    }

    public Compania (String nombre) {
        E = new ArrayList<>();
        this.nombre = nombre;
    }
}
