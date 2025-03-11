import java.util.Hashtable;
import java.util.Scanner;

public class SistemaCliente {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        Cliente C1 = new Cliente("Juan", "Sosa", "21-04-1980", "Lalala 123", 4500, 1100, "TUDAI");
        Cliente C2 = new Cliente("Roberto", "Carlos", "21-04-1978", "Lalala 123", 4500, 500, "TUDAI");
        Cliente C3 = new Cliente("Carlos", "Alegre", "21-04-1978", "Lalala 123", 4000, 10000, "HUMANAS");
        Cliente C4 = new Cliente("Lucas", "Sosa", "21-04-1978", "Lalala 123", 4000, 400, "DATOS");
        Cliente C5 = new Cliente("Jhon", "Sosa", "21-04-1978", "Lalala 123", 5000, 750, "PROGRAMACION");

        Hashtable<Integer, Cliente> listaClientes = new Hashtable<Integer, Cliente>();
        listaClientes.put(26709681, C1);
        listaClientes.put(49551335, C2);
        listaClientes.put(27800889, C3);
        listaClientes.put(54685468, C4);
        listaClientes.put(10011510, C5);

        System.out.println("ingrese un nro de DNI");
        int doc = lectura.nextInt();
        System.out.println(listaClientes.get(doc).getSaldo());

    }
}
