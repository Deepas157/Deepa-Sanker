
public class SwapTwoNmbers {
	public static void main(String[] args) {
		int first=120, second=220;
		System.out.println("--Before Swap--");
		System.out.println("first number="+first);
		System.out.println("second number="+second);
		int temporary=first;
		first= second;
		second= temporary;
		System.out.println("--After Swap--");
		System.out.println("first number="+first);
		System.out.println("second number="+second);
		
	}
}
