public class BST<T extends Comparable<T>> {
	private T datum;
	private BST<T> left; 
	private BST<T> right;  

	public BST(T datum) {
		this.datum = datum;
		left = null;
		right = null;
	}

	public T getDatum() {
		return datum;  // returns the datum of a node
	}
	public BST<T> getLeft() {
		return left;   // returns the left subtree
	}
	public BST<T> getRight() {
		return right;  // returns the right subtree
	}
	
	public void setLeft(T datum) {
		left = new BST<T>(datum);
	}

	public void setRight(T datum) {
		right = new BST<T>(datum);
	}
	
	public void insert(T datum) {
		if(datum.compareTo(this.datum) == 0) {
			setLeft(datum);
		}
		else if (datum.compareTo(this.datum) < 1) {
			if (left == null) {
				setLeft(datum);
			}
			else {
				left.insert(datum);
			}
		}
		else {
			if (right == null) {
				setRight(datum);
			}
			else {
				right.insert(datum);
			}
		}
	}
	
	public int depth() {
		int depthLeft = 0;
		int depthRight = 0;
		if (left == null) {
			depthLeft = 1;
		}
		else {
			depthLeft = depthLeft + 1 + left.depth();
		}
		
		if (right == null) {
			depthRight = 1;
		}
		else {
			depthRight = depthRight + 1 + right.depth();
		}
		
		if (depthLeft > depthRight) {
			return depthLeft;
		}
		else {
			return depthRight;
		}
	}
	
	public String toString() {
		String s = "" + datum + ", ";
		if (left != null)
			s = left.toString() + s;
		if (right != null)
			s = s + right.toString();
		return s;
	}
}
