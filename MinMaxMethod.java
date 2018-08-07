package treesnGraphs;

public class MinMaxMethod {
	int index = 0;
	
	public void inorder(TreeNode n, int[] array) {
		if(n == null) {
			array = new int[] {0};
		}
		inorder(n.left, array);
		array[index] = n.data;
		index++;
		inorder (n.right, array);
	}
	public boolean checkBST(TreeNode n) {
		int[] array = new int[n.size];
		inorder(n,array);
		for(int i = 0; i < array.length; i++) {
			if(array[i] <= array[i-1]) {
				return false;
			}
		}
		return true;
		
	}
	

}
