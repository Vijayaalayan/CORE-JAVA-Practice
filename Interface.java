
//3 types of interface
//Normal -- Any methods
//Functional -- Single method
//Marker -- No methods

@FunctionalInterface
interface Abc{
	void show();
}

//class A implements Abc{
//	public void show() {
//		System.out.print("Hello");
//	}
//}

public class Interface {  
	public static void main(String args[]) {
		Abc obj = new Abc() {
			public void show() {
				System.out.println("Hello");
			}
		};
		obj.show();
		
//		Lambda
		Abc ob2 = () -> System.out.println("Lambda works only with Functional Interface ");
		ob2.show();
	}
}
