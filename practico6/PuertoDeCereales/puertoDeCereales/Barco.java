package puertoDeCereales;

public class Barco implements Comparable<Barco>{
    private int capacidad;
    private String nombre;

    public Barco (String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cargar(Camion Ca) {
        System.out.println("El camion " + Ca.getMarca() + " se cargo correctamente");
    }
    @Override
    public String toString() {
        return this.getNombre() + "-" + this.getCapacidad();
    }

    @Override
    public int compareTo(Barco o) {
        return (this.getCapacidad() - o.getCapacidad());
    }
}
