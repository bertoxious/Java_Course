public class Calling{
	
	static int demo = 45;

	// Declaring static variable inside main function will generate compile 
	// time error.
	
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

		demo = 46;
		System.out.println(demo);
	}
}