package JavaProject;

import java.util.Arrays;

public class java19 {
	
	//Write Java program that checks if two arrays contain the same elements.
	public static void main (String[] args)    
	{   
	
		//defining array to compare   
	int[] a1 = new int[] {'a', 'b', 'c', 'd', 'e'};   
	int[] a2 = new int[] {'a', 'b', 'c', 'd', 'e'};  
	
	//comparing two arrays using equals() method  
	if (Arrays.equals(a1, a2))   
	System.out.println("Arrays are equal.");   
	else  
	System.out.println("Arrays are not equal.");   
	   
	
	if (a1==a2)   
		System.out.println("Arrays are equal.");   
		else  
		System.out.println("Arrays are not equal.");   
		}   
		
}
