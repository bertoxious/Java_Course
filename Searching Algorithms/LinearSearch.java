import java.util.Scanner;

public class LinearSearch{

	public static void main(String [] args){

		int[] sam = {10,20,30,40,50};
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a number to search for :: ")
		int number = s1.nextInt();
        
		for (int i = 0; i < sam.length; i++){
			if (sam[i]== 20 ){
				System.out.println("Element is present at position "+ (i+1));
			}
		}
	}
}