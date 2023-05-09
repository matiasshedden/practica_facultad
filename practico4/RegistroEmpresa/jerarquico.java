package practico4.RegistroEmpresa;

import java.util.ArrayList;

public class jerarquico extends empleado{

    private ArrayList <empleado> E;

    public jerarquico () {
        super();
        E = new ArrayList<>();
    }

    public void addEmpleado(empleado Emp) {
        E.add(Emp);
    }
}
