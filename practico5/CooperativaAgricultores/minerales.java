package practico5.CooperativaAgricultores;

import java.util.ArrayList;

public abstract class minerales {

    public abstract void addMineral(String mineral);

    public abstract boolean contieneMineral(String mineral);

    public boolean contieneElemento(ArrayList <String> A, String elem) {
        if (A.isEmpty())
            return false;
        for (String e:A)
            if (!A.contains(elem))
                return false;
        return true;
    }
}
