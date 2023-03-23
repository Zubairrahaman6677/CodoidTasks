package JavaProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java09 {

	
	//How to read a file in Java?
	  public static void main(String[] args) {
		
	
	  {
		   String str="C:\\Users\\Hp\\Selenium Framework\\com.Zubair.JavaProject\\src\\Input\\Read";
	       Path dir = Paths.get(str);            
	       String content = null;
		try {
			content = Files.readString(dir);
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
	       System.out.println(content);
	   }
	  }
}
