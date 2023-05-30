package practico5.facturacionEmpleados;

public class sueldoxVentas extends Sueldo{

    private int bonoxVentas = 50;
    private int bonoaCobrar = 5000;
    private double porcentaje;
    private double cantVentas;

    public sueldoxVentas(double sueldoBase, double porcentaje, double cantVentas){
        super(sueldoBase);
        this.porcentaje = porcentaje;
        this.cantVentas = cantVentas;
    }

    @Override
    public double getSueldoTotal() {
        if (cantVentas > bonoxVentas)
            return super.getSueldoTotal() * ( 1 +  porcentaje/ 100 ) + bonoaCobrar;
        else
            return super.getSueldoTotal() * ( 1 +  porcentaje/ 100 );
    }
}
