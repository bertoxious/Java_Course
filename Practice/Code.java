public class Code{
	int age; String name; boolean ki;
	
	void Code(int umar, String naam, boolean pappu){
		this(umar, naam, false);
		if(ki){
			System.out.println("Pappu pass");
		}

	}
	public static void main(String [] args){

		Code c = new Code();
		c.Code(17,"Martinas",true);
	}
}