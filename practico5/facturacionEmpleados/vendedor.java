package practico5.facturacionEmpleados;

public class vendedor extends empleado {
    private int cant_ventas;
    private double porcentaje;

    public vendedor(String nombre, String apellido, int DNI, double sueldo, int cant_ventas, double porcentaje) {
        super(nombre, apellido, DNI, sueldo);
        this.cant_ventas = cant_ventas;
        this.porcentaje = porcentaje;
    }

    public int getCant_ventas() {
        return cant_ventas;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    @Override
    public double getSueldo() {
        return (sueldo*( 1 + porcentaje / 100 ));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
