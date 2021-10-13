class Papa{
	void method(){
		System.out.println("I am Papa");
	}
}

interface Interface{
	public void inside_interface();
}
class Beta extends Papa implements Interface{
	public void inside_interface(){
		System.out.println("Interface method");
	}
	public void beta_method(){
		System.out.println("I am beta");
	}
	
} 

public class InterfaceCasting{

	public static void main(String [] args){
		Interface inter = new Beta(); 
		inter.inside_interface();
		Beta betaji = new Beta();
		betaji.beta_method();
		betaji.method();

	}
}
