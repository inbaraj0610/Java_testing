package basics;

public class Bank  extends Hdfc {
	public void salary() {
		System.out.println("salary acc");
	}
	public void current() {
		System.out.println("current acc");
	}
	
 public static void main(String[]args) {
	 Bank obj = new Bank();
	 obj.current();
	 obj.salary();
	 obj.savings();
 }
}
