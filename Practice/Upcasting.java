class Parent{


	void parent_method(){
		System.out.println("I am the parent");
	}
}

class Child extends Parent {

	void child_method(){
		System.out.println("I am the child");
	}
}



public class Upcasting{

	public static void main(String [] args){

		// Child object
		Child child = new Child();

		// Upcasting 
		Parent p = new Child();
		/* In this the Child is implicitly typecasted to Parent 
		so we can call the methods only available in the parent 
		class */
		// p.child_method();
		p.parent_method();

		/* below code will generate compile time error
		as parent cannot be converted to child */

		// Child c = new Parent(); 
		// c.child_method();
	}
}