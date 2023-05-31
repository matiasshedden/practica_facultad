package practico5.CooperativaAgricultores;

import java.util.ArrayList;

public class cereal{
    String nombre;
    private ArrayList <String> mineralesRequeridos;


    public cereal (String nombre) {
        this.nombre = nombre;
        mineralesRequeridos = new ArrayList<>();
    }


    public void addMineral(String mineral) {
        mineralesRequeridos.add(mineral);
    }


    public boolean contieneMineral(String mineral) {
        if (mineralesRequeridos.contains(mineral))
            return true;
        return false;
    }
    public String getNombre() {
        return nombre;
    }

    public boolean contieneMineral(lote lot) {
        //Busca si el mineral esta en el lote
        if (!mineralesRequeridos.isEmpty())
            for (String m:mineralesRequeridos)
                if (!lot.contieneMineral(m))
                    return false;
        return true;
    }
}
