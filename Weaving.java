package treesnGraphs;
import java.util.ArrayList;
import java.util.LinkedList;

public class Weaving {
	
	public ArrayList<LinkedList<Integer>> starting(TreeNode root){
		ArrayList<LinkedList<Integer>> results = new ArrayList<LinkedList<Integer>>();
		if(root == null) {
		LinkedList<Integer> current = new LinkedList<Integer>();
		results.add(current);
	}

	
	LinkedList<Integer> prefix = new LinkedList<Integer>();
		 prefix.add(root.data);
		 ArrayList<LinkedList<Integer>> leftseq = starting(root.left);
		 ArrayList<LinkedList<Integer>> rightseq = starting(root.right);
		 for(LinkedList<Integer> first: leftseq) {
			 for(LinkedList<Integer> second: rightseq) {
				 ArrayList<LinkedList<Integer>> weave = new ArrayList<LinkedList<Integer>>();
			 weaving(first,second,weave,prefix);
			 }
		 }
	}
		 public void weaving(LinkedList<Integer> left,LinkedList<Integer> right, ArrayList<LinkedList<Integer>> finald, LinkedList<Integer> prefix){
			 if(left.size() == 0 || right.size()==0) {
			 LinkedList<Integer> copy = (LinkedList<Integer>)prefix.clone();
			 finald.add(left);
			 finald.add(right);
			 finald.add(copy);
			 return;
			 }
			 
			 
			 int HeadFirst = left.removeFirst();
			 prefix.add(HeadFirst);
			 weaving(left,right,finald,prefix);
			 int HeadLast = left.removeLast();
			 left.add(HeadLast);
			 
			 int Headsecond = right.removeFirst();
			 prefix.add(Headsecond);
			 weaving(left,right,finald,prefix);
			 int Headsecondlast = right.removeLast();
			 left.add(Headsecondlast);
			 
			 
			 
		 
	}
}
