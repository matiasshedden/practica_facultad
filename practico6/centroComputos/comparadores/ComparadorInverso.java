package centroComputos.comparadores;

import java.util.Comparator;

public class ComparadorInverso implements Comparator {
    private Comparator directo;

    public ComparadorInverso(Comparator directo){
        this.directo = directo;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return -1 * directo.compare(o1,o2);
    }
}
