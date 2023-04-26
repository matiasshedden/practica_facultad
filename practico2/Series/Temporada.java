package practico2.Series;

import java.util.ArrayList;


public class Temporada extends ElementoSerie {

    private ArrayList<Episodio> episodios;

    public Temporada() {
        episodios= new ArrayList<>();
    }

    public void addEpisodio(Episodio e){
        episodios.add(e);
    }

    public void removeEpisodio(Episodio e){
        episodios.remove(e);
    }

    public boolean hasEpisodio(Episodio e){
        return episodios.contains(e);

    }

    @Override
    public int totalVistos(){
        int total=0;
        
        for(int i=0;i<episodios.size();i++){
        	if (episodios.get(i).isVisto()) 
        		total++;
        }
        return total;
    }

    @Override
    public int promedioCalificaciones(){
        int promedio=0;
        int total=0;

        for(Episodio e:episodios){
           total += e.getCalificacion();
        }
        promedio=(total/(episodios.size()));
        return promedio;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "episodios=" + episodios +
                '}';
    }
}
