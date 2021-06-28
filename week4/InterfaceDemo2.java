package week4;

public class InterfaceDemo2 {
	public static void mysomemethod(){
		System.out.println("my some method is called .....");
	}
	public void myanothermethod() {
		System.out.println("my another method is called....");
	}
	public static void main(String[] args) {
		Teacher  teacher = InterfaceDemo2 :: mysomemethod;
		teacher.doteach();
		teacher=new InterfaceDemo2()::myanothermethod;
		teacher.doteach();
	}
}
interface Teacher{
	public void doteach();
}
