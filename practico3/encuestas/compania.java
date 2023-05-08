package practico3.encuestas;

import java.util.ArrayList;

/**
 * La clase compania agrega un arreglo de encuestas y una comision por encuesta respondida
 */
public class compania {

    private String nombre;
    private ArrayList <encuesta> E;
    private final int comisionEncuesta = 10;
    private final int sueldoBase = 100;

    //Metodos
    public void addEncuesta(encuesta e) {
            E.add(e);
    }
    public void deleteEncuesta(encuesta e){
        E.remove(e);
    }
    public boolean tieneEncuesta(encuesta e){
        return E.contains(e);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getComisionEncuesta() {
        return comisionEncuesta;
    }
    public int getSueldoBase() {
        return sueldoBase;
    }
    //Constructor
    public compania(String nombre) {
        E = new ArrayList<>();
        this.nombre = nombre;
    }

    /* SE ROMPIO TODO POR NO SABER INVOCAR A UN ARRAYLIST DENTRO DE OTRO
    public int cuantasEncuestasHizo(String emp) {
        int contador=0;
        for (int i=0; i<E.size(); i++) {
            for (int j=0; j<E.size(); j++)
                if (E.get(i).R.get(j).equals(emp))
                    contador++;
        }
        return contador;
    }*/
}
