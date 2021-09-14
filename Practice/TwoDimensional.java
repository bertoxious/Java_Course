public class TwoDimensional{

	public static void main(String [] args){

		int [][] array = new int[5][];


		array[0] = new int[2];
		array[1] = new int[3];
		array[2] = new int[4];
		array[3] = new int[3];
		array[4] = new int[2];

		System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[1].length);
		System.out.println(array[2].length);
		System.out.println(array[3].length);
		System.out.println(array[4].length);
	}
}