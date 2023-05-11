package practico4.RegistroEmpresa;

import java.util.ArrayList;

public class Empresa {

    private ArrayList <Persona> P;

    public void addPersona(Persona per) {
        P.add(per);
    }

    public Empresa() {
        P = new ArrayList<>();
    }

    public void mostrarPersonas() {
        for (Persona Per:P) {
            System.out.println(Per);
        }
    }

}
