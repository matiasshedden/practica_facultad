package practico5.facturacionEmpleados;

public class vendedor extends empleado {
    private int cant_ventas;
    private int porcentaje;

    public vendedor(String nombre, String apellido, int DNI, double sueldo, int cant_ventas, int porcentaje) {
        super(nombre, apellido, DNI, sueldo);
        this.cant_ventas = cant_ventas;
        this.porcentaje = porcentaje;
    }

    public int getCant_ventas() {
        return cant_ventas;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    @Override
    public double getSueldo() {
        return (sueldo*(1+(getPorcentaje()/100)));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
