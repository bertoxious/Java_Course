public class BitShift{
	public static void main(String [] args){

		// left shift
		int x = -1;
	    x = x << 5;
		System.out.println(x);

		// right shift
		int y = -1;
		y = y >> 5;
		System.out.println(y);

		// right unsigned shift
		int z = -10;
		z = z >>> 1;
		System.out.println(z);

		// No unsigned left shift in java

		// int w = 0;
		// w = w <<< 5;
		// System.out.println(w);

	}
}