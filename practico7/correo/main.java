package practico7.correo;

public class main {
    public static void main(String[] args) {
        simple S1 = new simple("matias", "yo", "Brown", "Tres Arroyos", "A domicilio", 1, 1.5);
        simple S2 = new simple("pedro", "tu", "Alsina", "Tres Arroyos", "Retiro", 2, 2.5);
        simple S3 = new simple("nicolas", "ellos", "San Lorenzo", "Chaves", "Retiro", 3, 0.5);
        combo C1 = new combo("nadie", "cualquiera", "Paso", "Dorrego", "A domicilio", 4);
        combo C2 = new combo("nobody", "nadie2", "saenz peña", "Dorrego", "A domicilio", 5);
        C1.addEnvio(S1);
        C1.addEnvio(S2);
        C1.addEnvio(C2);
        C2.addEnvio(S3);

        System.out.println(C2.getTracking());
        C1.mostrarCombo();
        C2.mostrarCombo();

    }
}
