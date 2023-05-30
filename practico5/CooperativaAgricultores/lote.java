package practico5.CooperativaAgricultores;

import java.util.ArrayList;

public class lote extends minerales{

    private int superficie;
    private ArrayList <String> minerales;

    public lote (int superficie) {
        this.superficie = superficie;
        minerales = new ArrayList<>();
    }

    public void addMineral (String min) {
        minerales.add(min);
    }

    @Override
    public boolean contieneMineral(String mineral) {
        if (minerales.contains(mineral))
            return true;
        return false;
    }


    public boolean contieneElemento(String elem) {
        return super.contieneElemento(minerales, elem);
    }
}
