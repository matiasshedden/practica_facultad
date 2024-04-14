public class NodeD<T> extends Node<T> {

    private T info;
    private NodeD<T> next;
    private NodeD<T> previous;

    public NodeD() {
        this.info = null;
        this.next = null;
        this.previous = null;
    }

    public NodeD(T info, NodeD<T> next, NodeD<T> previous) {
        super.setInfo(info);
        super.setNext(next);
        this.setPrevious(previous);
    }

    public NodeD<T> getNext() {
        return next;
    }

    public void setNext(NodeD<T> next) {
        this.next = next;
    }

    public NodeD<T> getPrevious() { return previous; }

    public void setPrevious(NodeD<T> previous) { this.previous = previous; }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "" + info;
    }

  }

