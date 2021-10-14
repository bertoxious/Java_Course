import java.util.Stack;
import java.util.List;

public class StackExample{

	public static void main(String [] args){
		Stack<String> theStack = new Stack<>();
		theStack.push("Robert");
		theStack.push("Dowery");
		theStack.push("Junior");
		System.out.println(theStack);
		theStack.pop();
		System.out.println(theStack);
		System.out.println(theStack.seek());

		// List interface
		List<Integer> intStack = new Stack<>();
		intStack.add(34);
		intStack.add(45);
		intStack.add(56);
		System.out.println(intStack);
	}
}