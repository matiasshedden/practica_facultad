package practico5.CooperativaAgricultores;

public class pastura extends cereal{

    public pastura (String nombre) {
        super(nombre);
    }
    private final double minimoHa = 50;//minimo ha para sembrar pastura

    @Override
    public boolean contieneMineral(lote lot) {
        if (lot.getSuperficie() > minimoHa)
            return super.contieneMineral(lot);
        else
            return false;
    }
}
