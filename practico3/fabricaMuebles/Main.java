package practico3.fabricaMuebles;

public class Main {
    public static void main(String[] args) {

        producto P1 = new producto("silla","pino", "blanca", 15, 1000);
        producto P2 = new producto("silla","parana", "negra", 25, 2000);
        producto P3 = new producto("mesa","pino", "wenge", 50, 2000);
        producto P4 = new producto("banco","pino", "marron", 100, 5000);

        fabrica F = new fabrica();

        F.addProductos(P1);
        F.addProductos(P2);
        F.addProductos(P3);
        F.addProductos(P4);

        double total_costo = F.getPrecioCostodeVenta();
        System.out.println("El costo de los productos es: " + total_costo);
        double total = (F.getPrecioCostodeVenta() + (F.getPrecioCostodeVenta()*F.recargo)/100);
        System.out.println("El precio de venta de los productos es: " + total);
    }
}
