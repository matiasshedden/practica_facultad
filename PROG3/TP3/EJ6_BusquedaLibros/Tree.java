package EJ6_BusquedaLibros;

import java.util.ArrayList;
import java.util.List;

public class Tree {

	private TreeNode root;

	public Tree() {
		this.root = null;
	}

	//Metodo publico que utiliza add "privado" para recursion
	public void add(Integer value) {
		if (this.root == null)
			this.root = new TreeNode(value);
		else
			this.add(this.root, value);
	}

	//Pregunta por el nodo actual, si no tiene nada a la izquierda lo agrega sino va por la derecha
	private void add(TreeNode actual, Integer value) {
		if (actual.getValue() > value) {
			if (actual.getLeft() == null) {
				TreeNode temp = new TreeNode(value);
				actual.setLeft(temp);
			} else {
				add(actual.getLeft(), value);
			}
		} else if (actual.getValue() < value) {
			if (actual.getRight() == null) {
				TreeNode temp = new TreeNode(value);
				actual.setRight(temp);
			} else {
				add(actual.getRight(), value);
			}
		}
	}

	public void addLibro(Libro L) {	root.setLibro(L); }

	public void listaLibros() { getLibro(root); }

	//Metodo para devolver recursivamente el libro contenido en cada nodo
	private void getLibro(TreeNode N) {
		if (N == null)
			return;
		else {
			if (N.getLeft() == null && N.getRight() == null)
				System.out.println(N.getLibro());
		}
		getLibro(N.getLeft());
		getLibro(N.getRight());
	}

	public int getRoot() {
		return this.root.getValue();
	}

	public boolean isEmpty() {
		return root == null;
	}




	/*
	 * METODOS PARA IMPRIMIR EL ARBOL
	 * */

	public void imprimirPreOrden() { printPreOrder(root); }
	public void imprimirPosOrden() { printPosOrder(root); }
	public void imprimirEnOrden() { printInOrder(root); }

	private void printPreOrder(TreeNode N) {
		if (N == null)
			System.out.print(" - ");
		else {
			System.out.print(N.getValue() + " ");
			printPreOrder(N.getLeft());
			printPreOrder(N.getRight());
		}
	}

	private void printPosOrder (TreeNode N) {
		if (N == null)
			System.out.print(" - ");
		else {
			printPosOrder(N.getLeft());
			printPosOrder(N.getRight());
			System.out.print(N.getValue() + " ");
		}
	}

	public void printInOrder (TreeNode N) {
		if (N == null)
			System.out.print(" - ");
		else {
			printInOrder(N.getLeft());
			System.out.print(N.getValue() + " ");
			printInOrder(N.getRight());
		}
	}

	public boolean hasElem (int i) { return busquedabinaria(root, i); }

	public boolean busquedabinaria (TreeNode N, int i){
		if (N == null)
			return false;
		else if (N.getValue() > i)
			return busquedabinaria(N.getLeft(), i);
		else if (N.getValue() < i)
			return busquedabinaria(N.getRight(), i);
		else return true;
	}

	public int Altura() {
		int contador = 0;
		return getHight(root, contador);
	}

	private int getHight(TreeNode N, int cont) {
		if (N == null)
			return 0;
		else {
			// Incrementa el contador en cada llamada recursiva
			int leftHeight = getHight(N.getLeft(), cont + 1);
			int rightHeight = getHight(N.getRight(), cont + 1);
			// Retorna la máxima altura entre la rama izquierda y la derecha
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

	/*
	* METODO PRINCIPAL PARA ENCONTRAR LA RAMA MAS LARGA
	* Metodo publico getRamaMasLarga()
	* 	Llama a getLongestBranch(Nodo N)
	*
	* Metodo privado getLongestBranch(Nodo N)
	*	Iniciliza las variables que llevan los valores de cada rama y llama a "explorarRama"
	*
	* explorarRama
	* 	Función auxiliar recursiva para explorar el árbol
	*/
	public List<Integer> getRamaMasLarga() {
		return getLongestBranch(root);
	}

	private List<Integer> getLongestBranch(TreeNode N) {
		List<Integer> ramaActual = new ArrayList<>();
		List<Integer> ramaMasLarga = new ArrayList<>();
		// Usamos un arreglo para mantener una referencia mutable a la longitud
		int[] longitudRamaMasLarga = {0};
		explorarRama(root, ramaActual, ramaMasLarga, longitudRamaMasLarga);
		return ramaMasLarga;
	}

	private void explorarRama(TreeNode N, List<Integer> ramaActual, List<Integer> ramaMasLarga, int[] longitudRamaMasLarga) {
		if (N == null) {
			// Si llegamos a una hoja, comparamos la longitud de la rama actual con la más larga
			if (ramaActual.size() > longitudRamaMasLarga[0]) {
				longitudRamaMasLarga[0] = ramaActual.size();
				ramaMasLarga.clear();
				ramaMasLarga.addAll(ramaActual);
			}
		} else {
			// Recorremos el árbol de forma recursiva
			ramaActual.add(N.getValue());
			explorarRama(N.getLeft(), ramaActual, ramaMasLarga, longitudRamaMasLarga);
			explorarRama(N.getRight(), ramaActual, ramaMasLarga, longitudRamaMasLarga);
			// Retiramos el último elemento para retroceder
			ramaActual.remove(ramaActual.size() - 1);
		}
	}

	public int getElementoMaximo() {
		return getMaxElem(root);
	}

	private int getMaxElem(TreeNode N) {
		if (N == null)
			//Menor valor posible
			return Integer.MIN_VALUE;
		int valor = N.getValue();
		int maxderecho = getMaxElem(N.getRight());
		return Math.max(valor, maxderecho);
	}

	public int getElementoMinimo() {
		return getMinElem(root);
	}

	private int getMinElem(TreeNode N) {
		if (N == null)
			//Menor valor posible
			return Integer.MAX_VALUE;
		int valor = N.getValue();
		int minIzquierdo = getMinElem(N.getLeft());
		return Math.min(valor, minIzquierdo);
	}

	public ArrayList getHojas () {
		ArrayList aux = new ArrayList<>();
		if (root == null)
			return aux;
		else
			return getLeaf(root, aux);
	}
	private ArrayList getLeaf(TreeNode N, ArrayList aux) {
		//Condicion base
		if (N.getLeft() == null && N.getRight() == null)
			aux.add(N.getValue());
		else {
			//TIENE QUE PREGUNTAR EN AMBAS RAMAS Y SEGUIR BUSCANDO HOJAS!!!
			if (N.getLeft() != null)
				getLeaf(N.getLeft(), aux);
			if (N.getRight() != null)
				getLeaf(N.getRight(), aux);
		}
		return aux;
	}


	public ArrayList getElementosDeNivel (int nivel) {
		ArrayList aux = new ArrayList();
		if (nivel <= this.Altura()) {
			getElemAtLevel(root, nivel, aux, 1);
		}
		return aux;
	}

	//RECORDAR QUE SIEMPRE VA PRIMERO EL CASO DE CORTE!!!
	//SI EL CONTADOR LLEGA AL NIVEL DESEADO SE DETIENE EL CICLO!!
	private void getElemAtLevel(TreeNode N, int level, ArrayList aux, int contador) {
		if (N != null) {
			if (contador == level) {
				aux.add(N.getValue());
			} else {
				getElemAtLevel(N.getLeft(), level, aux, contador + 1);
				getElemAtLevel(N.getRight(), level, aux, contador + 1);
			}
		}
	}

	public String borrarNodo (int valor) {
		/*
		* Contempla una devolucion por pantalla depende la situacion encontrada
		*/

		// El árbol está vacío, no hay nada que borrar
		if (root == null) {
			return "El arbol está vacio";
		}

		//Busca si esta el valor en el arbol y procede a borrar
		if (busquedabinaria(root, valor)) {
			if (root.getValue() == valor) {
				// El nodo a borrar es la raíz del árbol
				TreeNode dummy = new TreeNode(0); // Nodo falso para actuar como padre de la raíz
				dummy.setLeft(root);
				delete(dummy, root, valor); // Llama a delete con el padre de la raíz
				root = dummy.getLeft(); // Actualiza la raíz si ha cambiado
			} else {
				// El nodo a borrar no es la raíz, llama a delete con la raíz y el valor a borrar
				delete(null, root, valor);
			}
			return "El nodo a sido borrado";
		} else
			return "El valor no fue encontrado";
	}

	private void delete(TreeNode parent, TreeNode N, int valorbuscado) {
	/*
	* Caso 1: Si no tiene hijos, lo borro
	* Caso 2: Si tiene 1 hijo, reemplazo el valor de N por next y borro el camino
	* Caso 3: Si tiene 2 hijos, reemplazo el nodo por el Mmd-AI o MmI-AD
	*/
		//No se encuentra el valor buscado
		if (N == null)
			return;

		if (valorbuscado < N.getValue())
			delete(N, N.getLeft(), valorbuscado);
		else if (valorbuscado > N.getValue()) {
			delete(N, N.getRight(), valorbuscado);
		} else { //ENCONTRAMOS EL NODO A ELIMINAR!!
			deleteNodo(parent, N);
		}
	}

	private void deleteNodo(TreeNode parent, TreeNode N) {
		// Caso 1: Nodo sin hijos
		if (N.getLeft() == null && N.getRight() == null) {
			if (parent.getLeft() == N) {
				parent.setLeft(null);
			} else {
				parent.setRight(null);
			}
		}
		// Caso 2: Nodo con un solo hijo
		else if (N.getLeft() == null) {
			if (parent.getLeft() == N) {
				parent.setLeft(N.getRight());
			} else {
				parent.setRight(N.getRight());
			}
		} else if (N.getRight() == null) {
			if (parent.getLeft() == N) {
				parent.setLeft(N.getLeft());
			} else {
				parent.setRight(N.getLeft());
			}
		}
		// Caso 3: Nodo con dos hijos
		else {
			TreeNode successor = findSuccessor(N.getRight());
			N.setValue(successor.getValue());
			delete(N, N.getRight(), successor.getValue());
		}
	}

	private TreeNode findSuccessor(TreeNode node) {
		TreeNode successorParent = node;
		TreeNode successor = node;
		TreeNode current = node.getRight();
		while (current != null) {
			successorParent = successor;
			successor = current;
			current = current.getLeft();
		}
		if (successor != node.getRight()) {
			successorParent.setLeft(successor.getRight());
			successor.setRight(node.getRight());
		}
		return successor;
	} //FIN METODOS DE BORRADO

	public int sumatoriaNodos () {
		return getSum(root);
	}

	private int getSum(TreeNode N) {
		if (N == null) {
			return 0; // Si el nodo es nulo, retorna 0
		} else {
			// Suma el valor del nodo actual y las sumas de los nodos hijos izquierdo y derecho
			int leftSum = getSum(N.getLeft());
			int rightSum = getSum(N.getRight());
			return N.getValue() + leftSum + rightSum;
		}
	}


	public ArrayList<Integer> getHojasMayoresQue (int k) {
		ArrayList<Integer> aux = new ArrayList<>();
		return HojasMayorQue(root, k, aux);
	}


	private ArrayList<Integer> HojasMayorQue(TreeNode N, int k, ArrayList<Integer> aux) {
		if (N == null)
			return aux;
		else {
			if (N.getLeft() == null && N.getRight() == null && N.getValue() > k) //SI es una hoja
				aux.add(N.getValue());
			else {
				HojasMayorQue(N.getLeft(), k, aux);
				HojasMayorQue(N.getRight(), k, aux);
			}
		}
		return  aux;
	}

	public String completeTree() {
		if (root == null)
			return "El arbol está vacio";
		else {
			completarArbol(root);
		}
		return "Arbol completado";
	}

	private int completarArbol(TreeNode N) {
		if (N == null)
			return 0;
		// Si el nodo es una hoja, su valor es su propio valor
		if (N.getLeft() == null && N.getRight() == null)
			return N.getValue();
		// Calcula la suma de los valores de los hijos izquierdo y derecho
		int leftSum = completarArbol(N.getLeft());
		int rightSum = completarArbol(N.getRight());
		// Asigna la diferencia entre los valores de los hijos al nodo interno
		if (N.getLeft() != null && N.getRight() != null) {
			N.setValue(rightSum - leftSum);
		} else if (N.getLeft() != null) {
			// Si el nodo tiene solo un hijo izquierdo, el valor del nodo es el valor del hijo izquierdo
			N.setValue(leftSum);
		} else if (N.getRight() != null) {
			// Si el nodo tiene solo un hijo derecho, el valor del nodo es el valor del hijo derecho
			N.setValue(-rightSum);
		}
		// Retorna la suma de los valores de los hijos para el nodo interno
		return leftSum + rightSum;
	}

	//BUSCA PALABRAS CON K VOCALES
	public ArrayList<String> buscarPalabrasConNVocales (int k) {
		ArrayList<String> palabrasConNVocales = new ArrayList<>();
		DFS(root, "", 0, k, palabrasConNVocales);
			return palabrasConNVocales;
		}

	//Busqueda en profundidad dentro del arbol
	private void DFS(TreeNode nodo, String palabraActual, int numVocales, int N, List<String> palabrasConNVocales) {
		if (nodo == null)
			return;
		palabraActual += nodo.getValue();

		//if (esVocal(nodo.getValue())) NO ES COMPATIBLE CON EL VALOR INTERNO
		//	numVocales++;

		if (nodo.getLeft() == null && nodo.getRight() == null) {
			if (numVocales == N)
				palabrasConNVocales.add(palabraActual);
			return;
		}
		DFS(nodo.getLeft(), palabraActual, numVocales, N, palabrasConNVocales);
		DFS(nodo.getRight(), palabraActual, numVocales, N, palabrasConNVocales);
	}

	private boolean esVocal(char c) {
		return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
	}


}//FIN CLASS



