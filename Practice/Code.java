public class Code{

	// Playground
	public static void main(String [] args){
		System.out.println("String [] args method executed");

		// java equals Ignore Case function compares two strings irrespective of the uppercases or lowercases in them.
		System.out.println("Sam".equalsIgnoreCase("sam"));

		// This is how equals ignore case works with spaces
		System.out.println("S a m ".equalsIgnoreCase("sam"));

		for(double i= 1.23; i < 12.01; i++){
			System.out.println("Working " + i);
		}

		for(int i=0; i< 10;System.out.println(i), i++);
		int [] arr = new int[] {10,20,30,40,50};
		for(int i=0; i< arr.length; System.out.println(arr[i++]));

		for(int i : arr){ System.out.println(i + " ");}
	}	

	public static void main(int [] args){
		System.out.println("Int [] args method executed");
	}

	public static void main(double [] args){
		System.out.println("Double [] method executed");
	}
} 