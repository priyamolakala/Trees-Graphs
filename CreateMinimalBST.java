package treesnGraphs;

public class CreateMinimalBST {
	public TreeNode createminimal(int[] array) {
		return createminimal(array, 0, array.length-1);
	}
	
	public TreeNode createminimal(int[] arr, int start, int end) {
		if(end<start) {return null; }
		int mid = (start + end)/2;
		TreeNode n  = new TreeNode(arr[mid]);
		n.right = creatingminimal(arr, mid + 1, end);
		n.left = creatingminimal(arr, mid - 1, start); 
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
