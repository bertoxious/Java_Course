public class StringPool{
	public static void main(String [] args){
	// String Pool
	String s = "Java";
 	// String Pool
	String d = new String("Java").intern();
	// Java Heap
	String a = new String("Java"); 

	System.out.println("With intern() :: " + (s==d));
	System.out.println("Without intern() :: "+ (s==a));

	}
}