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
}
