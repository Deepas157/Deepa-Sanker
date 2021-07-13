package RevBook1_2;

public class revProblem9 {
	public static void main(String[] args) {
		float first=2.3f;
		float second=3.4f;
		System.out.println("----before swap----");
		System.out.println("first number is   "+first);
		System.out.println("second number is  "+ second);
		float temp=first;
		first=second;
		second=temp;
		System.out.println();
		System.out.println("----after swap----");
		System.out.println("first number is  "+first);
		System.out.println("second number is  "+second);
	}
}
