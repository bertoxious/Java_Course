import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class IteratorExample{
	public static void main(String [] args){
		// Iterator
		List<Integer> integerList = new LinkedList<Integer>();
		integerList.add(34);
		integerList.add(45);
		integerList.add(56);
		System.out.println(integerList);

		Iterator<Integer> iterator = integerList.iterator();
		System.out.println(iterator);
		while(iterator.hasNext()){
			int element = iterator.next();
			System.out.println(element);
		}
	}
}