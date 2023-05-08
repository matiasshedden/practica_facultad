package practico3.fabricaMuebles;

public class producto {
    double peso;
    double costo_fab;
    double valor_venta;
    String tipo_madera;
    String color;
    String tipo_mueble;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosto_fab() {
        return costo_fab;
    }

    public void setCosto_fab(double costo_fab) {
        this.costo_fab = costo_fab;
    }

    public double getValor_venta() {
        return valor_venta;
    }

    public void setValor_venta(double valor_venta) {
        this.valor_venta = valor_venta;
    }

    public String getTipo_madera() {
        return tipo_madera;
    }

    public void setTipo_madera(String tipo_madera) {
        this.tipo_madera = tipo_madera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo_mueble() {
        return tipo_mueble;
    }

    public void setTipo_mueble(String tipo_mueble) {
        this.tipo_mueble = tipo_mueble;
    }

    public producto(String tipo_mueble, String tipo_madera, String color, double peso, double costo_fab) {
        this.tipo_mueble = tipo_mueble;
        this.tipo_madera = tipo_madera;
        this.color = color;
        this.peso = peso;
        this.costo_fab = costo_fab;
        //this.valor_venta = ; COMO LO RESUELVO??
    }
}
