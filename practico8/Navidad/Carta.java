package practico8.Navidad;

import java.util.ArrayList;

public class Carta extends ContenedorBPP {

    private int dni;
    private ArrayList<String> regalos;

    public Carta(int DNI) {
        this.dni = DNI;
        regalos = new ArrayList<>();
    }

    public int getDni() {
        return dni;
    }

    public void addregalo(String R) {
        regalos.add(R);
    }

    public void vaciar_regalos() {
        regalos.clear();
    }
    @Override
    public int cant_cartas() {
        return 1;
    }

    @Override
    public boolean tiene_regalo(String R) {
        return regalos.contains(R);
    }

    @Override
    public String toString() {
        return "Carta{" +
                "dni=" + dni +
                ", regalos=" + regalos +
                '}';
    }
}
