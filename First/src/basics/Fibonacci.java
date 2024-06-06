package basics;

public class Fibonacci {
	
	public static void main(String args[]) {
		
		int fib=7;
		int num1=0;
		int num2=1;
		System.out.print("Fibonacci Series are : "+num1 + ","+num2);
		int num3=0;
		
		for(int i=2;i<fib;i++) {
			num3=num1+num2; //0=0+1 num3=1 num3=1+1=2  , num3=1+2=3 , 
			System.out.print(" "+num3); //0,1,1,2,3
			num1=num2; //0=1 => num1=1 , 1=1 => num1=1 1=2 => num1=2;
			num2=num3; //1=1 => num2=1;  1=2=> num2=2  2=3 => num2=3;
		}
	}
}
