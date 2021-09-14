import java.util.Arrays;

public class Sorting{


	static int[] Bubble(int [] arr){

		for(int i=0;i < arr.length;i++){
			for(int j=0; j < arr.length-1;j++){
				if (arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

	static int[] Insertion(int [] arr){

		for(int i= 0; i < arr.length-1; i++){
			for(int j=0; j< i; j++){
				if (arr[j]> arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String args[]){
		int [] sam = {10,30,20,40,60,50};
		System.out.println(Arrays.toString(Bubble(sam)));
		System.out.println(Arrays.toString(Insertion(sam)));
	}
}