

import java.util.ArrayList;
import java.util.Iterator;

public class MySimpleLinkedList<T> implements Iterable<T>{

    private Node<T> first;
    private Node<T> last;
    protected int _size;

    public MySimpleLinkedList() {
        this.first = null;
        this.last = null;
        _size = 0;
    }

    public void insertFront(T info) {
        Node<T> tmp = new Node<T>(info,null);
        tmp.setNext(this.first);
        this.first = tmp;
        if (this.last == null)
            this.last = null;
        _size += 1;
    }


    /*
    O(n) donde n es el tamaño de la lista. A mayor crecimiento mayor acceso
     */
    public void insertLast(T info) {
        Node<T> aux = this.first;
        if (aux==null)
            insertFront(info);
        else {
                while (aux.getNext() != null) {
                    aux = aux.getNext();
                }
                Node<T> tmp = new Node<T>(info, null);
                aux.setNext(tmp);
                _size += 1;
            }
    }

    public T extractFront() {
        T tmp = null;
        if (first.getNext() == null)
            return null;
        else
            tmp = this.first.getInfo();
            this.first = this.first.getNext();
            _size -= 1;
        if (this.first == null)
                this.last = null;
        return tmp;
    }

    public boolean isEmpty() {
        return (first==null);
    }

    public int indexOf (T buscado) {
        T aux = null;
        int contador = 0;
        for (int i=0; i < size(); i++) {
            aux = get(i);
            contador = i;
            if (aux.equals(buscado))
                return contador;
        }
        return -1;
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
            while (contador < index) {
                aux = aux.getNext();
                contador++;}
        return aux.getInfo();
    }

    public int size() {
        return _size;
    }

    //Cada ciclo del bucle me carga el contenido en el String "resultado"
    //Si la lista está vacia lo hace explicito
    @Override
    public String toString() {
        if (first==null)
            return "La lista está vacia";
        else {
            Node<T> aux=first;
            String resultado= "|" + aux.getInfo();
            while(aux.getNext()!= null) {
                aux = aux.getNext();
                resultado += "|" + aux.toString();
            }
            return resultado + "|";
        }
    }

    //Al implementar el iterador, le paso a MyIterator la posicion desde donde comenzar
    @Override
    public MyIterator iterator() {
        return new MyIterator<T>(this.first);
    }
}
