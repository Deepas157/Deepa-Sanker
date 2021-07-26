package RevBook3_Part2;

import java.util.Arrays;
import java.util.Collections;

public class RevPro9 {
	public static void main(String[] args) {
		String[]s= {"deepa","vivina","ashwin","dev","vishvakuram"};
		System.out.println("-----before reverse----");
		for(String f:s) {
			System.out.print(f+" ");
		}
		System.out.println("");
		System.out.println();
		System.out.println("---after reverse----");
		Arrays.sort(s,Collections.reverseOrder());
		for(String h:s) {
			System.out.print(h+" ");
		}
	}
}
