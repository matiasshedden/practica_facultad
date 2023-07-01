package practico9.FabricaDeMuebles.CondicionesBusqueda;

import static java.time.temporal.ChronoUnit.DAYS;
import practico9.FabricaDeMuebles.Mueble;

import java.time.LocalDate;

public class BusquedaFechaMenorA extends condicionBusqueda {
    private LocalDate fechaMaxima;
    private int DuracionMes;

    public BusquedaFechaMenorA(LocalDate fecha) {
        this.fechaMaxima = fecha;
    }

    public LocalDate getFechaMaxima() {
        return fechaMaxima;
    }

    public void setFechaMaxima(LocalDate fechaMaxima) {
        this.fechaMaxima = fechaMaxima;
    }

    public int getDuracionMes() {
        return DuracionMes;
    }

    public void setDuracionMes(int duracionMes) {
        DuracionMes = duracionMes;
    }

    @Override
    public boolean cumple(Mueble M) {
        return (DAYS.between(LocalDate.now(), M.getFechaLimite()) < DuracionMes);
    }
}
