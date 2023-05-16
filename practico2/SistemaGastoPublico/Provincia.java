import java.util.ArrayList;

public class Provincia {

    private String nombre;
    private ArrayList <Ciudad> C;

    //constructor
    public Provincia(String nombre) {
        this.nombre = nombre;
        C = new ArrayList<>();
    }
    //Metodos
    public int cantciudadesgastadoras () {
        int contador=0;
        for (Ciudad Ciu:C) {
            if ((Ciu.getCantHabitantes() > 100000) && (Ciu.gastademas())) {
                contador++;
            }
        } return contador;
    }

    public void addCiudad (Ciudad Ciu) {
        C.add(Ciu);
    }

    public void getciudadesgastadoras () {
        for (Ciudad Ciu:C) {
            if ((Ciu.getCantHabitantes() > 100000) && (Ciu.gastademas())) {
                System.out.println(Ciu.getNombre());
            }
        }
    }
}
