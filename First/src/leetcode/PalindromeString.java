package leetcode;

public class PalindromeString {
	public static void main(String args[]) {
		
		String a="madam";
		String b=a;
		String temp="";
		for(int i=a.length()-1;i>=0;i--) { //i=5-1=4; 4>0;3; 
			temp=temp+a.charAt(i); //temp=a.charAt(i); temp=4 temp=4
		}
		if(temp.equals(b)) { //malayalam.equals(malayalam)
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given string is Not palindrome");
		}
}
}
