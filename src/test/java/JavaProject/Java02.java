package JavaProject;

public class Java02 {

	public static void main(String[] args) {

		
		//reverse a String 
		
	String name = "zubair";
	String rev="";
	
	int len = name.length();
	
	for(int i=len - 1;i>=0;i--) {
		
		rev=rev+name.charAt(i);
	}
	System.out.println(rev);
	
	//2nd method
	
	StringBuffer sb =  new StringBuffer(name);
	
	System.out.println(sb.reverse());
	
	
	
	
	}

}
