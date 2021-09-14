public class BasicsDemo{
	public static void main(String [] args){
		String demo = "Xavier";
		System.out.println(demo.getClass());
		int nemo = 45;
		System.out.println(((Object)nemo).getClass());
		String [] arr = {"Key","Super","Donut","Media","Birmingham"};
		System.out.println(arr.getClass());
	}
}