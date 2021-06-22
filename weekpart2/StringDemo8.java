package weekpart3;

public class StringDemo8 {
	public static void main(String[] args) {
		String str="monday tuesday wednesday thursday friday ";
		String []token =str.split("\\s");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<token.length;i++) {
			sb.insert(0,token[i]);
			if(i<token.length-1);{
			sb.insert(0,"");}
		}
		String strReverse=sb.toString();
		System.out.println(strReverse);
	}
}
