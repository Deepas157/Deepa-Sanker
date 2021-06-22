package weekpart3;

import java.util.StringJoiner;

public class StringDemo7 {
	public static void main(String[] args) {
		String s="Hello World";
		String ss=new String("Hello World");
		StringJoiner str=new StringJoiner(",");
		str.setEmptyValue("its a empty string");
		System.out.println(str);
		str.add("hello");
		str.add("hi");
		System.out.println(str);
		System.out.println();
		str=new StringJoiner(",","[","]");
	    str.add("hello");
	    str.add("hi");
	    System.out.println(str);
	    System.out.println();
	    StringBuffer sbf=new StringBuffer();
	    sbf.append("hello");
	    System.out.println(sbf);
	    StringBuilder sb =new StringBuilder();
	    sb.append("hi");
	    System.out.println(sb);
	}
}
