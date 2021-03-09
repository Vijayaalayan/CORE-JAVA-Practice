
public class FirstCode {
	public static void main(Strings args[]){
		for(int i=1;i<6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i=0;i<4;i++) {
			if(i == 0 || i==3) {
				for(int j=1;j<=4;j++) {
					System.out.print("$ ");
				}
			}else {
				for(int j=0;j<4;j++) {
					if(j == 0 || j==3)
					System.out.print("$ ");
					else {
						System.out.print("  ");
					}
				}
			}
			
			System.out.println();
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				char a = (char) (j+65);
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
	}
}
