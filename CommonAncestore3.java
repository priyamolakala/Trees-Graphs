package treesnGraphs;

public class CommonAncestore3 {
	
	public TreeNode ancestor(TreeNode root,TreeNode p, TreeNode q) {
		if(p == null) {
			return null;
		}
		if(!covers(root,p) || !covers(root,q)) {
			return null;
		}
		if(root == null || root == p || root == q) {
			return root;
		}
		
		boolean pIsLeft = covers(root.left,p);
		boolean qIsLeft = covers(root.right, q);
		if(pIsLeft!=qIsLeft) {
			return root;
		}
		TreeNode childNode = pIsLeft?root.left:root.right;
		return ancestor(childNode,p,q);
	}
	
	public boolean covers(TreeNode p,TreeNode q) {
		if(p == null) {
			return false;
		}
		if(p.data == q.data) {
			return true;
		}
		return covers(p.left,q) && covers(p.right,q);
	}

}
