package RevBook3_Part2;

import java.util.Scanner;

public class RevPro8 {
	public static void main(String[] args) {
		int[] num ={10,20,30,34};
		int index=0;
		int element;
		System.out.println("Choose a number find the location of element in the Array");
		Scanner scan=new Scanner(System.in);
		element=scan.nextInt();
		scan.close();
		for(int i=0;i<num.length;i++) {
			if(num[i]==element) {
				index =i;
			}
		}
		System.out.println("index of "+element+" is "+index);
	}
}
