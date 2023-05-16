import java.util.ArrayList;

public class Pais {

    private String nombre;
    private ArrayList<Provincia> P;

    public Pais (String nombre) {
        this.nombre = nombre;
        P = new ArrayList<>();
    }

    public void addProvincia (Provincia Prov) {
        P.add(Prov);
    }

    public void getCiudadGastadoraTotal () {
        for (Provincia Prov:P) {
            Prov.getciudadesgastadoras();
        }
    }
}
