
class Emp{
	int eid;
	int salary;
	static String ceo;
	
	
	static {
		ceo="Vijay";
		System.out.println("in static");
	}
	Emp(){
		eid = 1;
		salary = 3000;
		System.out.println("in constructor");
	}
	void show() {
		System.out.println(eid+" : "+salary+" : "+ceo);
	}
}


public class StaticCode {
	static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		i=9;
		Emp obj1 = new Emp();
		obj1.show();
		Emp obj2 = new Emp();
		obj2.show();
	}

}
