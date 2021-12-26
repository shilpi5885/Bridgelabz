/*Java program to demonstrate static variables, methods, and blocks*/

public class StaticDemo {		   
	
	static int x = 10;
	static int y;
	
	static void demo() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	
	static {
		System.out.println("Running static initialization block.");
		y = x + 5;
	}
	
	public static void main(String args[]) {
		 demo();
	}
}
