package JULY1stClass;

public class ControllingDemo1 {
	public static void main(String[] args) {
		canva boast=new canva();
		ShootingTask st=new ShootingTask(boast);
		Thread naina= new Thread(st,"naina");
		Thread lydii=new Thread(st,"lydii");
		naina.start();
		lydii.start();
	}
}
class ShootingTask implements Runnable{
	canva boast;
	public ShootingTask(canva boast) {
		this.boast=boast;
	}
	public void run() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(t.getName().equalsIgnoreCase("naina")) {
			for(int i=0;i<5;i++) {
			boast.fills();}
		}else if (t.getName().equalsIgnoreCase("lydii")) {
			for(int i=0;i<5;i++) {
			boast.shoot();}
		}
	}
}
class canva {
	public void fills() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" fills the gun....");
	}
	public void shoot() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is shooting.....");
	}
}
