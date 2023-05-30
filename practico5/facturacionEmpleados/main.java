package practico5.facturacionEmpleados;

public class main {
    public static void main(String[] args) {

        empresa E = new empresa();
        Sueldo S1 = new Sueldo(10000);
        Sueldo S2 = new sueldoxVentas(10000, 10, 55);
        empleado E1 = new empleado("Juan", "Perez", 26709681, S1);
        empleado E2 = new empleado("Jose", "Gimenez", 26100681, S1);
        empleado E3 = new empleado("Joaquin", "Alzaga", 7566490, S2);

        E.addempleado(E1);
        E.addempleado(E2);
        E.addempleado(E3);

        E.mostrarEmpleados();

        System.out.println(E1.getSueldo());
        System.out.println(E2.getSueldo());
        System.out.println(E3.getSueldo());

    }

}
