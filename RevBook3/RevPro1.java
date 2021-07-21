package RevBook3;

import java.util.Map;
import java.util.TreeMap;

public class RevPro1 {
	public static void main(String[] args) {
		Map<String, String> m=new TreeMap<String, String>();
		m.put("1","Hello World");
		System.out.println(m.get("1"));
	}
}
