package weekpart2;

public class StringDemo2 {
	public static void main(String[] args) {
		String s="hello";
		String str=new String("hello");
		System.out.println(s==str);
		System.out.println(s.equals(str));
		System.out.println(s.hashCode());
		System.out.println(str.hashCode());
		String temp="new temp is created..."+ s;
		System.out.println(temp);
		System.out.println(s);
		System.out.println();
		String mystore=s;
		s=s+"new value....";
		System.out.println(s);
		System.out.println(mystore);
		char ch=s.charAt(2);
		System.out.println(ch);
		System.out.println(s.substring(0,2));
		System.out.println(mystore==s);
		System.out.println(mystore.equals(str));
	}
}
