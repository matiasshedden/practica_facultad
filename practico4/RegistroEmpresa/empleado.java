package practico4.RegistroEmpresa;

public class empleado extends persona {
    private int nroLegajo;
    double sueldo;

    public empleado() {

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
    public empleado(int nroLegajo, double sueldo) {
        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;
    }


    public String mostrarDatos () {
        return super.mostrarDatos();
    }
}
