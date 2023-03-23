package JavaProject;

public class Java07 {


	//Write a program to demonstrate the method overloading by changing data types?
	void add(int a, int b){

		System.out.println(a+b);
	}

	void add(double a, double b){
		System.out.println(a+b);
	}

	public static void main(String[] args){

		Java07 over = new Java07();

		over.add(10, 20);
		over.add(10.21, 10.11);
	}
}