package JavaProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class java48 {
	
	//Implement quick sorting
	 public static void main(String[] args) {
	        
	        ArrayList<Integer> Add = new ArrayList<Integer>();
	        
	        Add.add(2);
	        Add.add(8);
	        Add.add(6);
	        Add.add(3);
	        Add.add(12);
	        Add.add(4);
	        Add.add(7);

	        System.out.println("Before Sorting"+Add);
	        
	        Collections.sort(Add);
	        System.out.println("After Sorting"+Add);
}
}