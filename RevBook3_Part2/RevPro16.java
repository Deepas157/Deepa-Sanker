package RevBook3_Part2;

import java.util.Scanner;

public class RevPro16 {
	public static void main(String[] args) throws Exception {
		int s[]= {10,20,30,40,50,60,70,80,90,100,110,120,1301,23,64576,6,776,};
		System.out.println("Enter a number....");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int result = search(s, num);
        if (result==-1)
            System.out.print(num+"  Element is not present in array.");
        else
            System.out.println(num+" Element is present in array. ");
            System.out.println(num+" element is present at index: "+result);
    }
	public static int search(int s[], int num){
        for(int i=0;i<s.length;i++){
            if(s[i]==num)
                return i;
            }
        return -1;
    }
}