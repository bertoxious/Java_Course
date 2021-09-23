public class ReflectionExample{
	public static void demoClassObjectAccess(){
		System.out.println("\n Demo class object access ... \n");

		String [] strarray = {"Brahman","Tokyo Manji","Black Riders"};
		System.out.println("\n strarray.getClass().getName() : " + strarray.getClass().getName());

	}
	public static void main(String [] args){
		demoClassObjectAccess();
	}
}