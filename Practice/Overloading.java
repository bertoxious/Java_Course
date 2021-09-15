public class Overloading{

	void Retro(String fname, String lname){
		System.out.println("Crushed" + fname);
	}

	void Retro(int a, int b, int c){
		System.out.println("Sum is " + (a+b+c));
	}
	public static void main(String [] args){
		System.out.println("Hello There!");

		Overloading c = new Overloading();

		c.Retro("Aditya","Batliwala");
		c.Retro(1,2,3);
	}
}