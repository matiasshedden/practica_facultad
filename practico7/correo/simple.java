package practico7.correo;

public class simple extends envio{
    private double peso;
    public simple(String destinatario, String remitente, String direccion, String ciudad, String modo_envio, int tracking, double peso) {
        super(destinatario, remitente, direccion, ciudad, modo_envio, tracking);
        this.peso = peso;
    }

    @Override
    public double getPeso() {
        return this.getPeso();
    }

    @Override
    public String toString() {
        return "envio simple a destinatario: " + this.getDestinatario() + "- nro tracking: " + this.getTracking() +"}"; }
}
