package week2;

import java.util.Scanner;

public class Ladder {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int a= in.nextInt();
		for(int i=0;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(j);
					for(int k=i-1;k>=1;k--) {
						System.out.print(k);
				}
			}
				
		}
	}
}
