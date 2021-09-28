import java.util.Arrays;

public class Sorting{

    // Bubble sort - Stable sorting algorithm
    /* Bubble sort - swapping between the adjancent elements based on which
    one is greater and which one is smaller*/
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
	// Insertion Sort - Stable sorting algorithm
	/* Insertion Sort- select one element at a time from the left of the collection.
	Insert the element at proper position. 
	After insertion every element to the left of it will be sorted.*/
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
	// Selection Sort - Unstable Sorting Algorithm
	/* Selection sort - we select a particular max or min element 
	and place it in its right position*/
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

	// Shell Sort - Unstable Sorting Algorithm
	/* Selects an element and compares element after a gap (Where gap = length / 2)
	Similar to Insertion Sort
	Inserts selected element from the gap at its proper position*/
	static int[] ShellSort(int [] arr){
		int gap = arr.length / 2;
		for (int i= 0; i < gap ; i ++){
			if (arr[i] > arr[i+gap]){
				int temp = arr[i];
				arr[i] = arr[i+gap];
				arr[i+gap] = temp;
			}
		}
		return arr;
	}
	// Merge Sort - Stable Algorithm
	/* Divides the collection of elements into smaller subsets.
	Recursively Sorts the subsets
	Combine or merge the result into a solution
	Merger sort uses divide and conquer approach*/
	static int[] MergeSort(int [] arr, int left, int right){
		if (left < right){
			mid = ( left + right ) / 2;
			MergeSort( arr, left, mid);
			MergeSort( arr, mid+1, right);
			merge(arr, left , mid, right);
			// Uncomplete 
		}


		
	}
	public static void main(String args[]){
		int [] sam = {60,50,40,30,20,10};
		System.out.println(Arrays.toString(Bubble(sam)));
		System.out.println(Arrays.toString(Insertion(sam)));
		System.out.println(Arrays.toString(Selection(sam)));
		System.out.println(Arrays.toString(ShellSort(sam)));
	}
}