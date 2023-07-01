package practico9.FabricaDeMuebles;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mueble {
    private String material;
    ArrayList<String> caracteristicas;
    LocalDate fechaLimite;
    double costo;
    double precioVenta;

    //Constructor
    public Mueble(String material, LocalDate fechaLimite, double costo, double precioVenta) {
        this.material = material;
        this.fechaLimite = fechaLimite;
        this.costo = costo;
        this.precioVenta = precioVenta;
        caracteristicas = new ArrayList<>();
    }

    //Metodos

    public String getMaterial() { return material; }

    public void setMaterial(String material) { this.material = material; }

    public LocalDate getFechaLimite() { return fechaLimite; }

    public void setFechaLimite(LocalDate fechaLimite) { this.fechaLimite = fechaLimite; }

    public double getCosto() { return costo; }

    public void setCosto(double costo) { this.costo = costo; }

    public double getPrecioVenta() { return precioVenta; }

    public void setPrecioVenta(double precioVenta) { this.precioVenta = precioVenta; }

    public void addCaracteristica (String C) { caracteristicas.add(C); }

    public boolean getCaracteristica(String C) {
        if (caracteristicas.contains(C))
                return true;
        return false;
    }

    public double getGanancia() {
        return (this.getPrecioVenta()-this.getCosto()); }

    @Override
    public String toString() {
        return "Mueble de " + material + " con " + caracteristicas + " fechaLimite: " + fechaLimite +
                " y ganancia: " + this.getGanancia() + "\n";
    }

}
