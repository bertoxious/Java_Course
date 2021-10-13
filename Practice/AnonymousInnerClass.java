class Outer{

	void outerMethod(){
		System.out.println("I am the outer method.");
	}
}


public class AnonymousInnerClass{


	public static void main(String [] args){
		Outer abc = new Outer(){
			void outerMethod(){
				System.out.println("I am not the outer method.");
			}
		};
		abc.outerMethod();

	}
}