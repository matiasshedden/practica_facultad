package fileSystem.condiciones;

import fileSystem.ElementoFS;

public class CondicionNot extends Condicion{
    private Condicion directa;

    public CondicionNot(Condicion directa) {
        this.directa = directa;
    }

    @Override
    public boolean cumple(ElementoFS e) {
        return !directa.cumple(e);
    }
}
