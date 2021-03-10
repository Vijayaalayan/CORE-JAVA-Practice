import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapImplementation {
	public static void main(String args[]) {
		
//		HashMap is not synchronized
//		No Thread Safety
		
		Map<String,String> map = new HashMap<>();
		map.put("name", "Vijay");
		map.put("Job", "SDE");
		map.put("degree", "BE");
		map.put("Job", "WEB Dev");
		
//		Can replace wont show error
		
		Set<String> keys = map.keySet() ;
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		
		
		
//		Hash table is synchronized
//		Thread Safety 
		
		Map<String,String> map1 = new Hashtable<>();
		map.put("name", "Vijay");
		map.put("Job", "SDE");
		map.put("degree", "BE");
		map.put("Job", "WEB Dev");
		
//		Can replace wont show error
		
		Set<String> keys1 = map1.keySet() ;
		for(String key : keys1) {
			System.out.println(key + " : " + map.get(key));
		}
	}
}
