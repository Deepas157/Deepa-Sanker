package JULY8thClass;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetDecendingOrder {
	public static void main(String[] args) {
		Set<String>set=new TreeSet<String>(new decendingorder() );
		set.add("ran");
		set.add("tan");
		set.add("ice");
		set.add("apple");
		set.add("zebra");
		set.add("ball");
		System.out.println(set);
	}
}
class decendingorder implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}

