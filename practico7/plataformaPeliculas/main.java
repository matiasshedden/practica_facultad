package practico7.plataformaPeliculas;

public class main {
    public static void main(String[] args) {
        plataforma netflix = new plataforma();
        pelicula P1 = new pelicula("top gun", "accion", "Francis", "tom Cruise", 2022, 90, 18);
        pelicula P2 = new pelicula("dracula", "terror", "Francis", "Keanu", 1994, 200, 21);
        pelicula P3 = new pelicula("28 semanas despues", "terror", "Pedro", "Jhon", 1995, 150, 12);
        pelicula P4 = new pelicula("dracula nueva generacion", "accion", "Coppola", "Jake", 1990, 200, 10);
        pelicula P5 = new pelicula("toxic man", "terror", "Matt", "Peter", 2000, 100, 15);
        netflix.addPelicula(P1);
        netflix.addPelicula(P2);
        netflix.addPelicula(P3);
        netflix.addPelicula(P4);
        netflix.addPelicula(P5);

        condicionBusqueda cond1 = new busquedaPorDuracionMenor(120);
        condicionBusqueda cond2 = new condicionNOT(new busquedaXGenero("terror"));
        condicionBusqueda cond3 = new condicionAND(cond1, cond2);
        System.out.println(netflix.buscar(cond3));

        if (cond3.cumple(P2))
            System.out.println("La pelicula " + P2.getTitulo() + " es rentable");
        else
           System.out.println("La pelicula " + P2.getTitulo() + " NO es rentable");
    }
}
