package practico5.facturacionEmpleados;

public class empleado {
    String nombre;
    String apellido;
    int DNI;
    double sueldo;

    public empleado(String nombre, String apellido, int DNI, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "empleado {" +
                "'" + nombre +
                " " + apellido + '\'' +
                ", DNI " + DNI +
                ", sueldo " + sueldo +
                '}';
    }
}
