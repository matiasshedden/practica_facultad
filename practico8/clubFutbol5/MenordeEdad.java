package practico8.clubFutbol5;

public class MenordeEdad extends condicion{
    private final int menor=18;
    private int edad;

    public MenordeEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean cumple(socio S) {
        return (S.getEdad()<menor);
    }
}
