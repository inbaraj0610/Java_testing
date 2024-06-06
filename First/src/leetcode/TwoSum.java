package leetcode;

public class TwoSum {
	public static void main(String args[]) {
		int a[]= {3,5,6};
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++){
				if(a[i]+a[j]==9) {
					System.out.println(i +" "+j);
				}
			}
		}
		
	}
}
