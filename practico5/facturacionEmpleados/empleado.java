package practico5.facturacionEmpleados;

public class empleado {
    private String nombre;
    private String apellido;
    private int DNI;
    private Sueldo sueldo;

    public empleado(String nombre, String apellido, int DNI, Sueldo sueldo) {
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
        if (sueldo != null) {
            return sueldo.getSueldoTotal();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "empleado {" +
                "'" + nombre +
                " " + apellido + '\'' +
                ", DNI " + DNI +
                ", sueldo " + this.getSueldo() +
                '}';
    }
}
