package JavaProject;

public class java3102 implements java31 {

	public void eat(){
		
		System.out.println("Overrided");
		
	}
	
	public static void main(String[] args) {

		java3102 over = new java3102();
		
		over.eat();
		over.eat1(10, 20);
		over.eat1(1, 2, 3);
		
	}

}
