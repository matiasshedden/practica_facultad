package centroComputos;

import java.util.ArrayList;

public class CentroComputos {
    private ColaEspera computadoras;
    private ColaEspera procesos;

    public CentroComputos() {
        computadoras = new ColaEspera();
        procesos = new ColaEspera();
    }

    public void agregarComputadora(Computadora nueva){
        computadoras.agregarElemento(nueva);
    }

    public void agregarProceso(Proceso nuevo){
        procesos.agregarElemento(nuevo);
    }

    public void imprimir(){
        System.out.println(computadoras);
        System.out.println(procesos);
    }

    public static void main(String[] args) {
        CentroComputos tresaComputos = new CentroComputos();
        Computadora c1 = new Computadora("C1", 200.0);
        Computadora c2 = new Computadora("C2", 100.0);
        Computadora c3 = new Computadora("C3", 300.0);

        Proceso proc1 = new Proceso("Proc1", 230.5);
        Proceso proc2 = new Proceso("Proc2", 351.7);
        Proceso proc3 = new Proceso("Proc3", 123.5);

        tresaComputos.agregarComputadora(c1);
        tresaComputos.agregarComputadora(c2);
        tresaComputos.agregarComputadora(c3);

        tresaComputos.agregarProceso(proc1);
        tresaComputos.agregarProceso(proc2);
        tresaComputos.agregarProceso(proc3);

        tresaComputos.imprimir();

        System.out.println("hola".compareTo("zorro"));
    }
}
