class StudentTest{

	public static void main(String [] args){

		Student s1 = new Student(1,"Naruto","Uzumaki");
		System.out.println("Name :: "+ s1.fname + s1.lname + s1.id);


		Student s2 = new Student(2,"Sasuke","Uchiha");
		System.out.println("Name :: "+s2.fname + s2.lname + s2.id);


		Student s3 = new Student(3,"Sakura","Haruno");
		System.out.println("Name :: "+s3.fname + s3.lname + s3.id);


		Student t = new Student("Kakashi","Hatake");
		System.out.println("Sensei :: "+ t.fname + t.lname);


		t.Update("Minato", "Namikaze");
		System.out.println("Updated name from " + old[0] +" "+ old[1] + " to " + t.fname + " " + t.lname );
	}
}