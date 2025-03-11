import java.util.Date;

public class Cliente {

    private String nombre;
    private String apellido;
    private String fechaNac;
    private String domicilio;
    private int cp;
    private double saldo;
    private String carrera;

    public Cliente(String nombre, String apellido, String fechaNac, String domicilio, int cp, double saldo, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.domicilio = domicilio;
        this.cp = cp;
        this.saldo = saldo;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " fecha Nacimiento " + fechaNac + " " + domicilio + " cp " + cp + " saldo " + saldo + " carrera " + carrera;
    }
}
