package JavaProject;

public class java68 {

	//Add two matrix
	public static void main(String args[]){  
		//creating two matrices    
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};    
		int b[][]={{7,8,9},{4,5,6},{1,2,3}};    
		    
		//creating another matrix to store the sum of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//adding and printing addition of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
		}}  

