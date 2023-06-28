package practico8.clubFutbol5;

public class CuotaImpaga extends condicion{
    private boolean pago;

    public CuotaImpaga (boolean pago){
        this.pago = pago;
    }
    @Override
    public boolean cumple(socio S) {
        return S.isCuota() == this.pago;
    }
}
