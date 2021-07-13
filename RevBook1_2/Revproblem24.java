package RevBook1_2;

public class Revproblem24 {
	public static void main(String[] args) {
		int i=0;
		int num=0;
		String primenumber="";
		for(i=1;i<=100;i++) {
			int counter=0;
			for(num=i;num>=i;num--) {
				if(i%num==0) {
					counter=counter+1;
				}
			}
			if(counter==2) {
				primenumber=primenumber+i+"";
			}
		}
		System.out.println("prime number from 1 to 100 are");
		System.out.println(""+primenumber);
	}
}
