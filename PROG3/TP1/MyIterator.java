import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
        //El cursor es un nodo auxiliar que va pasando por la lista
        Node<T> cursor;

        //Constructor para retomar lo que envio la lista
        public MyIterator(Node<T> index){ this.cursor=index; }

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        //Este metodo me da la info del nodo donde estoy parado y lo mueve al siguiente
        //next y hasNext del iterador hacen referencia al elemento siguiente
        @Override
        public T next() {
            T info = cursor.getInfo();
            cursor = cursor.getNext();
            return info;
        }

        public T value () {
            return cursor.getInfo();
        }

        public void _Next() { cursor = cursor.getNext(); }

    }
