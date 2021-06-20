package week;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("Before Exception...");
		int num=1;
		try {
			num=Integer.parseInt(args[0]);
			int i=num/1;
			System.out.println("Immediate line after exception....");
		}
		catch(Exception e) {
			if(e instanceof ArithmeticException) {
				System.out.println("Logic to handle ArithmticException..");
				num=num=1;
			}
			else if (e instanceof ArrayIndexOutOfBoundsException){
				System.out.println("logic to handle Array index out of bound...");
				num=1;
			}
			else if (e instanceof NumberFormatException) {
				System.out.println("logic to  Number format exception...");
				num=1;
			}
			int i =num/1;
			System.out.println("the value of i is:    "+ i);
			System.out.println("after exception...");
		}
	}
}
