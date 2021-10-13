import java.util.List;
import java.util.LinkedList;

public class IteratorExample{
	public static void main(String [] args){
		List<Integer> integerList = new LinkedList<Integer>();
		integerList.add(34);
		integerList.add(45);
		integerList.add(56);
		System.out.println(integerList);
	}
}