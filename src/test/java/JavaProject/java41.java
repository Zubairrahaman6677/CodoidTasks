package JavaProject;

public class java41 {

	
	//swap two numbers without using temporary variable
	public static void main(String[] args) {

		
	int a=10;
	int b=20;

	System.out.println("Before swaping values "+"a="+a+" b="+b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("After swaping values "+" a="+a+" b="+b);
	}

}
