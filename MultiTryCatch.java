
public class MultiTryCatch {
	public static void main(String args[]) {
		try {
			int a[] = new int[6];
			a[6] = 9;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error is " + e);
		}try {
			int i=3;
			int j=0;
			int k = i/j;
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("Error is " + e);
		}
		finally {
			System.out.println("Bye");
		}
	}
}
