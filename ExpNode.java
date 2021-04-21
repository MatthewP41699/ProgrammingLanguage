public class ExpNode extends Node{

	public int eval(){
		int result = child(0).eval();
		
		for(int i = 1; i < child.size(); i+=2){ 
			OpNode on = (OpNode)child(i);
			String op = on.op;

		
			if(op.equals("+"))
				result += child(i+1).eval();
			else if(op.equals("-"))
				result -= child(i+1).eval();
			else if(op.equals("*"))
				result = result * child(i+1).eval();
			else if(op.equals("/"))
				result = result / child(i+1).eval();
			else if(op.equals("%"))
				result = result % child(i+1).eval();
		}

		return result;
	}
}
