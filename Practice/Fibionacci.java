public class Fibionacci{

	static int Fibionacci(int number){
		int a = 0; int b = 1;int sum;
		if (number == 0){
			return 0;
		}
		else if (number == 1){
			return 1;
		}
		for (int i=0; i < number-1 ; i++){
			sum = a+b;
			a = b;
			b = sum;
		}
		return b;
	}
	public static void main(String [] args){
		System.out.println(Fibionacci(30));
	}
}