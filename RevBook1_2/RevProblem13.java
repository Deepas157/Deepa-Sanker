package RevBook1_2;

import java.util.Scanner;

public class RevProblem13 {
	public static void main(String[] args) {
		int num;
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number below 10...");
		num=scan.nextInt();;
		while(num<=10) {
			sum=sum+num;
			num++;
		}
		System.out.println("sum of the number from the while loop is :"+sum);
	}
}
