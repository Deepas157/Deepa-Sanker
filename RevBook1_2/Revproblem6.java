package RevBook1_2;

import java.util.Scanner;

public class Revproblem6 {
	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println("the num is even number");
		}
		else {
			System.out.println("the num is odd number ");
		}
	}
}
