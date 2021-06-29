package classdemo;

public class ThreadDemo1 {
	public static void main(String[] args)throws Exception {
		Thread t=Thread.currentThread();
		t.setName("i am threading");
		t.setPriority(10);
		System.out.println("i am starting now....");
		met();
		System.out.println(t);
		}
	static void met() throws Exception {
		Thread.sleep(3000);
		System.out.println("waiting due to sleep thread....");
		}
	}

