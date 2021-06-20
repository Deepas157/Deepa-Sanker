package week;

public class GoodPaintBrush {
	public static void main(String[] args) {
		Paint brush=new Paint();
		RedPaint obj1=new RedPaint();
		BluePaint obj2=new BluePaint();
		GreenPaint obj3=new GreenPaint();
		brush.obj1=obj3;
		brush.dopaint();
	}
}
class Paint{
	Paint obj1;
	public void dopaint() {
		System.out.println(obj1);
	}
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}
class GreenPaint extends Paint{
	
}
