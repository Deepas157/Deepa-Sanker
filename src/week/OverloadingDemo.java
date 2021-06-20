package week;
class service{
	void help(Police p) {
		System.out.println("call the police for help...");
	}
	void help(AccidentVictim ac) {
		System.out.println("i am met with an accident ... help us soon....");
	}
	void help(Helper h) {
		System.out.println("Helpers are send to the accident spot ...");
	}
}
public class OverloadingDemo {
	public static void main(String[] args) {
		service obj108=new service();
		Police obj1=new Police();
		AccidentVictim obj2=new AccidentVictim();
		Helper obj3=new Helper();
		obj108.help(obj1);
	    obj108.help(obj2);
	    obj108.help(obj3);
	}
}
class Police{
	
}
class AccidentVictim{
	
}
class Helper{
	
}

