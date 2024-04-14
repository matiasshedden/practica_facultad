import java.util.Iterator;

public class main {
    public static <T> void main(String[] args) {

        MySimpleLinkedList<Integer> lista = new MySimpleLinkedList<Integer>();
        MySimpleLinkedList<Integer> lista2 = new MySimpleLinkedList<Integer>();
        MySimpleLinkedList<Integer> lista3 = new MySimpleLinkedList<Integer>();
        MySimpleLinkedList listaVacia = new MySimpleLinkedList();

        lista.insertFront(11);
        lista.insertFront(9);
        lista.insertFront(4);
        lista.insertFront(2);

        lista2.insertFront(5);
        lista2.insertFront(11);
        lista2.insertFront(2);
        lista2.insertFront(8);
        lista2.insertFront(3);


        System.out.println(lista);
        lista.insertLast(4);
        System.out.println(lista);
        //System.out.println(lista2);
        //System.out.println("Lista resultado");
        /*
        EJERCICIO 5 a
        Recorro la lista y chequeo con la otra lista O(n*n) ¡¡¡No eficiente!!!
        for (Integer i:lista) {
            if (lista2.indexOf(i) != -1)
                lista3.insertFront(i);
        }
        */

        // EJERCICIO 5 b
        /*MyIterator<Integer> cursor1 = lista.iterator();
        MyIterator<Integer> cursor2 = lista2.iterator();

        while (cursor1.hasNext() && cursor2.hasNext()) { //contralamos que no llegue al final ninguna de las dos
            if (cursor1.value() < cursor2.value()) {//comparamos valor1 vs valor 2
                cursor1.next();
            } else if (cursor1.value() > cursor2.value())
                cursor2.next();
            else {
                lista3.insertLast(cursor1.value());//si encuentra el mismo lo devuelve y inserta en lista3
                cursor1.next();
                cursor2.next(); }
        }
        System.out.println(lista3);*/

    //EJERCICIO 6
    //Con 2 listas, armo una tercera con los elementos de la 1 que no se repitan en la 2
    /*MyIterator<Integer> iter1 = lista.iterator();
    while (iter1.hasNext()) {
        MyIterator<Integer> iter2 = lista2.iterator();
        while (iter2.hasNext()) {
            if (iter1.value() == iter2.value())
                break;
            iter2.next();//Muevo el cursor de la lista 2
        }
        if (!iter2.hasNext()) // Si sale del ciclo pregunto si NO hay siguiente, grabo el dato
            lista3.insertLast(iter1.value());
    iter1.next(); //Muevo el cursor de la lista 1
    }//Fin ejercicio 6
    System.out.println(lista3);*/

  }//Fin main

}//Fin class


