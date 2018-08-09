package treesnGraphs;

import java.util.Random;

public class TreeNode {
	int data;
	TreeNode left, right;
	TreeNode root = null; 
	public int size;
	public TreeNode(int d) {
		this.data = d;
		size = 1;
	}
	public int size() {
		return size;
	}
	public int data() {
		return data;
	}
	
	public TreeNode RandomNode() {
		int leftsize = left==null?0:left.size();
		Random random = new Random();
		int index = random.nextInt(size);
		if(index<leftsize) {
			left.RandomNode();
		}
		else if(index == leftsize) {
			return this;
		}
		else if(index>leftsize) {
			right.RandomNode();
		}
		return null;
	}
	
	public void insertNode(int d) {
		if(d<=data) {
			if(left!=null) {
				left = new TreeNode(d);
			}else {
				left.insertNode(d);
			}
		}
		else if(d>data) {
			if(right!=null) {
				right = new TreeNode(d);
			}else {
				right.insertNode(d);
			}
		}
		size++;
	}
	
	public TreeNode find(int d) {
		if(d == data) {
			return this;
		}
		else if(d<data && left!=null) {
			return left.find(d);
		}
		else if(d>data && right!=null) {
			return right.find(d);
		}
		return null;
	}
	
	

}
