package practico7.correo;

public abstract class envio {

    private String destinatario;
    private String remitente;
    private String direccion;
    private String ciudad;
    private String modo_envio;
    private int tracking;

    protected envio(String destinatario, String remitente, String direccion, String ciudad, String modo_envio, int tracking) {
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.modo_envio = modo_envio;
        this.tracking = tracking;
    }

    public abstract double getPeso();
    public void setTracking(int tracking) { this.tracking = tracking; }
    public int getTracking() { return tracking; }
    public String getCiudad() { return ciudad; }

    public String getDestinatario() {
        return destinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getModo_envio() {
        return modo_envio;
    }
}
