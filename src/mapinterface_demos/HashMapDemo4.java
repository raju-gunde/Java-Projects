package mapinterface_demos;

import java.util.HashMap;

public class HashMapDemo4 {
	public static void main(String[] args) {
		HashMap<Integer, String> newmap1=new HashMap<>();
		HashMap<Integer, String> newmap2=new HashMap<>();
		newmap1.put(1, "raju");
		newmap1.put(2, "ganesh");
		newmap1.put(3, "ramesh");
		System.out.println("in map1:"+newmap1);
		newmap2.put(4, "ragu");
		newmap2.putAll(newmap1);
		System.out.println("in map2:"+newmap2);
		
	}

}
