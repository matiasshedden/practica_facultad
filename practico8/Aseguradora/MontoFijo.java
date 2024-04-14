package practico8.Aseguradora;

public class MontoFijo extends TipoSeguro {

    private int montofijo;

    public MontoFijo(float montoAsegurado, int montoFijo) {
        super.setMonto_asegurado(montoAsegurado);
        this.montofijo = montoFijo;
    }

    //Devuelve un monto fijo
    @Override
    public float get_monto() {
        return montofijo;
    }
}
