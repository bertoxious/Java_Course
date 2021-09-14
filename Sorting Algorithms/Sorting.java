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

	static int[] Selection(int [] arr){

		for(int i= arr.length-1; i >=0 ; i--){
			int max = 0;
			for(int j= 0; j <= i; j++){ // 30 > 10
				if (arr[j] > max){ 
					max = arr[j]; // max = 30 
				}
			}
		arr[i] = max; 
		}
		return arr;
	}

	public static void main(String args[]){
		int [] sam = {60,50,40,30,20,10};
		System.out.println(Arrays.toString(Bubble(sam)));
		System.out.println(Arrays.toString(Insertion(sam)));
		System.out.println(Arrays.toString(Selection(sam)));
	}
}