package treesnGraphs;
import java.util.LinkedList;

public class Graph {
	int vertices;
	LinkedList<Integer>[] Node;
	
	Graph(int v) {
		this.vertices = v;
		Node = new LinkedList[v];
		for(int i = 0; i < vertices; i++) {
			Node[i] = new LinkedList<Integer>();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
