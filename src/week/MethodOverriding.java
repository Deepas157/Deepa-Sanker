package week;

public class MethodOverriding {
	 public static void main(String[] args) {
		 Employee obj1=new Engineer();
		 Engineer obj2=new Engineer();
		 obj1.met(2);
		 obj2.met(2);		 
	 }
}
class Human{
	public void blabla() {
		System.out.println("the blabla method is printed out...");
	}
}
class Employee extends Human {
	public int met (int i) {
		System.out.println("the employee method is printed..");
		return i;
	}
}
class Engineer extends Employee{
	public int met (int i) {
		System.out.println("the engineer method is printed...");
		super.met(4);
		super.blabla();
		return i;
	}
}
		
	

