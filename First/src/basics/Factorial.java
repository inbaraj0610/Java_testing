package basics;

public class Factorial {
	public static void main(String args[]) {
		int fact=1;
		int temp=5;
		for(int i=1;i<=temp;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of Given Number "+temp +" is "+fact);
	}
}
