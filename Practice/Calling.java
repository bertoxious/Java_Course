public class Calling{
	// Memory allocation for a static variable is only done once.
	// for a non-static variable, memory is allocated every time an instance of the class is created.
	static int demo = 45;
	int retro = 56;
	// Declaring static variable inside main function will generate compile 
	// time error.

	void print_function(){
		System.out.println("Simple print function.");
	}

	static void print_fun(int a, int b , int c){
		System.out.println("Static print function.");
	}
	public static void main(String [] args){
		// Static vs non-static Function Calling.
		Calling c = new Calling();
		c.print_function();
		Calling.print_fun();

		demo = 46;
		System.out.println(demo);

		Calling.demo = 47;
		System.out.println(demo);
		// Static Variable can be accessed the same way as static function
		c.retro = 97;
		System.out.println(c.retro);
	}
}