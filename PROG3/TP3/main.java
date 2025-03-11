
/*  Integer getRoot(),      OK
    boolean hasElem(Integer)OK
    boolean isEmpty(),      OK
    void add(Integer),      OK
    boolean delete(Integer),OK
    int getHeight(),        OK
    void printPosOrder(),   OK
    void printPreOrder(),   OK
    void printInOrder(),    OK
    List getLongestBranch(),OK
    List getFrontera(),     OK
    Integer getMaxElem(),   OK
    Integer getMinElem();   OK
    List getElemAtLevel(int)OK
*/
/*
        System.out.println("PRE ORDEN: ");
        tmp.imprimirPreOrden();
        System.out.println('\n');
        System.out.println("EN ORDEN: ");
        tmp.imprimirEnOrden();
        System.out.println('\n');
        System.out.println("POST ORDEN");
        tmp.imprimirPosOrden();
        System.out.println(vacio.hasElem(2));
        System.out.println(tmp.Altura());
        System.out.println("la rama mas larga es: " + tmp.getRamaMasLarga());
        System.out.println("El elemento maximo es: " + tmp.getElementoMaximo());
        System.out.println("El elemento minimo es: " + tmp.getElementoMinimo());
        System.out.println("las hojas son: " + tmp.getHojas());
        System.out.println("Los elementos del nivel son: " + tmp.getElementosDeNivel(0));
        System.out.println(tmp.borrarNodo(0));
        System.out.println("La sumatoria de nodos es: " + tmp.sumatoriaNodos());
        System.out.println(tmp.getHojas());
        System.out.println(tmp.getHojasMayoresQue(1));
         tmp.completeTree();
    */
public class main {
    public static void main(String[] args) {
        Tree tmp = new Tree();
        //Tree vacio = new Tree();

        tmp.add(6);
        tmp.add(2);
        tmp.add(1);
        tmp.add(4);
        tmp.add(3);
        tmp.add(8);
        tmp.add(7);

        System.out.println((int) (Math.random()*10));
        System.out.println((int) (Math.random()*10));
        System.out.println((int) (Math.random()*10));
        System.out.println((int) (Math.random()*10));
    }
}