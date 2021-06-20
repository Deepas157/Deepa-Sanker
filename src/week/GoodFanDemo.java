package week;

import java.util.Scanner;

public class GoodFanDemo {
	public static void main(String[] args) {
		GoodFan obj=new GoodFan();
		while(true) {
		System.out.println("pls enter any key to switch the state of the good fan...");
		Scanner scan=new Scanner(System.in);
		scan.next();
		obj.pull();}
	}
}
class GoodFan{
	State state =new SwitchOffState();
	public void pull() {
		state.pull(this);
	}
}
 abstract class State{
	public abstract void pull(GoodFan fan);
}
class SwitchOffState extends State {
	public void pull(GoodFan fan) {
		System.out.println("switch on state...");
		fan.state=new SwitchOnState() ;
	}
}
class SwitchOnState extends State{
	public void pull(GoodFan fan) {
		System.out.println("Medium Speed State... ");
		fan.state=new MediumSpeedState();
	}
}
class MediumSpeedState extends State{
	public  void pull(GoodFan fan) {
		System.out.println("high Speed State... ");
		fan.state=new HighSpeedState();
	}
}
class HighSpeedState extends State{
	public void pull(GoodFan fan) {
		System.out.println("Switch Off State... ");
		fan.state=new SwitchOffState();
	}
}
