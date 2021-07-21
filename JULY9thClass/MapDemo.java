package JULY9thClass;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> m=new HashMap<>();
		m.put("20201","deepa");
		m.put("20202", "divya");
		m.put("20203", "deva");
		System.out.println(m);
		
		Map<String, String> m1=new TreeMap<String, String>();
		m1.put("20201","deepa");
		m1.put("20202", "divya");
		m1.put("20203", "deva");
		System.out.println(m1);
		
		Map<String, String> m2=new TreeMap<String, String>((obj1,obj2)->{return obj2.compareTo(obj1);});
		m2.put("20201", "deepa");
		m2.put("20202", "divya");
		m2.put("20203", "deva");
		System.out.println(m2);
	}
}
