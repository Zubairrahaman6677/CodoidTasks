package JavaProject;

import java.util.Scanner;

public class java53 {
  //Write a Java Program to find whether a string or number is palindrome or not.
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter the Number to find Palindrom or Not");
		
		int num = sc.nextInt();
		
		int org_num= num;
		int rev=0;
		
		while(num!=0)
		{
			rev = rev*10+num%10;
			num=num/10;
		
		}
		if(org_num==rev) {
			System.out.println(org_num + "Palindrome number");
		}
		else {
			System.out.println(org_num+"is Not Palindrome number");
		}
	}
}
