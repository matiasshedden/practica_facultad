package fileSystem;

import fileSystem.condiciones.Condicion;

import java.util.ArrayList;

public class Carpeta extends ElementoFS{
    private ArrayList<ElementoFS> elementos;

    public Carpeta(String nombre) {
        super(nombre);
        elementos = new ArrayList<>();
    }

    public void agregarElemento(ElementoFS elem){
        if (!elementos.contains(elem))
            elementos.add(elem);
    }

    public void eliminarElemento(ElementoFS elem){
        elementos.remove(elem); //NO OLVIDARME DEL EQUALS
    }

    @Override
    public int cantidadArchivos(){
        //return archivos.size();//SOLO 1 NIVEL
        int cant = 0;
        for(ElementoFS e:elementos){
            cant += e.cantidadArchivos();
        }
        return cant;
    }

    @Override
    public double getTamanio(){
        double total = 0.0;
        for(ElementoFS e:elementos){
            total += e.getTamanio();
        }
        return total;
    }

    public ArrayList<ElementoFS> buscar(Condicion cond) {
        ArrayList<ElementoFS> retorno = super.buscar(cond);
        for (ElementoFS hijo:elementos){
            //lo que hubiera estado mal es
            //if(cond.cumple(hijo) { retorno.add(hijo) };
            retorno.addAll(hijo.buscar(cond));
        }
        return retorno;
    }

    /*
    Estos dos métodos siguientes NO VAN EN LA SOLUCION FINAL, se usa el de arriba
     */
    @Override
    public ArrayList<ElementoFS> buscarNombre(String nombre) {
        ArrayList<ElementoFS> retorno = super.buscarNombre(nombre);
        for (ElementoFS hijo:elementos){
            /*ArrayList<ElementoFS> retornoParcial =hijo.buscarNombre(nombre);
            for (ElementoFS resHijo:retornoParcial)
                retorno.add(resHijo);
            */
            retorno.addAll(hijo.buscarNombre(nombre));
        }
        return retorno;
    }
    @Override
    public ArrayList<ElementoFS> tamanioMayor(double min) {
        ArrayList<ElementoFS> retorno = super.tamanioMayor(min);
        for (ElementoFS hijo:elementos){
            /*ArrayList<ElementoFS> retornoParcial =hijo.buscarNombre(nombre);
            for (ElementoFS resHijo:retornoParcial)
                retorno.add(resHijo);
            */
            retorno.addAll(hijo.tamanioMayor(min));
        }
        return retorno;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        try {
            Carpeta otro = (Carpeta) o; //Esto puede fallar si me quieren comparar una carpeta con un comprimido con los mismos nombres
            return this.getNombre().equals(otro.getNombre());
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        String retorno = this.getNombre();/*+"{";
        int i = 0;
        while (i < elementos.size()) {
            retorno+=elementos.get(i).toString();
            if (i!=elementos.size()-1)
                retorno+=";";
            i++;
        }*/
        return retorno;/*+"}";*/
    }
}
