package tepe1;

import java.util.Iterator;

public class MySimpleLinkedList<T> implements Iterable<Object> 
{
	private int size=0;
	private Node<T> first;
	private Node<T> last;
//	private Node<T> cursor; No corresponde
	
	
	public MySimpleLinkedList() {
		this.first = null;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		size+=1;
	}
	
	//Puedo devolver null porque estamos devolviendo objetos, en int no podria¡
	
	public Node<T> extractFront() {
		Node<T> tmp=first;
		if(size!=0) {
			
			this.first=first.getNext();
			size-=1;
		}
		return tmp;			
	}

	public boolean isEmpty() {
		return first==null;
	}
	
	public void insertLast(T info) {
		Node<T> aux=this.first;
		if(aux==null) {
			this.insertFront(info);
		}
		else {
			while(aux.getNext()!=null) {
				aux.getNext();
			}
			Node<T> tmp=new Node(info, null);
			aux.setNext(tmp);
			size+=1;
		}
	}
	
	/* O(index) donde index es el tamaño de la lista*/
	public T get(int index1) {
		int index=index1-1;
		
		if(0<=index && index<=size) {
			cursor=first;
			for(int i=index; i>0; i--) {
				cursor=cursor.getNext();
			}
		}
		return cursor.getInfo();
	}
	
	public int size() {
		return size;
	}
	
	public int indexOf(T te) {
		int contador=0;
		Node<T> cursor=first;
		boolean romper=false;
		while((cursor.getNext()!=null) && (romper!=false)) {
			if(cursor.toString().equals(te));{
				romper=true;
			}
			cursor=cursor.getNext();
			contador++;
		}
		return contador-1;
	}
	/*public void iniciarCursor() {
		Node<T> cursor=this.first;
	}
	
	public Node<T> getCursor() {
		return cursor;
	}
	
	public void avanzarCursor() {
		cursor=cursor.getNext();
	}*/
	
	@Override
	public String toString() {
		Node<T> aux=first;
		String resultado=""+ aux.getInfo()+ "/";
		while(aux.getNext()!=null) {
			aux=aux.getNext();
			resultado+=aux.toString()+"/";
		}
		return resultado;
	}

	@Override
	public tepe1.MyIterator iterator() {
		return new MyIterator<T>(this.first);
	}
	
	
}
