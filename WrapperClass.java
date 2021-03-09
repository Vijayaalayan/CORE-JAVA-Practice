
public class WrapperClass {
	public static void main(String args[]) {
		int i=5;	//Primitive Datatype
		Integer ii = new Integer(i);	//Boxin/ Wraping
		int j = ii.intValue();	//Unboxing
		System.out.println(j);
		Integer x = i;	//Auto-Boxing
		
		int k = x;	//Auto-Unboxing
		
		
		String s = "123";
		int io = Integer.parseInt(s);
		System.out.println(io);
	}
}
