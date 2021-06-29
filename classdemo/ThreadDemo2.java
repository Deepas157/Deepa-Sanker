package classdemo;

import java.util.Date;

public class ThreadDemo2 {
	public static void main(String[] args)throws Exception {
		vaccinationCenter vc=new vaccinationCenter();
		vc.getToken();
	}
}
class vaccinationCenter {
	public void getToken() throws Exception {
		System.out.println("wating to get token in vaccination center....."+new Date());
		Thread.sleep(5000);
		System.out.println("The token is recevied...."+new Date());
	}
}
