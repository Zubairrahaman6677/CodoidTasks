package JavaProject;


interface java22 {

	default void speed() {
		System.out.println(" New Default Method Here");
	}
	
	static void hello()
    {
        System.out.println(" New Static Method Here");
    }
	
	void brake();

	public static void main(String[] args) {
		
		java22.hello();
		
	}
}

