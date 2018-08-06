package treesnGraphs;

public class InorderSucc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode successor(TreeNode root) {
		if(root == null) {
			return null;
		}
		if(root.right!=null) {
			return leftmostchild(root);
		}else {
		
		TreeNode x = root.parent;
		TreeNode q = root;
		while(x!=null && x.left!=q) {
			q = x;
			x = x.parent;
		}
		return x;
	}
	}
	
	public TreeNode leftmostchild(TreeNode root) {
		if(root == null) {
			return null;
		}
		if(root.left!=null) {
			root=root.left;
		}
		return root;
		
	}
	
	

}
