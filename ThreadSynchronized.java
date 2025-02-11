
class Counter{
	int count;
//	We use synchronized to run when t1 perform t2 to stop and t1 perform t2 to stop.
	
	public synchronized void increment() {
		count++;
	}
}

public class ThreadSynchronized {
	public static void main(String args[]) throws Exception {
		Counter c = new Counter();
		Thread t1 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				c.increment();
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				c.increment();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join(); 
		System.out.println("Count is " + c.count);
	}
}
