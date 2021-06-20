package week;

public class OverloadingByChangingDataType {
	public static void main(String[] args) {
		Overloading obj=new Overloading();
		System.out.println("the value of x is :"+obj.method(23));
		System.out.println("the value of y is :"+ obj.method(2.333));
	}}

class Overloading{
	 int method(int x) {
		 return x;
	 }
	double method(double y) {
		return y;
	}
} 
