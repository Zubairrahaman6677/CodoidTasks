package JavaProject;

import java.util.HashMap;
import java.util.Iterator;



public class java49 {
	public static void main(String args[])  
	{  
	HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
	hm.put(110,"Ravi");  
	hm.put(120,"Prateek");  
	hm.put(130, "Davesh");    
	hm.put(140, "Kamal");  
	hm.put(150, "Pawan");  
	Iterator <Integer> it = hm.keySet().iterator();        
	while(it.hasNext())  
	{  
	int key=(int)it.next();  
	System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
	}  
	
	for (int Rollno : hm.keySet())   
		System.out.println("State: " + Rollno);   
		for (String name : hm.values())         
		System.out.println("Capiatl: " + name);   
		}   
	}  
	


