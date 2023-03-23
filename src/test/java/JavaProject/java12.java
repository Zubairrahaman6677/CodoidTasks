package JavaProject;

public class java12 {


	/*"Write a program to generate the following output in java?
	 *
	 **
	 ****
	 *****
	 ******
	 */
	public static void main(String[] args) {

		for(int i=0;i<=5;i++) {

			for(int j=0;j<=i;j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

}
