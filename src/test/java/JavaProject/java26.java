package JavaProject;

public class java26 {

	//Write a Java Program to print the below output:
	//* 1 * 12 * 123 * 1234 * 12345 * 123456 * 1234567
	public static void main(String[] args) {

		{
			for(int i=1;i<=7;i++)
			{
			for(int j=1;j<=i;j++)
			{
			System.out.print(j);
			
			}
			System.out.print(" "+"*"+" ");
			}
			}
	}

}
