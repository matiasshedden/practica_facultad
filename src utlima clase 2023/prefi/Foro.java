package prefi;
import java.util.ArrayList;

public class Foro extends ElementoForo {

	private ArrayList<ElementoForo> elems;
	
	
	
	
	public Foro() {
		super();
		elems = new ArrayList<ElementoForo>();
	}
	
	public void addElemento(ElementoForo ff) {
		elems.add(ff);
	}

	@Override
	public ElementoForo getCopia(Condicion cc) {
      /* ArrayList<ElementoForo> salida = new ArrayList<ElementoForo>();
       for(ElementoForo ff: elems) {
    	   ElementoForo copia = ff.getCopia(cc);
    	   if (copia!=null) {
    		   salida.add(copia);
    	   }
       }
       if (salida.size()==0) {
    	   return null;
       }else {
    	   Foro f1 = new Foro();
    	   for(ElementoForo f2 : salida) {
    		   f1.addElemento(f2);
    	   }
       }*/
		 Foro f1 = new Foro();
		 boolean encontro = false;
		 for(ElementoForo ff: elems) {
	         ElementoForo copia = ff.getCopia(cc);
		       if (copia!=null) {
		    		   f1.addElemento(copia);
		    		   encontro = true;
		         }
	      }
	      
		 if (!encontro) {
	    	   return null;
	       }else {
	    	  return f1;
	       }
       
		
	}

	@Override
	public ArrayList<String> getPalabrasClaves() {
        ArrayList<String> salida = new ArrayList<String>();
        for(int i =0; i< elems.size(); i++) {
        	ArrayList<String> aux= elems.get(i).getPalabrasClaves();
        	for(String ss:aux) {
        		if(!salida.contains(ss)) {
        			salida.add(ss);
        		}
        	}
        }
        return salida;
	}

	@Override
	public String getEjeTematico() {
		if(elems.size()>0) {
			int pos = elems.size()-1;
			return   elems.get(pos).getEjeTematico();
		} else {
			return null;
		}
	}

	@Override
	public int getCantidadTemas(Condicion cc) {
        int i =0;
        for(ElementoForo ff:elems) {
        	i = i +ff.getCantidadTemas(cc);
        }
        return i;
	}

}
