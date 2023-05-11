package practico4.RegistroEmpresa;

import java.util.ArrayList;

public class Jerarquico extends Empleado {

    private ArrayList <Empleado> E;

    public Jerarquico() {
        super();
        E = new ArrayList<>();
    }

    public void addEmpleado(Empleado Emp) {
        E.add(Emp);
    }

    public void mostrarEmpleados () {
        for (Empleado Emp:E) {
            System.out.println(Emp);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " jerarquico";
    }
}
