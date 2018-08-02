
public class BinaryTree {
	
	 Node root;

	BinaryTree() {
		root = null;
	}
	
	public static void main(String[] args) {
		BinaryTree tree;
		BinaryTree bt = new BinaryTree();
		tree = bt.createBinaryTree();
		
		inorder(tree.root);
//		printTree();
//	test();
		
		
	}


	private Node addRecursive(Node current, int value) {
		if(current == null) {
			return new Node(value);
		}
		if(value < current.value) {
			current.left = addRecursive(current.left, value);
		}
		else if(value > current.value){
			current.right = addRecursive(current.right, value);
		}
		else {				//if the node containing the value already exists.
			return current; 
		}
		return current;
	}
	
	public  void addNode(int value) {
		root = addRecursive(root, value);
		
	}
	
	private BinaryTree createBinaryTree() {
		BinaryTree bt = new BinaryTree();
		bt.addNode(4);
		bt.addNode(6);
		bt.addNode(8);
		bt.addNode(3);
		bt.addNode(3);
		bt.addNode(5);
		bt.addNode(7);
		bt.addNode(9);
		return bt;
	}
	
	public static void printTree(Node root) {
//		BinaryTree tree; random
//		BinaryTree bt = new BinaryTree(); 
//		tree = bt.createBinaryTree();
		inorder(root);
		

	}
	
	private boolean containsNodeRecursive(Node current, int value) {
		
		if(current == null) {
			return false;
		}
		if(value == current.value) {
			return true;
		}
		return value<current.value?containsNodeRecursive(current.left, value):containsNodeRecursive(current.right,value);
	}
	
	public boolean containsNode(int value) {
		
		return containsNodeRecursive(root,value);
	
	}
	
	
//	public static void test() {
//		BinaryTree tree;
//		BinaryTree bt = new BinaryTree();
//		tree = bt.createBinaryTree();
////		System.out.println(tree.containsNode(6));
////		System.out.println(tree.containsNode(4));
////		System.out.println(tree.containsNode(1));
//		inorder(tree.root);
//		
//	}
	
	public static void inorder(Node current) {
		if(current == null) {
			return;
		}
		inorder(current.left);
		System.out.println(current.value + " ");
		inorder(current.right);
		
		
		
	}
	
	
}