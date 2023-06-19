package practico7.correo;

import java.util.ArrayList;

public class combo extends envio{
    private ArrayList<envio> envios;

    public combo(String destinatario, String remitente, String direccion, String ciudad, String modo_envio, int tracking) {
        super(destinatario, remitente, direccion, ciudad, modo_envio, tracking);
        envios = new ArrayList<envio>();
    }


    @Override
    public double getPeso() {
        double pesoTotal = 0;
        for (envio e:envios)
            pesoTotal += e.getPeso();
        return pesoTotal;
    }

    public void addEnvio(envio e) {
        e.setTracking(this.getTracking());
        envios.add(e);
    }

    public void mostrarCombo() {
        for (envio e:envios)
            System.out.println(e);
    }
}
