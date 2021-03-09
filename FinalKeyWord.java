/*final*/ class A{
	final int a;
	public A() {
		a= 11;
//		a=10;
	}
	public final void show() {
		System.out.println("IN A");
	}
}

class B extends A{
	
//	Cannot override a final method
//	public void show() {
//		
//	}
}

//No class can extend a final class
//class B extends A{
//	
//}

public class FinalKeyWord {
	public static void main(String args[]) {
		A obj = new A();
		System.out.println(obj.a);
	}
}
