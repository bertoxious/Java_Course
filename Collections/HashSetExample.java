import java.util.HashSet;
import java.util.Set;



public class HashSetExample{
	
	public static void main(String [] args){
		Set<String> sHash = new HashSet<>();
		sHash.add("Amazon");
		sHash.add("Amazon");
		sHash.add("Google");
		sHash.add("Tesla");
		sHash.add("Microsoft");

		System.out.println(sHash);
	}
}