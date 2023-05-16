public class Ciudad {

    private String nombre;
    private int cantHabitantes;
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;
    private double imp5;
    private double gastos;


    //Metodos

    public String getNombre() {
        return nombre;
    }
    public int getCantHabitantes() {
        return cantHabitantes;
    }
    public double getImp1() {
        return imp1;
    }
    public void setImp1(double imp1) {
        this.imp1 = imp1;
    }
    public double getImp2() {
        return imp2;
    }
    public void setImp2(double imp2) {
        this.imp2 = imp2;
    }
    public double getImp3() {
        return imp3;
    }
    public void setImp3(double imp3) {
        this.imp3 = imp3;
    }
    public double getImp4() {
        return imp4;
    }
    public void setImp4(double imp4) {
        this.imp4 = imp4;
    }
    public double getImp5() {
        return imp5;
    }
    public void setImp5(double imp5) {
        this.imp5 = imp5;
    }
    public double getGastos() {
        return gastos;
    }
    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
    public double recaudacion () {
        return imp1 + imp2 + imp3 + imp4 + imp5;
    }

    //Constructor
    public Ciudad (String nombre, int habitantes, double gastos, double imp1, double imp2, double imp3,
                   double imp4, double imp5) {
        this.nombre = nombre;
        this.cantHabitantes = habitantes;
        this.gastos = gastos;
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
    }
    public boolean gastademas () {
        return (this.recaudacion() < this.getGastos());
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
