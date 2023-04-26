package agroquimico;

import java.util.ArrayList;

public class Enfermedad {
  
  private String nombre;
  private ArrayList <String> estadosPatologicos;//caracteristicas de la enfermedad
  
  
  
  
  
  public boolean contieneCaracteristica(String caracteristica ){
    return estadosPatologicos.contains(caracteristica);
  }
  
  public boolean trataCura(ProductoQuimico pq){
    
    for(int i=0; i < estadosPatologicos.size(); i++){
      if(!pq.contieneCaracteristica(estadosPatologicos.get(i)))
      return false;
    }
    return true;
  }
  
  public ArrayList<ProductoQuimico> productoQuimicoParaEstaEnfermedad(ProductoQuimico pq){
    ArrayList<ProductoQuimico> listaAuxiliar = new ArrayList<>();
    
    for(int i=0;i<estadosPatologicos.size();i++){
      ProductoQuimico aux = estadosPatologicos.get(i);
       if(aux.trataCura(pq))
      listaAuxiliar.add(aux);
    }
    return listaAuxiliar;
  }
  
  
  
}
