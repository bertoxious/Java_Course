import java.util.Scanner;

public class SwitchStatement{

	public static void main(String [] args){
		Scanner s1 = new Scanner(System.in);
		int demo = s1.nextInt();

		switch(demo){
			case 1: System.out.println("One is entered"); break;
			case 2 : System.out.println("Two is entered"); break;
			default : System.out.println("Entered values is " + demo);
		}
	}
}