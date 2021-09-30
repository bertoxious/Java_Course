import java.util.ArrayList;
import java.util.List;

public class ListInterfaceExample{

	public static void main(String [] args){
	   List ninja = new ArrayList();
		ninja.add("Naruto");
		ninja.add("Sakura");
		ninja.add("Sasuke");
		ninja.add(2);

		//List <Integer> al = new ArrayList<Integer>();

		
		System.out.println(ninja);
	}
}