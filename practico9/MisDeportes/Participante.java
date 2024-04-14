package practico9.MisDeportes;

public class Participante {

    private String nombre;
    private String apellido;
    private String ciudad_origen;
    private int puntos_acumulados;

    public Participante(String nombre, String apellido, String ciudad_origen, int puntos_acumulados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad_origen = ciudad_origen;
        this.puntos_acumulados = puntos_acumulados;
    }

    public String getNombre() { return nombre; }

    public String getApellido() { return apellido; }

    public String getCiudad_origen() { return ciudad_origen; }

    public int getPuntos_acumulados() { return puntos_acumulados; }

    @Override
    public String toString() {
        return nombre + '\'' + apellido + '\'' + ", de " + ciudad_origen + '\'' + " con "  + puntos_acumulados + " puntos"; }

}
