package JavaProject;

public class java60 {
	//Multiple Exception handled
	  public static void main(String args[]){    
	        try{    
	            int array[] = new int[10];    
	            array[10] = 30/0;    
	        }    
	        catch(ArithmeticException e){  
	            System.out.println(e.getMessage());  
	        }    
	        catch(ArrayIndexOutOfBoundsException e){  
	            System.out.println(e.getMessage());  
	        }    
	        catch(Exception e){  
	            System.out.println(e.getMessage());  
	        }    
	        
	        System.out.println("Multiple Exception handled Sucessfully");
	     }    
}
