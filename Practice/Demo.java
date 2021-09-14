public class Demo{
	public static void main(String [] args){
		int lightspeed;
		long days;
		long seconds;
		long distance;

		lightspeed = 1_86_000;
		days = 1000;
		seconds = days * 24 * 60 * 60;
		distance = lightspeed * seconds;

		System.out.print("In " + days);
		System.out.print(" days light will travel about ");
		System.out.print(distance + " miles.");
	}
}

// integer -> - 2**64 to 2**64 - 1
// integer -> - 2**32 to 2**32 - 1
// short -> - 2**16 to 2**16 -1 
// byte -> - 2**7 to 2** 7 -1 
// hexadecimal -> 0x41 0x____

// binary ->  0b01000001 0b____

// octal -> 0101 0____

