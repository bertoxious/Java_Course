public class Code{

	// Playground
	int id; String name; int salary;

	Code(int userid, String username){
		id = userid;
		name = username;
	}

	Code(int userid, String username, int usersalary){
		this(userid, username);
		salary = usersalary;
	}

	public static void main(String [] args){

		Code student = new Code(1,"Ashish Kumar Uniyal");
		System.out.println("Student id:: "+ student.id + "Student Name :: " + student.name);
		Code instructor = new Code(2,"Rajan Punchouty",1000000);
		System.out.println("Name :: "+ instructor.name + "ID :: "+ instructor.name + "Salary :: "+ instructor.salary);

	}
}