package practico8.wbe;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public class TFinal extends Compositor {

    private ArrayList<Recurso> recursos;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private LocalDate fechaInicioEstimado;
    private LocalDate fechaFinalEstimado;

    public TFinal (String nombre, String est, LocalDate inicio, LocalDate f, LocalDate inicioEst, LocalDate finalEst) {
        super.setNombre(nombre);
        super.setEstado(est);
        recursos = new ArrayList<Recurso>();
        this.fechaInicio = inicio;
        this.fechaFinal = f;
        this.fechaInicioEstimado = inicioEst;
        this.fechaFinalEstimado = finalEst;
    }

    @Override
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    @Override
    public LocalDate getFechaFinal() {
        return fechaFinal;
    }


    @Override
    public ArrayList<Compositor> ListaDeTareasAtrasadas() {
        ArrayList<Compositor> aux = new ArrayList<Compositor>();
        if (fechaFinalEstimado.isBefore(LocalDate.now()) && getEstado().equals("en espera"))
            aux.add(this);
        return aux;
    }

    @Override
    public void addTareas(Compositor T) {}

    @Override
    public void addRecurso (Recurso R) { recursos.add(R); }

    public int getDuration () {
        int dias = (int) ChronoUnit.DAYS.between(this.fechaInicioEstimado, this.fechaFinalEstimado);
        return dias;
    }

    //Devolver los recursos sin repetir
    @Override
    public ArrayList<Recurso> getRecursosInvolucrados() {
        return new ArrayList<>(recursos);
    }

    @Override
    public String toString() {
        return "    - " + this.getNombre() + "  I: " + this.fechaInicio + "  F: " + this.fechaFinal + '\n'; }
}
