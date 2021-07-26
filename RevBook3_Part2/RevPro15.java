package RevBook3_Part2;

import java.util.Scanner;

public class RevPro15 {
	public static void main(String[] args) throws Exception{
		int number, originalNumber,remainder, result =0;
		System.out.println("Enter a number :");
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		originalNumber=number;
		System.out.println("checking whether the given number is Armstrong number or not");
		Thread.sleep(1000);
		while(originalNumber!=0)
		{
			remainder=originalNumber % 10;
			result+= Math.pow(remainder,3);
			originalNumber/=10;
		}
		if(result==number) {
			System.out.println(number+" is an Armstrong number.");
		}
		else {
			System.out.println(number+" is not an Armstrong number.");
		}
		System.out.println("");
		Thread.sleep(1000);
		System.out.println("Checking whether the given number is perfect number or not....");
		Thread.sleep(1000);
		int divisornum=2;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				divisornum+=i;
			}
			if(divisornum==number) {
				System.out.println(number+" is a perfect number.");
				}
			else {
				System.out.println(number+" is not a perfect number.");
			}break;
		}
		System.out.println("");
		Thread.sleep(1000);
		System.out.println("Checking whether the given number is palindrome or not....");
		Thread.sleep(1000);
		int temp=number;
		int rev=0,reminder;
		while(temp!=0) {
			reminder=temp%10;
			rev=rev*10+reminder;
			temp=temp/10;
		}
		if(number==rev) {
			System.out.println(number+" is a palindrome");
		}
		else {
			System.out.println(number+" is not a palindrome");
		}
	}
}
