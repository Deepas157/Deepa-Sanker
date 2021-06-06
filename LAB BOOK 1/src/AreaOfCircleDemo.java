import java.util.Scanner;
public class AreaOfCircleDemo {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the radius:");
		double radius =sc.nextDouble();
		double area= Math.PI*(radius*radius);
		System.out.println("The Area of Circle is :"+area);
		double circumference = Math.PI*2*radius;
		System.out.println("THE CIRCUMFERENCE OF THE CIRCLE IS:"+circumference);
	}

}
