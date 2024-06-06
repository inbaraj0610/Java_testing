package basics;

public class Method {
	
	public static void name() {
		System.out.print("You Can't ");
	}
	
	private void name1() {
		System.out.println("See Mee");
	}
	
	public static void main(String[] args) {
		name();
		Method obj=new Method();
		obj.name1();
		
		
	}
}
