public class VarNode extends Node{

	public String value; 

        public VarNode(String image){
                super();
                value = image;
        }

	public String getValue(){
		return value;
	}

        public int eval(){
                return Descript.ram.get(value);
       }

}

