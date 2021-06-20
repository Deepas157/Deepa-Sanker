package week;

public class ConstructorOverloading {
	 
	ConstructorOverloading(){
		System.out.println("con calling....");
	}	
	ConstructorOverloading(int i) {
		 System.out.println("the int con is called.....");
	 }
     ConstructorOverloading(String s) {
		 System.out.println("the String constructor is called.... ");
	 }
	 ConstructorOverloading(int d,String d1) {
		 System.out.println(" multi parameter is called....  ");
	 }

		public static void main(String[] args) {
			ConstructorOverloading obj =new ConstructorOverloading();
			ConstructorOverloading obj1 =new ConstructorOverloading(100);
			ConstructorOverloading obj2=new ConstructorOverloading("string");
			ConstructorOverloading obj3=new ConstructorOverloading(100,"string");
			
		}
}
			
	

