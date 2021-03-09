
public class UserDefinedException {
	public static void main(String args[]) {
		try {
			int i=3;
			int j=4;
			int k = i/j;
			if(k == 0) {
				throw new VijayException("This can't happen");
			}
			System.out.println(k);
		}catch(VijayException e) {
			System.out.println("Error is " + e);
		}finally {
			System.out.println("Bye");
		}
	}
}
