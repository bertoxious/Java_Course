public class Code{

	// Playground
	public static void main(String [] args){
		System.out.println("String [] args method executed");

		// java equals Ignore Case function compares two strings irrespective of the uppercases or lowercases in them.
		System.out.println("Sam".equalsIgnoreCase("sam"));

		// This is how equals ignore case works with spaces
		System.out.println("S a m ".equalsIgnoreCase("sam"));
	}	

	public static void main(int [] args){
		System.out.println("Int [] args method executed");
	}

	public static void main(double [] args){
		System.out.println("Double [] method executed");
	}
} 