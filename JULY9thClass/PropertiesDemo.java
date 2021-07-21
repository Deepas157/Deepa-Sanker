package JULY9thClass;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) throws Exception {
		Properties pro=new Properties();
		pro.put("20201", "deepa");
		pro.put("20202", "emile");
		pro.put("20203", "fastee");
		System.out.println(pro.get("20201"));
		System.out.println("--------------------");
	    Enumeration e=pro.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("--------------------");
		Set set=pro.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey()+" : "+me.getValue());
		}
	}
}
