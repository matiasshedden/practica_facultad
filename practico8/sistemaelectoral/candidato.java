package practico8.sistemaelectoral;

public class candidato implements Comparable<candidato>{
    private String nombre;
    private String partido;
    private String agrupacion;

    public candidato(String nombre, String partido, String agrupacion) {
        this.nombre = nombre;
        this.partido = partido;
        this.agrupacion = agrupacion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPartido() { return partido; }
    public void setPartido(String partido) {
        this.partido = partido;
    }
    public String getAgrupacion() {
        return agrupacion;
    }
    public void setAgrupacion(String agrupacion) {
        this.agrupacion = agrupacion;
    }

    public int compareTo(candidato c) {
        int aux = this.getPartido().compareTo(c.getPartido());
        int aux1 = this.getAgrupacion().compareTo(c.getAgrupacion());
        if ((aux == 0) && (aux1==0))
            return this.getNombre().compareTo(c.getNombre());
        else if ((aux == 0) && (aux1!=0)) {
            return this.getAgrupacion().compareTo(c.getAgrupacion());
        } else
            return this.getPartido().compareTo(c.getPartido());

    }

    @Override
    public String toString() {
        return "candidato{" + nombre + '\'' +", del partido " + partido + '\'' +", de='" + agrupacion + '\'' + "\n";
    }
}
