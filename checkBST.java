package treesnGraphs;

public class checkBST {
	public boolean isBST(TreeNode root, Integer min, Integer max) {
		if(root == null) {
			return true;
		}
		
		if((min!=null && min<=root.data) || (max!=null && max>root.data)) {
			return false;
		}
		return isBST(root.left,min,root.data) && isBST(root.right,root.data,max);
	}

}
