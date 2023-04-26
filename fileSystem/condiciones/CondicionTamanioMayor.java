package fileSystem.condiciones;

import fileSystem.ElementoFS;

public class CondicionTamanioMayor extends Condicion{
    private double tamMinimo;

    public CondicionTamanioMayor(double tamMinimo) {
        this.tamMinimo = tamMinimo;
    }

    @Override
    public boolean cumple(ElementoFS e) {
        return e.getTamanio()>this.tamMinimo;
    }
}
