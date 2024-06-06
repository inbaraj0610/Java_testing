package datastructure;
import java.util.ArrayList;

public class ArrList {
	public static void main(String args[]) {
		ArrayList<String> obj=new ArrayList<String>();
		
		//Here we are used add , set , remove , get
		
		obj.add("Green"); //add the value in array
		obj.add("white");
		obj.add("orange");
		obj.add("blue"); //set the value in array
		obj.set(2, "purple");
		obj.remove(2); //remove the value in given array
		System.out.println(obj); //print the whole array values
		System.out.println(obj.get(0)); //print the specific array values
	}
}
