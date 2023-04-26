package practico2.Series;

public class Main {

    public static void main(String[] args) {
        Serie crepusculo = new Serie("Vida","Buena","Stephani","Romance");
        Temporada temp1 = new Temporada();
        Episodio cepi1 = new Episodio("HOY","Buena",true, 5);
        Episodio cepi2 = new Episodio ("Mañana","Mala",true,2);
        Episodio cepi3 = new Episodio ("Mañana parte 2","Mediana",false,3);
        Episodio cepi4 = new Episodio ("El dia","",false,-1);

        temp1.addEpisodio(cepi1);
        temp1.addEpisodio(cepi2);
        temp1.addEpisodio(cepi3);
        temp1.addEpisodio(cepi4);

        crepusculo.addTemporada(temp1);

        Temporada temp2 = new Temporada();
        Episodio c2epi1 = new Episodio("HOY","Buena",true, 5);
        Episodio c2epi2 = new Episodio ("Mañana","",false,-1);
        Episodio c2epi3 = new Episodio ("Mañana parte 2","",false,-1);
        Episodio c2epi4 = new Episodio ("El dia","",false,-1);

        temp2.addEpisodio(c2epi1);
        temp2.addEpisodio(c2epi2);
        temp2.addEpisodio(c2epi3);
        temp2.addEpisodio(c2epi4);

        crepusculo.addTemporada(temp2);

        Serie japonesa = new Serie("propuesta","Buena","Che ouy","Romance");

        Temporada j1temp1 = new Temporada();
        Episodio j1epi1 = new Episodio("HOY","Buena",true, 2);
        Episodio j1epi2 = new Episodio ("Mañana","",false,-1);
        Episodio j1epi3 = new Episodio ("Mañana parte 2","",false,-1);
        Episodio j1epi4 = new Episodio ("El dia","",false,-1);

        j1temp1.addEpisodio(j1epi1);
        j1temp1.addEpisodio(j1epi2);
        j1temp1.addEpisodio(j1epi3);
        j1temp1.addEpisodio(j1epi4);

        japonesa.addTemporada(j1temp1);


        System.out.println(temp1.totalVistos());





    }
}
