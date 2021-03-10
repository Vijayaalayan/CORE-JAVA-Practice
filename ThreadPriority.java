
public class ThreadPriority {
	public static void main(String args[]) throws Exception {
		Thread t1 = new Thread(()->
					{
						for(int i=0;i<5;i++) {
							System.out.println("Hello T1");
							try {Thread.sleep(1000);}catch(Exception e) {}
						}
					}
					
				);
		Thread t2 = new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("Hello T2");
				try { Thread.sleep(1000);}catch(Exception e) {}
			}
		},"Thread T2");
		
//		Either set name by above or below
		t1.setName("Thread T1");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("Bye");
	}
}
