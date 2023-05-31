package practico5.CooperativaAgricultores;

import java.util.ArrayList;

public class lote{

    private int superficie;
    private ArrayList <String> mineralesProvistos;

    public lote (int superficie) {
        this.superficie = superficie;
        mineralesProvistos = new ArrayList<>();
    }

    public void addMineral (String min) {
        mineralesProvistos.add(min);
    }


    public boolean contieneMineral(String mineral) {
        if (mineralesProvistos.contains(mineral))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "lote: " + this.getClass();
    }
    public boolean contieneMineral(cereal cer) {
        //Busca si el cereal contiene los minerales del lote
        if (!mineralesProvistos.isEmpty())
            for (String m:mineralesProvistos)
                if (!cer.contieneMineral(m))
                    return false;
        return true;
    }

    public int getSuperficie() {
        return superficie;
    }
}
