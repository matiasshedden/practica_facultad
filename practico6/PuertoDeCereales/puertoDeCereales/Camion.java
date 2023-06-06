package puertoDeCereales;

import java.time.LocalDate;

public class Camion implements Comparable<Camion>{
    private String marca;
    private LocalDate fechaCarga;


    public Camion(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(int anio, int mes, int dia) {
        this.fechaCarga = LocalDate.of(anio, mes, dia);
    }

    @Override
    public String toString() {
        return this.getMarca() + "-" + getFechaCarga();
    }

    @Override
    public int compareTo(Camion o) {
        return this.getFechaCarga().compareTo(o.getFechaCarga());
    }
}
