package JavaProject;

import java.util.Arrays;

public class java16 {

     //Sort array
	public static void main(String[] args)   
	{   
		//defining an array of integer type   
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  

		Arrays.sort(array);   
		System.out.println("Elements of array sorted in ascending order: ");  

		for (int i = 0; i < array.length; i++)   
		{       
			System.out.println(array[i]);   
		}   
	}  
}
