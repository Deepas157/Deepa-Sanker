package week;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		int num=0;
		try {
			num=Integer.parseInt(args[0]);
			num=num/1;
			System.out.println("immediate line after exception...");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("handled with array index out of bound exception...");
		}
		finally {
			System.out.println("finally num= 1");
			num=1;
		}
		int i =num/1;
		System.out.println("the value of i is:"+ i);
		System.out.println("after exception...");
	}
}
