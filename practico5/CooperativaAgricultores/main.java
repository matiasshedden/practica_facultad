package practico5.CooperativaAgricultores;

public class main {
    public static void main(String[] args) {

        cooperativa Coop = new cooperativa();
        Coop.addMineral("oro");
        Coop.addMineral("cobre");
        lote chiquito = new lote(10);
        chiquito.addMineral("oro");

        cereal trigo = new cereal("trigo");
        cereal maiz = new cereal("maiz");
        cereal girasol = new cereal("girasol");
        trigo.addMineral("oro");
        trigo.addMineral("plata");
        maiz.addMineral("cobre");
        girasol.addMineral("oro");
        pastura alfalfa = new pastura("alfalfa");
        alfalfa.addMineral("oro");

        if (girasol.contieneMineral(chiquito))
            System.out.println("Se puede plantar en el lote ");
        else
            System.out.println("NO se puede plantar en el lote");

        if (chiquito.contieneMineral(alfalfa))
            System.out.println("El lote acepta el cereal");
        else
            System.out.println("El lote NO acepta el cereal");

    }
}
