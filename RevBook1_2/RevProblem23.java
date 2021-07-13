package RevBook1_2;

import java.util.Scanner;

public class RevProblem23 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int[]array=new int[10];int sum=0;
		System.out.println("enter the elements:");
		for (int i=0;i<10;i++) {
			array[i]=scan.nextInt();
		}
		for(int num:array) {
			sum=sum+num;
		}
		System.out.println("the sum of array elements is : "+sum);
	}
}
