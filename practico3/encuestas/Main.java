package practico3.encuestas;

import java.util.ArrayList;


public class Main {

	private ArrayList <encuesta> encuestas;
	
	  public void addEncuesta(encuesta e){
	        encuestas.add(e);
	    }
	  
	  public void deleteEncuesta(encuesta e){
	        encuestas.remove(e);
	    }
	  
	  public boolean tieneEncuesta(encuesta e){
	        return encuestas.contains(e);
	    }
	  
}
