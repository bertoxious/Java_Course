public class Calling{

	void print_function(){
		System.out.println("Simple print function.");
	}

	static void print_fun(){
		System.out.println("Static print function.");
	}
	public static void main(String [] args){
		// Static vs non-static Function Calling.
		Calling c = new Calling();
		c.print_function();
		Calling.print_fun();

	}
}