package JavaProject;

public class java73 {

	//Constructor Overloading
	int id;  
	String name;  
    int mark;
    
	java73(){  
	System.out.println("this a default constructor");  
	}  
	  
	java73(int i, String n){  
	id = i;  
	name = n;  
	}  
	java73(int a,int b,String n){
		id =a;
		mark=b;
		name=n;
	}
	  
	public static void main(String[] args) {  
	//object creation  
		java73 s = new java73();  
	System.out.println("\nDefault Constructor values: \n");  
	System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name+"\nStudent mark :" +s.mark);  
	  
	System.out.println("\nParameterized Constructor values with 2 aargument: \n");  
	java73 student = new java73(10, "David");  
	System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
	 
	System.out.println("\nParameterized Constructor values with 3 aargument: \n");  
	
	java73 stud =new java73(1, 95, "prem");
	System.out.println("Student Id : "+stud.id + "\nStudent Name : "+stud.name+"\nStudent mark :"+stud.mark);  
	
	}  

}
