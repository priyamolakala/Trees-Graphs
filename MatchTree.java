package treesnGraphs;

public class MatchTree {
	
	public boolean subtree(TreeNode p, TreeNode q) {
		StringBuilder sb1= new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		getInorder( p, sb1);
		getInorder( q, sb2);
		
		return sb1.indexOf(sb2.toString())!=-1;
		
		
		
	}
	
	public StringBuilder getInorder(TreeNode p, StringBuilder s) {
		if(p == null) {
			s.append("X");
			return s;
		}
		
		getInorder(p.left,s);
		s.append(p.data);
		getInorder(p.right,s);
		
		return s;
	}

}
