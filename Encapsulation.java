class Student{
	private int rollNo;
	private String name;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}


public class Encapsulation {
	public static void main(String args[]) {
		Student s = new Student();
		s.setRollNo(0);
		System.out.println(s.getRollNo());
		s.setName("Vijay");
		System.out.println(s.getName());
	}
}
