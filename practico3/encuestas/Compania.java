package practico3.encuestas;

import java.util.ArrayList;

/**
 * La clase compania agrega un arreglo de encuestas y una comision por encuesta respondida
 */
public class Compania {

    private String nombre;
    private ArrayList <encuesta> E;
    private final int comisionEncuesta = 10;

    //Metodos
    public void addEncuesta(encuesta e) {
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
