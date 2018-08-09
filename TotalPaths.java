package treesnGraphs;

public class TotalPaths {
	
	public int totalPaths(TreeNode root, int targetsum) {
		
		if(root == null) {
			return 0;
		}
		
		int totalpathsfromroot = totalPathsfromNode(root, targetsum, 0);
		int totalpathsleft = totalPaths(root.left,targetsum);
		int totalpathsright = totalPaths(root.right,targetsum);
		
		return totalpathsfromroot + totalpathsleft + totalpathsright;
	}
	
	public int totalPathsfromNode(TreeNode root, int targetsum, int currentsum) {
		if(root == null) {
			return 0;
		}
		currentsum+=root.data;
		int totalpaths = 0;
		if(currentsum == targetsum) {
			return totalpaths++;
		}
		
		 totalpaths+=totalPathsfromNode(root.left,targetsum,0)
				totalpaths+=+totalPathsfromNode(root.right,targetsum,0);
		 return totalpaths;
	}

}
