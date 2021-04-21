public class AssignNode extends Node {
        public int eval() {

		VarNode var = (VarNode)child(0);
		Node node = (Node)child(1);		
                int value = node.eval();
		String something = var.getValue();		

                Descript.ram.put(something, value);

                return 0;
        }
}

