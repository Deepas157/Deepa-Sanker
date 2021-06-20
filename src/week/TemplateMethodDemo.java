package week;

public class TemplateMethodDemo {
	public static void main(String[] args) {
		Sangeethahotel obj=new Sangeethahotel();
		obj.makeidly();
		obj.process();
	}
}
abstract class sangeetha{
	 public final void uniform() {
		System.out.println("uniform in all branch is constant....");
	}
	 public final void service() {
		 System.out.println("service in all branch is constant...");
	 }
	 public final void welcome() {
		 System.out.println("welcoming in all branch is constant...");
	 }
	 abstract void makeidly();
	 public final void process() {
		 uniform();
		 service();
		 welcome();
	 }
}
class Sangeethahotel extends sangeetha {
	void makeidly() {
		System.out.println("make idly .....");
	}
}
