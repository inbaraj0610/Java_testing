package leetcode;
public class Palindrome {
	public static void main(String[] args){
		int a=1001;
		int b=a;
		int c;
		int d=0;
		for(int i=0;i<b;i++) {
			c=b%10; //c=121%10=1 c=121%10; 1
			 //b=121/10=12;   b=a/10=12
			d=d*10+c; // 0=0+1+10=11 0*10+1=1
			b=b/10;
		}
		if(d==a) {
			System.out.print("Palidrome");
		}
		else {
			System.out.print("Not");
		}
	}
}
