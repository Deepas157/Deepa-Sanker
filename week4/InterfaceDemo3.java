package week4;

public class InterfaceDemo3 {
	public static void main(String[] args) {
		student students=()->{
			System.out.println("learning method logic.....");
		};
		students.learn();
		driver drives=(String s)->{
			System.out.println("the driver logic is...");
			System.out.println("the value is ...."+s);
		};
		drives.drive("little speed");
		pilot pilot=(String name,int speed)->{
			System.out.println("the pilot name is ..."+name);
			System.out.println("the pilot speed is ..."+speed);
		};
		pilot.fly("ramu",100000);
	}
}
interface student{
	public void learn();
}
interface driver{
	public void drive(String s);
}
interface pilot{
	public void fly(String name,int speed);
}