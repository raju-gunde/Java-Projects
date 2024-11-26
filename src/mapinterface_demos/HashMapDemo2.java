package mapinterface_demos;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
public static void main(String[] args) {
	Map<Integer, String> map=new HashMap<Integer, String>();
	map.put(1, "C");
	map.put(2, "C++");
	map.put(3, "Java");
	map.put(4, ".net");
	map.forEach((k,v)->System.out.println("key :"+k+"value"+v));
	System.out.println("return old object value:"+map.put(4, "phython"));
	Set keys=map.keySet();
	System.out.println(keys);
	Collection values=map.values();
	System.out.println(values);
	for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	map.remove(4);
	System.out.println(map);//deleted entry..
}
}
