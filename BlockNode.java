public class BlockNode extends Node {    
	public int eval() {
		for(Node c: children()) {    
			c.eval();
		}
		return 0;    
	}
}
