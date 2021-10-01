import java.util.*;

public class CollectionsExample{

	public static void main(String [] args){

		// List interface implementing ArrayList

		List <Integer> arrList = new ArrayList<Integer>();
		arrList.add(45);
		arrList.add(34);
		arrList.add(12);
		System.out.println("The array list is :: \n"+ arrList);
		System.out.println("arrList.contains(34) :: "+ arrList.contains(34));
		System.out.println("arrList.indexOf(12) :: " + arrList.indexOf(12));
		System.out.println("arrList.remove(12) :: ");
		arrList.remove(2); // remove method will input the index of the element
		System.out.println("---After removing ---- \n"+ arrList);
		// System.out.println("Implementing arrrList.removeAll()");
		// arrList.removeAll();
		// removeAll function works like this - List1.removeAll(list2)
		System.out.println("arrList.size() :: "+ arrList.size());
		System.out.println("arrList.isEmpty() :: "+ arrList.isEmpty());
		System.out.println("After removing all the elements ");
		System.out.println(arrList);
		System.out.println("Array List can store duplicates as well as null values.");
		arrList.add(45);
		arrList.add(null);
		System.out.println("arrList.add(45); arrList.add(null); :: "+ arrList);
		System.out.println("arrlist.set(2,90) :: "+ arrList.set(2,90));
		// .set(Index, value) and would return the value interchanged with
		System.out.println("arrList.lastIndexOf(45) ::"+ arrList.lastIndexOf(45));

		Collection <String> strList = new ArrayList<String>();
		strList.add("Ichi");
		strList.add("Ni");strList.add("Go");
		strList.add("San");strList.add("Youm");strList.add("Go");strList.add("Roku");
		System.out.println(strList);
		System.out.println(strList.indexOf("Go"));
		System.out.println(strList.lastIndexOf("Go"));
	}
}