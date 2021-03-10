import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//Own Sort logic using comparator

public class ComparotorSort {
	public static void main(String args[]) {
		List<Integer> values = new ArrayList();
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		for(int i=0;i<size;i++) {
			values.add(i, s.nextInt());
		}
		Comparator<Integer> c = (i, j) -> i%10>j%10?1:-1;
			
		
		
//		Comparator<Integer> c = new Comparator<Integer>() {
//			public int compare(Integer i,Integer j) {
//				return i%10>j%10?1:-1;
//			}
//		};
		
//		Directly place in sort function itself.
//		Collection.sort(values,(i,j) -> i%10>j%10?1:-1);
		Collections.sort(values,c);
		for(Integer i : values) {
			System.out.println(i);
		}
	}
}
