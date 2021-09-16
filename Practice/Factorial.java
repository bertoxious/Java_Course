public class Factorial{

	static int Factorial_method( int number ){
		if ( number == 1){
			return number;
		}
		return number*(number-1);
	}
	public static void main(String [] args){
		System.out.println(Factorial_method(5));

	}
}