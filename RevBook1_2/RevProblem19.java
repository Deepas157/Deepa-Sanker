package RevBook1_2;

import java.util.Scanner;

public class RevProblem19 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the width of the triangle:");
		double base=scan.nextDouble();
		System.out.println("enter the height of the triangle:");
		double height=scan.nextDouble();
		double area=(base* height)/2;
		System.out.println("the area of triangle is :   "+area);
	}	
}
