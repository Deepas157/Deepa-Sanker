package week;

public class ReflectionDemo4 {
	public static void main(String[] args)throws Exception {
		students s=(students)Class.forName("week.JavaStudents").getDeclaredConstructor().newInstance();
		students s1=(students)Class.forName("week.JavaStudents").getDeclaredConstructor(String.class).newInstance("Ramu");
        System.out.println(s);
        
	}
}
abstract class students{
	
}
class JavaStudents extends students{
	JavaStudents(){
		
	}
	JavaStudents(String s){
		System.out.println(s);
	}
}
