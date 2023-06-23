package practico8.clubFutbol5;

import java.time.LocalDate;

public class Alquiler {
    private LocalDate fecha;
    private int id;
    private double valor;

    public Alquiler(int id, double valor) {
        this.id = id;
        this.valor = valor;
        this.fecha = LocalDate.now();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }
}
