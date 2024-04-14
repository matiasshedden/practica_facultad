package practico9.MisDeportes;

import practico9.MisDeportes.Condiciones.Buscar;

import java.util.ArrayList;

public class Competencia extends Compositor {

    private ArrayList<Compositor> eventos;
    private String nombre;


    public Competencia (String name) {
        this.nombre = name;
        eventos = new ArrayList<Compositor>();
    }

    public void addEventos (Evento E) { eventos.add(E); }

    @Override
    public ArrayList<Participante> getParticipantes(Buscar cond) {
        ArrayList<Participante> resultado = new ArrayList<Participante>();
        for (Compositor E:eventos)
            if (E.getParticipantes(cond).size() > 0 && !resultado.containsAll(E.getParticipantes(cond)))
                resultado.addAll(E.getParticipantes(cond));
        return resultado;
    }

    @Override
    public int getDuracion() {
        int resultado = 0;
        for (Compositor E:eventos)
            resultado += E.getDuracion();
        return resultado;
    }

    @Override
    public int getPuntuacion() {
        int resultado = 0;
        for (Compositor E:eventos)
            resultado += E.getPuntuacion();
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Devuelvo todos los participantes de un evento / deporte / competencia sin repetir
    public ArrayList<Participante> getParticipantes() {
        ArrayList <Participante> resultado = new ArrayList<Participante>();
        for (Compositor E:eventos)
            if (!resultado.containsAll(E.getParticipantes()))
                resultado.addAll(E.getParticipantes());
        return resultado;
    }
}
