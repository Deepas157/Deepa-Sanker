package RevBook3_Part2;

import java.lang.reflect.Array;

public class RevPro6 {
	public static void main(String[] args) {
		int[] mark1= {10,20,30,40,50};
		int[] mark2= {60,70,80,90,100};
		System.arraycopy(mark1, 2, mark2, 3, 2);
		for(int i=0;i<Array.getLength(mark1);i++) {
			System.out.print(mark1[i]+" ");
		}
		System.out.println();
		for(int j=0;j<Array.getLength(mark2);j++) {
			System.out.print(mark2[j]+" ");
		}
	}
}
