
import java.util.LinkedList;
import java.util.HashMap;

public abstract class Node {    

	public LinkedList<Node> child;    
	
	public abstract int eval();    

	public LinkedList<Node> children() {
		return child;    
	}    
	public void addChild(Node n) {
		if (child ==null)     
			child = new LinkedList<Node>();child.add(n);    
	}    

	public Node child(int index) {
		return child.get(index);    
	}
	
	
}

