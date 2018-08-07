package treesnGraphs;
import java.util.LinkedList;
import java.util.ArrayList;
public class LevelOrderTraversal {
	
	public ArrayList<LinkedList<TreeNode>> levelTraversal(TreeNode root){
		
		ArrayList<LinkedList<TreeNode>> results = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> current;
		if(root == null) {
			current = new LinkedList<TreeNode>();
			results.add(current);
		}
		current = new LinkedList<TreeNode>();
		current.add(root);
		while(current.size()>0) {
			results.add(current);
			LinkedList<TreeNode> parent = current;
			current = new LinkedList<TreeNode>();
			for(TreeNode n : parent) {
				if(n.left!=null) {
				current.add(n.left);
				}
				if(n.right!=null) {
				current.add(n.right);
				}
			}
			
		}
		
		
		return results;
		
		
	
		
	}

}
