import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;


public class LArrayList{

	public static void main(String [] args){

		List<String> ninja = new ArrayList<>();
		// add function will always add the element at the end of the list
		ninja.add("Naruto");
		ninja.add("Sasuke");
		ninja.add("Shikamaru");
		ninja.add("Sai");
		ninja.add("Choji");
		ninja.add("Neiji");
        // Size will increase by n + n/2 + 1

        // add an element at particular index
        ninja.add(0,"The added element");
		System.out.println(ninja);

		List<String> newList = new ArrayList<>();
		newList.add("NEW LIST");
		newList.add("NEW LIST");
		System.out.println("\n .addAll(anotherList) ---------");
		ninja.addAll(newList);
		System.out.println(ninja);

		// get function will return the element at that particular index
		System.out.println("\n .get(index of element) --------");
		System.out.println(ninja.get(4));

		// remove function will remove the element at that particular index
		ninja.remove(4);
		System.out.println("----- After removal -----");
		System.out.println(ninja);

		System.out.println(".remove(String.valueOf(name of String))");
		ninja.remove(String.valueOf("Neiji"));
		System.out.println(ninja);

		Collection<String> list = new ArrayList<>();
		list.add("Amazon");
		list.add("Google");
		list.add("Apple");
		list.add("Facebook");
		list.add("Netflix");

		System.out.println(list);
		// clear function will remove all the elements present in the list.
		ninja.clear();
		System.out.println("\n .clear() ------");
		System.out.println(ninja);

		list.remove("Google");
		System.out.println(list);

		ninja.addAll(list);
		System.out.println(ninja);
		System.out.println(list);

		// set function will change the index at which the element is present with the given element
		ninja.set(0,"Changed using set function");
		System.out.println(ninja);
		System.out.println(list);

		System.out.println(ninja.contains("Facebook"));
		System.out.println(list.contains("Amazon"));
		System.out.println(newList.contains("NEW LIST"));


		Iterator<String> ninjaIterator = ninja.iterator();
		while (ninjaIterator.hasNext()){
			System.out.println(ninjaIterator.next());
		}
	}
}