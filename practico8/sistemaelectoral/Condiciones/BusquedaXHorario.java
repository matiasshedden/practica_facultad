package practico8.sistemaelectoral.Condiciones;

import practico8.sistemaelectoral.voto;

import java.time.LocalTime;

public class BusquedaXHorario extends condicionBusqueda{

    private LocalTime horaminima;
    private LocalTime horamaxima;

    public BusquedaXHorario(LocalTime minimo, LocalTime maximo) {
        //this.cond = cond;
        this.horaminima = minimo;
        this.horamaxima = maximo;
    }

    @Override
    public boolean cumple(voto v) {
        return (v.getEmitido().isAfter(horaminima) && v.getEmitido().isBefore(horamaxima));
    }
}
