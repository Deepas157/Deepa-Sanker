package JULY1stClass;

public class controlingDemo2 {
	public static void main(String[] args) {
		canva1 boast=new canva1();
		ShootingTask1 st=new ShootingTask1(boast);
		Thread naina= new Thread(st,"naina");
		Thread lydii=new Thread(st,"lydii");
		naina.start();
		lydii.start();
	}
}
class ShootingTask1 implements Runnable{
	canva1 boast;
	public ShootingTask1(canva1 boast) {
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
class canva1 {
	boolean flag;
	synchronized public void fills() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(flag) {
			try {
				wait();
			}catch(Exception e) {}
		}
		System.out.println(name+" fills the gun....");
		flag= true;
		notify();
	}
	synchronized public void shoot() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(!flag) {
			try {
				wait();
			}catch (Exception e) {}
		}
		System.out.println(name+" is shooting.....");
		flag=false;
		notify();
	}
}

