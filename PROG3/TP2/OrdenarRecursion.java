import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class OrdenarRecursion {
    private static String nro_bin;

    /*
    * Complejidad O(n) donde n es el tamaño del arreglo
    *
    * TIENE ALGUN PROBLEMA HACERLO RECURSIVO??
    * Consumo de memoria: Los algoritmos recursivos pueden consumir más memoria debido a la activación de
           múltiples llamadas de función en la pila de llamadas.
    * Rendimiento: a menudo hay un pequeño sobrecosto asociado con la llamada y el retorno de la función.
    * Límite de profundidad de recursión: En algunos entornos de ejecución, hay un límite en la profundidad
           máxima de la recursión.
    * Legibilidad y mantenibilidad: A menudo son más difíciles de entender y de depurar que sus contrapartes
           iterativas.
    *
    * QUE CAMBIARIA SI FUERA UNA LISTA EN VEZ DE UN ARREGLO??
    * Aunque la estrategia general para determinar si una lista está ordenada seguiría siendo similar en un
      enfoque recursivo, la implementación exacta del algoritmo podría variar dependiendo de la estructura
      específica de la lista y las operaciones admitidas por esa estructura
      *
    * */
    public static boolean estaOrdenado(int[] arreglo, int n) {
    // Caso base: Si el tamaño del arreglo es 0 o 1, está ordenado
       if (n == 0 || n == 1) {
            return true;     }
        // Caso recursivo: Si el primer elemento es mayor que el segundo, el arreglo no está ordenado
        if (arreglo[0] > arreglo[1]) {
            return false;            }
        // Llamada recursiva para verificar el resto del arreglo
        return estaOrdenado(arreglo, n - 1);
    }

    public static boolean estaElElemento(int[] arreglo, int n, int e) {
        // Caso base: Si el tamaño del arreglo es 0, no esta el elemento buscado
        if (n == 0) {
            return false;
        }
        // Caso recursivo: Si el primer elemento es mayor que el e buscado, no esta el elemento buscado
        if (arreglo[n-1] == e)
            return true;
        // Llamada recursiva para verificar el resto del arreglo
        return estaElElemento(arreglo, n - 1, e);
    }

    public static String Dec_a_binario(int n) {
        if (n == 0)
            return "0";
        if (n == 1)
            return "1";
        //Divido en nro por 2 y llamo al metodo
        //Concateno el residuo de la division con la representacion binaria del cociente
        return Dec_a_binario(n / 2) + (n % 2);
    }

    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public static void secuenciaFibonacci(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(fibonacciRecursivo(i) + " ");
        }
    }

    //OJO CON LOS INDICES DEL ARRAY!!
    public static boolean ieni(int[] Arr, int l) {
        //caso base
        if (l == 0)
            return false;
        if (Arr[l-1] == l)
            return true;
        return ieni(Arr, l-1);
    }

    public static int BinariaRecursiva(int [] A, int X, int inicio, int fin)
    {
        int medio;
        if (fin < inicio) return -1; //sucederá si no se encuentra el elemento
        else {
            medio = (inicio + fin) / 2; //al ser medio un int, se realiza un truncado
            if (X > A[medio])
                return BinariaRecursiva(A, X, medio+1, fin);
            else
            if (X < A[medio])
                return BinariaRecursiva(A, X, inicio, medio -1);
            else
                return medio;
        }
    }

    //Complejidad O(n²) donde n es el tamaño del arreglo (2 for anidados!)
    public static void burbujeo(int [ ] A) {
        int i, j, aux;
        for ( i=0; i < A.length - 1; i++)
            for (j = 0; j <  (A.length-i-1); j++)
        if (A[ j ] > A[ j+1 ]) {
            aux = A[ j+1 ];
            A[ j+1 ] = A[ j ];
            A[ j ] = aux;
        }
    }

    //Mejora porque al intercambiar un valor corta el ciclo
    public static void bubbleSortAdapt( int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i=0; i<arr.length - j; i++)
            {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

    //Complejidad O(n²), mantiene dentro dos for anidados
   public static void ordenamientoSeleccion(int[] arreglo) {
        int n = arreglo.length;
        // Iterar sobre el arreglo
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del elemento más pequeño en la porción no ordenada del arreglo
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMenor]) {
                    indiceMenor = j;
                }
            }
        // Intercambiar el elemento más pequeño con el elemento en la posición actual de la iteración
        int temp = arreglo[indiceMenor];
        arreglo[indiceMenor] = arreglo[i];
        arreglo[i] = temp;
        }
   }

    public static void mostrarArreglo(int [] a) {
        for (int i:a) {
            System.out.println(i);
        }
    }



    public static void quickSort(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            return;
        }
        int n = arreglo.length;
        quickSortRecursivo(arreglo, 0, n - 1);
    }

    public static void quickSortRecursivo(int[] arreglo, int izquierda, int derecha) {
        int i = izquierda;
        int j = derecha;
        // Escogemos el pivote como el elemento en la mitad del arreglo
        int pivote = arreglo[izquierda + (derecha - izquierda) / 2];
        // Dividir el arreglo en dos partes
        while (i <= j) {
            // Encontrar el primer elemento mayor que el pivote en la mitad izquierda
            while (arreglo[i] < pivote) {
                i++; }
            // Encontrar el primer elemento menor que el pivote en la mitad derecha
            while (arreglo[j] > pivote) {
                j--; }
            // Intercambiar elementos si encontramos un par de elementos desordenados
            if (i <= j) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
                // Avanzar los índices para continuar con la siguiente iteración
                i++;
                j--; }
        }
        // Llamadas recursivas para las mitades izquierda y derecha del arreglo
        if (izquierda < j) {
            quickSortRecursivo(arreglo, izquierda, j); }
        if (i < derecha) {
            quickSortRecursivo(arreglo, i, derecha); }
    }

     /*
     TP 2: EJERCICIO 8:
     public static <T> void sort(List<T> list, Comparator<? super T> c) { list.sort(c); }

     Searches the specified list for the specified object using the binary search algorithm.
     The list must be sorted into ascending order according to the {@linkplain Comparable natural ordering}
      of its elements (as by the {@link #sort(List)} method) prior to making this call.  If it is not sorted,
      the results are undefined.  If the list contains multiple elements equal to the specified object, there
     is no guarantee which one will be found.
     This method runs in log(n) time for a "random access" list (which provides near-constant-time
     positional access).  If the specified list does not implement the {@link RandomAccess} interface
     and is large, this method will do an iterator-based binary search that performs
     O(n) link traversals and O(log n) element comparisons.

     * @param  <T> the class of the objects in the list
     * @param  list the list to be searched.
     * @param  key the key to be searched for.
     * @return the index of the search key, if it is contained in the list;
     *         otherwise, <code>(-(<i>insertion point</i>) - 1)</code>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the list: the index of the first
     *         element greater than the key, or {@code list.size()} if all
     *         elements in the list are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     * @throws ClassCastException if the list contains elements that are not
     *         <i>mutually comparable</i> (for example, strings and
     *         integers), or the search key is not mutually comparable
     *         with the elements of the list.

    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        if (list instanceof RandomAccess || list.size()<BINARYSEARCH_THRESHOLD)
            return Collections.indexedBinarySearch(list, key);
        else
            return Collections.iteratorBinarySearch(list, key);
    }

    private static <T>
    int indexedBinarySearch(List<? extends Comparable<? super T>> list, T key) {
        int low = 0;
        int high = list.size()-1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            Comparable<? super T> midVal = list.get(mid);
            int cmp = midVal.compareTo(key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found
    }

    private static <T>
    int iteratorBinarySearch(List<? extends Comparable<? super T>> list, T key)
    {
        int low = 0;
        int high = list.size()-1;
        ListIterator<? extends Comparable<? super T>> i = list.listIterator();

        while (low <= high) {
            int mid = (low + high) >>> 1;
            Comparable<? super T> midVal = get(i, mid);
            int cmp = midVal.compareTo(key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found
    }
    */


}// Fin OrdenarRecursion

