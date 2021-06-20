package week;

public class OverloadingWithNumOfArguments {
	public static void main(String[] args) {
		NumberOfArguments obj=new NumberOfArguments();
		obj.method(20, 30);
		obj.method(12, 13, 14);
	}}	
	class NumberOfArguments{
		void method( int a,int b) {
			System.out.println("multiple two num:  "+(a*b));
		}
		void method(int a,int b,int c) {
			System.out.println("multiple three num:  "+(a*b*c));
		}
	}


