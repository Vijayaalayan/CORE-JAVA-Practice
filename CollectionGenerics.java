import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CollectionGenerics {
	public static void main(String args[]) {
		Collection obj = new ArrayList();
		int size;
		Scanner s = new Scanner(System.in);
		size = s.nextInt();
		for(int i=0;i<size;i++) {
			int temp = s.nextInt();
			obj.add(temp);
		}
		Iterator it = obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		List obj2 = new ArrayList();
		for(int i = 0;i<size;i++) {
			int temp = s.nextInt();
			obj2.add(i, temp);
		}
//		Iterator it2 = obj2.iterator();
//		while(it2.hasNext()) {
//			System.out.println(it2.next());
//		}
		obj2.add(2,7);
//		for(int i=0;i<obj2.size();i++) {
//			System.out.println(obj2.get(i));
//		}
		for(Object o : obj2) {
			System.out.println(o);
		}
	}
}
