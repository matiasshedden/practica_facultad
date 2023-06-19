package practico7.plataformaPeliculas;

import java.util.ArrayList;

public class plataforma {
    private ArrayList<pelicula> peliculas;

    public plataforma () {
        peliculas = new ArrayList<pelicula>();
    }

    public void addPelicula (pelicula P) { peliculas.add(P); }

    public ArrayList<pelicula> buscar(condicionBusqueda condicion) {
        ArrayList<pelicula> resultado = new ArrayList<pelicula>();
        for (pelicula p:peliculas)
            if (condicion.cumple(p))
                resultado.add(p);
        return resultado;
    }
}
