package JavaProject;

public class java30 {

	//Java program for Enumeration

	public enum Season { WINTER, SPRING, SUMMER, FALL }  


	public static void main(String[] args) {  
		for (Season s : Season.values())  
			System.out.println(s);  
	}

}
