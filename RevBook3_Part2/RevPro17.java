package RevBook3_Part2;

import java.util.Scanner;

public class RevPro17 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a 3 digit number.....");
		int n=scan.nextInt();
		if(n<0||n>999) {
			System.out.println("wrong entry... pls check....");
		}
		else {
			int u=n%10;
			int tt=n/10;
			int t=tt%10;
			int h=n/100;
			String uw[]= {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine","Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
			String tw[]= {" "," ","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
			String hw="Hundred";
			if(n<20) {
				System.out.println(uw[n]);
			}
			else if(n<100) {
				System.out.println(tw[t]+" "+uw[u]);
			}
			else {
				System.out.println(uw[h]+" "+hw+" "+tw[t]+" "+uw[u]);
			}
		}
	}
}
