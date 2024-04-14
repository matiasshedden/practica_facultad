package practico8.Aseguradora;

public abstract class TipoSeguro {

    private float monto_asegurado;
    /*private int montoFijo;
    private float porcentaje_asegurado;


    public int getMontoFijo() {
        return montoFijo;
    }

    public void setMontoFijo(int mf) {
        this.montoFijo = mf;
    }

    public void setPorcentaje_asegurado(float porcentaje_asegurado) { this.porcentaje_asegurado = porcentaje_asegurado; }

    public float getPorcentaje_asegurado() {
        return porcentaje_asegurado;
    }*/

    public float getMonto_asegurado() { return monto_asegurado; }

    public void setMonto_asegurado(float monto_asegurado) { this.monto_asegurado = monto_asegurado; }

    public abstract float get_monto();

}
