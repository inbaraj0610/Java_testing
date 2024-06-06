package basics;

public class Son extends Father {
	
	public static void education() {
		System.out.println("B.E");
	}
	
	public void game() {
		System.out.println("GTA");
	}
	
	public static void main(String args[]) {
		education();
		Son obj = new Son();
		obj.business();
        obj.Home();
        obj.property();
        obj.value();
        obj.add(5,5);
	}

}
