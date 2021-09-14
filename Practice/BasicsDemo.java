public class BasicsDemo{

	public class Student{
		String name;
		int id;

	}

	static double Sum(double a, double b){
		return ;
	}
	public static void main(String [] args){
		String demo = "Xavier";
		System.out.println(demo.getClass());
		int nemo = 45;
		System.out.println(((Object)nemo).getClass());
		String [] arr = {"Key","Super","Donut","Media","Birmingham"};
		System.out.println(arr.getClass());

		int max = 43;
		int news = 0;
		news = max;
		System.out.println(news);
		System.out.println(max);


		System.out.println(Sum(45.2245235, 13.4524534));


	 }
}