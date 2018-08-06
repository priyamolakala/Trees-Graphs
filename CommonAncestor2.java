package treesnGraphs;

public class CommonAncestor2 {
	
	public boolean covers(TreeNode p, TreeNode q) {
		if(p==null) {
			return false;
		}
		if(p.data == q.data) {
			return true;
		}
		return covers(p.left,q) || covers(p.right,q);
	}
	
	public TreeNode getSiblings(TreeNode root) {
		if(root == null) {
			return null;
		}
		TreeNode parent = root.parent;
		if(parent.left == root) {
			return parent.right;
		}else {
			return parent.right;
		}
	}
	
	public TreeNode ancestor(TreeNode p, TreeNode q) {
		if(!covers(root,q)) {
			return null;
		}
		if(covers(p,q)) {
			return p;
		}
		if(covers(q,p)) {
			return q;
		}
		
		TreeNode sibling = getSiblings(p);
		TreeNode parent = p.parent;
		while(!covers(sibling,q) && parent!=null) {
			sibling = parent;
			parent = parent.parent;
		}
		return parent;
	}

}
