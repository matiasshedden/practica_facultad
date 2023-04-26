package centroComputos;

public class Computadora implements Comparable<Computadora>{
    private String nombre;
    private double velocidad;

    public Computadora(String nombre, double velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }


    @Override
    public int compareTo(Computadora o) {
        //puede traer problemas de redondeo y decir que dos objetos son
        //iguales (retornar 0) cuando en realidad no lo eran
        return (int) this.getVelocidad()- (int) o.getVelocidad();
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "nombre='" + nombre + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }


}
