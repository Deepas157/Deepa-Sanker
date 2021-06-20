package week;

public class AbstractDemo {
	public static void main(String[] args) {
	new child();	
	}
}
abstract class grandparent{
	abstract public void met();
}
 abstract class Parent extends grandparent{
	public Parent() {
		System.out.println("constructor of parent class...");
	}
	public abstract void youarebeautiful();
	final public void youareunique() {
		System.out.println("you are unique....");
	}
}
class child extends Parent{
 public void met() {
	 System.out.println("child  have behaviour of grandparent class tooo.....");
 }
	public child() {
		System.out.println("child class of an abstract parent obj is created...");
	}
	public void youarebeautiful() {
		System.out.println("you are looking same as parent class...");
	}
}
