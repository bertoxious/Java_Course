import java.util.Arrays;

public class SelectionSort{
	public static void main(String [] args){
		int[] demo = {345,234523,2345,23,12,41};
		int temp = 0;

		for(int i=0; i< demo.length -1;i++){
			for(int j=1;j< demo.length; j++ ){
				if (demo[j] < demo[i]){
					temp = demo[j];
					demo[j] = demo[i];
					demo[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(demo));
	}
}