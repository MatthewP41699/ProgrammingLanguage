public class OutputNode extends Node {    
	public int eval() {
		Node child = child(0);
		System.out.println(child.eval());
		return 0;    
	}
}
