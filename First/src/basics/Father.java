package basics;

public class Father extends GrandFather{
	int a, b ,c;
	public void business() {
		System.out.println("Own Business");
	}
	
	public void Home() {
		System.out.println("Own Home");
	}
	public void add(int a,int b) {
		c=a+b;
		System.out.println(c);
	}
	
	public static void main(String args[]){
        
		
	}
}
