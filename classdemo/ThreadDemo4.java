package classdemo;

public class ThreadDemo4  {
	public static void main(String[] args)throws Exception {
	Thread t= Thread.currentThread();
	t.setName("mani");
	System.out.println("The ticket booking counter was opened by "+t.getName());
	ReservationCounter central=new ReservationCounter();
	Thread imran= new Thread (new bookticket(central,1000),"imran");
	Thread taqi=new Thread (new bookticket(central,500),"taqi");
	imran.start();
	taqi.start();
	}
}
class bookticket implements Runnable{
	 ReservationCounter central; int amount;
	 public bookticket(ReservationCounter central, int amount) {
		 this.central=central;
		 this.amount =amount;
	 }
	 public void run() {
		central.bookticket(amount);
		central.givechange();
	 }
	 
}
class ReservationCounter{
	int amount;
	public void bookticket(int amount) {
		this.amount=amount;
		Thread t= Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"has come to buy the ticket....");
		System.out.println("the amount brought is "+amount);
	}
	public void givechange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("give change to "+name);
		System.out.println("the change given is "+(amount-100));
	}
}
