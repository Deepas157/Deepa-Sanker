package RevBook1_2;

public class RevProblem16 {
	public static void main(String[] args) {
		int tech=2;
		int course=2;
		switch(tech) {
		case 1:{
			switch(course) {
			case 1:
				System.out.println("java....");
				break;
			case 2:
				System.out.println("java2....");
				break;
			}
		}
		case 2:{
			switch(course) {
			case 1:
				System.out.println("hit java....");
				break;
			case 2:
				System.out.println("hit java 2...");
				break;
			}
		}
		}
	}
}
