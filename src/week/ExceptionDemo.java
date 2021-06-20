package week;

public class ExceptionDemo {
	public static void main(String[] args) {
		int i=50;
		int a;
		try {
			a=i/0;
		}
		catch(ArithmeticException e) {
			System.out.println("divided by zero...");
		}
		System.out.println("after catch statement....");
	}
}
