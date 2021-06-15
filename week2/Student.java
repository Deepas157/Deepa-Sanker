package week2;

public class Student {
String name,city;
int age;
static int m;
void printData() {
	System.out.println("student name ="+name);
	System.out.println("student name ="+city);
	System.out.println("student name ="+age);
}
}
class stest{
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.name="Nikith";
		s1.city="Chennai";
		s1.age= 23;
		s2.age=34;
		s2.city="Madurai";
		s2.name="Meghana";
		s1.printData();
		s2.printData();
		s1.m=20;
		s2.m=22;
		Student.m=27;
		System.out.println("s1.m="+s1.m);
		System.out.println("s2.m="+s2.m);
		System.out.println("student.m ="+Student.m);
	}
}
