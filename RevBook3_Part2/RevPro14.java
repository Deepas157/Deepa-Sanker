package RevBook3_Part2;

import java.util.Scanner;

public class RevPro14 {
	public static void main(String[] args) {
		System.out.println("Enter a minimum number: ");
		Scanner scan=new Scanner(System.in);
		int mini=scan.nextInt();
		System.out.println("Enter a maxinum number: ");
		int max=scan.nextInt();
		for(int i=mini;i<=max;i++) {
			boolean Isprime=true;
				for(int j=mini;j<i;j++) {
					if(i%j==0) {
						Isprime=false;
						break;
					}
				}
				if(Isprime) {
					System.out.print(i+" ");
				}
		}
	}
}
