public class BasicsDemo{

	public class Student{
		String name;
		int id;

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

		Student [] students = new Student[2];
		students[0] = new Student();
		students[1] = new Student();
		students[0].id = 12;
		students[1].name = "amit";
		students[0].id = 121;
		students[1].name = "Sam";

		System.out.println(students[0].name);


	 }
}