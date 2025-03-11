package EJ3;

import java.util.ArrayList;
import java.util.Comparator;

public class MaximizarActividades {

    ArrayList<Actividad> actividades;

    public MaximizarActividades() {
        actividades = new ArrayList<>();
    }

    public void addActividades(Actividad A) {
        actividades.add(A);
    }

    public ArrayList<Actividad> greedyA() {
        return getCantActividades(actividades);
    }

    private ArrayList<Actividad> getCantActividades(ArrayList<Actividad> actividades) {
        ArrayList<Actividad> solucion = new ArrayList<>();
        actividades.sort(new Comparator<Actividad>() {
            @Override
            public int compare(Actividad t1, Actividad t2) {
                return t1.getComienzo()-t2.getComienzo();
            }
        });
        if (!actividades.isEmpty()) {
            solucion.add(actividades.get(0));
            int ultimoFin = actividades.get(0).getFin();
            // Recorrer las actividades restantes
            for (int i = 1; i < actividades.size(); i++) {
                if (actividades.get(i).getComienzo() >= ultimoFin) {
                    solucion.add(actividades.get(i));
                    ultimoFin = actividades.get(i).getFin();
                }
            }
        }
        return solucion;
    }
}
