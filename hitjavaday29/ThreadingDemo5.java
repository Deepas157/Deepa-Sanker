package hitjavaday29;

public class ThreadingDemo5 {
	public static void main(String[] args) {
		counsellinghall hall=new counsellinghall();
		Thread taqi=new Thread(new optimistic(hall),"taqi");
		Thread imran=new Thread(new optimistic(hall),"imran");
		taqi.start();
		imran.start();
	}
}
class optimistic implements Runnable{
	counsellinghall hall;
	public optimistic(counsellinghall hall) {
		this.hall=hall;
	}
	public void run() {
		//synchronized (hall) {
			if(Thread.currentThread().getName().equals("taqi")) {
				hall.table1();
				hall.table2();
			}else
				hall.water();
		//}
	}
}
class counsellinghall {
	synchronized public void table1(){
		System.out.println(Thread.currentThread().getName()+ " is this in table 1...");
		try {
			Thread.sleep(5000);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	synchronized public void table2() {
		System.out.println(Thread.currentThread().getName()+ " is this in table 2...");
	}
	public void water() {
		System.out.println(Thread.currentThread().getName()+" is now drinking water...");
	}
}
