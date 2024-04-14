package practico8.wbe;

import java.time.LocalDate;
import java.util.ArrayList;

public class TCompuesto extends Compositor {

    private ArrayList<Compositor> tareas;

    public TCompuesto (String nombre, String e) {
        super.setNombre(nombre);
        super.setEstado(e);
        tareas = new ArrayList<Compositor>();
    }

    @Override
    public LocalDate getFechaInicio() {
        int i = 0;
        LocalDate aux = tareas.get(i).getFechaInicio();
        for (i=0; i < tareas.size(); i++) {
            if (aux.isAfter(tareas.get(i).getFechaInicio()))
                aux = tareas.get(i).getFechaInicio();
        }
        return aux;
    }
    //En ambos metodos, me traigo la menor/mayor fecha de la lista
    @Override
    public LocalDate getFechaFinal() {
        int i = 0;
        LocalDate aux = tareas.get(i).getFechaFinal();
        for (i=0; i < tareas.size(); i++) {
            if (aux.isBefore(tareas.get(i).getFechaFinal()))
                aux = tareas.get(i).getFechaFinal();
        }
        return aux;
    }

    //pregunto por el tamaño de la lista, asi se si contiene tareas
    @Override
    public ArrayList<Compositor> ListaDeTareasAtrasadas() {
        ArrayList<Compositor> aux = new ArrayList<Compositor>();
        for (Compositor T:tareas)
            if (T.ListaDeTareasAtrasadas().size() > 0)
                aux.add(T);
        return aux;
    }

    @Override
    public String toString() {
        return "+" + this.getNombre() + '\n' + tareas; }

    public void addTareas (Compositor T) { tareas.add(T);}

    @Override
    public void addRecurso(Recurso R) { }

    @Override
    public int getDuration() {
        int aux = 0;
        for (Compositor T:tareas)
            aux += T.getDuration();
        return aux;
    }

    @Override
    public ArrayList<Recurso> getRecursosInvolucrados() {
        ArrayList<Recurso> aux = new ArrayList<Recurso>();
        for (Compositor T:tareas)
            if (!aux.containsAll(T.getRecursosInvolucrados()))
                aux.addAll(T.getRecursosInvolucrados());
        return aux;
    }
}
