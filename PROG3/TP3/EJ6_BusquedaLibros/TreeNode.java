package EJ6_BusquedaLibros;
//Agregar a cada nodo un libro
public class TreeNode {

	private Integer value;
	private TreeNode left;
	private TreeNode right;
	private Libro libro;

	public TreeNode(Integer value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public void setLibro(Libro L) { this.libro = L; }

	public Libro getLibro() { return libro; }

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public Integer getValue() {	return value; }

	public void setValue(Integer value) { this.value = value; }

	@Override
	public String toString() {
		return "{" + value + " " + libro + "}";
	}
}
