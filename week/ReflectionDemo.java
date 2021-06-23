package week;

import java.util.Scanner;
public class ReflectionDemo  {
	public static void main(String[] args) throws Exception {
    paint staticPaint =new RedPaint();// static binding 
    System.out.println(staticPaint);
    System.out.println();
	Scanner scan=new Scanner(System.in);
	String PaintClass=scan.next();
	paint dynamicPaint = (paint)Class.forName(PaintClass).newInstance();
	System.out.println(dynamicPaint);	
	}
}
abstract class paint{
	
}
class RedPaint extends paint{
	public RedPaint() {
		
	}
}
class BluePaint extends paint{
	public BluePaint() {
		
	}
}
