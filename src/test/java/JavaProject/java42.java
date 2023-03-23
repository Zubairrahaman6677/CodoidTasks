package JavaProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class java42 {

	//Implement Exception Handling without Catch block
	
public static void main(String[] args) throws IOException {
		
		
		{
			String str="C:\\Users\\Hp\\Selenium Framework\\com.Zubair.JavaProject\\src\\Input\\Read";
			Path dir = Paths.get(str);            
			String content = Files.readString(dir); 
			System.out.println(content);
		}
	}
}
