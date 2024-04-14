package practico9.MisDeportes;

import practico9.MisDeportes.Condiciones.Buscar;

import java.time.LocalDate;
import java.util.ArrayList;

public class Evento extends Compositor {

    private ArrayList<Participante> participantes;
    private int puntos;
    private LocalDate fecha;
    private int duracion;

    public Evento(int puntos, int duracion) {
        this.puntos = puntos;
        this.duracion = duracion;
        participantes = new ArrayList<Participante>();
    }

    public int getPuntos() { return puntos; }

    public LocalDate getFecha() { return fecha; }

    public void addParticipante (Participante P) { participantes.add(P); }

    //Busco los participantes que cumplen con la condicion "cond"
    @Override
    public ArrayList<Participante> getParticipantes(Buscar cond) {
        ArrayList<Participante> resultado = new ArrayList<Participante>();
        for (Participante P:participantes)
            if (cond.cumple(P))
                resultado.add(P);
        return resultado;
    }

    @Override
    public int getDuracion() { return duracion; }

    @Override
    public int getPuntuacion() { return puntos; }

    public ArrayList<Participante> getParticipantes() {
        return new ArrayList<>(participantes);
    }
}
