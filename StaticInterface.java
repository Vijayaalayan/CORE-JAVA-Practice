
interface StaticInter{
	int num = 8;
	static void show(){
		System.out.println("Hello");
	}
}

class StatDemo implements StaticInter{
	public void show() {
//		num =9;
		
//		by default any variable declare inside interface becomes a FINAL variable.
		
//		public void show() {
//			
//		}
	}
}

public class StaticInterface {

}
