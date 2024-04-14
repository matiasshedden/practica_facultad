package practico8.Aseguradora;

public class Combinado extends TipoSeguro {

    private TipoSeguro seg1, seg2;

    public Combinado(TipoSeguro seg1, TipoSeguro seg2) {
        this.seg1 = seg1;
        this.seg2 = seg2;
    }


    @Override
    public float get_monto() {
        return (seg1.get_monto()+seg2.get_monto());
    }
}
