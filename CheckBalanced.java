package treesnGraphs;

public class CheckBalanced {
	
	public int getHeight(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return 1 + getHeight(root.left) + getHeight(root.right);
	}
	
	public boolean isBalanced(TreeNode root) {
		if(root == null) {
			return true;
		}
		int delta = getHeight(root.left) - getHeight(root.right);
		if(delta<0 || delta>1) {
			return false;
		}
		return isBalanced(root.left) && isBalanced(root.right);
	}

}
