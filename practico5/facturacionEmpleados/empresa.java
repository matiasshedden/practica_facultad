package practico5.facturacionEmpleados;

import java.util.ArrayList;

public class empresa {

    private ArrayList <empleado> empleados;

    public empresa() {
        empleados = new ArrayList<>();
    }
    public void addempleado(empleado e) {
        empleados.add(e);
    }

    public void mostrarEmpleados () {
        for (empleado e:empleados)
            System.out.println(e);
    }
}
