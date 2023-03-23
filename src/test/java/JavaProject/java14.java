package JavaProject;

public class java14 {
	
	public static void main(String args[])   
	{  
	String str= "This#string%not!contains^special*characters&.";   
	str = str.replaceAll("[^a-zA-Z0-9]", " ");  
	System.out.println(str);  
	}  

}
