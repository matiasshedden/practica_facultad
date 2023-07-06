package practico9.SistemaGastos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class ControlGastos {
    private ArrayList<Gasto> gastos;

    public ControlGastos() {
        this.gastos = new ArrayList<>();
    }

    public void agregarGasto(Gasto gasto) {
        gastos.add(gasto);
    }

    public double calcularTotalGastadoEnFecha(Date fecha) {
        double total = 0;
        for (Gasto gasto : gastos) {
            if (gasto.getFecha().equals(fecha)) {
                total += gasto.getTotalGasto();
            }
        }
        return total;
    }

    public double calcularTotalGastadoEnRubro(String rubro) {
        double total = 0;
        for (Gasto gasto : gastos) {
            if (gasto.getDescripcion().equalsIgnoreCase(rubro)) {
                total += gasto.getTotalGasto();
            }
        }
        return total;
    }

    public ArrayList<Gasto> obtenerGastosEnFecha(Date fecha) {
        ArrayList<Gasto> gastosEnFecha = new ArrayList<>();
        for (Gasto gasto : gastos) {
            if (gasto.getFecha().equals(fecha)) {
                gastosEnFecha.add(gasto);
            }
        }
        return gastosEnFecha;
    }

    public ArrayList<Gasto> obtenerGastosDeCalidadMedia() {
        ArrayList<Gasto> gastosCalidadMedia = new ArrayList<>();
        for (Gasto gasto : gastos) {
            boolean calidadMedia = false;
            for (GastoDetalle detalle : gasto.getDetalles()) {
                if (detalle.getDescripcion().equalsIgnoreCase("calidad media")) {
                    calidadMedia = true;
                    break;
                }
            }
            if (calidadMedia) {
                gastosCalidadMedia.add(gasto);
            }
        }
        return gastosCalidadMedia;
    }

}

