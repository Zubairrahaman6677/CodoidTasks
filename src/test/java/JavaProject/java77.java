package JavaProject;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class java77 {

	//How to create LinkedHashSet program in java
	public static void main(String args[]){  
		//Creating HashSet and adding elements  
		LinkedHashSet<String> set=new LinkedHashSet();  
		set.add("One");    
		set.add("Two");    
		set.add("Three");   
		set.add("Four");  
		set.add("Five");  
		Iterator<String> i=set.iterator();  
		while(i.hasNext())  
		{  
			System.out.println(i.next());  
		}  
	}  
}
