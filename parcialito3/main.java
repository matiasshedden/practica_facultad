package parcialito3;

public class main {
    public static void main(String[] args) {
        asociacion TA = new asociacion("TSAS");
        corredor C1 = new corredor(1983, "Juan", "Perez", 5);
        corredor C2 = new corredor(1993, "Pablo", "Perez", 4);
        corredor C3 = new corredor(2003, "Pedro", "Perez", 1);
        corredor C4 = new corredor(2013, "Mateo", "Perez", 10);

        condicionBusqueda cond1 = new BusquedaPorEdad(30);

        TA.addCorredor(C1);
        TA.addCorredor(C2);
        TA.addCorredor(C3);
        TA.addCorredor(C4);

        //System.out.println(TA.mostrarCorredores());
        System.out.println(TA.menoresDe(cond1));
    }
}
