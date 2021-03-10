import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementation {
	public static void main(String args[]) {
		Set<Integer> values = new HashSet();
		
//		HashSet -> Unique only add
//		and
//		Add in hash table wise so not give values in the order which we add		
		
		
		values.add(3);
		values.add(1);
		values.add(9);
		for(Integer i: values) {
			System.out.println(i);
		}
		
//		TreeSet gives values in ascending order. 
		
		Set<Integer> obj = new TreeSet();
		obj.add(9);
		obj.add(3);
		obj.add(1);
		for(Integer i: obj) {
			System.out.println(i);
		}
		
	}
}
