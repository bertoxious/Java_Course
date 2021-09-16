public class Student{
	int id;
	String fname;
	String lname;

	Student(int id, String fname, String lname){
		this(fname, lname);
		this.id = id;
	}
	Student(String fname, String lname){
		this.fname = fname;
		this.lname = lname;
	}

	boolean Update(String fname, String lname){
		this.fname = fname;
		this.lname = lname;
		return true;
	}
}