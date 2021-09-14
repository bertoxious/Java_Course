public class Calling{

	static void updatedID(Calling id){
		c.id = 2000;
	}
	public static void main(String [] args){
		int id = 1000;
		updatedID(id);
		System.out.println(id);

		Calling c = new Calling();
		c.id = 1000;
		updatedID(c);
		System.out.println(id);



	}
}