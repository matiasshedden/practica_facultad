package agroquimico;

import java.util.ArrayList;
public class ProductoQuimico extends Producto {
  
  private ArrayList <String> cultivosDesconsejados;//no se puede utilizar este agroquimico en estos cultivos
  private ArrayList <String> estadosPatologicosCapazTratar;// las enfermedades que este agroquimico cura
  
  public ProductoQuimico(String nombre){
    super(nombre);
    cultivosDesconsejados = new ArrayList<>();
    estadosPatologicosCapazTratar = new ArrayList<>();
  }
  
  public void addEstadoPatologico(String e){
    estadosPatologicosCapazTratar.add(e);
  }
  public void removeEstadoPatologico(String e){
    estadosPatologicosCapazTratar.remove(e);
  }
  
  public boolean contieneEstadoPatologico(Enfermedad enfermedad){
    return estadosPatologicosCapazTratar.contains(enfermedad);
  }
  
  public void addCultivoDesconsejado(String c){
    cultivosDesconsejados.add(c);
  }
  
  public void removeCultivoDesconsejado(String c){
    cultivosDesconsejados.remove(c);
  }
  
  public boolean contieneCultivoDesconsejado(String c){
   return  cultivosDesconsejados.contains(c);
  }

public boolean contieneCaracteristica(String string) {
	// TODO Auto-generated method stub
	return false;
}
  
}
