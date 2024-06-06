package leetcode;

public class CheckString {
	public static void main(String args[]) {
		String a="INBARAJ";
		int count=0,count1=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' ||a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I' || a.charAt(i)=='O' || a.charAt(i)=='U') {
				count=count+1;
			}
			else {
				count1=count1+1;
			}
			
		}
		System.out.println("Vowels "+count);
		System.out.println("consonant "+count1);
	}
	
	
}
