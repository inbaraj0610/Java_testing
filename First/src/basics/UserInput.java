package basics;
import java.util.Scanner;

public class UserInput {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String a=sc.nextLine();
		System.out.println("Enter Your Initial ");
		char c=sc.next().charAt(0);
		System.out.println("Enter Your Age");
		int b=sc.nextInt();
		System.out.println("Your Name "+a);
		System.out.println("Your Initial "+c);
		System.out.println("Your Age "+b);
		sc.close();
	}
}
