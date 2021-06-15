package week2;

public class Bird {
int age;
String name;
Bird(){
	System.out.println("This is a parrot");
}
Bird(String x){
	name =x;
	System.out.println("This is the    "+name);
}
Bird(int a,String s){
	age = a;
    name =s;
	System.out.println("The name is   "+ name+"the age is "+age);
}
	public static void main(String[] args) {
		Bird obj1=new Bird();
		Bird obj2=new Bird("Maina");
		Bird obj3 =new Bird( 20,"Sparrow");
	}
}
