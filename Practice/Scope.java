public class Scope{
	int x = 45;

	void function(){
		int x = 56;
		System.out.println("Incrementing inside function");
		x++;
		System.out.println("Incremented variable inside function :: " + x);
		this.x++;
		System.out.println("Incremented using this keyword :: "+ this.x);
	}

	public static void main(String [] args){

		Scope s = new Scope();
		s.function();
	}
}