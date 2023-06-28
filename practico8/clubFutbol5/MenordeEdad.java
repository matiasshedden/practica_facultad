package practico8.clubFutbol5;

public class MenordeEdad extends condicion{
    private final int menor=18;

    public MenordeEdad() {
    }
    @Override
    public boolean cumple(socio S) {
        return (S.getEdad()<menor);
    }
}
