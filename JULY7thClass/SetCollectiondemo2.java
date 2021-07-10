package JULY7thClass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetCollectiondemo2 {
	public static void main(String[] args) {
	Set<String>set1=new HashSet<>();
	set1.add("ran");
	set1.add("pan");
	set1.add("tan");
	set1.add("can");
	System.out.println(set1);
	Iterator i2=set1.iterator();
	while(i2.hasNext()){
		System.out.println(i2.next());
	}
	for(String s:set1) {
		System.out.println(s);
	}
}
}
