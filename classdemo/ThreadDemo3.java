package classdemo;

import java.util.Date;

public class ThreadDemo3 {
	public static void main(String[] args) throws Exception{
	System.out.println("Want to go to vc...");
	vaccinationCentre1 vc1=new vaccinationCentre1();
	Thread kala=new Thread(new kala(vc1),"kala");
	kala.start();
	System.out.println("attend the class "+new Date());
	}
}
class kala implements Runnable{
	vaccinationCentre1 vc1;
	public kala(vaccinationCentre1 vc1) {
		this.vc1=vc1;
	}
	public void run() {
		System.out.println("i have assigned kala to get token in vaccination center..."+new Date());
		try {
			vc1.gettoken1();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
class vaccinationCentre1{
	public void gettoken1() throws Exception{
	Thread t=new Thread();
	t.setName("kala");
	String name=t.getName();
	System.out.println(name+" is waiting to get token in vaccination center...."+new Date());
	Thread.sleep(5000);
	System.out.println("Token is recevied "+new Date());
	}
}
