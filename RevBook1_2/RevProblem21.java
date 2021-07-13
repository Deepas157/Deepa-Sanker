package RevBook1_2;

import java.util.Scanner;

public class RevProblem21 {
	public static void main(String[] args) {
		int reversenum=0,num;
		System.out.println("enter a number....");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		while(num!=0) {
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
		}
		System.out.println("reverse of the input number is  "+reversenum);
	}
}
