package JULY1stClass;

public class DeadLockDemo1 {
	public static void main(String[] args) {
		Crane crane=new Crane();
		Frog frog=new Frog();
		new Thread(new Runnable() {
			public void run() {
			crane.eat(frog);	
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
			frog.escape(crane);	
			}
		}).start();
	}
}
class Crane {
	synchronized public void eat(Frog frog ) {
		frog.leaveCallByCrane();
	}
	synchronized public void leaveCallByFrog() {
		
	}
}
class Frog {
	synchronized public void escape(Crane crane) {
		crane.leaveCallByFrog();
	}
	synchronized public void leaveCallByCrane() {
		
	}
}
