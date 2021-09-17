public class BitwiseOperator{
	static int x = 1;
	static int y = 3;

	static float a = 54.345f;
	static float b = 234.342f;

	static boolean retro = true;
	static boolean crush = false;

	static char finding = 'a';
	static char nemo = 'b';

	public static void main(String [] args){
		// or operator
		System.out.println(x | y);

		// and operator
		System.out.println(x & y);

		// xor operator
		System.out.println(x ^ y);

		//Not operator
		System.out.println( ~ y);

		// System.out.println(a | b);

		System.out.println(retro | crush);

		// Note :: Bitwise Operators don;t work on double and float 
		System.out.println(finding | nemo);
	}
}