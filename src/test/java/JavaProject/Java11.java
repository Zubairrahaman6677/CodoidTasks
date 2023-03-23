package JavaProject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Java11 {
	
	//How to convert string to date in java in yyyy-mm-dd format?
	public static void main(String[] args) throws Exception{  
	
		String Date="2023/03/22";  
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
		
		Date date = sdf.parse(Date);
		
		System.out.println(date);
		
			    
		}  
		}  


