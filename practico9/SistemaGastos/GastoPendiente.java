package practico9.SistemaGastos;

import java.time.LocalDate;
import java.util.Date;

class GastoPendiente extends Gasto {
    private double porcentajeActualizacionAnual;
    private int diasPendiente;
    private boolean pagado;
    private double montoPago;

    public GastoPendiente(String descripcion, LocalDate fecha, double monto, double porcentajeActualizacionAnual,
                          int diasPendiente) {
        super(descripcion, fecha, monto);
        this.porcentajeActualizacionAnual = porcentajeActualizacionAnual;
        this.diasPendiente = diasPendiente;
        this.pagado = false;
        this.montoPago = 0;
    }

    public void informarPago(double montoPago) {
        this.pagado = true;
        this.montoPago = montoPago;
    }

    @Override
    public double getTotalGasto() {
        if (pagado) {
            return montoPago;
        } else {
            double montoActualizado = getMonto();
            for (int i = 0; i < diasPendiente; i++) {
                montoActualizado += montoActualizado * (porcentajeActualizacionAnual / 365);
            }
            return montoActualizado;
        }
    }
}

