
// Thread class when started it automatically calls the run method.
class Apple extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("In Apple");
			try{Thread.sleep(1000);}catch(Exception e) {}    // --> Thread.sleep() must always be enclosed within try catch.
		}
	}
}

class Ball extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("In Ball");
			try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}


public class ThreadingConcept {
	public static void main(String args[]) {
		Apple obj1 = new Apple();
		Ball obj2 = new Ball();
		obj1.start();
		try{Thread.sleep(10);}catch(Exception e) {}     // to avoid randomness printing due to scheduling
		obj2.start();
	}
}
