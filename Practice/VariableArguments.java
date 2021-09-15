public class VariableArguments{
	// varargs - variable length arguments
	// The three dots represent that int ...,

	void vargsmethod(int i, int j, int k){
		System.out.println(i+j+k);
	}

	void vargsmethod(int... array){
		int sum=0;
		for (int i=0; i< array.length; i++){
			sum += array[i];
		}
		System.out.println(sum);
	}
	public static void main(String [] args){
		VariableArguments c = new VariableArguments();
		c.vargsmethod(2,34,5);
		int [] sam = new int [] {1,23,34,234,3241,56};
		c.vargsmethod(sam);

	}
}