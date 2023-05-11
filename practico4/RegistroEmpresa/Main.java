package practico4.RegistroEmpresa;

public class Main {
    public static void main (String[] args) {
        Empleado E1 = new Empleado(176678, 200);
        Empleado E2 = new Empleado(176679, 200);
        Empleado E3 = new Empleado(176680, 150);
        E1.setNombre("Matias");
        E1.setApellido("Shedden");
        E1.setEdad(44);
        E2.setNombre("NoMans");
        E2.setApellido("land");
        E2.setEdad(30);
        E3.setNombre("Italo");
        E3.setApellido("Calvino");
        E3.setEdad(50);
        Usuario_final uf1 = new Usuario_final("elpelotas", "niidea");
        Usuario_final uf2 = new Usuario_final("elpelotitas", "niidea2");
        uf1.setNombre("Pelo");
        uf1.setApellido("tas");
        uf1.setEdad(31);
        uf2.setNombre("Carita");
        uf2.setApellido("triste");
        uf2.setEdad(33);
        Jerarquico J = new Jerarquico();
        J.setNombre("El");
        J.setApellido("Jefecito");
        J.setEdad(98);
        J.addEmpleado(E1);
        J.addEmpleado(E2);
        J.addEmpleado(E3);

        Empresa Best = new Empresa();
        Best.addPersona(E1);
        Best.addPersona(E2);
        Best.addPersona(E3);
        Best.addPersona(uf1);
        Best.addPersona(uf2);
        Best.addPersona(J);

        Best.mostrarPersonas();
        System.out.println("Los empleados son: ");
        J.mostrarEmpleados();
    }
}
