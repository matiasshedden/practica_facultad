package tepe1;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		MySimpleLinkedList lista=new MySimpleLinkedList();
		lista.insertFront(2);
		lista.insertFront(10);
		lista.insertFront(50);
		//System.out.println(lista.size());
		System.out.print(lista.get(3));
		
		Iterator<Integer> iterador=lista.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		//	System.out.print("String lista "+lista.toString());
		
	/*	
		for(int i=0; i<lista.size(); i++) {O(size*size)
			lista.get(i);O(size)
		}
		for(int i=0; i<lista.size(); i++) {O(size*size)
			lista.getcursor();O(size)
			lista.avanzarCursor
		}*/
	}

}
