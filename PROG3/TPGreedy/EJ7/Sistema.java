package EJ7;

public class Sistema {
    public static void main(String[] args) {
        Cancion C1 = new Cancion("lalaland", "pop", 4, 5);
        Cancion C2 = new Cancion("pinocho", "black", 8, 8);
        Cancion C3 = new Cancion("la conga", "pop", 4, 5);
        Cancion C4 = new Cancion("sobredosis de tv", "pop", 4, 5);
        Cancion C5 = new Cancion("dale", "rock", 5, 6);
        Cancion C6 = new Cancion("elvis presley", "pop", 4, 5);
        Cancion C7 = new Cancion("yellow submarine", "rock", 5, 6);

        CD C = new CD(40);
        C.addCanciones(C1);
        C.addCanciones(C2);
        C.addCanciones(C3);
        C.addCanciones(C4);
        C.addCanciones(C5);
        C.addCanciones(C6);
        C.addCanciones(C7);

        System.out.println(C.maximimaCapacidad());
    }
}
