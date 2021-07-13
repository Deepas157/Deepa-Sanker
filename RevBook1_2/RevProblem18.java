package RevBook1_2;

import java.util.Scanner;

public class RevProblem18 {
	public static void main(String[] args) {
		int side;
		int area;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number for side of squrare :");
		side=scan.nextInt();;
		area=side*side;
		System.out.println("area of square is : "+area);
	}
}
