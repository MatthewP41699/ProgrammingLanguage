import java.util.*;  

public class InputNode extends Node {
        public int eval() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
                VarNode child = (VarNode)child(0);
		Descript.ram.put(child.getValue(), input);                

		return 0;
        }
}

