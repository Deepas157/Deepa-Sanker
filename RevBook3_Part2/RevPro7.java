package RevBook3_Part2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RevPro7 {
	public static void main(String[] args) {
	String[] mark= {"a","i","o","s","e"};
	System.out.println("---Before sorting---");
	for(String i:mark) {
		System.out.print(i+"   ");
	}
	System.out.println();
	System.out.println();
	System.out.println("---Ascending Order---");
	Arrays.sort(mark);
	for(String j:mark) {
		System.out.print(j+"   ");
	}
	System.out.println();
	System.out.println();
	System.out.println("---Decending Order---");
	Arrays.sort(mark, Collections.reverseOrder());;
	for(String d:mark) {
		System.out.print(d+"   ");
	}
	}
}
