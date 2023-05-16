import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {

        Ciudad C1 = new Ciudad("Chaves", 8000, 1000, 5, 3, 4, 4, 10);
        Ciudad C2 = new Ciudad("Tres Arroyos", 60000, 100, 10, 10, 10, 10, 10);
        Ciudad C3 = new Ciudad("Tandil", 180000, 5000, 100, 100, 200, 100, 200);
        Ciudad C4 = new Ciudad("Mar del plata", 500000, 4000, 1000, 100, 15, 40, 50);
        Provincia P1 = new Provincia("Buenos Aires");
        Pais PP = new Pais("Argentina");

        P1.addCiudad(C1);
        P1.addCiudad(C2);
        P1.addCiudad(C3);
        P1.addCiudad(C4);
        PP.addProvincia(P1);

        PP.getCiudadGastadoraTotal();
    }
}
