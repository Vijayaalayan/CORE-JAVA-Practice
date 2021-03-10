import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Emplo implements Comparable<Emplo>{
	int Eno,salary;
	String name;
	public Emplo(int eno, String name, int salary ) {
		super();
		Eno = eno;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emplo [Eno=" + Eno + ", salary=" + salary + ", name=" + name + "]";
	}
	
	public int compareTo(Emplo e) {
		return salary>e.salary?1:-1;
	}
	
	
}

public class ComparableInterface {
	public static void main(String args[]) {
		List<Emplo> obj = new ArrayList<>();
		obj.add(new Emplo(1,"Vijay",1000));
		obj.add(new Emplo(2,"Naveen",2000));
		obj.add(new Emplo(4,"Kili",4000));
		obj.add(new Emplo(3,"Nithin",3000));
		
		Collections.sort(obj);
		Collections.sort(obj,(i,j)->i.salary>j.salary?1:-1);
		for(Emplo e : obj) {
			System.out.println(e);
		}
	}
}
