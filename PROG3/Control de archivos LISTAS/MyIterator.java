
import ProgramacionIII.ProgramacionIII.tp1.Node;
import java.util.Iterator;

public class MyIterator<T> implements Iterator<T>{
	Node<T> cursor;
	
	//Constructor para retomar lo que envio la lista
	
	public MyIterator(Node<T> index){
		this.cursor=index;
	}
	
	@Override
	public boolean hasNext() {
		return cursor!=null;
	}

	@Override
	public T next() {
		T info=cursor.getInfo();
		cursor=cursor.getNext();
		return info;
	}

}
