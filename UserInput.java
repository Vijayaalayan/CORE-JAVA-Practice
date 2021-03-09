import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {
	public static void main(String args[]) throws Exception{
		int n = 0;
		System.out.println("Enter a number");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
			System.out.print(n);
		}catch(Exception e) {
			System.out.print(e);
		}finally {
			br.close();
		}
		
	}
}
