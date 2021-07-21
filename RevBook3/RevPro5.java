package RevBook3;

import java.util.Scanner;

public class RevPro5 {
	public static void main(String[] args) {
		String s;
		System.out.println("Enter the name of the student:");
		Scanner scan =new Scanner(System.in);
		s=scan.next();
		
		int t,e,m,sci,soc;
		System.out.println("Enter marks\n");
		System.out.println("Tamil marks:");
		t=scan.nextInt();
		System.out.println("English marks:");
		e=scan.nextInt();
		System.out.println("Maths marks:");
		m=scan.nextInt();
		System.out.println("Science marks:");
		sci=scan.nextInt();
		System.out.println("social marks:");
		soc=scan.nextInt();
		System.out.println();
		
		System.out.println("Academic record of the student "+s);
		System.out.println("Tamil marks: "+t);
		System.out.println("English marks: "+e);
		System.out.println("Maths marks: "+m);
		System.out.println("Science marks: "+sci);
		System.out.println("Social marks: "+soc);
		System.out.println("The average of all the subjects is  "+((t+e+m+sci+soc)/5));
	}
}
