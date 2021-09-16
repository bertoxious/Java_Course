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

	String[]  Update(String fname, String lname){
		String [] old = new String[2];
		old[0] = this.fname;
		old[1] = this.lname;
		this.fname = fname;
		this.lname = lname;

		return old;
	}
}