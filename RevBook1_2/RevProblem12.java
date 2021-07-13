package RevBook1_2;

import java.util.Scanner;

public class RevProblem12 {
	public static void main(String[] args) {
		int rows;
		int num=1;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number of rows:  ");
		rows=scan.nextInt();
		System.out.println("floyd's triangle...");
		System.out.println("***********************");
		for(int counter=1;counter<=rows;counter++) {
			for (int j=1;j<=counter ;j++) {
				System.out.println(num +"  ");
				num++;
				}
			System.out.println(  );
		}
	}
}
