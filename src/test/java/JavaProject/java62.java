package JavaProject;

import java.util.ArrayList;

public class java62 {

	//Convert arraylist into string
	 public static void main(String[] args)
	    {
	 
	             ArrayList<String> al = new ArrayList<String>();
	 
	             al.add("Zubair");
	        al.add("Rahaman");
	        al.add("viswa");
	        al.add("siva");
	 
	        String[] str = new String[al.size()];
	 
	        for (int i = 0; i < al.size(); i++) {
	            str[i] = al.get(i);
	        }
	 
	             for (String k : str) {
	            System.out.println(k);
	        }
	    }
}
