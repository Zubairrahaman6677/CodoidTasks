package JavaProject;

public interface java29 {
	
	//Implement multiple inheritances using an interface

	void eat();
}

interface Travel {
	  
	void travel();
}

class Animal implements java29, Travel {
	   public void eat() {
	      System.out.println("Animal is eating");
	   }
	   public void travel() {
	      System.out.println("Animal is travelling");
	   }
	   
	    
		}