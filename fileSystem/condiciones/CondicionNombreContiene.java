package fileSystem.condiciones;

import fileSystem.ElementoFS;

public class CondicionNombreContiene extends Condicion{
    private String substring;

    public CondicionNombreContiene(String substring) {
        this.substring = substring;
    }

    @Override
    public boolean cumple(ElementoFS e) {
        return e.getNombre().contains(substring);
    }
}
