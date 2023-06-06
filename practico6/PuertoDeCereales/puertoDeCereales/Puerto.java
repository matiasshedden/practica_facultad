package puertoDeCereales;

public class Puerto {
    private ListaOrdenada BarcosLibres;
    private ListaOrdenada CamionesEnEspera;

    public Puerto() {
        BarcosLibres = new ListaOrdenada();
        CamionesEnEspera = new ListaOrdenada();
    }
    //A PARTIR DE ACA REFACTOR DE TODOS LOS METODOS A BARCO Y CAMION
    public void addCamion(Camion camion) {
        if (BarcosLibres.vacia()) {
            CamionesEnEspera.insertar(camion);
        } else {
            //Si tengo barcos disponibles, en el siguiente cargo el camion
            Barco titus = (Barco) BarcosLibres.siguiente();
            titus.cargar(camion);
        }
    }

    public void addBarco(Barco titus) {
        if (CamionesEnEspera.vacia()) {
            BarcosLibres.insertar(titus);
        } else {
            //Si tengo camiones, tomo el barco y le cargo el mismo
            Camion camion = (Camion) CamionesEnEspera.siguiente();
            titus.cargar(camion);
        }
    }

    public void imprimirBarcos() {
        while (!BarcosLibres.vacia())
            System.out.println(BarcosLibres.siguiente());
    }

    public void imprimirCamiones() {
        while (!CamionesEnEspera.vacia())
            System.out.println(CamionesEnEspera.siguiente());
    }
}
