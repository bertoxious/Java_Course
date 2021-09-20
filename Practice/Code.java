import java.util.Date;
import java.util.ArrayList;

public class Code{

	// Playground
	public static void main(String [] args){
		System.out.println("String [] args method executed");

		// java equals Ignore Case function compares two strings irrespective of the uppercases or lowercases in them.
		System.out.println("Sam".equalsIgnoreCase("sam"));

		// This is how equals ignore case works with spaces
		System.out.println("S a m ".equalsIgnoreCase("sam"));

		// types of working of different for loops
		for(double i= 1.23; i < 12.01; i++){
			System.out.println("Working " + i);
		}

		for(int i=0; i< 10;System.out.println(i), i++);
		int [] arr = new int[] {10,20,30,40,50};
		for(int i=0; i< arr.length; System.out.println(arr[i++]));
		// working of for each loop in java
		for(int i : arr){ System.out.println(i + " ");
		Date date;
		ArrayList list;
		java.sql.Date date2;
	}
	int uzumaki = 43;
	String naruto = "Nanadaime Hokage";
	System.out.println(uzumaki + naruto);
	System.out.println("String" + 43);
	}	

	public static void main(int [] args){
		System.out.println("Int [] args method executed");
	}

	public static void main(double [] args){
		System.out.println("Double [] method executed");
	}
} 