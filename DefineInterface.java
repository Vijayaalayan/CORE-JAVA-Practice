

// After JAVA 1.7 i.e in 1.8 and above interface can be defined using keyword default

@FunctionalInterface /*Now this doesn't show error because it takes into acount only the abstract methods and not the defined ones */
interface Abcd{
	void show();
	public default void inter() {
		System.out.println("In Abcd interface");
	}
}

interface Demo{
	public default void inter() {
		System.out.println("In Demo interface");
	}
}
class Imple implements Abcd,Demo{
	public void show() {
		System.out.println ("In Class");
	}
//	Either override on own or override and implement any one method from other interface 
	@Override
	public void inter() {
		// TODO Auto-generated method stub
		Abcd.super.inter();
	}
	
	
//	Default methods can be overridden
//	public void inter() {
//		System.out.println("In Class Inter");
//	}
}

public class DefineInterface {
	public static void main(String args[]) {
		Abcd obj = new Imple();
		obj.inter();
		obj.show();
	}
}
