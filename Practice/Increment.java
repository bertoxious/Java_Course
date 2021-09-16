class Increment{

	public static void main(String [] args){
		// Post and pre increment working in java

		int x = 45;
		int y = x++;
		System.out.println("Value of x is :: "+ x);
		System.out.println("Value of y ix :: "+ y);

		int a = 50;
		int b = ++a;
		System.out.println("Value of a is :: "+ a);
		System.out.println("Value of b is :: "+ b);

		// Post and pre decrement working in java

		int p = 100;
		int q = p--;
		System.out.println("Value of p is :: "+ p);
		System.out.println("Value of q is :: "+ q);

		int r = 200;
		int s = --r;
		System.out.println("Value of r is :: "+ r);
		System.out.println("Value of s is :: "+ s);
	}
}