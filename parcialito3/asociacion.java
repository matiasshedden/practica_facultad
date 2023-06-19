package parcialito3;

import java.util.ArrayList;
import java.util.Collections;

public class asociacion {
    private String nombre;
    private ArrayList<corredor> corredores;
    private ArrayList<carrera> carreras;

    public asociacion(String nombre) {
        this.nombre = nombre;
        corredores = new ArrayList<>();
        carreras = new ArrayList<>();
    }

    public ArrayList<corredor> menoresDe(condicionBusqueda condicion) {
        ArrayList <corredor> resultado =new ArrayList<>();
        for (int i = 0; i < corredores.size(); i++) {
            if (condicion.cumple(corredores.get(i)))
                resultado.add(corredores.get(i));
        }
        return resultado;
    }

    public void addCorredor (corredor c) {
        corredores.add(c);
    }

    public void mostrarCorredores() {
        for (corredor c:corredores)
            System.out.println(c);
    }

    public void mostrarCorredoresPorNombre() {
        Collections.sort(corredores);
        for (corredor c:corredores)
            System.out.println(c);
    }
}
