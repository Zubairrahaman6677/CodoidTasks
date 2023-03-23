package JavaProject;

public interface java31 {

	
	default void eat() {
		System.out.println("Before Overiding");
	}
	default void eat1(int a,int b) {
		System.out.println("Overloading with 2 aruguent"+" "+(a+b));
	}
	default void eat1(int a,int b,int c) {
		System.out.println("Overloading with 3 aruguent"+" "+(a+b+c));
	}
}
