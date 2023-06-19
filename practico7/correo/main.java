package practico7.correo;

public class main {
    public static void main(String[] args) {
        simple S1 = new simple("matias", "yo", "Brown", "Tres Arroyos", "A domicilio", 1, 1.5);
        simple S2 = new simple("pedro", "tu", "Alsina", "Tres Arroyos", "Retiro", 2, 2.5);
        simple S3 = new simple("nicolas", "ellos", "San Lorenzo", "Chaves", "Retiro", 3, 0.5);
        combo C1 = new combo("nadie", "cualquiera", "Paso", "Dorrego", "A domicilio", 4);
        C1.addEnvio(S1);
        C1.addEnvio(S2);

        System.out.println(S1.getTracking());
        System.out.println(S2.getTracking());
        System.out.println(C1.getTracking());
        //C1.mostrarCombo();
    }
}
