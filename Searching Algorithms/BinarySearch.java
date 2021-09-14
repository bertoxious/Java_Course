import java.util.Scanner;

public class BinarySearch{
	public static void main(String [] args){
		int[] values = {10,20,30,40,50};

		int left=0;
		int right=values.length;
		int middle;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a number to search for :: ");
		int number = s1.nextInt();

		while (left < right){

			middle = (left+right)/2;

			if (values[middle] == number){
				System.out.println("Element present at position "+ (middle+1));
				break;
			}
			else if (values[middle] < number){
				left = middle - 1;
			}
			else if (values[middle] > number){
				right = middle + 1;
			}
		}
	}
}