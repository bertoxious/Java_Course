public class Constructors{
	String name; int salary; String desi;

	Constructors(String username, int usersalary){
		name = username;
		salary = usersalary;
	}
	Constructors(String rapchik, int mamu, String designation){
		this(rapchik, mamu);
		desi = designation;
	}
	public static void main(String [] args){
		Constructors emp = new Constructors("Ashish", 15000);
		System.out.printf("Name of the person is :: %s \n Salary of the person is :: %d \n Designation :: Employee ",emp.name, emp.salary);
		Constructors boss = new Constructors("Mayank",65000, "Boss");
		System.out.printf("Name of the person is :: %s \n Salary of the persons is :: %d \n Designation :: %s",boss.name, boss.salary,boss.desi);

	}
}