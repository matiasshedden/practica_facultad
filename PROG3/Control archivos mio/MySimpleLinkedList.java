package ProgramacionIII.ProgramacionIII.tp1.ProgramacionIII.tp1;


import java.util.ArrayList;
import java.util.Iterator;

public class MySimpleLinkedList<T> implements Iterable<T>{
	
	private Node<T> first;
	private Node<T> cursor;//Para recorrer la lista
	protected int _size;
	
	public MySimpleLinkedList() {

		this.first = null;
		_size = 0;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		_size += 1;
	}
	/*
	O(n) donde n es el tamaño de la lista. A mayor crecimiento mayor acceso
	 */
	public void insertLast(T info) {
		Node<T> aux = this.first;
		if (aux==null)
			insertFront(info);
		else
			while (aux.getNext() != null)
				aux = aux.getNext();
			Node<T> tmp = new Node<T>(info,null);
			aux.setNext(tmp);
			_size +=1;
	}

	public T extractFront() {
		T tmp = null;
		if (first.getNext() == null)
			return null;
		else
			tmp = this.first.getInfo();
			this.first = this.first.getNext();
			_size -= 1;
        return tmp;
    }

	public boolean isEmpty() {
		// TODO
		return false;
	}
	/*
	O(index) donde index es el tamaño de la iteracion.
	 */
	public T get(int index) {
		int contador = 0;
		Node<T> aux = this.first;
		if ((index<0) || (index >= _size))
			return null;
		else
			while (contador<=index) {
				aux = aux.getNext();
				contador++;}
			return aux.getInfo();
	}



	public int size() {
		return _size;
	}

	public String getLista() {
		ArrayList aux = new ArrayList<>();
		int indice = 0;
		if (first==null)
			aux.add("No hay elementos");
		else
			while (indice < _size)
				aux.add();
	}

	@Override
	public String toString() {
		return "contenido: " + first + "tamaño: " + _size;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}
}
