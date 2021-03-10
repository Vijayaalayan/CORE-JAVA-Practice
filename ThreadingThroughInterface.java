
class Apple1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("In Apple");
			try{Thread.sleep(1000);}catch(Exception e) {}    // --> Thread.sleep() must always be enclosed within try catch.
		}
	}
}

class Ball1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("In Ball");
			try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}


public class ThreadingThroughInterface {
	public static void main(String args[]) {
//		Apple1 obj1 = new Apple1();
//		Ball1 obj2 = new Ball1();
//		Either above or below can be used
		Runnable obj1 = new Apple1();
		Runnable obj2 = new Ball1();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		try{Thread.sleep(10);}catch(Exception e) {}     // to avoid randomness printing due to scheduling
		t2.start();
	}
}
