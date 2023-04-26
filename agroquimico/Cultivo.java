package agroquimico;

import java.util.ArrayList;
public class Cultivo {
  
  private String nombre;
  private ArrayList <Enfermedad> enfermedadesFrecuentes;
  
  public Cultivo(String nombre){
    this.nombre=nombre;
    enfermedadesFrecuentes=new ArrayList<>();
  }
  
  public String getNombre(){
    return nombre;
  }
  
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  
  public void addEnfermedad(Enfermedad e){
    enfermedadesFrecuentes.add(e);
  }
  public void removeEnfermedad(Enfermedad e){
    enfermedadesFrecuentes.remove(e);
  }
  public boolean contieneEnfermedad(Enfermedad e){/* se fija en la lista de enfermedad si la contiene*/
    return enfermedadesFrecuentes.contains(e);
  }
  public boolean esUtil(ProductoQuimico pq){
    for(int i=0;i<enfermedadesFrecuentes.size();i++){
    if(!pq.contieneEstadoPatologico(enfermedadesFrecuentes.get(i)))
      return false;
    }
    /*si puede este producto quimico tratar las enfermedades de mi lista*/
    return true;
  }
  
}
