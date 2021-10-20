import java.util.HashSet;
import java.util.Set;

public class HashSetExample{
	
	public static void main(String [] args){
		Set<String> sHash = new HashSet<>();

		sHash.add("Amazon");
		sHash.add("Google");
		sHash.add("Tesla");
		sHash.add("Microsoft");

		System.out.println(sHash);
		Set<Integer> iHash = new HashSet<>();

		iHash.add(34);
		iHash.add(12);
		iHash.add(45);
		iHash.add(78);

		System.out.println(iHash);

	}
}