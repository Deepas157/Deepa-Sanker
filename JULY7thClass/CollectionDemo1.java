package JULY7thClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo1 {
	public static void main(String[] args) {
		List<String>l= new ArrayList<>(10);
		l.add("hi");
		l.add("hello");
		l.add("how r u ?");
		System.out.println(l.get(2));
		System.out.println(l.size());
		System.out.println(l.contains("hi"));
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		l.add("i am fine..");
		System.out.println(l);
		System.out.println(l.isEmpty());
		l.remove(3);
		System.out.println(l);
		l.set(1, "hiiiii");
		System.out.println(l);
		Iterator<String> i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		ListIterator<String>i1=l.listIterator();
		while( i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
	}
}
