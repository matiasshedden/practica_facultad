package practico4.RegistroEmpresa;

import java.util.ArrayList;

public class empresa {

    private ArrayList <empleado> Empleados;
    private ArrayList <usuario_final> UsuariosF;

    public void addEmpleados(empleado Emp) {
        Empleados.add(Emp);
    }

    public void addusuarios(usuario_final UF) {
        UsuariosF.add(UF);
    }

    public empresa() {
        Empleados = new ArrayList<>();
        UsuariosF = new ArrayList<>();
    }

    public void mostrarEmpleados() {
        for (int i=0; i<Empleados.size();i++) {
            System.out.println(Empleados.get(i).mostrarDatos());
        }
    }

    public void mostrarUsuario() {
        for (int i=0; i<UsuariosF.size();i++) {
            System.out.println(UsuariosF.get(i).mostrarDatos());
        }
    }
}
