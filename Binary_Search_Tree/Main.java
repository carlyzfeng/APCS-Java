
public class Main {

	public static void main(String[] args) {
		BST<Integer> bsti = new BST<Integer>(12);
		bsti.setLeft(7);
		bsti.setRight(19);
		System.out.println(bsti);
		System.out.println(bsti.depth());
		
		bsti.insert(5);
		System.out.println(bsti);
		System.out.println(bsti.depth());
	}

}
