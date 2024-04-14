package practico8.Aseguradora;

public class PorcValorAsegurado extends TipoSeguro {

    private int porcentaje;

    public PorcValorAsegurado(float montoAsegurado, int porcentaje) {
        super.setMonto_asegurado(montoAsegurado);
        this.porcentaje = porcentaje;
    }

    //Devuelve un porcentaje del valor asegurado
    @Override
    public float get_monto() {
        return (getMonto_asegurado()*porcentaje)/100;
    }
}
