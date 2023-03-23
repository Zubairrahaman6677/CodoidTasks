package JavaProject;

import java.util.ArrayList;
import java.util.LinkedHashSet;


public class Java04 {


	//Write a Program to remove duplicates in an ArrayList.
	public static void main(String[] args) {  
		ArrayList<String> add = new ArrayList<String>();  
		add.add("Mango");  
		add.add("Banana");  
		add.add("Mango");  
		add.add("Apple");  
		System.out.println("Before: "+add.toString());  

		LinkedHashSet<String> s = new LinkedHashSet<String>(add);  
		System.out.println("After: "+ s);  
	}  
}  


