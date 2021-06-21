package weekpart2;

public class StringDemo6 {
	public static void main(String[] args) {
		String s1="HARRISINFOTECH";
		String s2="training Department";
		System.out.println("the concatenation of two string is "+ s1.concat(s2));
		System.out.println("the character at 7th place of string 2 is "+ s2.charAt(7));
		System.out.println("the comparsion of two string is "+ s1.concat(s2));
		System.out.println("ignore the case of 2 string is  "+ s1.equalsIgnoreCase(s2));
		System.out.println("the hashcode of string is   "+ s2.hashCode());
		System.out.println("the index of E in string 2 is  "+s2.indexOf('e',3));
		System.out.println("the last index of E in string 2 is   "+s2.lastIndexOf('e', 16));
		System.out.println("the length of s1 is "+s1.length());
		System.out.println("the replace s2 is  "+s1.replace('H','P'));
		System.out.println("substring of s2 is "+s2.substring(4));
		System.out.println("substring of s2 is  "+ s2.substring(4, 9));
		System.out.println("change to upper case  "+s2.toUpperCase());
		System.out.println("change to lower case   "+ s2.toLowerCase());
		System.out.println("to trim the string   "+s2.trim());
	}
}
