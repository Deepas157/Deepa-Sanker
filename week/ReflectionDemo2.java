package week;

public class ReflectionDemo2 {
	public static void main(String[] args)throws Exception {
	Politician p =new abcPolitician("Ramu");
    System.out.println(p);
    p=(Politician)Class.forName("output_ex.xyzPolitician").getConstructor(String.class).newInstance("santhosh");
    System.out.println(p);
	}
}
abstract class Politician {
	
}
class abcPolitician extends Politician{
	String name;
	public abcPolitician(String name) {
	this.name =name;
	}
	public String toString() {
		return this.name;
	}
	
}
class xyzPolitician extends Politician{
	String name1;
	public xyzPolitician(String name1) {
	this.name1 =name1;
	}
	public String toString() {
		return this.name1;
	}
}