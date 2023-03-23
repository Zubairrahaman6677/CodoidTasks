package JavaProject;

public class java25 {

	//Write a Java program to demonstrate the usage of break and 
	//continue statements inside while loop?
     public static void main(String[] args) {
	
    	 for (int i = 0; i < 10; i++) {
    		  if (i == 4) {
    		    break;
    		  }
    		  System.out.println(i);
    		}
    	 
    	 for (int i = 0; i < 10; i++) {
    		  if (i == 4) {
    		    continue;
    		  }
    		  System.out.println(i);
    		}
	}
}
