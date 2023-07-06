package prefinal2022;

import java.util.ArrayList;

public class foro extends ElementoT {
    private ArrayList<ElementoT> foro;

    public foro() {
        foro = new ArrayList<ElementoT>();
    }

    public void agregarElementoT(ElementoT ET){
        foro.add(ET);
    }

    @Override
    public ArrayList<String> getpalabrasClaves() {
        ArrayList<String> aux = new ArrayList<>();
        for (int i = 0; i < foro.size(); i++) {
            ElementoT hijo = foro.get(i);
            ArrayList<String> palabrasC = hijo.getpalabrasClaves();
            for (String pal:palabrasC)
                if (!aux.contains(pal))
                    aux.add(pal);
        }
        return aux;
    }

    @Override
    public String getejeTematico() {//Devolver el ultimo eje tematico de sus elementos
        return null;
    }
}
