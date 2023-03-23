package JavaProject;

public abstract class  java59 {
	 
		//abstract method 
		abstract void computeBill(); 
	} 

	class Commercial extends java59 
	{ 
		@Override
		void computeBill() { 
			System.out.println("Overided 1");
		} 
	} 

	class Domestic extends java59 
	{ 
		@Override
		void computeBill() { 
			System.out.println("overrided 2"); 
			
		} 
	} 

