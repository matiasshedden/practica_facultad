package practico5.facturacionEmpleados;

public class main {
    public static void main(String[] args) {

        empresa E = new empresa();
        empleado E1 = new empleado("Juan", "Perez", 26709681, 25000);
        empleado E2 = new empleado("Jose", "Gimenez", 26100681, 20000);
        empleado V1 = new vendedor("Joaquin", "Alzaga", 7566490, 75000, 43, 10);

        E.addempleado(E1);
        E.addempleado(E2);
        E.addempleado(V1);

        E.mostrarEmpleados();

        System.out.println(V1.getSueldo());

    }

}
