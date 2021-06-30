package hitjavaday29;

public class ThreadingDemo1 {
	public ThreadingDemo1() {
		Thread t=new Thread(new ThreadJob());
		t.start();
	}
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
	    new ThreadingDemo1();
		for(int i=0;i<=5;i++) {
			try{
				Thread.sleep(1000);
			}catch (Exception e) {
			}
			System.out.println(i);
		}
	}
}
class ThreadJob implements Runnable{
	@Override
	public void run() {
		System.out.println("i am child thread....");
	}

}
