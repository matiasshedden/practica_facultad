package practico4.RegistroEmpresa;

public class Empleado extends Persona {
    private int nroLegajo;
    double sueldo;

    public Empleado() {

    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Constructor
    public Empleado(int nroLegajo, double sueldo) {
        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + ", empleado";
    }
}
