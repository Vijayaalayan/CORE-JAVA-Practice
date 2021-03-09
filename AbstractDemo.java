abstract class Human{
	public abstract void eat();
	public void man() {
		System.out.println("In Abstract");
	}
}

class Man extends Human{ // In concrete class --> the class extends the abstract class
	public void eat() {
		System.out.println("In concrete class");
	}
}

abstract class Writer{
	public abstract void write();
}

class Pen extends Writer{
	public void write() {
		System.out.println("Write using pen");
	}
}

class Pencil extends Writer{
	public void write() {
		System.out.println("Write using pencil");
	}
}

class Printer{
	public void show(Number i) {
		System.out.println(i);
	}
}

public class AbstractDemo {
	public static void main(String args[]) {
		Human abc = new Man();
		abc.eat();
		abc.man();
		Writer write = new Pen();
		write.write();
		Printer pri = new Printer();
		pri.show(5.5);
	}
}
