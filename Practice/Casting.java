

public class Casting{
	public static void printObjectSize(Object object) {
        System.out.println("Object type: " + object.getClass() +
          ", size: " + InstrumentationAgent.getObjectSize(object) + " bytes");
    }


    static int Sum(double a, double b){
    	return (int) (a+b);
    }
	public static void main(String [] args){
		//Implicit Type Casting
		int x = 435;
		long y = x;
		System.out.println(y);

		//Explicit Type Casting
		long a = 345;
		int b = (int) a;
		System.out.println(b);

		byte narrowed = (byte) 128;
		System.out.println(narrowed);

		short down = (short) 123456;
		System.out.println(down);

		// Information loss eg: truncation
		int truncate = (int) 2.99;
		System.out.println(truncate);

		// Chart to int
		char demo = 'A';
		int nemo = (int) demo;
		System.out.println(nemo);

		// System.out.println(instrument.getObjectSize(nemo));

		System.out.println(Sum(23.141,1234.234));

	}
}