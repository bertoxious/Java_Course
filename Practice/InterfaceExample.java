interface Drawable{
	void print();
}

class Circle implements Drawable{
	public void print(){
		System.out.println("This is a Circle");
	}
}
class Rectangle implements Drawable{
	public void print(){
		System.out.println("This is a Rectangle");
	}
}
public class InterfaceExample{

	public static void main(String [] args){
		Drawable d = new Circle();
		Drawable r = new Rectangle();
		d.print();
		r.print();
	}
}