public class AssertionsExample{
	static void equal(int a){
		assert a > 0: "The entered integer is greater than zero"; 
	}

	public static void main(String args[]){
		equal(11);// true
		equal(10);// true
		equal(-1);// Assertion will work here
	}
}