package centroComputos;

public class Proceso implements Comparable<Proceso>{
    private String nombre;
    private double memoriaRequerida;

    public Proceso(String nombre, double memoriaRequerida) {
        this.nombre = nombre;
        this.memoriaRequerida = memoriaRequerida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMemoriaRequerida() {
        return memoriaRequerida;
    }

    public void setMemoriaRequerida(double memoriaRequerida) {
        this.memoriaRequerida = memoriaRequerida;
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "nombre='" + nombre + '\'' +
                ", memoriaRequerida=" + memoriaRequerida +
                '}';
    }


    @Override
    public int compareTo(Proceso o) {
        if (this.getMemoriaRequerida()>o.getMemoriaRequerida())
            return 1;
        else if (this.getMemoriaRequerida()<o.getMemoriaRequerida())
            return -1;
        return 0;
        //alternativa
        // return this.getMemoriaRequerida() - o.getMemoriaRequerida();
    }
}
