package practico8.Navidad;

import practico8.Navidad.Busquedas.condBusqueda;

import java.util.ArrayList;

public class BuzonPP extends ContenedorBPP {

    private ArrayList<ContenedorBPP> cartas;
    private ArrayList<Integer> ninos_buenos;
    private int cant_ninos_malos=0;

    public BuzonPP () {
        cartas = new ArrayList<ContenedorBPP>();
        ninos_buenos = new ArrayList<>();
    }

    //posibilidad de hacer un addBPP??
    public void addcarta(Carta C) {
        if (ninos_buenos.contains(C.getDni()))
            cartas.add(C);
        else
            { C.vaciar_regalos();
              C.addregalo("Carbon");
              cant_ninos_malos++;}
    }

    public void addContenedor(ContenedorBPP Cont){
        cartas.add(Cont);
    }

    public void addnino_bueno(Integer nb) {
        ninos_buenos.add(nb);
    }

    @Override
    public int cant_cartas() {
        int aux=0;
        for (ContenedorBPP Cont:cartas)
            aux += Cont.cant_cartas();
        return aux;
    }

    @Override
    public boolean tiene_regalo(String R) {
        boolean flag=false;
        for (ContenedorBPP c:cartas)
            if (c.tiene_regalo(R))
                flag=true;
        return flag;
    }

    @Override
    public String toString() {
        return "BuzonPP{" +
                "ninos_buenos=" + ninos_buenos +
                '}';
    }

    public int buscar (condBusqueda condicion) {
        //si cumple con la condicion dada, devuelvo la cantidad de veces que ocurre
        int aux=0;
        for (ContenedorBPP c:cartas)
            if (condicion.cumple(c))
                aux++;
        return aux;
    }

    public double porcentaje_cartas(condBusqueda cond1) {
        //Se multiplica por 1.0 para realizar la conversion a double, la otra opcion es hacer casting
        double aux = ((buscar(cond1)*1.0 / cant_cartas()) * 100);
        return aux;
    }

    public int CartasConRegalo(String R) {
        int aux=0;
        for (ContenedorBPP c:cartas)
            if (c.tiene_regalo(R))
                aux++;
        return aux;
    }

    //se puede trabajar con un ArrayList de niños malos para identificarlos
    public int getCant_ninos_malos() {
        return cant_ninos_malos;
    }
}
