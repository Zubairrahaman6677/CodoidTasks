package JavaProject;

public class Java08 {
	
	
	//Write a program to demonstrate the method overloading by changing a number of arguments?
	void add(int a, int b,int c){
		
		System.out.println(a+b+c);
		}
	
	 void add(int a ,int b){
		System.out.println(a+b);
		}
	
	public static void main(String[] args){
	
		Java08 over = new Java08();
		
		over.add(10, 20, 30);
		over.add(10, 10);
}

}
