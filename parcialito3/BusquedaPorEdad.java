package parcialito3;

import java.time.LocalDate;

public class BusquedaPorEdad extends condicionBusqueda {
    private int edad;

    public BusquedaPorEdad(int edad) {this.edad = edad; }

    @Override
    public boolean cumple(corredor c) {
        if (LocalDate.now().getYear() - c.getAnio_nac() <= edad)
            return true;
        return false;
    }
}
