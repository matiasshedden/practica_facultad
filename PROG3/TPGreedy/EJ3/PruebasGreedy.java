package EJ3;

public class PruebasGreedy {
    public static void main(String[] args) {
        Actividad A1 = new Actividad("teatro", 15, 16);
        Actividad A2 = new Actividad("cine", 16, 17);
        Actividad A3 = new Actividad("baile", 18, 19);
        Actividad A4 = new Actividad("folclote", 14, 17);
        Actividad A5 = new Actividad("pintura", 15, 16);
        Actividad A6 = new Actividad("escultura", 17, 18);

        MaximizarActividades ma = new MaximizarActividades();
        ma.addActividades(A1);
        ma.addActividades(A2);
        ma.addActividades(A3);
        ma.addActividades(A4);
        ma.addActividades(A5);
        ma.addActividades(A6);

        System.out.println("Las actividades son: " + ma.greedyA());
    }
}
