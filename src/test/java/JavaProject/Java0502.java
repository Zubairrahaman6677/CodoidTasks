package JavaProject;

public class Java0502 extends Java05{
	
	
	void run() {
		System.out.println("Overrided here");
	}

	public static void main(String[] args) {



		Java0502 over = new Java0502();
		over.run();
	}

}

