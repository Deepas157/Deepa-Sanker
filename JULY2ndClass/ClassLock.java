package JULY2ndClass;

public class ClassLock {
	public static void main(String[] args) {
		ClasslockSample obj1=new ClasslockSample();
		new Thread (new Runnable() {
		public void run() {
			synchronized(ClasslockSample.class) { 
				obj1.met1();}
		}
		}).start();
		ClasslockSample obj2=new ClasslockSample();
		new Thread (new Runnable() {
			public void run() {
				synchronized(ClasslockSample.class) {
				obj2.met2();}
			}
		}).start();
	}
}
class ClasslockSample{
	static int money=1000;
	public static void met1() {
	money=money+100;
	try {Thread.sleep(1000);}catch(Exception e ) {}
	System.out.println("the money of met1=  "+money);
	
	}
	public static void met2() {
	money=money+200;
	try {Thread.sleep(1000);}catch(Exception e ) {}
	System.out.println("the money of met2=  "+money);
	}
}
