package puertoDeCereales;

public class main {
    public static void main(String[] args) {
        Puerto PP = new Puerto();
        Barco B1 = new Barco("Lorenzo", 100);
        Barco B2 = new Barco("Papa Francisco", 150);
        Barco B3 = new Barco("Independencia", 75);
        Camion C1 = new Camion("Mercedez");
        Camion C2 = new Camion("Ford");
        Camion C3 = new Camion("Chevrolet");
        C1.setFechaCarga(2023, 6, 5);
        C2.setFechaCarga(2023, 5,5);
        C3.setFechaCarga(1900, 5, 6);
        /*
        PP.addBarco(B1);
        PP.addBarco(B2);
        PP.addBarco(B3);
        */

        PP.addCamion(C1);
        PP.addCamion(C2);
        PP.addCamion(C3);

        //PP.imprimirBarcos();
        PP.imprimirCamiones();
    }
}
