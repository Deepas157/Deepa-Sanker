package RevBook1_2;

import java.util.Scanner;

public class RevProblem20 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		double radius=scan.nextDouble();
		double area=Math.PI*(radius*radius);
		System.out.println("the area of circle is :  "+area);
		double circumference=Math.PI*2*radius;
		System.out.println("the circumference of the circle is: "+circumference);
	}
}
