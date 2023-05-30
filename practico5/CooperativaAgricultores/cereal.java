package practico5.CooperativaAgricultores;

import java.util.ArrayList;

public class cereal extends minerales {
    String nombre;
    private ArrayList <String> mineralesRequeridos;


    public cereal (String nombre) {
        this.nombre = nombre;
        mineralesRequeridos = new ArrayList<>();
    }

    @Override
    public void addMineral(String mineral) {
        mineralesRequeridos.add(mineral);
    }

    @Override
    public boolean contieneMineral(String mineral) {
        if (mineralesRequeridos.contains(mineral))
            return true;
        return false;
    }

    public boolean contieneElemento(String elem) {
        return super.contieneElemento(mineralesRequeridos, elem);
    }

    public String getNombre() {
        return nombre;
    }
}
