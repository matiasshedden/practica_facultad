package ProgramacionIII.ProgramacionIII.tp1.ProgramacionIII.tp1;

public class main {
    public static void main(String[] args) {
        MySimpleLinkedList lista = new MySimpleLinkedList();
        //Insercion de elementos
        lista.insertFront(2);
        lista.insertFront(10);
        System.out.println(lista);
        //System.out.println(lista._size);

        //Extraccion de elementos
        lista.extractFront();
        System.out.println(lista._size);

        System.out.println(lista);

    }
}
