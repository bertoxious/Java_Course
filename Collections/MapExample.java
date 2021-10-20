import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class MapExample{
	public static void main(String [] args){

		Map<String , Integer > map = new HashMap<>();

		map.put("Saitama",1);
		map.put("Genos",2);
		map.put("Silver Fang", 3);

		System.out.println(map);

		if (map.containsKey("Genos")){
			System.out.println("Genos is present");
		}

		map.putIfAbsent("Genos", 5);
		System.out.println(map);
		map.put("Genos", 56);
		map.put("Motor",56);
		System.out.println(map);

		for(Entry<String, Integer> e: map.entrySet()){
			System.out.println("Key :: "+ e.getKey() +" Value :: "+ e.getValue());
		}
	}
}