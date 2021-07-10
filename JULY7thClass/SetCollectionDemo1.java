package JULY7thClass;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionDemo1 {
	public static void main(String[] args) {
		Set<String>set=new TreeSet<>();
		set.add("fan");
		set.add("pan");
		set.add("tan");
		set.add("can");
		System.out.println(set);
		Iterator i2=set.iterator();
		while(i2.hasNext()){
			System.out.println(i2.next());
		}
		for(String s:set) {
			System.out.println(s);
		}
	}
}
