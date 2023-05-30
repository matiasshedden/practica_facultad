package practico5.CooperativaAgricultores;

import java.util.ArrayList;

public class cooperativa {
    private ArrayList <String> mineralesInteresantes;

    public cooperativa () {
        mineralesInteresantes = new ArrayList<>();
    }

    public void addMineral (String min) {
        mineralesInteresantes.add(min);
    }

    public boolean contieneMineral(lote lot) {
    //Busca si el mineral especial esta en el lote
        if (mineralesInteresantes.isEmpty())
            return false;
        for (String m:mineralesInteresantes)
            if (!lot.contieneMineral(m))
                return false;
        return true;
    }

}
