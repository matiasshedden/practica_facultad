package practico4.RegistroEmpresa;

public class Main {
    public static void main (String[] args) {
        empleado E1 = new empleado(176678, 200);
        empleado E2 = new empleado(176679, 200);
        empleado E3 = new empleado(176680, 150);
        E1.setNombre("Matias");
        E1.setApellido("Shedden");
        E1.setEdad(44);
        E2.setNombre("NoMans");
        E2.setApellido("land");
        E2.setEdad(30);
        E3.setNombre("Italo");
        E3.setApellido("Calvino");
        E3.setEdad(50);
        usuario_final uf1 = new usuario_final("elpelotas", "niidea");
        usuario_final uf2 = new usuario_final("elpelotitas", "niidea2");
        uf1.setNombre("Pelo");
        uf1.setApellido("tas");
        uf1.setEdad(31);
        uf2.setNombre("Carita");
        uf2.setApellido("triste");
        uf2.setEdad(33);

        empresa Best = new empresa();
        Best.addEmpleados(E1);
        Best.addEmpleados(E2);
        Best.addEmpleados(E3);
        Best.addusuarios(uf1);
        Best.addusuarios(uf2);

        Best.mostrarEmpleados();
        Best.mostrarUsuario();

    }
}
