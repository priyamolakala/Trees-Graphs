package treesnGraphs;
import java.util.LinkedList;
import java.io.*;

import javax.xml.soap.Node;



public class BFSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	enum State {
		Unvisited,
		Visiting,
		Visited;
	}
	
	public boolean search(Graph g, Node start,Node end) {
		if(start == end) {
			return true;
		}
		LinkedList<Node> q = new LinkedList<Node>();
		for(Node u: g.getNodes()) {
			u.state = State.Unvisited;
		}
		
		start.state = State.Visiting;
		q.add(start);
		Node u;
		while(!q.isEmpty()) {
			u = q.removeFirst();
			if(u != null) {
				for(Node v: u.getAdjacent()) {
					if(v == end) {
						return true;
					}
					else {
						v.state = State.Visiting;
						q.add(v);
					}
				}
			}
			u.state = State.Visited;
		}
		
	}

}
