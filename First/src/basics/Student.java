package basics;

public class Student {
    
	public void studentDetail(String name) {
		System.out.println(name);
	}
	public void studentDetail(short age) {
		System.out.println(age);
	}
	
	public void studentDetail(int userid) {
		System.out.println(userid);
	}
	
	public void studentDetail(char initial) {
		System.out.println(initial);
	}
	
	
	public static void main(String[]args) {
		Student obj = new Student();
		obj.studentDetail("shree");
		obj.studentDetail(24);
		obj.studentDetail('R');
		obj.studentDetail(1122);
	}
}
