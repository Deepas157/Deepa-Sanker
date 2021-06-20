package week;

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		overloaded obj=new overloaded();
		obj.method();
		obj.method(5);
		obj.method(7.6f);
	}
}
class overloaded{
	void method() {
		System.out.println("no parameter in this method...");
	}
	void method(int num) {
		int result=num+num;
		System.out.println("the sum of two int value in parameterized method is :  "+result);
	}
	void method(float num) {
		float result =num*num;
		System.out.println("the multiple of two float value in parameterized method is : " +result);
	}
}
