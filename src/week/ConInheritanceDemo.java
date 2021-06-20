package week;

public class ConInheritanceDemo {
	public static void main(String[] args) {
		shoe obj=new LeatherShoe(100);
		
	}
}
class shoe{
	int i;
	shoe() {
		System.out.println("no paramterized constructor...");
	}
	shoe(int i){
		System.out.println("parameterized constructor...");
	}
	void met() {
		System.out.println("parent shoe method is called...");
	}
}
class LeatherShoe extends shoe{
	public LeatherShoe(int i) {
		super(300);
		super .i =100;
		super. met();
		System.out.println("con leathershoe method is called...");
	}
    
}