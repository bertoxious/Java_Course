class Something <T>{
	T value;

	public void show(){
		System.out.println(value.getClass().getName());
	}
}

public class GenericsExample{
	public static void main(String [] args){

		Something <Integer> d = new Something<>();
		d.value = 45;
		d.show();
	}
}