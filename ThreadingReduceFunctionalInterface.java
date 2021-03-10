
public class ThreadingReduceFunctionalInterface {
	public static void main(String args[]) {
		Thread t1 = new Thread(()->
					{
						for(int i=0;i<5;i++) {
							System.out.println("Hello T2");
							try {Thread.sleep(1000);}catch(Exception e) {}
						}
					}
					
				);
		Thread t2 = new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("Hello t2");
				try { Thread.sleep(1000);}catch(Exception e) {}
			}
		});
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		System.out.println("Bye");
	}
}
