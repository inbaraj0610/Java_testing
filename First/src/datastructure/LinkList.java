package datastructure;
import java.util.LinkedList;

public class LinkList {
	public static void main(String args[]) {
		LinkedList<String> obj=new LinkedList<String>();
		
		
	//Here we used Set , add, remove , get , addfirst() , addlast() , getfirst() , getlast() , removefirst() , removelast().
		
		
		obj.add("Green"); //add the value in array
		obj.add("white");
		obj.add("orange");
		obj.add("blue"); //set the value in array
		obj.set(2, "purple");
		obj.addFirst("Pink"); //add the first value in given array
		obj.addLast("Red");   //add the last value in given array
		obj.removeFirst(); //remove the first value in given array
		obj.removeLast();  //remove the last value in given array
		System.out.println(obj); //print the whole array values
		System.out.println(obj.getFirst()); //get the first value in given array
		System.out.println(obj.getLast());  //get the last value in given array
	}
}
