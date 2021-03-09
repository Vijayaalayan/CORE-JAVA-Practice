/*
 * 
 * Classes are of 3 types
 * Member class (normal class)
 * Static class
 * Anonymous class 
 * 
 * 
 */
class Outer{
	int a;
	public void show(){
		System.out.println("in outer");
	}
	
	Outer(){
		Inner obj1 = new Inner();
		obj1.display();
	}
	class Inner{
		int b;
		public void display() {
			System.out.println("in inner");
		}
	}
	static class Static{
		public void dis() {
			System.out.println("Static class");
		}
	}
}




public class InnerClassDemo {

	public static void main(Strings[] args) {
		Outer obj = new Outer();
		obj.show();
		Outer.Inner obj2 = obj.new Inner();
		obj2.display();
		Outer.Static obj3 = new Outer.Static();
		obj3.dis();
	}

}
