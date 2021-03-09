
public class SingleTryCatch {
	public static void main(String args[]) {
		try {
			int i=3;
			int j=0;
			int k = i/j;
			System.out.println(k);
		}catch(Exception e) {
			System.out.println("Error is " + e);
		}finally {
			System.out.println("Bye");
		}
	}
}
