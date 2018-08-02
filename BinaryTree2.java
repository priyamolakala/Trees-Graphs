
public class BinaryTree2 {
	Node root;
	BinaryTree2(int value) {
		root = new Node(value);
	}
	BinaryTree2() {
		root = null;
	}

	public static void main(String[] args) {
		BinaryTree2 tree = new BinaryTree2();
		tree.root = new Node(2);
		tree.root.left = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.right = new Node(5);
		inOrder(tree.root);
		
		
		

	}
	public static void inOrder(Node current) {
		if(current == null) {
			return;			
		}
		inOrder(current.left);
		System.out.println(current.value);
		inOrder(current.right);
	}
}
