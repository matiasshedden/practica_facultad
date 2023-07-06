package practico9.SistemaGastos;

import java.time.LocalDate;
import java.util.ArrayList;

class Gasto {
    private String descripcion;
    private LocalDate fecha;
    private double monto;
    private ArrayList<GastoDetalle> detalles;

    public Gasto(String descripcion, LocalDate fecha, double monto) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.monto = monto;
        this.detalles = new ArrayList<>();
    }

    public void agregarDetalle(GastoDetalle detalle) {
        detalles.add(detalle);
    }

    public double getTotalGasto() {
        double total = monto;
        for (GastoDetalle detalle : detalles) {
            total += detalle.getMonto();
        }
        return total;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public ArrayList<GastoDetalle> getDetalles() {
        ArrayList<GastoDetalle> aux = new ArrayList<GastoDetalle>();
        for (int i = 0; i < detalles.size(); i++) {
            aux.addAll(detalles);
        }
        return aux;
    }
}

