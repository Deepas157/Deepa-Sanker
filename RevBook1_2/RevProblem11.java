package RevBook1_2;

public class RevProblem11 {
	public static void main(String[] args) {
		int temp=6;
		for (int i=1;i<=temp;i++) {
			for(int j=temp;j>=i;j--) {
				System.out.println("****");
			}
			System.out.println("outer for loop");
		}
	}
}
