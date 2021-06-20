package week;

public class MultiCatch {
	public static void main(String[] args) {
	try {
		int l=args.length;
		System.out.println("l="+l);
		int b =42/l;
		int arr[]= {1};
		arr[22]=99;
		}
	catch( ArithmeticException e){
		System.out.println("divided by 0:"+ e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index oob:"+e);
	}
	System.out.println("rest of the code....");
	}
}
