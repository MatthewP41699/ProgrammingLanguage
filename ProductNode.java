public class ProductNode extends Node{

        public int eval(){
                int result = child(0).eval();
                OpNode on = (OpNode)child(1);
                String op = on.op;
                if(op.equals("*"))
                        result *= child(2).eval();
                return result;
        }
}


