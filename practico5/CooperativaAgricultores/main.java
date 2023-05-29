package practico5.CooperativaAgricultores;

public class main {
    public static void main(String[] args) {

        cooperativa Coop = new cooperativa();
        Coop.addMineral("oro");
        Coop.addMineral("cobre");
        lote chiquito = new lote(100);
        chiquito.addMineral("oro");
        chiquito.addMineral("plata");
        chiquito.addMineral("cobre");
        cereal trigo = new cereal("trigo");
        cereal maiz = new cereal("maiz");
        cereal girasol = new cereal("girasol");
        trigo.addMineral("oro");
        trigo.addMineral("plata");
        maiz.addMineral("cobre");
        girasol.addMineral("");

        if (Coop.contieneMineral(chiquito))
            System.out.println("El lote es especial");
        else
            System.out.println("El lote es comun");

        System.out.println(chiquito.contieneElemento());
    }
}
