package week;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		System.out.println("before Exception...");
		try {
			int i=1/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block...");
		}
		System.out.println("after exception...");
	}
}
